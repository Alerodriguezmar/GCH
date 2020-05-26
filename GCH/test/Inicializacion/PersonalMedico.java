/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Inicializacion;

import DAO.UsuarioDAO;
import java.util.ArrayList;
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
public class PersonalMedico {
    
    public PersonalMedico() {
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
    public void initData() {
        UsuarioDAO dao = new UsuarioDAO();
        ArrayList<Entidad.PersonalMedico> usuarios = new ArrayList<Entidad.PersonalMedico>();

        Entidad.PersonalMedico a = new Entidad.PersonalMedico();
        Entidad.PersonalMedico b = new Entidad.PersonalMedico();
        Entidad.PersonalMedico c = new Entidad.PersonalMedico();

        a.setNombre1("juan");
        a.setNombre2("daniel");
        a.setApellido1("perez");
        a.setApellido2("alvear");
        a.setCargo("asistente enfermeria");
        a.setReTHUS("123456");
        a.setNomUsuario("juan");
        a.setPasswordAux("315521");
        a.setTipo_sangre("o+");
        a.setEmail("juanp@unal.edu.co");
        a.setDireccion("Kr10#16–69");
        a.setCelular("31552261");
        
        b.setNombre1("Sofia");
        b.setNombre2("Sara");
        b.setApellido1("Rojas");
        b.setApellido2("Hoyos");
        b.setEmail("Sofi@email.com");
        b.setDireccion("Kr10#16–69");
        b.setTipo_sangre("O+");
        b.setCelular("3112698969");
        b.setCargo("Asistente Enfermeria");
        b.setId(1036895699);
        b.setReTHUS("8369869");
        b.setNomUsuario("sofa");
        b.setPasswordAux("Sof123");
        
        c.setNombre1("Sofia");
        c.setNombre2("Sara");
        c.setApellido1("Rojas");
        c.setApellido2("Hoyos");
        c.setEmail("Sofi@email.com");
        c.setDireccion("Kr10#16–69");
        c.setTipo_sangre("O+");
        c.setCelular("3112698969");
        c.setCargo("Asistente Enfermeria");
        c.setId(1073252824);
        c.setReTHUS("8369869");
        c.setNomUsuario("saray");
        c.setPasswordAux("sa123");

        usuarios.add(a);
        usuarios.add(b);
        usuarios.add(c);

        for (Entidad.PersonalMedico u : usuarios) {
            System.out.println(u.getNomUsuario());
            System.out.println(u.getPasswordAux());
            System.out.println("--------------------------------");
            dao.crear(u);
        }
     }
 
}
