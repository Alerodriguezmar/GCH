
package Control;

import DAO.CamaDAO;
import Entidad.Camas;

public class ValidarRegistroCamas {
    private final CamaDAO dao = new CamaDAO();
    
    public ValidarRegistroCamas(){ 
    }
    
    public String VerificarRegistroCamas(Camas cama){ 
       
        if(isCama(cama.getUbicacion())){
           return("No hay ubicación de la cama"); 
        }
        if (dao.leerE(cama) == true) {
            return("Cama Registrada Correctamente");
        } 
          return ("La cama ya está Registrada"); 
    }
    
   public boolean isCama(String ubicacion){
    return(ubicacion.length()<=0);
   }
}
