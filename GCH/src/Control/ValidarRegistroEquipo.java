/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Control;

import Entidad.Equipo;

/**
 *
 * @author Diego Irreño
 */


public class ValidarRegistroEquipo {

    public ValidarRegistroEquipo() {
    }
// Se declara el metodo VerificarRegistroEquipo que llama los métodos de verificación descritos al terminar este método.
    public String VerificarRegistroEquipo(Equipo equipo) {

        if (!VerificarLongitudMarca(equipo.getMarca())) {
            return ("Longitud marca incorrecta");
        }
        if (!VerificarLongitudRegistroSanitarioEquipo(equipo.getRegistroSanitario())) {/*Añadir verificar que sean numeros*/
            return ("Longitud Registro Sanitario incorrecta");
        }
        if (!VerificarLongitudDescripcionEquipo(equipo.getDescripcionEquipo())) {
            return ("Longitud descripcion incorrecta");
        }

        return ("Datos ingresados correctamente");

    }
    //Método para verificar la longitud del texto ingresado en marca (2 y 32 dígitos).
    public boolean VerificarLongitudMarca(String marca) {
        return (marca.length() >= 2 && marca.length() < 33);
    }
    //Método para verificar la longitud del texto ingresado en descripcion de equipo (1 y 256 dígitos).
    public boolean VerificarLongitudDescripcionEquipo(String descr) {
        return (descr.length() > 0 && descr.length() < 257);
    }
    //Método para verificar que la cantidad de equipo ingresada sea un entero.

    public boolean VerificarLongitudCantidadEquipo(int cant) {
        return (cant > 0 );
    }
    //Método para verificar la longitud del código de registro sanitario del equipo(6 y 30 dígitos)
    public boolean VerificarLongitudRegistroSanitarioEquipo(String reg) {
        return (reg.length() >= 6 && reg.length() < 31);
    }

}
