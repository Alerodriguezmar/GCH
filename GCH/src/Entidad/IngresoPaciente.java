/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidad;

/**
 *
 * @author DAVID
 */
public class IngresoPaciente {
    
    private int idIngreso;
    private Paciente paciente;
    private String observacion;
    private personalMedico personalm;
    /* private Cama cama; */

    public IngresoPaciente() {
    }

    public int getIdIngreso() {
        return idIngreso;
    }

    public void setIdIngreso(int idIngreso) {
        this.idIngreso = idIngreso;
    }

    public Paciente getPaciente() {
        return paciente;
    }

    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }

    public String getObservacion() {
        return observacion;
    }

    public void setObservacion(String observacion) {
        this.observacion = observacion;
    }

    public personalMedico getPersonalm() {
        return personalm;
    }

    public void setPersonalm(personalMedico personalm) {
        this.personalm = personalm;
    }
}
