/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DB;

import Classes.Customer;
import com.google.gson.Gson;
import com.mongodb.MongoClient;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import com.mongodb.client.model.Filters;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.bson.Document;

/**
 *
 * @author BUE
 */
public class AdminDB {
    private MongoClient client;
    private MongoDatabase database;
    private MongoCollection<Document> CustomerCollection;
    private Gson gson = new Gson();

    public AdminDB(){
        Logger mongoLogger = Logger.getLogger("org.mongodb.driver");
        mongoLogger.setLevel(Level.SEVERE);

        // Initialize
        client = new MongoClient();
        database = client.getDatabase("OFO"); // Database name
        CustomerCollection = database.getCollection("Customer");
    }
    
    public boolean AdminLogin(String email,String p){
        boolean logged = false;
        try {
            Document doc = CustomerCollection.find(Filters.eq("email", email)).first();
            Customer result = gson.fromJson(doc.toJson(), Customer.class);
            System.out.println(result.getEmail());    
            if(result.getPassword().equals(p)){
                System.out.println("Logged in");
                return true;
            }
        } catch (NullPointerException e) {
            return false;
        }
        System.out.println(logged);
        return logged;
                
    }
}
