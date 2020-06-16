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
//Clase para validar el inicio de sesion del administrador del programa.
public class ValidarLoginAdmin {
    private final AdminDAO dao = new AdminDAO();
    
    //Se crea el método verificarLogin el cual sera utilizado para ver un objeto del tipo usuario en la clase Adiministrador
    //Para poder leer sus datos, al llamar a los metodos 3 metodos de cada uno de los if.
    //-En caso de fallar el primer if, retornará: "longitud nombre incorrecta".
    //-En caso de fallar el segundo if, retornará: "longitud contraseña incorrecto".
    //-Si existe un usuario que no es nulo al que se le puede ejecutar el metodo leerd, retorna: Bienvenido.
    //-Por ultimo en caso de que no pueda ser ejecutado el método leerd en usuario el sistema retornara; Datos incorrectos.
    public ValidarLoginAdmin() {
    }
    public String verificarLogin (Administrador usuario){
        if(!VerificarLongitudNombre(usuario.getUsuario())){
            return("Longitud nombre incorrecta");
        }
        if(!VerificarLongitudPassword(usuario.getContrasenia())){
            return("Longitud contraseña incorrecta");
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
    
    
//Método para verificar la longitud del nombre la cual debe estar entre 5 y 32 digitos.

    public boolean VerificarLongitudNombre (String nombre){
        return(nombre.length() >= 5 && nombre.length() <= 32);
    }
 //Método para verificar la longitud de la contraseña la cual debe ser mayor o igual a 5 dígitos.

    public boolean VerificarLongitudPassword (String contrasenia){
        return(contrasenia.length() >= 5);
    }
    
}
