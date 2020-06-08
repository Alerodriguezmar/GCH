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
    private String UBICACION_INCORRECTA = "No hay ubicación de la cama";
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
         
        b.setIdCamas(3);
        b.setEstado(false);
        b.setPabellon("Cuidados intensivos");
        b.setUbicacion("");
        
        assertEquals( regisCamas.VerificarRegistroCamas(b),UBICACION_INCORRECTA);
    
    }
    
 
    
    @Test
    public void RegistroCompleto(){
        Camas b = new Camas();
        b.setEstado(true);
        b.setPabellon("Cuidados Intensivos");
        b.setUbicacion("5");
        assertEquals(regisCamas.VerificarRegistroCamas(b), REGISTRO_COMPLETO);
        
         Camas c = new Camas();
        c.setEstado(true);
        c.setPabellon("Cuidados intermedios");
        c.setUbicacion("7");
        assertEquals(regisCamas.VerificarRegistroCamas(b), REGISTRO_COMPLETO);
        
    }
    
    
    @Test
    public void RegistroExist(){
        Camas b = new Camas();

        b.setEstado(false);
        b.setPabellon("Cuidados intermedios");
        b.setUbicacion("256");
        assertEquals(regisCamas.VerificarRegistroCamas(b), REGISTRO_EXISTENTE);
    }
    
    }

