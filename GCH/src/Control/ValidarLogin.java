/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Control;

import DAO.PersonalMedicoDAO;
import DAO.UsuarioDAO;
import Entidad.PersonalMedico;
import javax.swing.JOptionPane;

/**
 *
 * @author andiazo 
 */
public class ValidarLogin {
 private final PersonalMedicoDAO dao = new PersonalMedicoDAO();
    public ValidarLogin() {
    }
    
    public String verificarLogin (PersonalMedico usuario){
        if(!VerificarLongitudNombre(usuario.getNomUsuario())){
          //  JOptionPane.showMessageDialog(null, "Longitud nombre incorrecta", "Advertencia", JOptionPane.WARNING_MESSAGE);   
            return("Longitud nombre incorrecta");
        }
        if(!VerificarLongitudPassword(usuario.getPasswordAux())){
          // JOptionPane.showMessageDialog(null, "Longitud contraseña incorrecto", "Advertencia", JOptionPane.WARNING_MESSAGE);   
            return("Longitud contraseña incorrecto");
         
        }
    if (dao.leerd(usuario) != null) {
            return ("Bienvenido");
        }
    // JOptionPane.showMessageDialog(null, "Datos incorrectos", "Advertencia", JOptionPane.WARNING_MESSAGE);
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
