/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import javax.swing.JTextField;
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
public class ControllerValidationsTest {

    public ControllerValidationsTest() {
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
     * Test of validatePicoPlaca method, of class ControllerValidations.
     */
    @Test
    public void testValidatePicoPlaca() {
        System.out.println("validatePicoPlaca");
        char lastDigit = '3';
        int day = 2;
        ControllerValidations instance = new ControllerValidations();
        int expResult = 1;
        int result = instance.validatePicoPlaca(lastDigit, day);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        // fail("The test case is a prototype.");
    }

}
