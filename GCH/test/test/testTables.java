/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import DAO.CamaDAO;
import DAO.IngresoPacienteDAO;
import DAO.PacienteDAO;
import DAO.PersonalMedicoDAO;
import Entidad.Camas;
import Entidad.IngresoPaciente;
import Entidad.Paciente;
import Entidad.PersonalMedico;
import java.util.HashSet;
import java.util.Set;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author User
 */
public class testTables {
    
    public testTables() {
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
     public void hello() {
         /*
         PersonalMedico personalm = new PersonalMedico();
         Paciente paciente = new Paciente();
         Camas cama = new Camas();
         IngresoPaciente ingp = new IngresoPaciente();
         IngresoPaciente ingp2 = new IngresoPaciente();
         
         personalm.setId(54321);
         personalm.setNombre1("David");
         
         paciente.setIdPaciente(12345);
         paciente.setNombrePaciente1("Juan");
         
         cama.setUbicacion("Pabellon A");
         
         ingp.setPaciente(paciente);
         ingp.setPersonalm(personalm);
         ingp.setCama(cama);
         ingp.setEstado(true);
         
         ingp2.setPaciente(paciente);
         ingp2.setPersonalm(personalm);
         ingp2.setCama(cama);
         ingp2.setEstado(false);
         
         //DAO
         PacienteDAO pdao = new PacienteDAO();
         pdao.crear(paciente);
         PersonalMedicoDAO pmdao = new PersonalMedicoDAO();
         pmdao.crear(personalm);
         CamaDAO cdao = new CamaDAO();
         cdao.crear(cama);
         IngresoPacienteDAO idao = new IngresoPacienteDAO();
         idao.crear(ingp);
         idao.crear(ingp2);*/
         PacienteDAO pdao2 = new PacienteDAO();
         Paciente prueba = pdao2.leerPorId("12345");
         
     }
}
