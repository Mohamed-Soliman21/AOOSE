/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author BUE
 */
public class RestaurantTest {
    
    public RestaurantTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
    }
    
    @AfterEach
    public void tearDown() {
    }

    /**
     * Test of getID method, of class Restaurant.
     */
    @Test
    public void testGetID() {
        System.out.println("getID");
        Restaurant instance = null;
        int expResult = 0;
        int result = instance.getID();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setID method, of class Restaurant.
     */
    @Test
    public void testSetID() {
        System.out.println("setID");
        int ID = 0;
        Restaurant instance = null;
        instance.setID(ID);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getName method, of class Restaurant.
     */
    @Test
    public void testGetName() {
        System.out.println("getName");
        Restaurant instance = null;
        String expResult = "";
        String result = instance.getName();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setName method, of class Restaurant.
     */
    @Test
    public void testSetName() {
        System.out.println("setName");
        String Name = "";
        Restaurant instance = null;
        instance.setName(Name);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getAddresses method, of class Restaurant.
     */
    @Test
    public void testGetAddresses() {
        System.out.println("getAddresses");
        Restaurant instance = null;
        String[] expResult = null;
        String[] result = instance.getAddresses();
        assertArrayEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setAddresses method, of class Restaurant.
     */
    @Test
    public void testSetAddresses() {
        System.out.println("setAddresses");
        String[] Addresses = null;
        Restaurant instance = null;
        instance.setAddresses(Addresses);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getRating method, of class Restaurant.
     */
    @Test
    public void testGetRating() {
        System.out.println("getRating");
        Restaurant instance = null;
        float expResult = 0.0F;
        float result = instance.getRating();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setRating method, of class Restaurant.
     */
    @Test
    public void testSetRating() {
        System.out.println("setRating");
        float Rating = 0.0F;
        Restaurant instance = null;
        instance.setRating(Rating);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
