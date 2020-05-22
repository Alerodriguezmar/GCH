
package Entidad;

public class Usuario {

    private int id;
    private String usuario;
    private String contrasena;
    
    public Usuario(String usuario, String contrasena,int id){
        this.contrasena = contrasena;
        this.id = id;
        this.usuario = usuario;
    }
    public String getUsuario(){
        return usuario;
    }
    
    public String getContrasena(){
        return contrasena;
    }
    
    public int getid(){
        return id;
}
    public static void main(String[] args) {
        
    }
    
}
