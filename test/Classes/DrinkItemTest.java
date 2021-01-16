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
public class DrinkItemTest {
    
    public DrinkItemTest() {
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
     * Test of getDrinkType method, of class DrinkItem.
     */
    @Test
    public void testGetDrinkType() {
        System.out.println("getDrinkType");
        DrinkItem instance = null;
        String expResult = "";
        String result = instance.getDrinkType();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setDrinkType method, of class DrinkItem.
     */
    @Test
    public void testSetDrinkType() {
        System.out.println("setDrinkType");
        String DrinkType = "";
        DrinkItem instance = null;
        instance.setDrinkType(DrinkType);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getDrinkDescription method, of class DrinkItem.
     */
    @Test
    public void testGetDrinkDescription() {
        System.out.println("getDrinkDescription");
        DrinkItem instance = null;
        String expResult = "";
        String result = instance.getDrinkDescription();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setDrinkDescription method, of class DrinkItem.
     */
    @Test
    public void testSetDrinkDescription() {
        System.out.println("setDrinkDescription");
        String DrinkDescription = "";
        DrinkItem instance = null;
        instance.setDrinkDescription(DrinkDescription);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getDrinkCost method, of class DrinkItem.
     */
    @Test
    public void testGetDrinkCost() {
        System.out.println("getDrinkCost");
        DrinkItem instance = null;
        float expResult = 0.0F;
        float result = instance.getDrinkCost();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setDrinkCost method, of class DrinkItem.
     */
    @Test
    public void testSetDrinkCost() {
        System.out.println("setDrinkCost");
        float DrinkCost = 0.0F;
        DrinkItem instance = null;
        instance.setDrinkCost(DrinkCost);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
