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
public class PaymentTest {
    
    public PaymentTest() {
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
     * Test of getAmount method, of class Payment.
     */
    @Test
    public void testGetAmount() {
        System.out.println("getAmount");
        Payment instance = null;
        float expResult = 0.0F;
        float result = instance.getAmount();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setAmount method, of class Payment.
     */
    @Test
    public void testSetAmount() {
        System.out.println("setAmount");
        float Amount = 0.0F;
        Payment instance = null;
        instance.setAmount(Amount);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of MakePayment method, of class Payment.
     */
    @Test
    public void testMakePayment() {
        System.out.println("MakePayment");
        Payment instance = null;
        instance.MakePayment();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
