
package Control;

import DAO.CamaDAO;
import Entidad.Camas;

//Clase para validar el registro exitoso de una cama en el sistema. 

public class ValidarRegistroCamas {
    private final CamaDAO dao = new CamaDAO();
    
    public ValidarRegistroCamas(){ 
    }
    // Se define un string de nombre VerificarRegistroCamas, que recibira un objeto de tipo cama
    // y al que le hara una solicitud de tipo get, para revisar si tiene ubicación, y si es posible
    // llamarle el metodo leerE, si es así, retornará: cama registrada correctamente,
    // En caso de que no pueda ser ejecutado el metodo significa que ya existe una cama con esos datos
    // por lo que retornara: la cama ya esta registrada.
      
    public String VerificarRegistroCamas(Camas cama){ 
       
        if(isCama(cama.getUbicacion())){
           return("No hay ubicación de la cama"); 
        }
        if (dao.leerE(cama) == true) {
            return("Cama Registrada Correctamente");
        } 
          return ("La cama ya está Registrada"); 
    }
    
    //Metodo para saber la variable ubicación de la cama.
   public boolean isCama(String ubicacion){
    return(ubicacion.length()<=0);
   }
}
