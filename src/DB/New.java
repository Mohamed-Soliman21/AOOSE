/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DB;

import Classes.Restaurant;
import com.google.gson.Gson;
import com.mongodb.MongoClient;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.bson.Document;

/**
 *
 * @author BUE
 */
public class New {
    private MongoClient client;
    private MongoDatabase database;
    private MongoCollection<Document> NewCollection;
    private Gson gson = new Gson();

    public New(){
        Logger mongoLogger = Logger.getLogger("org.mongodb.driver");
        mongoLogger.setLevel(Level.SEVERE);

        // Initialize
        client = new MongoClient();
        database = client.getDatabase("OFO"); // Database name
        database.createCollection("sampleCollection");
    }
    
    public void insertCustomer(Restaurant restaurant) {
        NewCollection.insertOne(Document.parse(gson.toJson(restaurant)));
        System.out.println("User inserted.");
    }

}
