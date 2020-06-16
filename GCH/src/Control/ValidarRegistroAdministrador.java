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

// se instancia la clase para validar el registro de un administrador.
public class ValidarRegistroAdministrador {

    public ValidarRegistroAdministrador() {
    }
    // Se declara el método VerificarRegistroAdministrador que revisa i aplica cada uno de los metodos
    // declarados al terminar este método, para asegurarse de que los datos esten correctos, en tal caso
    // retornará : Datos ingresados correctamente.
    public String VerificarRegistroAdministrador(Administrador admin) {
        if (!VerificarLongitudNombre1Admin(admin.getNombre1())) {
            return ("Longitud primer nombre incorrecta");
        }
        if (!VerificarLongitudNombre2Admin(admin.getNombre2())) {
            return ("Longitud segundo nombre incorrecta");
        }
        if (!VerificarLongitudApellido1Admin(admin.getApellido1())) {
            return ("Longitud primer apellido incorrecta");
        }
        if (!VerificarLongitudApellido2Admin(admin.getApellido2())) {
            return ("Longitud segundo apellido incorrecta");
        }
        if (!VerificarLongitudNIAdmin(admin.getNidentificacion())) {/*Añadir verificar que sean numeros*/
            return ("Identificación incorrecta");
        }
        if (!VerificarLongitudCelularAdmin(admin.getCelular())) {/*Añadir verificar que sean numeros*/
            return ("Longitud celular incorrecta");
        }
        if (!VerificarLongitudEmailAdmin(admin.getEmail())) {
            return ("Longitud email incorrecta");
        }
        if (!VerificarLongitudUsuarioAdmin(admin.getUsuario())) {
            return ("Longitud usuario incorrecta");
        }
        if (!VerificarLongitudContraseniaAdmin(admin.getContrasenia())) {
            return ("Longitud contraseña incorrecta");
        }

        return ("Datos ingresados correctamente");
    }
//Métodos
    //verifica que la longitud del primer nombre este entre 4 y 14 digitos.
    public boolean VerificarLongitudNombre1Admin(String nombre1) {
        return (nombre1.length() >= 4 && nombre1.length() <= 14);
    }
    // verifica que la longitud del segundo nombre sea menor o igual a 14 digitos.
    public boolean VerificarLongitudNombre2Admin(String nombre2) {
        return (nombre2.length() <= 14);
    }
    //verifica que la longitud del primer apellido este entre 4 y 14 digitos.
    public boolean VerificarLongitudApellido1Admin(String apellido1) {
        return (apellido1.length() >= 4 && apellido1.length() <= 14);
    }
    //verifica que la longitud del segundo APELLIDO sea menor o igual a 14 digitos.
    public boolean VerificarLongitudApellido2Admin(String apellido2) {
        return (apellido2.length() <= 14);
    }
    //Verifica que la longitud del NI del adiministrador este entre 4 y 11 digitos.
    //Tambien se hace llamado al metodo isNumeric, para hacer el parsing al tipo de dato.
    public boolean VerificarLongitudNIAdmin(String ni) {
        boolean isNum = isNumeric(ni);
        return (ni.length() >= 4 && ni.length() < 12 && isNum);
    }
    //Verifica que la longitud del numero de celular sea de 10 digitos exactamente.
    //Tambien se hace llamado al metodo isNumeric, para hacer el parsing al tipo de dato.
    public boolean VerificarLongitudCelularAdmin(String celular) {
        boolean isNum = isNumeric(celular);
        return (celular.length() == 10);
    }
    //Verifica que la longitud del email sea mayor o igual a 8 digitos.
    //en el que el email debe coincidir con el signo @ en la posicion designada.
    public boolean VerificarLongitudEmailAdmin(String email) {
        return (email.length() >= 8 /*&& email.matches("[-\\w\\.]+@\\w+\\.\\w+")*/);
    }
    //Verifica que la longitud del usuario este entre 5 y 32 digitos.
        public boolean VerificarLongitudUsuarioAdmin(String usuario) {
        return (usuario.length() >= 5 && usuario.length() < 33);
    }
    //Verifica que la longitud de la contraseña sea mayor o igual a 5 digitos y 
    //que solo contenga caracteres de los tipos definidos entre comillas.
    public boolean VerificarLongitudContraseniaAdmin(String contrasenia) {
        return (contrasenia.length() >= 5 && !contrasenia.matches(".*[^A-Za-z_0-9].*"));
    }
    //Analiza las dos contraseñas
    public boolean VerificarSimilitudContrasenia(String contrasenia1, String contrasenia2) {
        return (contrasenia1.equals(contrasenia2));
    }
//Método para convertir un entero a una cadena string.
    public static boolean isNumeric(String cadena) {
        boolean resultado;
        try {
            Integer.parseInt(cadena);
            resultado = true;
        } catch (NumberFormatException excepcion) {
            resultado = false;
        }
        return resultado;
    }

}
