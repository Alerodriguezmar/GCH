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
    
    //se instancia un objeto de la clase validarlogin.
 public ValidarLogin() {
    }
    // Se crea el metodo verificarlogin, invocado sobre el usuario,  en el que se llaman a los siguientes metodos:
    // (Verificar longitud nombre, Verificar longitud password, los cuales son declarados mas adelante en el codigo).
    // -En caso de fallar el primer if, retornara: "longitud nombre incorrecta".
    // -En caso de fallar el segundo if, retornara: "longitud contraseña incorrecto".
    // -Si existe un usuario que no es nulo al que se le puede ejecutar el metodo leerd, retornará: Bienvenido.
    // -Por último en caso de que no pueda ser ejecutado el método leerd en usuario el sistema retornará; Datos incorrectos.
   
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
        //JOptionPane.showMessageDialog(null, "Datos incorrectos", "Advertencia", JOptionPane.WARNING_MESSAGE);
        return ("Datos incorrectos");
    }
        /*
        for(Usuario u: sistema.getUsuarios()){
            if(u.getNombre().equals(usuario.getNombre()) && u.getPassword().equals(usuario.getPassword())){
                return("Bienvenido");
            }
        }
        */
    
   
    //Método para verificar la longitud del nombre la cual debe estar entre 4 y 30 digitos.
    
    public boolean VerificarLongitudNombre (String nombre){
        return(nombre.length() >= 4 && nombre.length() <= 30);
    }
    //Método para verificar la longitud de la contraseña la cual debe ser mayor o igual a 4 dígitos.

    public boolean VerificarLongitudPassword (String contrasenia){
        return(contrasenia.length() >= 4 );
    }
    
}
