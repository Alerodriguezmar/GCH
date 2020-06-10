/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Control;

import Entidad.EgresoPaciente;
import Entidad.IngresoPaciente;
import Entidad.Paciente;
import java.util.Calendar;
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
public class ValidarEgresoTest {
    
     private static ValidarEgresoPaciente ingreso = new ValidarEgresoPaciente();
    private String PACIENTE_RECUPERADO = "El paciente fue dado de Alta";
    private String PACIENTE_NO_REGISTRADO = "El paciente nunca fue registrado";
    private String LONGITUD_IDENTIFICACION = "Longitud idetificacion incorrecta";
    private String LONGITUD_DESCRIPCION_INCORRECTA = "longitud Descripcion Incorrecta";
   
    public ValidarEgresoTest() {
        
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

    /*=======================================================*/
    /*=======================================================*/
    /*=======================================================*/
    /*=======================================================*/
    
     @Test
     public void EGRESO() {
         
         Paciente b = new Paciente();
         b.setIdPaciente(1073252824);
         
         Paciente c = new Paciente();
         c.setIdPaciente(1073252824);
         
         Paciente e = new Paciente();
         e.setIdPaciente(1036959 );
         
         
         
         IngresoPaciente a = new IngresoPaciente();
         
         a.setFecha(String.valueOf(Calendar.getInstance()));
         a.setIdIngreso(1073252824);
         a.setPaciente(b);
         a.setObservacion("El paciente no Presenta complicaciones");       
         assertEquals(ingreso.VerificarEgresoPaciente(a),PACIENTE_RECUPERADO );
         
         IngresoPaciente d = new IngresoPaciente();
         
         d.setFecha(String.valueOf(Calendar.getInstance()));
         d.setIdIngreso(1073252824);
         d.setPaciente(c);
         d.setObservacion("En perfecto estado de Salud ");       
         assertEquals(ingreso.VerificarEgresoPaciente(a),PACIENTE_RECUPERADO );
         
             IngresoPaciente f = new IngresoPaciente();
         
         f.setFecha(String.valueOf(Calendar.getInstance()));
         f.setIdIngreso(1036959 );
         f.setPaciente(c);
         f.setObservacion("En perfecto estado de Salud ");       
         assertEquals(ingreso.VerificarEgresoPaciente(f),PACIENTE_RECUPERADO );
         
     }
     
     @Test
     public void LongitudIdIncorrecta(){
         Paciente b = new Paciente();
         b.setIdPaciente(1);
         
        IngresoPaciente a = new IngresoPaciente();
         
         a.setFecha(String.valueOf(Calendar.getInstance()));
         a.setIdIngreso(1);
         a.setPaciente(b);
         a.setObservacion("Se le asignaron citas dentro de 3 semanas");       
         assertEquals(ingreso.VerificarEgresoPaciente(a),LONGITUD_IDENTIFICACION );
         
         
         
     }
     
     @Test
     public void LogitudDescripcion(){
         
         
        Paciente b = new Paciente();
         b.setIdPaciente(8956363);
         
        IngresoPaciente a = new IngresoPaciente();
         
         a.setFecha(String.valueOf(Calendar.getInstance()));
         a.setIdIngreso(8956363);
         a.setPaciente(b);
         a.setObservacion("");       
         assertEquals(ingreso.VerificarEgresoPaciente(a), LONGITUD_DESCRIPCION_INCORRECTA);
         
         
          Paciente e = new Paciente();
         e.setIdPaciente(73189636);
         
        IngresoPaciente c = new IngresoPaciente();
         
         c.setFecha(String.valueOf(Calendar.getInstance()));
         c.setIdIngreso(73189636);
         c.setPaciente(e);
         c.setObservacion("");       
         assertEquals(ingreso.VerificarEgresoPaciente(a), LONGITUD_DESCRIPCION_INCORRECTA);
         
     }
     
     @Test
     public void PacienteNoregistrado(){
         Paciente b = new Paciente();
         b.setIdPaciente(146598);
        IngresoPaciente a = new IngresoPaciente();
        IngresoPaciente c = new IngresoPaciente();
        c.setIdIngreso(123456);
        
         
         a.setFecha(String.valueOf(Calendar.getInstance()));
         a.setIdIngreso(123456);
         a.setPaciente(b); 
         a.setObservacion("Se le asignaron citas dentro de 3 semanas");       
         assertEquals(ingreso.VerificarEgresoPaciente(a),PACIENTE_RECUPERADO );
         
     }
     
}
