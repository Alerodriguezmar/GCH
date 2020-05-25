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
    private String nombre1;
    private String nombre2;
    private String apellido1;
    private String apellido2;
    private String tipoAtencion;
    private String tipoSangre;
    private boolean Respirador;
    private boolean EquipoIntubacion;
    private boolean AspiradorSecreciones;
    private boolean BombasNutricion;
    private boolean Monitor;
    private boolean BombaInfucionContinua;
    private boolean Saturometros;
    private boolean EquipoOrotraqueal;
    private boolean BalasOxigeno;
    private boolean egresado;
    private int cantidadBalasOxigeno;
    private String observaciones;

    public ValidarIngresoPaciente() {
    }

    public int getIdIngreso() {
        return idIngreso;
    }

    public int getIdPaciente() {
        return idPaciente;
    }

    public int getIdPersonal() {
        return idPersonal;
    }

    public int getIdCama() {
        return idCama;
    }

    public String getNombre1() {
        return nombre1;
    }

    public String getNombre2() {
        return nombre2;
    }

    public String getApellido1() {
        return apellido1;
    }

    public String getApellido2() {
        return apellido2;
    }

    public String getTipoAtencion() {
        return tipoAtencion;
    }

    public String getTipoSangre() {
        return tipoSangre;
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

    public boolean isBombasNutricion() {
        return BombasNutricion;
    }

    public boolean isMonitor() {
        return Monitor;
    }

    public boolean isBombaInfucionContinua() {
        return BombaInfucionContinua;
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
    
    public boolean isEgresado(){
        return egresado;
    }

    public int getCantidadBalasOxigeno() {
        return cantidadBalasOxigeno;
    }

    public String getObservaciones() {
        return observaciones;
    }
    
    public void setEgreso(){
        
    }
    
    public void setIdIngreso(int idIngreso) {
        if (Integer.toString(idIngreso).length()>2 && Integer.toString(idIngreso).length()<=10 ){
            this.idIngreso = idIngreso;
        } else {
            System.out.println("Longitud de id ingreso incorrecta");
            System.out.println("Longitud debe estar en 2 y 10 caractéres");
        }
    }

    public void setIdPaciente(int idPaciente) {
        if (Integer.toString(idPaciente).length()>2 && Integer.toString(idPaciente).length()<=10 ){
            this.idPaciente = idPaciente;
        } else {
            System.out.println("Longitud de id paciente incorrecta");
            System.out.println("Longitud debe estar en 2 y 10 caractéres");
        }
    }

    public void setIdPersonal(int idPersonal) {
        if (Integer.toString(idPersonal).length()>2 && Integer.toString(idPersonal).length()<=10 ) {
            this.idPersonal = idPersonal;
        } else{
            System.out.println("Longitud de id del personal incorrecta");
            System.out.println("Longitud debe estar en 2 y 10 caractéres");
        }
    }

    public void setIdCama(int idCama) {
        if (Integer.toString(idCama).length()>2 && Integer.toString(idCama).length()<=10 ) {
            this.idCama = idCama;
        } else{
            System.out.println("Longitud de id de la cama incorrecta");
            System.out.println("Longitud debe estar en 2 y 10 caractéres");
        }
    }

    public void setNombre1(String nombre1) {
        if (nombre1.length()>2 && nombre1.length()<=10 ) {
            this.nombre1=nombre1;
        } else{
            System.out.println("Longitud del primer nombre incorrecta");
            System.out.println("Longitud debe estar en 2 y 10 caractéres");
        }
    }

    public void setNombre2(String nombre2) {
        if (nombre2 != null){
            if (nombre2.length()>2 && nombre2.length()<=10 ) {
                this.nombre2=nombre2;
            } else{
                System.out.println("Longitud del segundo nombre incorrecta");
                System.out.println("Longitud debe estar en 2 y 10 caractéres");
            }
        }
    }

    public void setApellido1(String apellido1) {
        if (apellido1.length()>2 && apellido1.length()<=10 ) {
            this.apellido1=apellido1;
        } else{
            System.out.println("Longitud del primer apellido incorrecta");
            System.out.println("Longitud debe estar en 2 y 10 caractéres");
        }
    }

    public void setApellido2(String apellido2) {
        if (apellido2.length()>2 && apellido2.length()<=10 ) {
            this.apellido2=apellido2;
        } else{
            System.out.println("Longitud del segundo apellido incorrecta");
            System.out.println("Longitud debe estar en 2 y 10 caractéres");
        }
    }

    public void setTipoAtencion(String tipoAtencion) {
        this.tipoAtencion = tipoAtencion;
    }

    public void setTipoSangre(String tipoSangre) {
        this.tipoSangre = tipoSangre;
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

    public void setBombasNutricion(boolean BobamasNutricion) {
        this.BombasNutricion = BobamasNutricion;
    }

    public void setMonitor(boolean Monitor) {
        this.Monitor = Monitor;
    }

    public void setBombaInfucionContinua(boolean NombaInfucionContinua) {
        this.BombaInfucionContinua = NombaInfucionContinua;
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

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }    
}
