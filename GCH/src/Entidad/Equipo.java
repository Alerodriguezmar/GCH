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
@Table(name = "Equipo")

public class Equipo implements Serializable{
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idEquipo;
    private String nombreEquipo;
    private String Marca;
    private String RegistroSanitario;
    private String DescripcionEquipo;
    private Boolean EstadoEquipo;
    private String TipoUso;

    public String getTipoUso() {
        return TipoUso;
    }

    public void setTipoUso(String TipoUso) {
        this.TipoUso = TipoUso;
    }

    public Equipo() {
    }

    public int getIdEquipo() {
        return idEquipo;
    }

    public void setIdEquipo(int idEquipo) {
        this.idEquipo = idEquipo;
    }

    public String getNombreEquipo() {
        return nombreEquipo;
    }

    public void setNombreEquipo(String nombreEquipo) {
        this.nombreEquipo = nombreEquipo;
    }

    public String getMarca() {
        return Marca;
    }

    public void setMarca(String Marca) {
        this.Marca = Marca;
    }

    public String getRegistroSanitario() {
        return RegistroSanitario;
    }

    public void setRegistroSanitario(String RegistroSanitario) {
        this.RegistroSanitario = RegistroSanitario;
    }

    public String getDescripcionEquipo() {
        return DescripcionEquipo;
    }

    public void setDescripcionEquipo(String DescripcionEquipo) {
        this.DescripcionEquipo = DescripcionEquipo;
    }

    public Boolean getEstadoEquipo() {
        return EstadoEquipo;
    }

    public void setEstadoEquipo(Boolean EstadoEquipo) {
        this.EstadoEquipo = EstadoEquipo;
    }

    public void setTipoDeEquipo(String toString) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
}
