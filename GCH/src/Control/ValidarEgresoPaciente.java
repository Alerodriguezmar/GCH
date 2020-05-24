
package Control;

import Entidad.EgresoPaciente;
/**
 *
 * @author Daniel Guillen
 */
public class ValidarEgresoPaciente {
    
    public ValidarEgresoPaciente(){

    }
    public String VerificarEgresoPaciente(EgresoPaciente egresoPaciente) {
        if(!VerificarLongitudidNI(EgresoPaciente.getIdPaciente())){
            return("Longitud identificacion del paciente incorrecta");
        }
        if(!VerificarLongitudObservaciones(EgresoPaciente.getObservaciones())){
            return("Longitud identificacion del paciente incorrecta");
        }
        return("Datos ingresados Correctamente, Paciente Egresado del Hospital");
       
    }
    
   /*public boolean verificarLongitudID(int idPaciente){
       return(idPaciente.length() >= 2 && idPaciente.length() <= 12 );
   }*/
    public boolean VerificarLongitudNI(String ni){
        boolean isNum = isNumeric(ni);
        return(ni.length() >= 5 && ni.length() < 13 && isNum);
    }
   public boolean VerificarLongitudObservaciones(String Observaciones){
       return(Observaciones.length() >= 2 && Observaciones.length() <= 256 );
   }
   public static boolean isNumeric(String cadena) {
        boolean resultado;
        try {
            Integer.parseInt(cadena);
            resultado = true;
        } catch (NumberFormatException excepcion) {
            resultado = false;
        }
        return resultado;
    }
   
}
