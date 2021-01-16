/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DB;

import com.google.gson.Gson;
import com.mongodb.MongoClient;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import com.mongodb.client.model.Filters;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.bson.Document;
import Classes.Customer;
import com.mongodb.DBCollection;

/**
 *
 * @author BUE
 */
public class CustomerDB {
    private MongoClient client;
    private MongoDatabase database;
    private MongoCollection<Document> CustomerCollection;
    private Gson gson = new Gson();

    public CustomerDB(){
        Logger mongoLogger = Logger.getLogger("org.mongodb.driver");
        mongoLogger.setLevel(Level.SEVERE);

        // Initialize
        client = new MongoClient();
        database = client.getDatabase("OFO"); // Database name
        CustomerCollection = database.getCollection("Customer");
    }

    public MongoCollection<Document> getCustomerCollection() {
        return CustomerCollection;
    }

    public void setCustomerCollection(MongoCollection<Document> CustomerCollection) {
        this.CustomerCollection = CustomerCollection;
    }
    
    public void insertCustomer(Customer customer) {
        CustomerCollection.insertOne(Document.parse(gson.toJson(customer)));
        System.out.println("User inserted.");
    }

    public void deleteCustomer(int ID) {
        CustomerCollection.deleteOne(Filters.eq("ID", ID));
    }
    
    public void updateCustomer(Customer customer) {
        Document doc = Document.parse(gson.toJson(customer));
        CustomerCollection.replaceOne(Filters.eq("ID", customer.getID()), doc);
        CustomerCollection.replaceOne(Filters.eq("First_Name", customer.getFirstName()), doc);
        CustomerCollection.replaceOne(Filters.eq("Last_Name", customer.getLastname()), doc);
        CustomerCollection.replaceOne(Filters.eq("PhoneNO", customer.getPhoneNum()), doc);
        CustomerCollection.replaceOne(Filters.eq("email", customer.getEmail()), doc);
        CustomerCollection.replaceOne(Filters.eq("password", customer.getPassword()), doc);
        CustomerCollection.replaceOne(Filters.eq("Address", customer.getAddress()), doc);
    }
    
    public ArrayList<Customer> getCustomerByID(int ID) {
        ArrayList<Customer> result = new ArrayList();
        ArrayList<Document> docs = CustomerCollection.find(Filters.lt("ID", ID)).into(new ArrayList<Document>());
        for (int i = 0; i < docs.size(); i++) {
            result.add(gson.fromJson(docs.get(i).toJson(), Customer.class));
        }
        return result;
    }
    
    public ArrayList<Customer> getAllCustomers() {
        ArrayList<Customer> result = new ArrayList();
        ArrayList<org.bson.Document> docs = CustomerCollection.find().into(new ArrayList<org.bson.Document>());
        for (int i = 0; i < docs.size(); i++) {
            result.add(gson.fromJson(docs.get(i).toJson(), Customer.class));
        }
        return result;
    }
    
        public boolean customerLogin(String email,String p){
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
        
    public void close() {
        client.close();
    }

}