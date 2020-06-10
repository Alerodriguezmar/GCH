/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Inicializacion;

import DAO.PacienteDAO;
import java.util.ArrayList;
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
public class Paciente {
    
    public Paciente() {
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
             
           PacienteDAO dao = new PacienteDAO();
           
        ArrayList<Entidad.Paciente> Pacientes = new ArrayList<Entidad.Paciente>();
        Entidad.Paciente a = new Entidad.Paciente();
        a.setNombrePaciente1("Dego");
        a.setNombrePaciente2("alejandro");
        a.setApellidoPaciente1("Rodriguez");
        a.setApellidoPaciente2("Martinez");
        a.setTipoSangre("O +");
        a.setIdPaciente(123456);
        
             
            Pacientes.add(a);
              for (Entidad.Paciente u: Pacientes ){
            System.out.println(u.getIdPaciente());
            System.out.println(u.getNombrePaciente1());
            System.out.println("--------------------------------");
            dao.crear(u);
        }
             }
}
