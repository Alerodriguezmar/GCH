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
        if(!VerificarLongitudNombreEquipo(equipo.getNombreEquipo())){
            return("Longitud nombre incorrecta");
        }
        if(!VerificarLongitudMarca(equipo.getMarca())){
            return("Longitud marca incorrecta");
        }
        if(!VerificarLongitudIdEquipo(Integer.toString(equipo.getIdEquipo()))){/*Añadir verificar que sean numeros*/
            return("Identificación incorrecta");
        }    
        if(!VerificarLongitudRegistroSanitarioEquipo(equipo.getRegistroSanitario())){/*Añadir verificar que sean numeros*/
            return("Longitud Registr oSanitario incorrecta");
        }
        if(!VerificarLongitudDescripcionEquipo(equipo.getDescripcionEquipo())){
            return("Longitud descripcion incorrecta");
        }
        
        return("Datos ingresados correctamente");
        
    }
    
    public boolean VerificarLongitudNombreEquipo(String nombre){
        return(nombre.length() >= 2 && nombre.length() < 64);
    }
    public boolean VerificarLongitudMarca(String marca){
        return(marca.length() >= 2 && marca.length() < 32);
    }
    public boolean VerificarLongitudIdEquipo(String id){
        return(id.length() >= 1 && id.length() < 13);
    }
    public boolean VerificarLongitudDescripcionEquipo(String descr){
        return(descr.length() >= 0 && descr.length() < 256);
    }
    public boolean VerificarLongitudRegistroSanitarioEquipo(String reg){
        return(reg.length() >= 12 && reg.length() < 30);
    }
    
}
