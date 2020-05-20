package Entidad;
/**
 *
 * @author Santiago Ladino
 */
public class equiposUsados {
    private int idEquipo;
    private int idIngreso;
    public equiposUsados(int ide, int idi){
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
