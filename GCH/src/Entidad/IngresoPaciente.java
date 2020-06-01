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
    @ManyToOne
    private Equipo ventilador;
    @ManyToOne
    private Equipo saturometro;
    @ManyToOne
    private Equipo balaOx;
    @ManyToOne
    private Equipo monitorCard;
    @ManyToOne
    private Equipo bombaInf;
    @ManyToOne
    private Equipo bombaNut;
    @ManyToOne
    private Equipo aspiradorSec;
    @ManyToOne
    private Equipo equipoIntubacion;
    private String observacion;
    

    public IngresoPaciente() {
    }

    public Equipo getVentilador() {
        return ventilador;
    }

    public void setVentilador(Equipo ventilador) {
        this.ventilador = ventilador;
    }

    public Equipo getSaturometro() {
        return saturometro;
    }

    public void setSaturometro(Equipo saturometro) {
        this.saturometro = saturometro;
    }

    public Equipo getBalaOx() {
        return balaOx;
    }

    public void setBalaOx(Equipo balaOx) {
        this.balaOx = balaOx;
    }

    public Equipo getMonitorCard() {
        return monitorCard;
    }

    public void setMonitorCard(Equipo monitorCard) {
        this.monitorCard = monitorCard;
    }

    public Equipo getBombaInf() {
        return bombaInf;
    }

    public void setBombaInf(Equipo bombaInf) {
        this.bombaInf = bombaInf;
    }

    public Equipo getBombaNut() {
        return bombaNut;
    }

    public void setBombaNut(Equipo bombaNut) {
        this.bombaNut = bombaNut;
    }

    public Equipo getAspiradorSec() {
        return aspiradorSec;
    }

    public void setAspiradorSec(Equipo aspiradorSec) {
        this.aspiradorSec = aspiradorSec;
    }

    public Equipo getEquipoIntubacion() {
        return equipoIntubacion;
    }

    public void setEquipoIntubacion(Equipo equipoIntubacion) {
        this.equipoIntubacion = equipoIntubacion;
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
