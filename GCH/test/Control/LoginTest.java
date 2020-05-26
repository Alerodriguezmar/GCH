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
public class LoginTest {
    
    private static ValidarLogin login = new ValidarLogin();
    private String LONG_NOMBRE_INCORRECTA = "Longitud nombre incorrecta";
    private String LONG_PASSWORD_INCORRECTA = "Longitud contraseña incorrecto";
    private String DATOS_INCORRECTO = "Datos incorrectos";
    private String USUARIO_AUTORIZADO = "Bienvenido";
    
    public LoginTest() {
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
       Entidad.PersonalMedico a = new Entidad.PersonalMedico();
        a.setNomUsuario("S");
        a.setPasswordAux("1234567");
        assertEquals(login.verificarLogin(a),LONG_NOMBRE_INCORRECTA);
        
        a.setNomUsuario("DiegoAlejandroRodriguezMartinez");
        a.setPasswordAux("123456");
        assertEquals(login.verificarLogin(a),LONG_NOMBRE_INCORRECTA);   
    }
    
    @Test
    public void testLongitudContrasenia(){
        
        Entidad.PersonalMedico u = new Entidad.PersonalMedico();
        u.setNomUsuario("Santi");
        u.setPasswordAux("12");
        assertEquals(login.verificarLogin(u),LONG_PASSWORD_INCORRECTA);
        
        u.setNomUsuario("Andi");
        u.setPasswordAux("12345678912");
        assertEquals(login.verificarLogin(u),LONG_PASSWORD_INCORRECTA); 
        
    }
    
    @Test
    
    public void testNombre(){
        Entidad.PersonalMedico u = new Entidad.PersonalMedico();
        u.setNomUsuario("Saray");
        u.setPasswordAux("123456");
        assertEquals(login.verificarLogin(u),DATOS_INCORRECTO);
        
    }
    
    @Test
    
    public void testcontrasenia(){
        Entidad.PersonalMedico u = new Entidad.PersonalMedico();
        u.setNomUsuario("Santi");
        u.setPasswordAux("1234");
        assertEquals(login.verificarLogin(u),DATOS_INCORRECTO);
        
    }
    
    @Test
     public void testDatos(){
        Entidad.PersonalMedico u = new Entidad.PersonalMedico();
        u.setNomUsuario("Henry");
        u.setPasswordAux("1234");
        assertEquals(login.verificarLogin(u),DATOS_INCORRECTO);
        
    }
     
     @Test
     public void testTodoCorrecto(){
         
        Entidad.PersonalMedico u = new Entidad.PersonalMedico();
        u.setNomUsuario("saray");
        u.setPasswordAux("sa123");
        assertEquals(login.verificarLogin(u),USUARIO_AUTORIZADO);
        
        u.setNomUsuario("sofa");
        u.setPasswordAux("Sof123");
        assertEquals(login.verificarLogin(u),USUARIO_AUTORIZADO);
        
        u.setNomUsuario("juan");
        u.setPasswordAux("315521");
        assertEquals(login.verificarLogin(u),USUARIO_AUTORIZADO);
         
         
     }
    
}
