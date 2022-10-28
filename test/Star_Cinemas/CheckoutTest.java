/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Star_Cinemas;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author jacob.s
 */
public class CheckoutTest {
    
    public CheckoutTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of checkoutCalculation method, of class Checkout.
     */
    @Test
    public void testCheckoutCalculation() {
        System.out.println("checkoutCalculation");
        double price = 3.5;
        int quantity = 2;
        Checkout instance = new Checkout();
        double expResult = 7;
        double result = instance.checkoutCalculation(price, quantity);
        assertEquals(expResult, result, 0);
    }

    /**
     * Test of addTotal method, of class Checkout.
     */
    @Test
    public void testAddTotal() {
        System.out.println("addTotal");
        double total = 28.5;
        double billTotal = 11.5;
        Checkout instance = new Checkout();
        double expResult = 40;
        double result = instance.addTotal(total, billTotal);
        assertEquals(expResult, result, 0.0);
    }

    /**
     * Test of billTotal method, of class Checkout.
     */
    @Test
    public void testBillTotal() {
        System.out.println("billTotal");
        double billTotal = 75.50;
        double ticketTotal = 25.0;
        Checkout instance = new Checkout();
        double expResult = 100.50;
        double result = instance.billTotal(billTotal, ticketTotal);
        assertEquals(expResult, result, 0.0);
    }
    /**
     * Test of checkoutCalculation method, of class Checkout.
     */
    @Test
    public void testCheckoutCalculation2() {
        System.out.println("checkoutCalculation 2");
        double price = 12.5;
        int quantity = 25;
        Checkout instance = new Checkout();
        double expResult = 312.50;
        double result = instance.checkoutCalculation(price, quantity);
        assertEquals(expResult, result, 0);
    }

    /**
     * Test of addTotal method, of class Checkout.
     */
    @Test
    public void testAddTotal2() {
        System.out.println("addTotal 2 ");
        double total = 153.5;
        double billTotal = 191.5;
        Checkout instance = new Checkout();
        double expResult = 345;
        double result = instance.addTotal(total, billTotal);
        assertEquals(expResult, result, 0.0);
    }

    /**
     * Test of billTotal method, of class Checkout.
     */
    @Test
    public void testBillTotal2() {
        System.out.println("billTotal 2");
        double billTotal = 32.75;
        double ticketTotal = 57.0;
        Checkout instance = new Checkout();
        double expResult = 89.75;
        double result = instance.billTotal(billTotal, ticketTotal);
        assertEquals(expResult, result, 0.0);
    }
    /**
     * Test of getBillTotal method, of class Checkout.
     */
    @Test
    public void testGetBillTotal() {
        System.out.println("getBillTotal");
        Checkout instance = new Checkout();
        double expResult = 0.0;
        double result = instance.getBillTotal();
        assertEquals(expResult, result, 0.0);
    }

    /**
     * Test of getFinalTotal method, of class Checkout.
     */
    @Test
    public void testGetFinalTotal() {
        System.out.println("getFinalTotal");
        Checkout instance = new Checkout();
        double expResult = 0.0;
        double result = instance.getFinalTotal();
        assertEquals(expResult, result, 0.0);

    }

    /**
     * Test of getCompleteTotal method, of class Checkout.
     */
    @Test
    public void testGetCompleteTotal() {
        System.out.println("getCompleteTotal");
        Checkout instance = new Checkout();
        double expResult = 0.0;
        double result = instance.getCompleteTotal();
        assertEquals(expResult, result, 0.0);
    }
    
}
