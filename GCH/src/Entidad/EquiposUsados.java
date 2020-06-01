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
@Table(name="EquiposUsados")
public class EquiposUsados implements Serializable{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @ManyToOne
    private IngresoPaciente ingresoP;
    @ManyToOne
    private Equipo equipo;
    
    public EquiposUsados() {
    }

    public IngresoPaciente getIngresoP() {
        return ingresoP;
    }

    public void setIngresoP(IngresoPaciente ingresoP) {
        this.ingresoP = ingresoP;
    }

    public Equipo getEquipo() {
        return equipo;
    }

    public void setEquipo(Equipo equipo) {
        this.equipo = equipo;
    }
    
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
    
}
