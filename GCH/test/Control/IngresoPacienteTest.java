/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Control;

import Entidad.Paciente;
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
public class IngresoPacienteTest {
    
    private static ValidarIngresoPaciente IngrePaci = new ValidarIngresoPaciente();
     private String LONG_ID_INCORRECTA = "Longitud de id paciente incorrecta";
     private String LONG_NOMBRE1_INCORRECTA = "Longitud del primer nombre incorrecta";
     private String LONG_NOMBRE2_INCORRECTA = "Longitud del segundo nombre incorrecta";
     private String LONG_APELLIDO_INCORRECTA = "Longitud del segundo nombre incorrecta";
     private String REGISTRO_COMPLETO = "";
    
     
    
    public IngresoPacienteTest() {
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
     public void LongitudNombre() {
     
         Paciente a = new Paciente();
         a.setNombrePaciente1("R");
         a.setNombrePaceinte2("Freddy");
         a.setApellidoPaciente1("Rojas");
         a.setApellidoPaciente2("Hoyos");
         a.setIdPaciente(1);
         assertEquals(a, a);
     
     
     }
     
     @Test 
     public void LongitudApellido(){
     Paciente a = new Paciente();
         a.setNombrePaciente1(LONG_ID_INCORRECTA);
         a.setNombrePaceinte2(REGISTRO_COMPLETO);
         a.setApellidoPaciente1(LONG_ID_INCORRECTA);
         a.setApellidoPaciente2(LONG_ID_INCORRECTA);
         a.setIdPaciente(1);
         assertEquals(a, a);
     }
     
     @Test
     public void LongitudIdIncorrecta(){
         Paciente a = new Paciente();
         a.setNombrePaciente1(LONG_ID_INCORRECTA);
         a.setNombrePaceinte2(REGISTRO_COMPLETO);
         a.setApellidoPaciente1(LONG_ID_INCORRECTA);
         a.setApellidoPaciente2(LONG_ID_INCORRECTA);
         a.setIdPaciente(1);
         assertEquals(a, a);
     }
     
     @Test
     public void RegistroCompleto(){
     Paciente a = new Paciente();
         a.setNombrePaciente1(LONG_ID_INCORRECTA);
         a.setNombrePaceinte2(REGISTRO_COMPLETO);
         a.setApellidoPaciente1(LONG_ID_INCORRECTA);
         a.setApellidoPaciente2(LONG_ID_INCORRECTA);
         a.setIdPaciente(1);
         assertEquals(a, a);
     }
     
     
     
}
