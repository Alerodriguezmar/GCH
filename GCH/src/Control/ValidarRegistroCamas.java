
package Control;

import Entidad.Camas;

public class ValidarRegistroCamas {
    public ValidarRegistroCamas(){ 
    }
    
    public String VerificarRegistroCamas(Camas cama){
        if(!VerificarLongitudUbicacion(cama.getUbicacion())){
        return ("Longitud Ubicacion Incorrecta"); 
        }
        if(!VerificarLongitudPabellon(cama.getPabellon())){
        return ("Longitud Ubicacion Incorrecta"); 
        }
        return("Cama Registrada Correctamente");
    }
    
    public boolean VerificarLongitudUbicacion(String Ubicacion){
        return(Ubicacion.length() >= 2 && Ubicacion.length() <= 256); 
    } 
    public boolean VerificarLongitudPabellon(String Pabellon){
        return(Pabellon.length() >= 2 && Pabellon.length() <= 256); 
    } 
}
