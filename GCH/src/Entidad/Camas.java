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
public class Camas {
    
    private int idCamas;
    private String Ubicacion;
    private String pabellon;
    private boolean estado;

    public Camas() {
    }

    public int getIdCamas() {
        return idCamas;
    }

    public void setIdCamas(int idCamas) {
        this.idCamas = idCamas;
    }

    public String getUbicacion() {
        return Ubicacion;
    }

    public void setUbicacion(String Ubicacion) {
        this.Ubicacion = Ubicacion;
    }

    public String getPabellon() {
        return pabellon;
    }

    public void setPabellon(String pabellon) {
        this.pabellon = pabellon;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }
    
    
}
