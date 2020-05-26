package DAO;

import Entidad.Paciente;
import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import static javax.swing.UIManager.getBoolean;
import static javax.swing.UIManager.getInt;
import static javax.swing.UIManager.getString;

/**
 *
 * @author Santiago Ladino 
 */
public class PacienteDAO {    
    
    public PacienteDAO() {
    }
    /*
    private static EntityManagerFactory
            emf = Persistence.createEntityManagerFactory("GCHPU");
    
    public Paciente leerp(Paciente par) {
        EntityManager em = emf.createEntityManager();
        Paciente usuario = null;
        Query q = em.createQuery("SELECT u FROM Paciente u " +
                    "WHERE u.idPaciente LIKE :idp")
                    .setParameter("idp", par.getIdPaciente());
        try {
            usuario = (Paciente) q.getSingleResult();
        } catch (NonUniqueResultException e) {
            usuario = (Paciente) q.getResultList().get(0);
        } catch (Exception e){
            e.printStackTrace();
        }finally {
            em.close();
            return usuario;
        }
    }
    */
    public void crear(){
        
        String query = "CREATE TABLE Paciente (" +
                       "idPaciente INT NOT NULL," +
                       "nombre1 VARCHAR(16) NOT NULL," +
                       "nombre2 VARCHAR(16)," +
                       "apellido1 VARCHAR(16) NOT NULL," +
                       "apellido2 VARCHAR(16)," +
                       "tipo_sangre VARCHAR(5) NOT NULL," +
                       "tipo_atencion varchar(50) not null," +
                       "Respirador BOOLEAN NOT NULL WITH DEFAULT false," +
                       "Equipo_Intubacion BOOLEAN NOT NULL WITH DEFAULT false," +
                       "Aspirador_Secreciones BOOLEAN NOT NULL WITH DEFAULT false," +
                       "Bombas_Nutricion BOOLEAN NOT NULL WITH DEFAULT false," +
                       "Monitor BOOLEAN NOT NULL WITH DEFAULT false," +
                       "Bomba_Infucion_Continua BOOLEAN NOT NULL WITH DEFAULT false," +
                       "Saturometros BOOLEAN NOT NULL WITH DEFAULT false," +
                       "Balas_Oxigeno BOOLEAN NOT NULL WITH DEFAULT false,"+
                       "Egresado BOOLEAN NOT NULL WITH DEFAULT false,"+
                       "Observaciones VARCHAR(250),"+
                       "PRIMARY KEY (idPaciente))";
        
        String table_name = "Paciente";
        String url = "jdbc:derby://localhost:1527/GCHDB_JPA";
        String username = "root";
        String password = "123456";
        Connection conn = null;
        Statement stmt = null;
        try {
            conn = DriverManager.getConnection(url, username, password);
            stmt = conn.createStatement();
            ResultSet res = conn.getMetaData().getTables(null, null, table_name.toUpperCase(), null);//Default schema name is "APP"
            if(res.next()){
                //do some thing;
            }else{
                stmt.executeUpdate(query);  
                System.out.println("Table created");          
            }
            conn.close();
            stmt.close();

        } catch (SQLException e) {
            e.printStackTrace();
        }       
    }
    
    public void ingresar(int idp, String nombre1, String nombre2, String apellido1, String apellido2, String ts, String ta,
                         boolean res, boolean ei, boolean as, boolean bn, boolean m, boolean bic, boolean s, boolean bo, String obs){
        String query = "INSERT INTO Paciente (" +
                       "idPaciente," +
                       "nombre1," +
                       "nombre2," +
                       "apellido1," +
                       "apellido2," +
                       "tipo_sangre," +
                       "tipo_atencion," +
                       "Respirador," +
                       "Equipo_Intubacion," +
                       "Aspirador_Secreciones," +
                       "Bombas_Nutricion," +
                       "Monitor," +
                       "Bomba_Infucion_Continua," +
                       "Saturometros," +
                       "Balas_Oxigeno,"
                       + "Observaciones" + " ) " + "VALUES (" +
                       idp+","+
                       "'"+nombre1+"'"+","+
                       "'"+nombre2+"'"+","+
                       "'"+apellido1+"'"+","+
                       "'"+apellido2+"'"+","+
                       "'"+ts+"'"+","+
                       "'"+ta+"'"+","+
                       res+","+
                       ei+","+
                       as+","+
                       bn+","+
                       m+","+
                       bic+","+
                       s+","+bo+","+"'"+obs+"'"+")";
        String url = "jdbc:derby://localhost:1527/GCHDB_JPA";
        String username = "root";
        String password = "123456";
        Connection conn = null;
        Statement stmt = null;
        try {
            conn = DriverManager.getConnection(url, username, password);
            stmt = conn.createStatement();
            stmt.execute(query);
            conn.close();
            stmt.close();
            System.out.println("Datos ingresados");
        } catch (SQLException e) {
            e.printStackTrace();
        } 
    }
    
    public void leer(){
        String query = "SELECT * FROM PACIENTE";
        String url = "jdbc:derby://localhost:1527/GCHDB_JPA";
        String username = "root";
        String password = "123456";
        Connection conn = null;
        Statement stmt = null;
        try {
            conn = DriverManager.getConnection(url, username, password);
            stmt = conn.createStatement();
            ResultSet res = stmt.executeQuery(query);
            System.out.println("Datos del paciente: ");
            while (res.next()) {
                System.out.println(getInt("idPaciente") +
                       getString("nombre1") + ", " +
                       getString("nombre2") + ", " +
                       getString("apellido1") + ", "+
                       getString("apellido2") + ", "+
                       getString("tipo_sangre") + ", " +
                       getString("tipo_atencion") + ", " +
                       getBoolean("Respirador") + ", " +
                       getBoolean("Equipo_Intubacion") + ", " +
                       getBoolean("Aspirador_Secreciones") + ", " +
                       getBoolean("Bombas_Nutricion") + ", " +
                       getBoolean("Monitor") + ", " +
                       getBoolean("Bomba_Infucion_Continua") + ", " +
                       getBoolean("Saturometros") + ", " +
                       getBoolean("Balas_Oxigeno") 
                       + ", " +getString("Observaciones"));
            }
            res.close();
            conn.close();
            stmt.close();
        } catch (SQLException e) {
            e.printStackTrace();
        } 
    }
    
    public Paciente leerPorId(String id){
        Paciente p = new Paciente();
        String query = "SELECT * FROM PACIENTE WHERE IDPACIENTE="+id;
        String url = "jdbc:derby://localhost:1527/GCHDB_JPA";
        String username = "root";
        String password = "123456";
        Connection conn = null;
        Statement stmt = null;
        try {
            conn = DriverManager.getConnection(url, username, password);
            stmt = conn.createStatement();
            ResultSet res = stmt.executeQuery(query);
                
            System.out.println("Datos del paciente: ");
            while (res.next()) {
                System.out.println(res.getInt("idPaciente") +
                       res.getString("nombre1") + ", " +
                       res.getString("nombre2") + ", " +
                       res.getString("apellido1") + ", "+
                       res.getString("apellido2") + ", "+
                       res.getString("tipo_sangre") + ", " +
                       res.getString("tipo_atencion") + ", " +
                       res.getBoolean("Respirador") + ", " +
                       res.getBoolean("Equipo_Intubacion") + ", " +
                       res.getBoolean("Aspirador_Secreciones") + ", " +
                       res.getBoolean("Bombas_Nutricion") + ", " +
                       res.getBoolean("Monitor") + ", " +
                       res.getBoolean("Bomba_Infucion_Continua") + ", " +
                       res.getBoolean("Saturometros") + ", " +
                       res.getBoolean("Balas_Oxigeno") 
                       + ", " +res.getString("Observaciones"));
                p.setNombrePaceinte2(res.getString("nombre2"));
                p.setNombrePaciente1(res.getString("nombre1"));
                p.setApellidoPaciente1(res.getString("apellido1"));
                p.setApellidoPaciente2(res.getString("apellido2"));
                
            }
            res.close();
            stmt.execute(query);
            conn.close();
            stmt.close();
        } catch (SQLException e) {
            e.printStackTrace();
        } 
        return p;
    }
    
    public void ActualizarEstado(String id){
        Paciente p = new Paciente();
        String query = "UPDATE PACIENTE SET EGRESADO=TRUE WHERE IDPACIENTE="+id;
        String url = "jdbc:derby://localhost:1527/GCHDB_JPA";
        String username = "root";
        String password = "123456";
        Connection conn = null;
        PreparedStatement stmt = null;
        try {
            conn = DriverManager.getConnection(url, username, password);
            stmt = conn.prepareStatement(query);
            stmt.executeUpdate();                
            System.out.println("Columna corregida: ");
            conn.close();
            stmt.close();
        } catch (SQLException e) {
            e.printStackTrace();
        } 
    }
     
}
