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
//Clase que contiene el metodo para validar el registro del personal médico.

public class ValidarRegistroPersonalMedico {

    public ValidarRegistroPersonalMedico() {
    }
    
    //Aquí se declara el metodo para realizar la verificación total de un registro de cualquier personal médico
    //que en caso de ser exitoso, retornará: datos ingresados correctamente, y registrará al personal.
    
    public String VerificarRegistroPersonalMedico(PersonalMedico personal) {
        if(!VerificarLongitudNombre1personalMedico(personal.getNombre1())){
            return("Longitud primer nombre incorrecta" );
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
        if(!VerificarLongitudNIpersonalMedico(Integer.toString(personal.getId()))){
            return("Identificación incorrecta");
        }
        if(!VerificarCargopersonalMedico(personal.getCargo())){
            return("Longitud Cargo incorrecta");
        }
        if(!VerificarLongitudReTHUSpersonalMedico(personal.getReTHUS())){
            return("Longitud ReTHUS incorrecta");
        }
        if(!VerificarLongitudEmailpersonalMedico(personal.getEmail())){
            return("Longitud email incorrecta");
        }
        if(!VerificarLongitudCelularpersonalMedico(personal.getCelular())){
            return("Longitud Celular incorrecta");
        }
        if(!VerificarLongitudUsuariopersonalMedico(personal.getNomUsuario())){
            return("Longitud usuario incorrecta");
        }
        if(!VerificarLongitudContraseniapersonalMedico(personal.getPasswordAux())){
            return("Longitud contraseña incorrecta");
        }
         if(!VerificarLongitudDireccionpersonalMedico(personal.getDireccion())){
            return("Longitud dirección incorrecta");
        }
        return("Datos ingresados correctamente");
    }
    
    //Método para verificar la longitud del nombre 1 del personal en cuestión (4 y 16 dígitos).
    
    public boolean VerificarLongitudNombre1personalMedico(String nombre1){
        return(nombre1.length() >= 4 && nombre1.length() < 15);
    }
    
    //Método para verificar la longitud del nombre 2 del personal (menor o igual a 14 dígitos).
    
    public boolean VerificarLongitudNombre2personalMedico(String nombre2){
        return(nombre2.length() <= 14);
    }
    
    //Método para verificar la longitud del apellido 1 del personal en cuestión (4 y 16 dígitos).
    
    public boolean VerificarLongitudApellido1personalMedico(String apellido1){
        return(apellido1.length() >= 4 && apellido1.length() < 15);
    }
    
    //Método para verificar la longitud del apellido 2 del personal (menor o igual a 14 dígitos). 
    
    public boolean VerificarLongitudApellido2personalMedico(String apellido2){
        return( apellido2.length() <= 14);
    }
    //Método para verificar la longitud del numero NI del personal (4 y 12 dígitos).
    
    public boolean VerificarLongitudNIpersonalMedico(String ni){
        return(ni.length() >= 4 && ni.length() < 13);
    }
    
    //Método para verificar la longitud de la dirección del personal en cuestión (8 y 32 dígitos).
    
     public boolean VerificarLongitudDireccionpersonalMedico(String direccion){
        return(direccion.length() >= 8 && direccion.length() < 33);
    }
     
     //Método para verificar la longitud del celular del personal en cuestión, este debe tener exactamente 10 digitos.
     
    public boolean VerificarLongitudCelularpersonalMedico(String celular){
        return(celular.length() == 10);
    }
    
    //Método para verificar la longitud del e-mail (correo electronico) del personal en cuestión 
    //(mayor a igual a 8 digitos, y debe contener @). 
    
    public boolean VerificarLongitudEmailpersonalMedico(String email){
         return(email.length() >= 8 && email.matches("[-\\w\\.]+@\\w+\\.\\w+"));
    }
    
    //Método para verificar la longitud del usuario a utilizar del personal en cuestión (5 y 32 dígitos). 
    
    public boolean VerificarLongitudUsuariopersonalMedico(String usuario){
        return(usuario.length() >= 5 && usuario.length() < 33);
    }
    
    //Método para verificar la longitud de la contraseña que quedara registrada en el usuario 
    //debe ser mayor a 4 dígitos y debe contener solo caracteres entre (a-z,A-Z,0-9).
    
    public boolean VerificarLongitudContraseniapersonalMedico(String contrasenia){
        return(contrasenia.length() >= 5 /*&& /*contrasenia.matches(".*[^A-Za-z_0-9].*")*/ );
    }
    
    //Método para verificar la longitud del cargo al que quedara registrado el personal en cuestión(2 y 31 dígitos).
    
    public boolean VerificarCargopersonalMedico(String cargo){
        return(cargo.length() >= 2 && cargo.length() < 32);
    }
    
    //Método para verificar la longitud del ReThus del personal en cuestión (10 y 26 dígitos). 
    
    public boolean VerificarLongitudReTHUSpersonalMedico(String reTHUS){
        return(reTHUS.length() >= 10 && reTHUS.length() < 25);
    }
    
    //Analiza las dos contraseñas si coinciden
    public boolean VerificarSimilitudContrasenia(String contrasenia1, String contrasenia2) {
        return (contrasenia1.equals(contrasenia2));
    }
    
    
}
