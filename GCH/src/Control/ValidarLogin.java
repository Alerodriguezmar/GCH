/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Control;

/**
 *
 * @author andiazo 
 */
public class ValidarLogin {

    public ValidarLogin() {
    }
    
    public String verificarLogin (Usuario usuario){
        if(!VerificarLongitudNombre(usuario.getNombre())){
            return("Longitud nombre incorrecta");
        }
        if(!VerificarLongitudPassword(usuario.getPassword())){
            return("Longitud contraseña incorrecto");
        }}
        /*
        for(Usuario u: sistema.getUsuarios()){
            if(u.getNombre().equals(usuario.getNombre()) && u.getPassword().equals(usuario.getPassword())){
                return("Bienvenido");
            }
        }
        */
    
    
    public boolean VerificarLongitudNombre (String nombre){
        return(nombre.length() > 1 && nombre.length() <= 6);
    }
    
    public boolean VerificarLongitudPassword (String contrasenia){
        return(contrasenia.length() >= 3 && contrasenia.length() < 6);
    }
    
}
