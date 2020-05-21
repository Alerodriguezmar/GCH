package Entidad;
/*
   @ autor Santiago Ladino
*/

public class PersonalMedico {
    
    private String nombre1;
    private String nombre2;
    private String apellido1;
    private String apellido2;
    private int id;
    private String cargo;
    private String ReTHUS;
    private String email;
    private String nidentificacion;
    private String celular;
    private String usuario;
    private String contrasenia;

    public PersonalMedico(String nombre1, String nombre2, String apellido1, String apellido2, int id, String cargo, String ReTHUS, String email, String nidentificacion, String celular, String usuario, String contrasenia) {
        this.nombre1 = nombre1;
        if (nombre2!="NA") this.nombre2=nombre2;
        this.apellido1 = apellido1;
        this.apellido2 = apellido2;
        this.id = id;
        this.cargo = cargo;
        this.ReTHUS = ReTHUS;
        this.email = email;
        this.nidentificacion = nidentificacion;
        this.celular = celular;
        this.usuario = usuario;
        this.contrasenia = contrasenia;
    }

    public String getNombre1() {
        return nombre1;
    }

    public void setNombre1(String nombre1) {
        this.nombre1 = nombre1;
    }

    public String getNombre2() {
        return nombre2;
    }

    public void setNombre2(String nombre2) {
        this.nombre2 = nombre2;
    }

    public String getApellido1() {
        return apellido1;
    }

    public void setApellido1(String apellido1) {
        this.apellido1 = apellido1;
    }

    public String getApellido2() {
        return apellido2;
    }

    public void setApellido2(String apellido2) {
        this.apellido2 = apellido2;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public String getReTHUS() {
        return ReTHUS;
    }

    public void setReTHUS(String ReTHUS) {
        this.ReTHUS = ReTHUS;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNidentificacion() {
        return nidentificacion;
    }

    public void setNidentificacion(String nidentificacion) {
        this.nidentificacion = nidentificacion;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getContrasenia() {
        return contrasenia;
    }

    public void setContrasenia(String contrasenia) {
        this.contrasenia = contrasenia;
    }
    
}
