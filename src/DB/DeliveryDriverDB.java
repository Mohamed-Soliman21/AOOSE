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
import Classes.DeliveryDriver;

/**
 *
 * @author BUE
 */
public class DeliveryDriverDB {
    private MongoClient client;
    private MongoDatabase database;
    private MongoCollection<Document> DeliveryDriverCollection;
    private Gson gson = new Gson();
    
    public DeliveryDriverDB(){
        Logger mongoLogger = Logger.getLogger("org.mongodb.driver");
        mongoLogger.setLevel(Level.SEVERE);

        // Initialize
        client = new MongoClient();
        database = client.getDatabase("OFO"); // Database name
        DeliveryDriverCollection = database.getCollection("DeliverDriver");    
    }
    
        public void insertDeliveryDriver(DeliveryDriver deliveryDriver) {
        DeliveryDriverCollection.insertOne(Document.parse(gson.toJson(deliveryDriver)));
        System.out.println("User inserted.");
    }

    public void deleteDeliveryDriver(int ID) {
        DeliveryDriverCollection.deleteOne(Filters.eq("ID", ID));
    }
    
    public void updateDeliveryDriver(DeliveryDriver deliveryDriver) {
        Document doc = Document.parse(gson.toJson(deliveryDriver));
        DeliveryDriverCollection.replaceOne(Filters.eq("ID", deliveryDriver.getID()), doc);
        DeliveryDriverCollection.replaceOne(Filters.eq("First_Name", deliveryDriver.getFirstName()), doc);
        DeliveryDriverCollection.replaceOne(Filters.eq("Last_Name", deliveryDriver.getLastname()), doc);
        DeliveryDriverCollection.replaceOne(Filters.eq("PhoneNO", deliveryDriver.getPhoneNum()), doc);
        DeliveryDriverCollection.replaceOne(Filters.eq("email", deliveryDriver.getEmail()), doc);
        DeliveryDriverCollection.replaceOne(Filters.eq("password", deliveryDriver.getPassword()), doc);
        DeliveryDriverCollection.replaceOne(Filters.eq("Address", deliveryDriver.getAddress()), doc);
    }
    
    public ArrayList<DeliveryDriver> getDeliveryDriverByID(int ID) {
        ArrayList<DeliveryDriver> result = new ArrayList();
        ArrayList<Document> docs = DeliveryDriverCollection.find(Filters.lt("ID", ID)).into(new ArrayList<Document>());
        for (int i = 0; i < docs.size(); i++) {
            result.add(gson.fromJson(docs.get(i).toJson(), DeliveryDriver.class));
        }
        return result;
    }
    
    public ArrayList<DeliveryDriver> getAllDeliveryDrivers() {
        ArrayList<DeliveryDriver> result = new ArrayList();
        ArrayList<org.bson.Document> docs = DeliveryDriverCollection.find().into(new ArrayList<org.bson.Document>());
        for (int i = 0; i < docs.size(); i++) {
            result.add(gson.fromJson(docs.get(i).toJson(), DeliveryDriver.class));
        }
        return result;
    }
    
    public void close() {
        client.close();
    }
}
