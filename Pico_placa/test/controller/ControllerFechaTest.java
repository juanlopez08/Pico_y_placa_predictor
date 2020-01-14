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
     * Test of dayOfWeek method, of class ControllerFecha.
     */
    @Test
    public void testDayofweek() {
        System.out.println("dayofweek");
        int day = 9;
        int month = 9;
        int year = 2015;
        ControllerFecha instance = new ControllerFecha();
        int expResult = 3;
        int result = instance.dayOfWeek(day, month, year);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of dayOfWeek method, of class ControllerFecha.
     */
    

    /**
     * Test of theDayIs method, of class ControllerFecha.
     */
    @Test
    public void testTheDayIs() {
        System.out.println("theDayIs");
        int dayNumber = 5;
        ControllerFecha instance = new ControllerFecha();
        String expResult = "Friday";
        String result = instance.theDayIs(dayNumber);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of dayOfWeek method, of class ControllerFecha.
     */
   

    /**
     * Test of StringToInt method, of class ControllerFecha.
     */
    @Test
    public void testStringToInt() {
        System.out.println("StringToInt");
        String date = "05/06/2012";
        ControllerFecha instance = new ControllerFecha();
        int[] expResult = {5, 6, 2012};
        int[] result = instance.StringToInt(date);
        assertArrayEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
