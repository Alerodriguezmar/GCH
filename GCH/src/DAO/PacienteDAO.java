package DAO;

import Entidad.Paciente;
import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Santiago Ladino 
 */
public class PacienteDAO {    
    
    private static String query = "CREATE TABLE IF NOT EXISTS `GCH_Data`.`Paciente` (" +
                                  "`idPaciente` INT(10) NOT NULL," +
                                  "`nombre1` VARCHAR(16) NOT NULL," +
                                  "`nombre2` VARCHAR(16) NULL DEFAULT NULL," +
                                  "`apellido1` VARCHAR(16) NOT NULL," +
                                  "`apellido2` VARCHAR(16) NULL DEFAULT NULL," +
                                  "`tipo_sangre` VARCHAR(5) NOT NULL," +
                                  "PRIMARY KEY (`idPaciente`))"; 
    
    public PacienteDAO() {
    }
    
    public void crear(){
        
        String query = "CREATE TABLE Paciente (" +
                       "idPaciente INT NOT NULL GENERATED ALWAYS AS IDENTITY," +
                       "nombre1 VARCHAR(16) NOT NULL," +
                       "nombre2 VARCHAR(16)," +
                       "apellido1 VARCHAR(16) NOT NULL," +
                       "apellido2 VARCHAR(16)," +
                       "tipo_sangre VARCHAR(5) NOT NULL," +
                       "PRIMARY KEY (idPaciente))";
        
        String url = "jdbc:derby://localhost:1527/GCHDB_JPA";
        String username = "root";
        String password = "123456";
        Connection conn = null;
        Statement stmt = null;
        try {
            conn = DriverManager.getConnection(url, username, password);
            stmt = conn.createStatement();
            stmt.executeUpdate(query);
            System.out.println("Table created");

        } catch (SQLException e) {
            e.printStackTrace();
        }
        
    }
    
}
