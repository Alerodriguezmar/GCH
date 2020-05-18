/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidad;

/**
 *
 * @author Diego
 */
public class Paciente {
    
    private int idPaciente;
    private String nombrePaciente1;
    private String nombrePaceinte2;
    private String apellidoPaciente1;
    private String apellidoPaciente2;
    private String TipoSangre;

    public Paciente() {
    }

    public int getIdPaciente() {
        return idPaciente;
    }

    public void setIdPaciente(int idPaciente) {
        this.idPaciente = idPaciente;
    }

    public String getNombrePaciente1() {
        return nombrePaciente1;
    }

    public void setNombrePaciente1(String nombrePaciente1) {
        this.nombrePaciente1 = nombrePaciente1;
    }

    public String getNombrePaceinte2() {
        return nombrePaceinte2;
    }

    public void setNombrePaceinte2(String nombrePaceinte2) {
        this.nombrePaceinte2 = nombrePaceinte2;
    }

    public String getApellidoPaciente1() {
        return apellidoPaciente1;
    }

    public void setApellidoPaciente1(String apellidoPaciente1) {
        this.apellidoPaciente1 = apellidoPaciente1;
    }

    public String getApellidoPaciente2() {
        return apellidoPaciente2;
    }

    public void setApellidoPaciente2(String apellidoPaciente2) {
        this.apellidoPaciente2 = apellidoPaciente2;
    }

    public String getTipoSangre() {
        return TipoSangre;
    }

    public void setTipoSangre(String TipoSangre) {
        this.TipoSangre = TipoSangre;
    }
    
    
    
}
