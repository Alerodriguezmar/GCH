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
 * @author daguillenr
 */

@Entity
@Table(name = "EgresoPacientes")
public class EgresoPaciente implements Serializable {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @ManyToOne
    private IngresoPaciente ingresoP;
    private String Observaciones;
    
    public EgresoPaciente(){ 
    }

    public IngresoPaciente getIngresoP() {
        return ingresoP;
    }

    public void setIngresoP(IngresoPaciente ingresoP) {
        this.ingresoP = ingresoP;
    }
    
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getObservaciones() {
        return Observaciones;
    }

    public void setObservaciones(String Observaciones) {
        this.Observaciones = Observaciones;
    }
    
}
