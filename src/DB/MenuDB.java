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
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.bson.Document;
import Classes.DrinkItem;
import Classes.FoodItem;

/**
 *
 * @author BUE
 */
public class MenuDB {
    private MongoClient client;
    private MongoDatabase database;
    private MongoCollection<Document> MenuCollection;
    private Gson gson = new Gson();
    
    public MenuDB() {
        Logger mongoLogger = Logger.getLogger("org.mongodb.driver");
        mongoLogger.setLevel(Level.SEVERE);

        // Initialize
        client = new MongoClient();
        database = client.getDatabase("OFO"); // Database name
        MenuCollection = database.getCollection("Menu");
    }
    
    public ArrayList<FoodItem> getAMenu() {
        ArrayList<FoodItem> result = new ArrayList();
        ArrayList<org.bson.Document> docs = MenuCollection.find().into(new ArrayList<org.bson.Document>());
        for (int i = 0; i < docs.size(); i++) {
            result.add(gson.fromJson(docs.get(i).toJson(), FoodItem.class));
        }
        return result;
    }
        
    public ArrayList<DrinkItem> getAllDrinkItems() {
        ArrayList<DrinkItem> result = new ArrayList();
        ArrayList<org.bson.Document> docs = MenuCollection.find().into(new ArrayList<org.bson.Document>());
        for (int i = 0; i < docs.size(); i++) {
            result.add(gson.fromJson(docs.get(i).toJson(), DrinkItem.class));
        }
        return result;
    }
    
    public void close() {
        client.close();
    }
}