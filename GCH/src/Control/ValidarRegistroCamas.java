
package Control;

import DAO.CamaDAO;
import Entidad.Camas;

public class ValidarRegistroCamas {
    private final CamaDAO dao = new CamaDAO();
    public ValidarRegistroCamas(){ 
    }
    
    public String VerificarRegistroCamas(Camas cama){ 
         if (dao.leerE(cama) == true) {
            return("Cama Registrada Correctamente");
        }
          return ("La cama ya está Registrada"); 
    }
    
  
}
