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
import javax.persistence.Table;

/**
 *
 * @author Diego
 */
@Entity
@Table(name = "Paciente")
public class Paciente implements Serializable {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idPaciente;
    private String nombre1;
    private String nombre2;
    private String apellido1;
    private String apellido2;
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
        return nombre1;
    }

    public void setNombrePaciente1(String nombrePaciente1) {
        this.nombre1 = nombrePaciente1;
    }

    public String getNombrePaceinte2() {
        return nombre2;
    }

    public void setNombrePaceinte2(String nombrePaceinte2) {
        this.nombre2 = nombrePaceinte2;
    }

    public String getApellidoPaciente1() {
        return apellido1;
    }

    public void setApellidoPaciente1(String apellidoPaciente1) {
        this.apellido1 = apellidoPaciente1;
    }

    public String getApellidoPaciente2() {
        return apellido2;
    }

    public void setApellidoPaciente2(String apellidoPaciente2) {
        this.apellido2 = apellidoPaciente2;
    }

    public String getTipoSangre() {
        return TipoSangre;
    }

    public void setTipoSangre(String TipoSangre) {
        this.TipoSangre = TipoSangre;
    }
    
    
    
}
