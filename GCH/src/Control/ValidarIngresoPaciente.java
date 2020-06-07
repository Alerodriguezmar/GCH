package Control;

import DAO.CamaDAO;
import DAO.EquipoDAO;
import DAO.IngresoPacienteDAO;
import DAO.PacienteDAO;
import Entidad.Paciente;
/**
 *
 * @author Julio Munoz
 */
public class ValidarIngresoPaciente {

    private final CamaDAO daoC = new CamaDAO();
    private final EquipoDAO daoE = new EquipoDAO();
    private final PacienteDAO daoP = new PacienteDAO();
    private final IngresoPacienteDAO daoIE = new IngresoPacienteDAO();
     
    public ValidarIngresoPaciente(){
    }
    //verificacion del paciente
    public String VerificarIngresoPaciente(Paciente paciente) {
        if(!VerificarLongitudNombre1(paciente.getNombrePaciente1())){
            return("Longitud primer nombre incorrecta");
        }
        if(!VerificarLongitudNombre2(paciente.getNombrePaciente2())){
            return("Longitud segundo nombre incorrecta");
        }
        if(!VerificarLongitudApellido1(paciente.getApellidoPaciente1())){
            return("Longitud primer apellido incorrecta");
        }
        if(!VerificarLongitudApellido2(paciente.getApellidoPaciente2())){
            return("Longitud segundo apellido incorrecta");
        }
        if(!VerificarLongitudId(String.valueOf(paciente.getIdPaciente()))){
            return("Logitud Identificación incorrecta");
        }
        if(!VerificarSelectTipoSangre(paciente.getTipoSangre())){
            return("No se ha seleccionado tipo de sangre");
        }
          if(!VerificarCamasDisponibles()){
            return("No hay camas Disponibles");
        }
           if(!VerificarEquiposDisponibles()){
            return("No hay equipos disponibles");
        }
         if(VerificarIsRegistrado(String.valueOf(paciente.getIdPaciente()))){
            return("Paciente está registrado");
        }
        return("Datos del paciente ingresados correctamente");
    }
    //verificacion del paciente metodo corto
     public String VerificarIngresoPaciente_(Paciente paciente) {
        if(!VerificarLongitudNombre1(paciente.getNombrePaciente1())){
            return("Longitud primer nombre incorrecta");
        }
        if(!VerificarLongitudNombre2(paciente.getNombrePaciente2())){
            return("Longitud segundo nombre incorrecta");
        }
        if(!VerificarLongitudApellido1(paciente.getApellidoPaciente1())){
            return("Longitud primer apellido incorrecta");
        }
        if(!VerificarLongitudApellido2(paciente.getApellidoPaciente2())){
            return("Longitud segundo apellido incorrecta");
        }
        if(!VerificarLongitudId(String.valueOf(paciente.getIdPaciente()))){
            return("Logitud Identificación incorrecta");
        }
        
        return("Datos del paciente ingresados correctamente");
    }
//metodos
    public boolean VerificarLongitudNombre1(String nombre1) {
        return (nombre1.length() >= 4 && nombre1.length() <= 14);
    }

    public boolean VerificarLongitudNombre2(String nombre2) {
        return (nombre2.length() <= 14);
    }

    public boolean VerificarLongitudApellido1(String apellido1) {
        return (apellido1.length() >= 4 && apellido1.length() <= 14);
    }

    public boolean VerificarLongitudApellido2(String apellido2) {
        return (apellido2.length() <= 14);
    }

    public boolean VerificarLongitudId(String id) {
        return (id.length() >= 4 && id.length() < 13);
    }

    public boolean VerificarSelectTipoSangre(String tipoSangre) {
        return (tipoSangre.isEmpty());
    }

    public boolean VerificarSelectTipoAtencion(String tipoAtencion) {
        return (tipoAtencion.isEmpty());
    }

    public boolean VerificarSelectCama(String tipoAtencion) {
        return (tipoAtencion.isEmpty());

    }
    //revisa si hay disponibles camas
    public boolean VerificarCamasDisponibles() {
        return (daoC.leerDisponibles() != null);
    }
    //revisa si hay disponibles equipos
    public boolean VerificarEquiposDisponibles() {
        return (daoE.leerDisponibles() != null);
    }
    //revisa si el paciente ya está registrado
     public boolean VerificarIsRegistrado(String id) {
        return (daoP.leerPorId(id)!= null);
    }
    
}
