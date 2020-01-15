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
public class ControllerPlacaTest {
    
    public ControllerPlacaTest() {
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
     * Test of getLastDigit method, of class ControllerPlaca.
     */
    @Test
    public void testGetLastDigit() {
        System.out.println("getLastDigit");
        String placa = "123458";
        ControllerPlaca instance = new ControllerPlaca();
        char expResult = '8';
        char result = instance.getLastDigit(placa);
        assertEquals(expResult, result);
       
        
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of validateChapa method, of class ControllerPlaca.
     */
    @Test
    public void testValidateChapa() {
        System.out.println("validateChapa");
        String chapa = "HJH6569";
        ControllerPlaca instance = new ControllerPlaca();
        int expResult = 1;
        int result = instance.validateChapa(chapa);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
