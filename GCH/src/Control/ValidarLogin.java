/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Control;

import DAO.UsuarioDAO;
import Entidad.PersonalMedico;

/**
 *
 * @author andiazo 
 */
public class ValidarLogin {
 private final UsuarioDAO dao = new UsuarioDAO();
    public ValidarLogin() {
    }
    
    public String verificarLogin (PersonalMedico usuario){
        if(!VerificarLongitudNombre(usuario.getNomUsuario())){
            return("Longitud nombre incorrecta");
        }
        if(!VerificarLongitudPassword(usuario.getPasswordAux())){
            return("Longitud contraseña incorrecto");
        }
    if (dao.leer(usuario) != null) {
            return ("Bienvenido");
        }
        return ("Datos incorrectos");
    }
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
        return(contrasenia.length() >= 3 && contrasenia.length() < 10);
    }
    
}
