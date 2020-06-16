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
        // Se crea el metodo para verificar el egreso de un paciente en el que se revisan:
        // -Que exista un IDpaciente.
        // -Que la longitud de la identificacion sea correcta.
        // -Que la longitud de la descripcion no exceda el limita establecido.
        // si todo lo anterior se cumple se retorna un mensaje en el que se notifica el egreso del paciente.
    public String VerificarEgresoPaciente(IngresoPaciente ingreso) {  
        
        if(!VerificarRegistro(String.valueOf(ingreso.getPaciente().getIdPaciente()))){
            return("El paciente nunca fue registrado");
        }
        if(!VerificarLongitudRegistro(String.valueOf(ingreso.getIdIngreso()))){
            return("Longitud identificacion incorrecta");   
        } 
        
        if(VerificarLongitudDescripcionEgreso(ingreso.getObservacion())){
            return("longitud Descripcion Incorrecta");
        }

        return ("El paciente fue dado de Alta");
    }
    
        // A continuacion se verifica que la longitud de la descripcion no exceda 256 caracteres.
      public boolean VerificarLongitudDescripcionEgreso(String descr) {
        return (descr.length() <= 0 && descr.length() < 257);
        
      }
      //Se verifica que exista un id y no sea nulo
      public boolean VerificarRegistro(String id){
          return(dao.leerPorId(id) != null);
      }
      //Se verifica que la longitud del nombre del registro estre entre 4 y 13 digitos
      public boolean VerificarLongitudRegistro(String ni){
        return(ni.length() >= 4 && ni.length() < 13);
    }
      
    }


