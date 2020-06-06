package test;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import DAO.AdminDAO;
import DAO.CamaDAO;
import Entidad.Administrador;
import Entidad.Camas;
import java.util.ArrayList;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author DAVID
 */
public class TestAndres {
    
    public TestAndres() {
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
    // @Test
    // public void hello() {}
    @Test
    public void initData() {
        /*AdminDAO dao= new AdminDAO();
        ArrayList<Administrador> administradores = new ArrayList<Administrador>();
        Administrador a = new Administrador();
        a.setNombre1("juan");  
        a.setNombre2("daniel");
        a.setApellido1("perez");
        a.setApellido2("alvear");
        a.setEmail("andiazo@unalco");
        a.setCelular("3132202222");
        a.setNidentificacion("1223456");
        a.setUsuario("andiazo");
        a.setContrasenia("123456");
        
        administradores.add(a);
        for (Administrador u: administradores ){
            System.out.println(u.getUsuario());
            System.out.println(u.getContrasenia());
            System.out.println("--------------------------------");
            dao.crear(u);
        }*/
        Camas cama;
        CamaDAO cdao = new CamaDAO();
        cama = cdao.leerCamasDisp();
        System.out.println(cama.getIdCamas());
    }
}
