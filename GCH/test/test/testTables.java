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
         PersonalMedico personal = new PersonalMedico();
         personal.setId(1234567890);
         personal.setNombre1("Santiago");
         Paciente paciente = new Paciente();
         paciente.setIdPaciente(1234567891);
         paciente.setNombrePaciente1("Santi");
         Camas cama = new Camas();
         cama.setUbicacion("Uzi");
         IngresoPaciente ip = new IngresoPaciente();
         ip.setPaciente(paciente);
         ip.setPersonalm(personal);
         ip.setCama(cama);
         PersonalMedicoDAO pmd = new PersonalMedicoDAO();
         pmd.crear(personal);
         PacienteDAO pd = new PacienteDAO();
         pd.crear(paciente);
         CamaDAO cd = new CamaDAO();
         cd.crear(cama);
         IngresoPacienteDAO ing = new IngresoPacienteDAO();
         ing.crear(ip);
     }
}
