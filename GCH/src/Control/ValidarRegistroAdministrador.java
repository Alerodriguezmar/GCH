/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Control;

import Entidad.Administrador;

/**
 *
 * @author DAVID
 */
public class ValidarRegistroAdministrador {

    public ValidarRegistroAdministrador() {
    }
    
    public String VerificarRegistroAdministrador(Administrador admin) {
        if(!VerificarLongitudNombre1Admin(admin.getNombre1())){
            return("Longitud primer nombre incorrecta");
        }
        if(!VerificarLongitudNombre2Admin(admin.getNombre2())){
            return("Longitud segundo nombre incorrecta");
        }
        if(!VerificarLongitudApellido1Admin(admin.getApellido1())){
            return("Longitud primer apellido incorrecta");
        }
        if(!VerificarLongitudApellido2Admin(admin.getApellido2())){
            return("Longitud segundo apellido incorrecta");
        }
        if(!VerificarLongitudNIAdmin(admin.getNidentificacion())){/*Añadir verificar que sean numeros*/
            return("Identificación incorrecta");
        }
        if(!VerificarLongitudCelularAdmin(admin.getCelular())){/*Añadir verificar que sean numeros*/
            return("Longitud celular incorrecta");
        }
        if(!VerificarLongitudEmailAdmin(admin.getEmail())){
            return("Longitud email incorrecta");
        }
        if(!VerificarLongitudUsuarioAdmin(admin.getUsuario())){
            return("Longitud usuario incorrecta");
        }
        if(!VerificarLongitudContraseniaAdmin(admin.getContrasenia())){
            return("Longitud contraseña incorrecta");
        }
        
        return("Datos ingresados correctamente");
    }
    
    public boolean VerificarLongitudNombre1Admin(String nombre1){
        return(nombre1.length() >= 2 && nombre1.length() < 20);
    }
    public boolean VerificarLongitudNombre2Admin(String nombre2){
        return(nombre2.length() >= 0 && nombre2.length() < 20);
    }
    public boolean VerificarLongitudApellido1Admin(String apellido1){
        return(apellido1.length() >= 2 && apellido1.length() < 33);
    }
    public boolean VerificarLongitudApellido2Admin(String apellido2){
        return(apellido2.length() >= 0 && apellido2.length() < 33);
    }
    public boolean VerificarLongitudNIAdmin(String ni){
        return(ni.length() >= 5 && ni.length() < 13);
    }
    public boolean VerificarLongitudCelularAdmin(String celular){
        return(celular.length() >= 5 && celular.length() < 14);
    }
    public boolean VerificarLongitudEmailAdmin(String email){
        return(email.length() >= 12 && email.length() < 30);
    }
    public boolean VerificarLongitudUsuarioAdmin(String usuario){
        return(usuario.length() >= 4 && usuario.length() < 33);
    }
    public boolean VerificarLongitudContraseniaAdmin(String contrasenia){
        return(contrasenia.length() >= 3 && contrasenia.length() < 17);
    }
    
}
