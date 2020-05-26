/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Inicializacion;

import DAO.AdminDAO;
import Entidad.Administrador;
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
public class Administradores {
    
    public Administradores() {
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
        
        AdminDAO dao= new AdminDAO();
        ArrayList<Administrador> administradores = new ArrayList<Administrador>();
        
        Administrador a = new Administrador();
        Administrador b = new Administrador();
        Administrador c = new Administrador();
        
        a.setNombre1("Diego");  
        a.setNombre2("Alejandro");
        a.setApellido1("Rodriguez");
        a.setApellido2("Martinez");
        a.setEmail("laero@unalco");
        a.setCelular("3132202222");
        a.setNidentificacion("1223456");
        a.setUsuario("Alero");
        a.setContrasenia("123456");
        
        b.setNombre1("Santiago");  
        b.setNombre2("David");
        b.setApellido1("Aguiñar");
        b.setApellido2("Perez");
        b.setEmail("Sagu@unalco");
        b.setCelular("3132202222");
        b.setNidentificacion("1223456");
        b.setUsuario("Santi");
        b.setContrasenia("santi123");
        
        c.setNombre1("juan");  
        c.setNombre2("daniel");
        c.setApellido1("perez");
        c.setApellido2("alvear");
        c.setEmail("andiazo@unalco");
        c.setCelular("3132202222");
        c.setNidentificacion("1223456");
        c.setUsuario("andin");
        c.setContrasenia("123456");
        
        administradores.add(a);
        administradores.add(b);
        administradores.add(c);
        
        for (Administrador u: administradores ){
            System.out.println(u.getUsuario());
            System.out.println(u.getContrasenia());
            System.out.println("--------------------------------");
            dao.crear(u);
        }
    }
}
