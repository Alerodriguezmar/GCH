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

    public boolean VerificarLongitudMarca(String marca) {
        return (marca.length() >= 2 && marca.length() < 33);
    }

    public boolean VerificarLongitudDescripcionEquipo(String descr) {
        return (descr.length() > 0 && descr.length() < 257);
    }
      public boolean VerificarLongitudCantidadEquipo(int cant) {
        return (cant > 0 );
    }
    public boolean VerificarLongitudRegistroSanitarioEquipo(String reg) {
        return (reg.length() >= 6 && reg.length() < 31);
    }

}
