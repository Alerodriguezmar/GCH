/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Control;


import DAO.AdminDAO;
import DAO.CamaDAO;
import DAO.EgresoPacienteDAO;
import DAO.IngresoPacienteDAO;
import DAO.PacienteDAO;
import DAO.UsuarioDAO;
import Entidad.Administrador;
import Entidad.EgresoPaciente;
import Entidad.IngresoPaciente;
import Entidad.Paciente;
import java.util.Calendar;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Diego
 */
public class TestFuncionalidadGCH {
    
    public TestFuncionalidadGCH() {
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
     Administrador ad = new Administrador();
     @Test
     public void RegistroAdmin() {
        AdminDAO dao= new AdminDAO();
        
       
      
        
        ad.setNombre1("Juan");  
        ad.setNombre2("Camilo");
        ad.setApellido1("Rodriguez");
        ad.setApellido2("Martinez");
        ad.setEmail("jcrod@unal.edu");
        ad.setCelular("3132202222");
        ad.setNidentificacion("1223456");
        ad.setUsuario("jcro");
        ad.setContrasenia("123456");
      
        dao.crear(ad);
     }
     
     @Test
     public void LoginAdmin(){
         
         ad.setUsuario("ada");
         ad.setContrasenia("adasd");
         
     }
     Entidad.PersonalMedico med = new Entidad.PersonalMedico();
     @Test
     public void RegistroMedico(){
         UsuarioDAO dao = new UsuarioDAO();
        
        med.setId(595);
        med.setNombre1("juan");
        med.setNombre2("daniel");
        med.setApellido1("perez");
        med.setApellido2("alvear");
        med.setCargo("asistente enfermeria");
        med.setReTHUS("123456");
        med.setNomUsuario("juan");
        med.setPasswordAux("315521");
        med.setTipo_sangre("O +");
        med.setEmail("juanp@unal.edu.co");
        med.setDireccion("Kr10#16–69");
        med.setCelular("31552261");
        dao.crear(med);
     }
     @Test
     public void login(){
         med.setNomUsuario("asdad");
         med.setPasswordAux("adasd");
     }
      Entidad.Camas b = new Entidad.Camas();
     @Test
     public void Camas(){
       CamaDAO dao = new CamaDAO();
        Entidad.Camas a = new Entidad.Camas();
        b.setIdCamas(23);
        b.setEstado(false);
        b.setPabellon("UCIM");
        b.setUbicacion("201");
        
        dao.crear(b);
        
     }
     
     @Test
     public void Equipos(){
         
     }
     
      IngresoPaciente ingre = new IngresoPaciente();
     @Test
     public void Ingreso(){
    
    PacienteDAO dao = new PacienteDAO();
    Paciente a = new Paciente();
    a.setIdPaciente(123455);
    a.setNombrePaciente1("Dylan");
    a.setNombrePaciente2("Felupe");
    a.setApellidoPaciente1("Rodriguez");
    a.setApellidoPaciente2("Martinez");
    a.setTipoSangre("O +");
    
    dao.crear(a);
    
    IngresoPacienteDAO dao2 = new IngresoPacienteDAO();
   
    ingre.setPaciente(a);
    ingre.setPersonalm(med);
    ingre.setCama(b);
    ingre.setEstado(true);
    ingre.setFecha(String.valueOf(Calendar.getInstance()));
    ingre.setObservacion("Ingresado paciente Con covid");
    dao2.crear(ingre);
   
 
     }
     
     @Test
     public void Actualizacion(){
         
         
         
     }
     
     @Test
     public void Egreso(){
         EgresoPacienteDAO egre = new EgresoPacienteDAO();
         EgresoPaciente egreso = new EgresoPaciente();
         egreso.setIngresoP(ingre);
         egreso.setFecha(String.valueOf(Calendar.getInstance()));
         egreso.setObservaciones("Se curo satisfactoriamente de covid");
         egre.crear(egreso);
         
         
     }
}
