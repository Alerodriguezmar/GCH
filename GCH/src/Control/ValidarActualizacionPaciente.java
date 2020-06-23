/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Control;

import DAO.PacienteDAO;

/**
 *
 * @author DAVID
 */
public class ValidarActualizacionPaciente {
    private final PacienteDAO daoP = new PacienteDAO();
    
    public ValidarActualizacionPaciente() {
    }
    
    public String VerificarActualizacionPaciente(String id){
        if(!VerificarLongitudId(id)){

            return ("Longitud id incorrecta" + id);
        }
        
         if(!VerificarIsRegistrado(id)){
            return("No esta registrado el paciente");
        }
        return("Usuario Actualizado");
    }
    
    //verifica que longitud de id este entre 2 y 13 dígitos.
    public boolean VerificarLongitudId(String id) {
        return ( id.length() >= 2 &&  id.length() < 13);
    } 
    
        //revisa si el paciente ya está registrado
     public boolean VerificarIsRegistrado(String id) {
        return (daoP.leerPorId(id) != null);
    }
     
}
