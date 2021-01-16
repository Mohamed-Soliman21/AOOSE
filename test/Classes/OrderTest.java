/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes;

import DesignPatterns.State;
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
public class OrderTest {
    
    public OrderTest() {
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
     * Test of getState method, of class Order.
     */
    @Test
    public void testGetState() {
        System.out.println("getState");
        Order instance = null;
        State expResult = null;
        State result = instance.getState();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setState method, of class Order.
     */
    @Test
    public void testSetState() {
        System.out.println("setState");
        State state = null;
        Order instance = null;
        instance.setState(state);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getOrderID method, of class Order.
     */
    @Test
    public void testGetOrderID() {
        System.out.println("getOrderID");
        Order instance = null;
        int expResult = 0;
        int result = instance.getOrderID();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setOrderID method, of class Order.
     */
    @Test
    public void testSetOrderID() {
        System.out.println("setOrderID");
        int OrderID = 0;
        Order instance = null;
        instance.setOrderID(OrderID);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getOrderItems method, of class Order.
     */
    @Test
    public void testGetOrderItems() {
        System.out.println("getOrderItems");
        Order instance = null;
        String[] expResult = null;
        String[] result = instance.getOrderItems();
        assertArrayEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setOrderItems method, of class Order.
     */
    @Test
    public void testSetOrderItems() {
        System.out.println("setOrderItems");
        String[] OrderItems = null;
        Order instance = null;
        instance.setOrderItems(OrderItems);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of isHavePromocode method, of class Order.
     */
    @Test
    public void testIsHavePromocode() {
        System.out.println("isHavePromocode");
        Order instance = null;
        boolean expResult = false;
        boolean result = instance.isHavePromocode();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setHavePromocode method, of class Order.
     */
    @Test
    public void testSetHavePromocode() {
        System.out.println("setHavePromocode");
        boolean HavePromocode = false;
        Order instance = null;
        instance.setHavePromocode(HavePromocode);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getRestaurant method, of class Order.
     */
    @Test
    public void testGetRestaurant() {
        System.out.println("getRestaurant");
        Order instance = null;
        Restaurant expResult = null;
        Restaurant result = instance.getRestaurant();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setRestaurant method, of class Order.
     */
    @Test
    public void testSetRestaurant() {
        System.out.println("setRestaurant");
        Restaurant restaurant = null;
        Order instance = null;
        instance.setRestaurant(restaurant);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getDeliveryDriver method, of class Order.
     */
    @Test
    public void testGetDeliveryDriver() {
        System.out.println("getDeliveryDriver");
        Order instance = null;
        DeliveryDriver expResult = null;
        DeliveryDriver result = instance.getDeliveryDriver();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setDeliveryDriver method, of class Order.
     */
    @Test
    public void testSetDeliveryDriver() {
        System.out.println("setDeliveryDriver");
        DeliveryDriver deliveryDriver = null;
        Order instance = null;
        instance.setDeliveryDriver(deliveryDriver);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getDeliveryCost method, of class Order.
     */
    @Test
    public void testGetDeliveryCost() {
        System.out.println("getDeliveryCost");
        Order instance = null;
        float expResult = 0.0F;
        float result = instance.getDeliveryCost();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setDeliveryCost method, of class Order.
     */
    @Test
    public void testSetDeliveryCost() {
        System.out.println("setDeliveryCost");
        float DeliveryCost = 0.0F;
        Order instance = null;
        instance.setDeliveryCost(DeliveryCost);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
