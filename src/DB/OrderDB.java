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
import Classes.Order;

/**
 *
 * @author BUE
 */
public class OrderDB {
    private MongoClient client;
    private MongoDatabase database;
    private MongoCollection<Document> OrderCollection;
    private Gson gson = new Gson();
    
    public OrderDB(){
        // Disables Mongo Logs
        Logger mongoLogger = Logger.getLogger("org.mongodb.driver");
        mongoLogger.setLevel(Level.SEVERE);

        // Initialize
        client = new MongoClient();
        database = client.getDatabase("OFO"); // Database name
        OrderCollection = database.getCollection("Order");
    }
    
    public ArrayList<Order> getAllOrders() {
        ArrayList<Order> result = new ArrayList();
        ArrayList<org.bson.Document> docs = OrderCollection.find().into(new ArrayList<org.bson.Document>());
        for (int i = 0; i < docs.size(); i++) {
            result.add(gson.fromJson(docs.get(i).toJson(), Order.class));
        }
        return result;
    }
    
    public ArrayList<Order> getDOrderByID(int ID) {
        ArrayList<Order> result = new ArrayList();
        ArrayList<Document> docs = OrderCollection.find(Filters.lt("ID", ID)).into(new ArrayList<Document>());
        for (int i = 0; i < docs.size(); i++) {
            result.add(gson.fromJson(docs.get(i).toJson(), Order.class));
        }
        return result;
    }
    
    public void close() {
        client.close();
    }
}
