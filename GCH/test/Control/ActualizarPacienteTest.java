/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Control;

import DAO.PacienteDAO;
import DAO.PacienteDAO_prov;
import Entidad.Paciente;
import Frontera.ActualizarPaciente;
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
    
   
   private static ValidarActualizacionPaciente Valiact = new ValidarActualizacionPaciente();
    private String ID_INCORRECTA = "Longitud id incorrecta";
    private String NO_RESGISTRADO = "No esta registrado el paciente";
    private String ACTUALIZADO = "Usuario Actualizado";
    
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

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
     @Test
     public void longitudIdIconrrecta() {
         
         Paciente paci = new Paciente();
         paci.setIdPaciente(7);
         paci.setNombrePaciente1("Juan");
         paci.setNombrePaciente2("Carlos");
         paci.setApellidoPaciente1("Rodriguez");
         paci.setApellidoPaciente2("");
         paci.setTipoSangre("O +");
         assertEquals(Valiact.VerificarActualizacionPaciente(String.valueOf(paci.getIdPaciente())),ID_INCORRECTA );
         
     }
     
 
     @Test
     public void PacienteActualizado(){
          Paciente paci = new Paciente();
         paci.setIdPaciente(789878);
         paci.setNombrePaciente1("Juan");
         paci.setNombrePaciente2("Carlos");
         paci.setApellidoPaciente1("Rodriguez");
         paci.setApellidoPaciente2("");
         paci.setTipoSangre("O +");
         assertEquals(Valiact.VerificarActualizacionPaciente(String.valueOf(paci.getIdPaciente())),ACTUALIZADO);
     }
     
     


     }

