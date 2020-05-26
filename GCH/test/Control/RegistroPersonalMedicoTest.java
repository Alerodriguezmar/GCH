/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Control;

import Entidad.PersonalMedico;
import Entidad.PersonalMedico_;
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
public class RegistroPersonalMedicoTest {
    
    private static ValidarRegistroPersonalMedico RegistroMedico = new ValidarRegistroPersonalMedico();
    private String LONG_PRIMER_NOMBRE_INCORRECTA = "Longitud primer nombre incorrecta";
    private String LONG_SEGUNDO_NOMBRE_INCORRECTA = "Longitud segundo nombre incorrecta";
    private String LONG_PRIMER_APELLIDO_INCORRECTA = "Longitud primer apellido incorrecta";
    private String LONG_SEGUNDO_APELLIDO_INCORRECTA = "Longitud segundo apellido incorrecta";
    private String INDENTIFICACION_INCORRECTA = "Identificación incorrecta";
    private String LONG_EMAIL_INCORRECTO = "Longitud email incorrecta";
    private String LONG_CELULAR_INCORRECTA = "Longitud Celular incorrecta";
    private String LONG_USUARIO_INCORRECTO = "Longitud usuario incorrecta";
    private String LONG_CONTRASENIA_INCORRECTA = "Longitud contraseña incorrecta";
    private String REGISTRO_COMPLETO = "Datos ingresados correctamente";
    
    public RegistroPersonalMedicoTest() {
    }

    @Test
    public void RegistroPersonalExitoso() {
    
        PersonalMedico b = new PersonalMedico();
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
        b.setNomUsuario("Sofro");
        b.setPasswordAux("Sof123");
    
        assertEquals(RegistroMedico.VerificarRegistroPersonalMedico(b), REGISTRO_COMPLETO);
    
    }
    
    
    @Test
    
    public void LongitudNmbrePersonal(){
        
        PersonalMedico b = new PersonalMedico();
        b.setNombre1("S");
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
        b.setNomUsuario("Sofro");
        b.setPasswordAux("Sof123");
    
        assertEquals(RegistroMedico.VerificarRegistroPersonalMedico(b), LONG_PRIMER_NOMBRE_INCORRECTA);
        
        
    }
    
     @Test
     
     public void IdentificacionIncorrecta(){
         
         PersonalMedico b = new PersonalMedico();
        b.setNombre1("Sofia");
        b.setNombre2("Sara");
        b.setApellido1("Rojas");
        b.setApellido2("Hoyos");
        b.setEmail("Sofi@email.com");
        b.setDireccion("Kr10#16–69");
        b.setTipo_sangre("O+");
        b.setCelular("3112698969");
        b.setCargo("Asistente Enfermeria");
        b.setId(1039);
        b.setReTHUS("8369869");
        b.setNomUsuario("Sofro");
        b.setPasswordAux("Sof123");
    
        assertEquals(RegistroMedico.VerificarRegistroPersonalMedico(b), INDENTIFICACION_INCORRECTA);
         
     }
    
     
     @Test
     
     public void CelularIncorrecto(){
         PersonalMedico b = new PersonalMedico();
        b.setNombre1("Sofia");
        b.setNombre2("Sara");
        b.setApellido1("Rojas");
        b.setApellido2("Hoyos");
        b.setEmail("Sofi@email.com");
        b.setDireccion("Kr10#16–69");
        b.setTipo_sangre("O+");
        b.setCelular("3112");
        b.setCargo("Asistente Enfermeria");
        b.setId(1036895699);
        b.setReTHUS("8369869");
        b.setNomUsuario("Sofro");
        b.setPasswordAux("Sof123");
    
        assertEquals(RegistroMedico.VerificarRegistroPersonalMedico(b), LONG_CELULAR_INCORRECTA);
     }
    
     
     
      @Test
      
      public void LongitudUsuarioIncorrecto(){
         PersonalMedico b = new PersonalMedico();
        b.setNombre1("Sofia");
        b.setNombre2("Sara");
        b.setApellido1("Rojas");
        b.setApellido2("Hoyos");
        b.setEmail("Sofi@email.com");
        b.setDireccion("Kr10#16–69");
        b.setTipo_sangre("O+");
        b.setCelular("3112897257");
        b.setCargo("Asistente Enfermeria");
        b.setId(1036895699);
        b.setReTHUS("8369869");
        b.setNomUsuario("So");
        b.setPasswordAux("Sof123");
    
        assertEquals(RegistroMedico.VerificarRegistroPersonalMedico(b), LONG_USUARIO_INCORRECTO);  
          
      }
     
      @Test
      
      public void LongitudContraseñaIncorrecta(){
         PersonalMedico b = new PersonalMedico();
        b.setNombre1("Sofia");
        b.setNombre2("Sara");
        b.setApellido1("Rojas");
        b.setApellido2("Hoyos");
        b.setEmail("Sofi@email.com");
        b.setDireccion("Kr10#16–69");
        b.setTipo_sangre("O+");
        b.setCelular("3112897257");
        b.setCargo("Asistente Enfermeria");
        b.setId(1036895699);
        b.setReTHUS("8369869");
        b.setNomUsuario("Sofro");
        b.setPasswordAux("So");
    
        assertEquals(RegistroMedico.VerificarRegistroPersonalMedico(b), LONG_CONTRASENIA_INCORRECTA);  
             
          
          
      }
     
}
