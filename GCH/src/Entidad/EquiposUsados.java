package Entidad;
/**
 *
 * @author Santiago Ladino
 */
public class EquiposUsados {
    private int idEquipo;
    private int idIngreso;
    public EquiposUsados(int ide, int idi){
        this.idEquipo = ide;
        this.idIngreso = idi;
    }

    public int getIdEquipo() {
        return idEquipo;
    }

    public int getIdIngreso() {
        return idIngreso;
    }

    public void setIdEquipo(int idEquipo) {
        this.idEquipo = idEquipo;
    }

    public void setIdIngreso(int idIngreso) {
        this.idIngreso = idIngreso;
    }
    
}
