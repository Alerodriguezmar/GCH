/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Control;

/**
 *
 * @author DAVID
 */
public class ValidarActualizacionPaciente {
    
    public ValidarActualizacionPaciente() {
    }
    
    public String VerificarActualizacionPaciente(String id){
        if(!VerificarLongitudId(id)){
            return ("Longitud id incorrecta");
        }
        return("Longitud id correcta");
    }
    
    //verifica que longitud de id este entre 2 y 13 dígitos.
    public boolean VerificarLongitudId(String id) {
        return ( id.length() >= 2 &&  id.length() < 13);
    } 
}
