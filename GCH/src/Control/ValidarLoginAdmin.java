/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Control;

import DAO.AdminDAO;
import Entidad.Administrador;
import Entidad.PersonalMedico;

/**
 *
 * @author DAVID
 */
public class ValidarLoginAdmin {
    private final AdminDAO dao = new AdminDAO();

    public ValidarLoginAdmin() {
    }
    public String verificarLogin (Administrador usuario){
        if(!VerificarLongitudNombre(usuario.getUsuario())){
            return("Longitud nombre incorrecta");
        }
        if(!VerificarLongitudPassword(usuario.getContrasenia())){
            return("Longitud contraseña incorrecto");
        }
    if (dao.leerd(usuario) != null) {
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
