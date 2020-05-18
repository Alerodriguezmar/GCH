/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidad;

import java.util.ArrayList;

/**
 *
 * @author Diego
 */
public class Sistema {
    
    private ArrayList<Equipo>Equipos;
    private ArrayList<Paciente>Pacientes;

    public Sistema() {
    }

    public ArrayList<Equipo> getEquipos() {
        return Equipos;
    }

    public void setEquipos(ArrayList<Equipo> Equipos) {
        this.Equipos = Equipos;
    }

    public ArrayList<Paciente> getPacientes() {
        return Pacientes;
    }

    public void setPacientes(ArrayList<Paciente> Pacientes) {
        this.Pacientes = Pacientes;
    }
    
    
    
}
