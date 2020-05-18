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
public class Equipo {
    
    private int idEquipo;
    private String nombreEquipo;
    private String Marca;
    private String RegistroSanitario;
    private String DescripcionEquipo;
    private String EstadoEquipo;

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

    public String getEstadoEquipo() {
        return EstadoEquipo;
    }

    public void setEstadoEquipo(String EstadoEquipo) {
        this.EstadoEquipo = EstadoEquipo;
    }
    
    
    
}
