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
public class MenuTest {
    
    public MenuTest() {
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
     * Test of getItemID method, of class Menu.
     */
    @Test
    public void testGetItemID() {
        System.out.println("getItemID");
        Menu instance = null;
        int expResult = 0;
        int result = instance.getItemID();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setItemID method, of class Menu.
     */
    @Test
    public void testSetItemID() {
        System.out.println("setItemID");
        int ItemID = 0;
        Menu instance = null;
        instance.setItemID(ItemID);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getItemType method, of class Menu.
     */
    @Test
    public void testGetItemType() {
        System.out.println("getItemType");
        Menu instance = null;
        String expResult = "";
        String result = instance.getItemType();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setItemType method, of class Menu.
     */
    @Test
    public void testSetItemType() {
        System.out.println("setItemType");
        String ItemType = "";
        Menu instance = null;
        instance.setItemType(ItemType);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getFoodItem method, of class Menu.
     */
    @Test
    public void testGetFoodItem() {
        System.out.println("getFoodItem");
        Menu instance = null;
        FoodItem expResult = null;
        FoodItem result = instance.getFoodItem();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setFoodItem method, of class Menu.
     */
    @Test
    public void testSetFoodItem() {
        System.out.println("setFoodItem");
        FoodItem foodItem = null;
        Menu instance = null;
        instance.setFoodItem(foodItem);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getDrinkItem method, of class Menu.
     */
    @Test
    public void testGetDrinkItem() {
        System.out.println("getDrinkItem");
        Menu instance = null;
        DrinkItem expResult = null;
        DrinkItem result = instance.getDrinkItem();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setDrinkItem method, of class Menu.
     */
    @Test
    public void testSetDrinkItem() {
        System.out.println("setDrinkItem");
        DrinkItem drinkItem = null;
        Menu instance = null;
        instance.setDrinkItem(drinkItem);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
