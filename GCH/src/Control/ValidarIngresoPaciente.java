package Control;

/**
 *
 * @author Santiago Ladino
 */
public class ValidarIngresoPaciente {
    
    private int idIngreso;
    private int idPaciente;
    private int idPersonal;
    private int idCama;
    private boolean Respirador;
    private boolean EquipoIntubacion;
    private boolean AspiradorSecreciones;
    private boolean BobamasNutricion;
    private boolean Monitor;
    private boolean NombaInfucionContinua;
    private boolean Saturometros;
    private boolean EquipoOrotraqueal;
    private boolean BalasOxigeno;
    private int cantidadBalasOxigeno;
    private String observaciones;

    public ValidarIngresoPaciente(int idIngreso, int idPaciente, int idPersonal, int idCama, boolean Respirador,
            boolean EquipoIntubacion, boolean AspiradorSecreciones, boolean BobamasNutricion,
            boolean Monitor, boolean NombaInfucionContinua, boolean Saturometros, boolean EquipoOrotraqueal,
            boolean BalasOxigeno, int cantidadBalasOxigeno, String observaciones) {
        if (Integer.toString(idIngreso).length()>2 && Integer.toString(idIngreso).length()<=10 ){
            this.idIngreso = idIngreso;
        } else {
            System.out.println("Longitud de id ingreso incorrecta");
            System.out.println("Longitud debe estar en 2 y 10 caractéres");
        }
        if (Integer.toString(idPaciente).length()>2 && Integer.toString(idPaciente).length()<=10 ){
            this.idPaciente = idPaciente;
        } else {
            System.out.println("Longitud de id paciente incorrecta");
            System.out.println("Longitud debe estar en 2 y 10 caractéres");
        }
        if (Integer.toString(idPersonal).length()>2 && Integer.toString(idPersonal).length()<=10 ) {
            this.idPersonal = idPersonal;
        } else{
            System.out.println("Longitud de id del personal incorrecta");
            System.out.println("Longitud debe estar en 2 y 10 caractéres");
        }
        if (Integer.toString(idCama).length()>2 && Integer.toString(idCama).length()<=10 ) {
            this.idCama = idCama;
        } else{
            System.out.println("Longitud de id de la cama incorrecta");
            System.out.println("Longitud debe estar en 2 y 10 caractéres");
        }
        if (this.idIngreso!=0 && this.idPaciente!=0 && this.idPersonal!=0 && this.idCama!=0){
            this.Respirador = Respirador;
            this.EquipoIntubacion = EquipoIntubacion;
            this.AspiradorSecreciones = AspiradorSecreciones;
            this.BobamasNutricion = BobamasNutricion;
            this.Monitor = Monitor;
            this.NombaInfucionContinua = NombaInfucionContinua;
            this.Saturometros = Saturometros;
            this.EquipoOrotraqueal = EquipoOrotraqueal;
            this.BalasOxigeno = BalasOxigeno;
            this.cantidadBalasOxigeno = cantidadBalasOxigeno;
            this.observaciones = observaciones;
        }

    }

    
   

    public int getIdIngreso() {
        return idIngreso;
    }

    public int getIdPaciente() {
        return idPaciente;
    }

    public String getObservaciones() {
        return observaciones;
    }

    public int getIdPersonal() {
        return idPersonal;
    }

    public int getIdCama() {
        return idCama;
    }

    public boolean isRespirador() {
        return Respirador;
    }

    public boolean isEquipoIntubacion() {
        return EquipoIntubacion;
    }

    public boolean isAspiradorSecreciones() {
        return AspiradorSecreciones;
    }

    public boolean isBobamasNutricion() {
        return BobamasNutricion;
    }

    public boolean isMonitor() {
        return Monitor;
    }

    public boolean isNombaInfucionContinua() {
        return NombaInfucionContinua;
    }

    public boolean isSaturometros() {
        return Saturometros;
    }

    public boolean isEquipoOrotraqueal() {
        return EquipoOrotraqueal;
    }

    public boolean isBalasOxigeno() {
        return BalasOxigeno;
    }

    public int getCantidadBalasOxigeno() {
        return cantidadBalasOxigeno;
    }

    public void setIdIngreso(int idIngreso) {
        this.idIngreso = idIngreso;
    }

    public void setIdPaciente(int idPaciente) {
        this.idPaciente = idPaciente;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }

    public void setIdPersonal(int idPersonal) {
        this.idPersonal = idPersonal;
    }

    public void setIdCama(int idCama) {
        this.idCama = idCama;
    }

    public void setRespirador(boolean Respirador) {
        this.Respirador = Respirador;
    }

    public void setEquipoIntubacion(boolean EquipoIntubacion) {
        this.EquipoIntubacion = EquipoIntubacion;
    }

    public void setAspiradorSecreciones(boolean AspiradorSecreciones) {
        this.AspiradorSecreciones = AspiradorSecreciones;
    }

    public void setBobamasNutricion(boolean BobamasNutricion) {
        this.BobamasNutricion = BobamasNutricion;
    }

    public void setMonitor(boolean Monitor) {
        this.Monitor = Monitor;
    }

    public void setNombaInfucionContinua(boolean NombaInfucionContinua) {
        this.NombaInfucionContinua = NombaInfucionContinua;
    }

    public void setSaturometros(boolean Saturometros) {
        this.Saturometros = Saturometros;
    }

    public void setEquipoOrotraqueal(boolean EquipoOrotraqueal) {
        this.EquipoOrotraqueal = EquipoOrotraqueal;
    }

    public void setBalasOxigeno(boolean BalasOxigeno) {
        this.BalasOxigeno = BalasOxigeno;
    }

    public void setCantidadBalasOxigeno(int cantidadBalasOxigeno) {
        this.cantidadBalasOxigeno = cantidadBalasOxigeno;
    }
    
}
