/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Control;

import Entidad.PersonalMedico;

/**
 *
 * @author Diego Irreño
 */
public class ValidarRegistroPersonalMedico {

    public ValidarRegistroPersonalMedico() {
    }
    
    public String VerificarRegistroPersonalMedico(PersonalMedico personal) {
        if(!VerificarLongitudNombre1personalMedico(personal.getNombre1())){
            return("Longitud primer nombre incorrecta");
        }
        if(!VerificarLongitudNombre2personalMedico(personal.getNombre2())){
            return("Longitud segundo nombre incorrecta");
        }
        if(!VerificarLongitudApellido1personalMedico(personal.getApellido1())){
            return("Longitud primer apellido incorrecta");
        }
        if(!VerificarLongitudApellido2personalMedico(personal.getApellido2())){
            return("Longitud segundo apellido incorrecta");
        }
        if(!VerificarLongitudNIpersonalMedico(Integer.toString(personal.getId()))){/*Añadir verificar que sean numeros*/
            return("Identificación incorrecta");
        }
        if(!VerificarCargopersonalMedico(personal.getCargo())){/*Añadir verificar que sean numeros*/
            return("Longitud Cargo incorrecta");
        }
        if(!VerificarLongitudReTHUSpersonalMedico(personal.getReTHUS())){/*Añadir verificar que sean numeros*/
            return("Longitud ReTHUS incorrecta");
        }
        if(!VerificarLongitudEmailpersonalMedico(personal.getEmail())){
            return("Longitud email incorrecta");
        }
        if(!VerificarLongitudCelularpersonalMedico(personal.getCelular())){
            return("Longitud Celular incorrecta");
        }
        if(!VerificarLongitudUsuariopersonalMedico(personal.getUsuario())){
            return("Longitud usuario incorrecta");
        }
        if(!VerificarLongitudContraseniapersonalMedico(personal.getContrasenia())){
            return("Longitud contraseña incorrecta");
        }
        
        return("Datos ingresados correctamente");
    }
    
    public boolean VerificarLongitudNombre1personalMedico(String nombre1){
        return(nombre1.length() >= 2 && nombre1.length() < 20);
    }
    public boolean VerificarLongitudNombre2personalMedico(String nombre2){
        return(nombre2.length() >= 0 && nombre2.length() < 20);
    }
    public boolean VerificarLongitudApellido1personalMedico(String apellido1){
        return(apellido1.length() >= 2 && apellido1.length() < 33);
    }
    public boolean VerificarLongitudApellido2personalMedico(String apellido2){
        return(apellido2.length() >= 0 && apellido2.length() < 33);
    }
    public boolean VerificarLongitudNIpersonalMedico(String ni){
        return(ni.length() >= 5 && ni.length() < 13);
    }
    public boolean VerificarLongitudCelularpersonalMedico(String celular){
        return(celular.length() >= 5 && celular.length() < 14);
    }
    public boolean VerificarLongitudEmailpersonalMedico(String email){
        return(email.length() >= 12 && email.length() < 30);
    }
    public boolean VerificarLongitudUsuariopersonalMedico(String usuario){
        return(usuario.length() >= 4 && usuario.length() < 33);
    }
    public boolean VerificarLongitudContraseniapersonalMedico(String contrasenia){
        return(contrasenia.length() >= 3 && contrasenia.length() < 17);
    }
    public boolean VerificarCargopersonalMedico(String cargo){
        return(cargo.length() >= 2 && cargo.length() < 32);
    }
    public boolean VerificarLongitudReTHUSpersonalMedico(String reTHUS){
        return(reTHUS.length() >= 2 && reTHUS.length() < 32);
    }
    
}
