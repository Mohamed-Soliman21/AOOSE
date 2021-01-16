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
import Classes.Restaurant;

/**
 *
 * @author BUE
 */
public class RestaurantDB {
    private MongoClient client;
    private MongoDatabase database;
    private MongoCollection<Document> RestaurantCollection;
    private Gson gson = new Gson();

    public RestaurantDB(){
        Logger mongoLogger = Logger.getLogger("org.mongodb.driver");
        mongoLogger.setLevel(Level.SEVERE);

        // Initialize
        client = new MongoClient();
        database = client.getDatabase("OFO"); // Database name
        RestaurantCollection = database.getCollection("Restaurant");
    }

    public void insertRestaurant(Restaurant restaurant) {
        RestaurantCollection.insertOne(Document.parse(gson.toJson(restaurant)));
        System.out.println("Restaurant inserted.");
    }

    public void deleteRestaurant(int ID) {
        RestaurantCollection.deleteOne(Filters.eq("ID", ID));
    }
    
    public void updateRestaurant(Restaurant restaurant) {
        Document doc = Document.parse(gson.toJson(restaurant));
        RestaurantCollection.replaceOne(Filters.eq("ID", restaurant.getID()), doc);
        RestaurantCollection.replaceOne(Filters.eq("Name", restaurant.getName()), doc);
        RestaurantCollection.replaceOne(Filters.eq("Address", restaurant.getAddresses()), doc);
        RestaurantCollection.replaceOne(Filters.eq("Rating", restaurant.getRating()), doc);
    }
    
    public ArrayList<Restaurant> getRestaurantByID(int ID) {
        ArrayList<Restaurant> result = new ArrayList();
        ArrayList<Document> docs = RestaurantCollection.find(Filters.lt("ID", ID)).into(new ArrayList<Document>());
        for (int i = 0; i < docs.size(); i++) {
            result.add(gson.fromJson(docs.get(i).toJson(), Restaurant.class));
        }
        return result;
    }
    
    public Restaurant getRestaurantByName(String Name) {
        Document doc = RestaurantCollection.find(Filters.eq("Name", Name)).first();
        Restaurant result = gson.fromJson(doc.toJson(), Restaurant.class);
        return result;
    }
    
    public ArrayList<Restaurant> getAllRestaurants() {
        ArrayList<Restaurant> result = new ArrayList();
        ArrayList<org.bson.Document> docs = RestaurantCollection.find().into(new ArrayList<org.bson.Document>());
        for (int i = 0; i < docs.size(); i++) {
            result.add(gson.fromJson(docs.get(i).toJson(), Restaurant.class));
        }
        return result;
    }

    public void close() {
        client.close();
    }
}        

