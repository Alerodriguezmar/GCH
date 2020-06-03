/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidad;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 *
 * @author DAVID
 */
@Entity
@Table(name = "Ingreso_Paciente")
public class IngresoPaciente implements Serializable {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idIngreso;
    @ManyToOne
    private Paciente paciente;
    @ManyToOne
    private PersonalMedico personalm;
    @ManyToOne
    private Camas cama;
    private String observacion;
    private String fecha;

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }
    
    

    public IngresoPaciente() {
    }
    
    public Camas getCama() {
        return cama;
    }

    public void setCama(Camas cama) {
        this.cama = cama;
    }

    public long getIdIngreso() {
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

    public PersonalMedico getPersonalm() {
        return personalm;
    }

    public void setPersonalm(PersonalMedico personalm) {
        this.personalm = personalm;
    }
}
