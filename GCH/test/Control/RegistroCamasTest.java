/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Control;

import Entidad.Camas;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Administrador
 */
public class RegistroCamasTest {
    
    private static ValidarRegistroCamas regisCamas = new ValidarRegistroCamas();
    private String REGISTRO_EXISTENTE = "La cama ya está Registrada";
    private String REGISTRO_COMPLETO = "Cama Registrada Correctamente";
    
    
    public RegistroCamasTest() {
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

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    
   @Test
    public void LongitudUbicacionPabellon() {
    
        Camas b = new Camas();
        b.setIdCamas(1);
        b.setEstado(false);
        b.setPabellon("5");
        b.setUbicacion("Izquierdo Inferior");
        assertEquals( REGISTRO_EXISTENTE,regisCamas.VerificarRegistroCamas(b));
    
    }
    
 
    
    @Test
    public void RegistroCompleto(){
        Camas b = new Camas();
        b.setEstado(true);
        b.setPabellon("Pabellon 4");
        b.setUbicacion("Segundo piso izq");
        assertEquals(regisCamas.VerificarRegistroCamas(b), REGISTRO_COMPLETO);
        
         Camas c = new Camas();
        c.setEstado(true);
        c.setPabellon("Pabellon 7");
        c.setUbicacion("Primer Piso Der.");
        assertEquals(regisCamas.VerificarRegistroCamas(b), REGISTRO_COMPLETO);
        
    }
    }

