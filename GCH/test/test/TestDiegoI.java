/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import DAO.PersonalMedicoDAO;
import DAO.UsuarioDAO;
import Entidad.PersonalMedico;
import java.util.ArrayList;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author user
 */
public class TestDiegoI {
    
    public TestDiegoI() {
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
    @Test
    public void initData(){
    PersonalMedicoDAO dao= new PersonalMedicoDAO();
     ArrayList<PersonalMedico> usuarios = new ArrayList<PersonalMedico>();

    PersonalMedico a = new PersonalMedico();
     /*private String nombre1;
        private String nombre2;
        private String apellido1;
        private String apellido2;
        private String cargo;
        private String ReTHUS;
        private String nomUsuario;
        private String passwordAux;
      private String email;
        private String direccion;
        private String tipo_sangre;
        private String celular;
    */
    a.setNombre1("david");  
    a.setNombre2("daniel");
    a.setApellido1("perez");
    a.setApellido2("alvear");
    a.setCargo("Medico General");
    a.setReTHUS("123456");
    a.setNomUsuario("david");
    a.setPasswordAux("315521");
    a.setTipo_sangre("o+");
    a.setEmail("juanp@unal.edu.co");
    a.setDireccion("calle siempre viva");
    a.setCelular("315521");

    usuarios.add(a);




    for (PersonalMedico u: usuarios ){
    System.out.println(u.getNomUsuario());
     System.out.println(u.getPasswordAux());
      System.out.println("--------------------------------");
      dao.crear(u);
    }
}
    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
}
