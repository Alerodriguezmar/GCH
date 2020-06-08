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
public class RegistroAdminTest {
    
    private static ValidarRegistroAdministrador registroAdmin = new ValidarRegistroAdministrador();
    private String LONG_PRIMER_NOMBRE_INCORRECTA = "Longitud primer nombre incorrecta";
    private String LONG_SEGUNDO_NOMBRE_INCORRECTA = "Longitud segundo nombre incorrecta";
    private String LONG_PRIMER_APELLIDO_INCORRECTA = "Longitud primer apellido incorrecta";
    private String LONG_SEGUNDO_APELLIDO_INCORRECTA = "Longitud segundo apellido incorrecta";
    private String INDENTIFICACION_INCORRECTA = "Identificación incorrecta";
    private String LONG_CARGO_INCORRECTO = "Longitud Cargo incorrecta";
    private String LONG_RETHUS_INCORRECTO = "Longitud ReTHUS incorrecta";
    private String LONG_EMAIL_INCORRECTO = "Longitud email incorrecta";
    private String LONG_CELULAR_INCORRECTA = "Longitud celular incorrecta";
    private String LONG_USUARIO_INCORRECTO = "Longitud usuario incorrecta";
    private String LONG_CONTRASENIA_INCORRECTA = "Longitud contraseña incorrecta";
    private String REGISTRO_COMPLETO = "Datos ingresados correctamente";
    
    public RegistroAdminTest() {
    }
    
    
     @Test
    public void LogitudPrimerNombre() {
        
        Administrador a = new Administrador();
        a.setNombre1("j");  
        a.setNombre2("daniel");
        a.setApellido1("perez");
        a.setApellido2("alvear");
        a.setEmail("andiazo@unalco");
        a.setCelular("313220222");
        a.setNidentificacion("1223456");
        a.setUsuario("andiazo");
        a.setContrasenia("123456");
        
         assertEquals(registroAdmin.VerificarRegistroAdministrador(a),LONG_PRIMER_NOMBRE_INCORRECTA);
         
         
         a.setNombre1("DiegoAlejandroRodriguez");  
        a.setNombre2("daniel");
        a.setApellido1("perez");
        a.setApellido2("alvear");
        a.setEmail("andiazo@unalco");
        a.setCelular("313220222");
        a.setNidentificacion("1223456");
        a.setUsuario("andiazo");
        a.setContrasenia("123456");
        
         assertEquals(registroAdmin.VerificarRegistroAdministrador(a),LONG_PRIMER_NOMBRE_INCORRECTA);
         
        
        }
    
     @Test
     
     public void IdenticacionTest(){
         Administrador a = new Administrador();
        a.setNombre1("juan");  
        a.setNombre2("daniel");
        a.setApellido1("perez");
        a.setApellido2("alvear");
        a.setEmail("andiazo@unalco");
        a.setCelular("3132202222");
        a.setNidentificacion("124");
        a.setUsuario("andiazo");
        a.setContrasenia("123456");
        assertEquals(registroAdmin.VerificarRegistroAdministrador(a),INDENTIFICACION_INCORRECTA);
        
        a.setNombre1("juan");  
        a.setNombre2("daniel");
        a.setApellido1("perez");
        a.setApellido2("alvear");
        a.setEmail("andiazo@unalco");
        a.setCelular("313220222");
        a.setNidentificacion("123456789112");
        a.setUsuario("andiazo");
        a.setContrasenia("123456");
        assertEquals(registroAdmin.VerificarRegistroAdministrador(a),INDENTIFICACION_INCORRECTA);
         
     }
     
     
     @Test
     public void NumeroCelIncorecto(){
        Administrador a = new Administrador();
        a.setNombre1("juan");  
        a.setNombre2("daniel");
        a.setApellido1("perez");
        a.setApellido2("alvear");
        a.setEmail("andiazo@unalco");
        a.setCelular("3112");
        a.setNidentificacion("12645");
        a.setUsuario("andiazo");
        a.setContrasenia("123456");
        assertEquals(registroAdmin.VerificarRegistroAdministrador(a),LONG_CELULAR_INCORRECTA);
         
         
         
     }
     
     @Test
     
     public void LongitudUsuariaAdminIncorecto(){
         
        Administrador a = new Administrador();
        a.setNombre1("juan");  
        a.setNombre2("daniel");
        a.setApellido1("perez");
        a.setApellido2("alvear");
        a.setEmail("andiazo@unalco");
        a.setCelular("3112897257");
        a.setNidentificacion("12645");
        a.setUsuario("and");
        a.setContrasenia("123456");
        assertEquals(registroAdmin.VerificarRegistroAdministrador(a),LONG_USUARIO_INCORRECTO);
         
         
     }
     
     @Test
     
     public void LogitudContraseñaIncorecta (){
         
        Administrador a = new Administrador();
        a.setNombre1("juan");  
        a.setNombre2("daniel");
        a.setApellido1("perez");
        a.setApellido2("alvear");
        a.setEmail("andiazo@unalco");
        a.setCelular("3112897257");
        a.setNidentificacion("12645");
        a.setUsuario("andinazo");
        a.setContrasenia("23");
        assertEquals(registroAdmin.VerificarRegistroAdministrador(a),LONG_CONTRASENIA_INCORRECTA);
         
     }
     
     
     @Test
     
     public void ResgistroAdminExitoso(){
         Administrador a = new Administrador();
        a.setNombre1("juan");  
        a.setNombre2("daniel");
        a.setApellido1("perez");
        a.setApellido2("alvear");
        a.setEmail("andiazo@unalco");
        a.setCelular("3112897257");
        a.setNidentificacion("12645");
        a.setUsuario("andinazo");
        a.setContrasenia("23456");
        assertEquals(registroAdmin.VerificarRegistroAdministrador(a),REGISTRO_COMPLETO);
     }
    
    }
    
   

