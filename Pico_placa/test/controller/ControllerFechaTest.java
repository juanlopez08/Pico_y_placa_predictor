/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author juanc
 */
public class ControllerFechaTest {
    
    public ControllerFechaTest() {
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
     * Test of dayofweek method, of class ControllerFecha.
     */
    @Test
    public void testDayofweek() {
        System.out.println("dayofweek");
        int day = 9;
        int month = 9;
        int year = 2015;
        ControllerFecha instance = new ControllerFecha();
        int expResult = 3;
        int result = instance.dayofweek(day, month, year);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
