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
import static org.junit.Assert.*;

/**
 *
 * @author Diego
 */
public class ValidarIngresoPacienteTest {
    
    private static ValidarIngresoPaciente ingreso = new ValidarIngresoPaciente();
    private String LONG_PRIMER_NOMBRE_INCORRECTA = "Longitud primer nombre incorrecta";
    private String LONG_SEGUNDO_NOMBRE_INCORRECTA = "Longitud segundo nombre incorrecta";
    private String LONG_PRIMER_APELLIDO_INCORRECTA = "Longitud primer apellido incorrecta";
    private String LONG_SEGUNDO_APELLIDO_INCORRECTA = "Longitud segundo apellido incorrecta";
    private String INDENTIFICACION_INCORRECTA = "Logitud Identificación incorrecta";
    private String SELECCION_SANGRE = "No se ha seleccionado tipo de sangre";
    private String CAMAS_NO_DISPONIBLES = "No hay camas Disponibles";
    private String EQUIPOS_DISPONIBLES ="No hay equipos disponibles";
    private String PACIENTE_REGISTRADO ="Paciente está registrado";
    private String DATOS_CORRECTOS = "Datos del paciente ingresados correctamente";


   
    
    public ValidarIngresoPacienteTest() {
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
    /*
    @Test
    public void PacienteRegistrado() {
    Paciente a = new Paciente();
    a.setIdPaciente(123456);
    a.setNombrePaciente1("Dego");
    a.setNombrePaciente2("alejandro");
    a.setApellidoPaciente1("Rodriguez");
    a.setApellidoPaciente2("Martinez");
    a.setTipoSangre("");
    assertEquals(ingreso.VerificarIngresoPaciente(a),PACIENTE_REGISTRADO );
    }
    */
    
    
     @Test
    public void LongitudIdIncorrecto() {
        
    Paciente a = new Paciente();
    a.setIdPaciente(1);
    a.setNombrePaciente1("Dego");
    a.setNombrePaciente2("alejandro");
    a.setApellidoPaciente1("Rodriguez");
    a.setApellidoPaciente2("Martinez");
    a.setTipoSangre("");
    assertEquals(ingreso.VerificarIngresoPaciente(a),INDENTIFICACION_INCORRECTA);

   
 
    }
    
    
    @Test
    public void LongitudNombreIncorrecto() {
    
    Paciente a = new Paciente();
    a.setIdPaciente(12345);
    a.setNombrePaciente1("D");
    a.setNombrePaciente2("alejandro");
    a.setApellidoPaciente1("Rodriguez");
    a.setApellidoPaciente2("Martinez");
    a.setTipoSangre("");
 
    assertEquals(ingreso.VerificarIngresoPaciente(a), LONG_PRIMER_NOMBRE_INCORRECTA);
    
    }
    
    
     @Test
    public void LongitudApellidoIncorrecto() {
    
    Paciente a = new Paciente();
    a.setIdPaciente(12345);
    a.setNombrePaciente1("Diego");
    a.setNombrePaciente2("alejandro");
    a.setApellidoPaciente1("R");
    a.setApellidoPaciente2("Martinez");
    a.setTipoSangre("");
 
    
   
    assertEquals(ingreso.VerificarIngresoPaciente(a), LONG_PRIMER_APELLIDO_INCORRECTA);
   
    }
    
    
      @Test
    public void TipoDeSangre() {
        
    
    Paciente a = new Paciente();
    a.setIdPaciente(12345);
    a.setNombrePaciente1("Diego");
    a.setNombrePaciente2("alejandro");
    a.setApellidoPaciente1("Rodriguez");
    a.setApellidoPaciente2("Martinez");
    a.setTipoSangre("B +");
 
    
   
    assertEquals(ingreso.VerificarIngresoPaciente(a), SELECCION_SANGRE);
        
    }
    
   
    @Test
    public void NohayCamas(){
    Paciente a = new Paciente();
    a.setIdPaciente(123456);
    a.setNombrePaciente1("Dego");
    a.setNombrePaciente2("alejandro");
    a.setApellidoPaciente1("Rodriguez");
    a.setApellidoPaciente2("Martinez");
    a.setTipoSangre("");
    assertEquals(ingreso.VerificarIngresoPaciente(a),CAMAS_NO_DISPONIBLES);
    }   
    
    @Test
    public void NohayEquipos(){
        Paciente a = new Paciente();
    a.setIdPaciente(123456);
    a.setNombrePaciente1("Dego");
    a.setNombrePaciente2("alejandro");
    a.setApellidoPaciente1("Rodriguez");
    a.setApellidoPaciente2("Martinez");
    a.setTipoSangre("");

    assertEquals(ingreso.VerificarIngresoPaciente(a),CAMAS_NO_DISPONIBLES);
        
    }
    
    @Test
    public void RegistroCompleto(){
    Paciente a = new Paciente();
    a.setIdPaciente(123456);
    a.setNombrePaciente1("Dego");
    a.setNombrePaciente2("alejandro");
    a.setApellidoPaciente1("Rodriguez");
    a.setApellidoPaciente2("Martinez");
    a.setTipoSangre("");

    assertEquals(ingreso.VerificarIngresoPaciente(a),CAMAS_NO_DISPONIBLES);
    }
    
    
}
