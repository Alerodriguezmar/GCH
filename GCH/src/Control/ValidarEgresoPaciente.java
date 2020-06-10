/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Control;


import DAO.PacienteDAO;
import DAO.PacienteDAO_prov;
import Entidad.EgresoPaciente;
import Entidad.IngresoPaciente;
import Entidad.Paciente;

/**
 *
 * @author Diego
 */
public class ValidarEgresoPaciente {
    
     PacienteDAO_prov dao = new PacienteDAO_prov();

    public ValidarEgresoPaciente() {
    }

    public String VerificarEgresoPaciente(IngresoPaciente ingreso) {  
        
        if(!VerificarRegistro(String.valueOf(ingreso.getPaciente().getIdPaciente()))){
            return("El paciente nunca fue registrado");
        }
        if(!VerificarLongitudRegistro(String.valueOf(ingreso.getIdIngreso()))){
            return("Longitud idetificacion incorrecta");   
        } 
        
        if(VerificarLongitudDescripcionEgreso(ingreso.getObservacion())){
            return("longitud Descripcion Incorrecta");
        }

        return ("El paciente fue dado de Alta");
    }
    
    
      public boolean VerificarLongitudDescripcionEgreso(String descr) {
        return (descr.length() <= 0 && descr.length() < 257);
        
      }
      
      public boolean VerificarRegistro(String id){
          return(dao.leerPorId(id) != null);
      }
      
      public boolean VerificarLongitudRegistro(String ni){
        return(ni.length() >= 4 && ni.length() < 13);
    }
      
    }


