/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Control;

import Entidad.Administrador;
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
public class LoginAdminTest {
    
    private static ValidarLoginAdmin loginAdmin = new ValidarLoginAdmin();
    private String LONG_NOMBRE_INCORRECTA = "Longitud nombre incorrecta";
    private String LONG_PASSWORD_INCORRECTA = "Longitud contraseña incorrecta";
    private String DATOS_INCORRECTO = "Datos incorrectos";
    private String USUARIO_AUTORIZADO = "Bienvenido";
    
    public LoginAdminTest() {
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
     
     
    public void testLongitudNombre(){
         Administrador u = new Administrador();
        u.setUsuario("A");
        u.setContrasenia("1234567");
        assertEquals(loginAdmin.verificarLogin(u),LONG_NOMBRE_INCORRECTA);
        
        u.setUsuario("Ale");
        u.setContrasenia("123456");
        assertEquals(loginAdmin.verificarLogin(u),LONG_NOMBRE_INCORRECTA);   
    }
    
    @Test
    public void testLongitudContrasenia(){
        
        Administrador u = new Administrador();
        u.setUsuario("Santi");
        u.setContrasenia("12");
        assertEquals(loginAdmin.verificarLogin(u),LONG_PASSWORD_INCORRECTA);
        
        u.setUsuario("Andin");
        u.setContrasenia("123");
        assertEquals(loginAdmin.verificarLogin(u),LONG_PASSWORD_INCORRECTA); 
        
    }
    
    @Test
    
    public void testNombre(){
        Administrador u = new Administrador();
        u.setUsuario("Alejo");
        u.setContrasenia("123456");
        assertEquals(loginAdmin.verificarLogin(u),DATOS_INCORRECTO);
        
    }
    
    @Test
    
    public void testcontrasenia(){
        Administrador u = new Administrador();
        u.setUsuario("Santi");
        u.setContrasenia("12345");
        assertEquals(loginAdmin.verificarLogin(u),DATOS_INCORRECTO);
        
    }
    
    @Test
     public void testDatos(){
        Administrador u = new Administrador();
        u.setUsuario("Henry");
        u.setContrasenia("12345");
        assertEquals(loginAdmin.verificarLogin(u),DATOS_INCORRECTO);
        
    }
     
     @Test
     public void testTodoCorrecto(){
         
        Administrador u = new Administrador();
        u.setUsuario("andin");
        u.setContrasenia("123456");
        assertEquals(loginAdmin.verificarLogin(u),USUARIO_AUTORIZADO);
        
        u.setUsuario("Santi");
        u.setContrasenia("santi123");
        assertEquals(loginAdmin.verificarLogin(u),USUARIO_AUTORIZADO);
        
        u.setUsuario("Alero");
        u.setContrasenia("123456");
        assertEquals(USUARIO_AUTORIZADO,loginAdmin.verificarLogin(u));
         
         
     }
   
}
