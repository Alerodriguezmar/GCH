/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Frontera;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Diego
 */
public class ActualizarPacienteTest {
    
    public ActualizarPacienteTest() {
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
     * Test of limpiar method, of class ActualizarPaciente.
     */
    @Test
    public void testLimpiar() {
        System.out.println("limpiar");
        ActualizarPaciente instance = new ActualizarPaciente();
        instance.limpiar();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of mostrar method, of class ActualizarPaciente.
     */
    @Test
    public void testMostrar() {
        System.out.println("mostrar");
        ActualizarPaciente instance = new ActualizarPaciente();
        String[][] expResult = null;
        String[][] result = instance.mostrar();
        assertArrayEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
