/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import Classes.Customer;
import DB.New;
import org.bson.Document;

/**
 *
 * @author BUE
 */
public class Test {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Document doc1 = new Document("FName", "Mo").append("LName", "So").append("Role", "bjgv");
        New DB = new New();
        DB.insertCustomer(doc1);
    }
    
}
