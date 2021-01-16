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
public class FoodItemTest {
    
    public FoodItemTest() {
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
     * Test of getFoodType method, of class FoodItem.
     */
    @Test
    public void testGetFoodType() {
        System.out.println("getFoodType");
        FoodItem instance = null;
        String expResult = "";
        String result = instance.getFoodType();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setFoodType method, of class FoodItem.
     */
    @Test
    public void testSetFoodType() {
        System.out.println("setFoodType");
        String FoodType = "";
        FoodItem instance = null;
        instance.setFoodType(FoodType);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getFoodDescription method, of class FoodItem.
     */
    @Test
    public void testGetFoodDescription() {
        System.out.println("getFoodDescription");
        FoodItem instance = null;
        String expResult = "";
        String result = instance.getFoodDescription();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setFoodDescription method, of class FoodItem.
     */
    @Test
    public void testSetFoodDescription() {
        System.out.println("setFoodDescription");
        String FoodDescription = "";
        FoodItem instance = null;
        instance.setFoodDescription(FoodDescription);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getFoodCost method, of class FoodItem.
     */
    @Test
    public void testGetFoodCost() {
        System.out.println("getFoodCost");
        FoodItem instance = null;
        float expResult = 0.0F;
        float result = instance.getFoodCost();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setFoodCost method, of class FoodItem.
     */
    @Test
    public void testSetFoodCost() {
        System.out.println("setFoodCost");
        float FoodCost = 0.0F;
        FoodItem instance = null;
        instance.setFoodCost(FoodCost);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
