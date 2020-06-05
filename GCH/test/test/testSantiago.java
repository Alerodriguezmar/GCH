
package test;

import DAO.EquipoDAO;
import DAO.PacienteDAO_prov;
import Entidad.Equipo;
import Entidad.Paciente;
import java.util.ArrayList;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 *
 * @author User
 */
public class testSantiago {
    
    public testSantiago() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
    
    /*@Test
     public void initData() {
     PacienteDAO_prov dao = new PacienteDAO_prov();
     Paciente p = new Paciente();
     dao.crear();
     }*/
    
    @Test
    public void intData(){
        Equipo eq = new Equipo();
        EquipoDAO eqdao = new EquipoDAO();
        String nombree = "ASPIRADOR";
        eq = eqdao.leerEquiposDisp(nombree);
        System.out.println(Integer.toString(eq.getIdEquipo()) + " Nombre: " + eq.getNombreEquipo());
        
    }
    
    
}
