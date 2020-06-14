package test;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import DAO.AdminDAO;
import DAO.CamaDAO;
import DAO.EquipoDAO;
import DAO.IngresoPacienteDAO;
import Entidad.Administrador;
import Entidad.Camas;
import Entidad.Equipo;
import Entidad.IngresoPaciente;
import Entidad.Paciente;
import java.util.ArrayList;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author DAVID
 */
public class TestAndres {
    
    public TestAndres() {
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
    @Test
    public void initData() {
        /*AdminDAO dao= new AdminDAO();
        ArrayList<Administrador> administradores = new ArrayList<Administrador>();
        Administrador a = new Administrador();
        a.setNombre1("juan");  
        a.setNombre2("daniel");
        a.setApellido1("perez");
        a.setApellido2("alvear");
        a.setEmail("andiazo@unalco");
        a.setCelular("3132202222");
        a.setNidentificacion("1223456");
        a.setUsuario("andiazo");
        a.setContrasenia("123456");
        
        administradores.add(a);
        for (Administrador u: administradores ){
            System.out.println(u.getUsuario());
            System.out.println(u.getContrasenia());
            System.out.println("--------------------------------");
            dao.crear(u);
        }*//*
        Camas cama,c;
        CamaDAO cdao = new CamaDAO();
        c = cdao.leerCamasDisp();
        cama = cdao.leerCamasDisp();
        cama.setEstado(true);
        cdao.actualizar(c, cama);
        System.out.println(cama.getIdCamas());
        EquipoDAO edao = new EquipoDAO();
        Equipo equipo = new Equipo();
        equipo.setNombreEquipo("VENTILADOR MECANICO");
        equipo.setEstadoEquipo(false);
        String nomeq = "VENTILADOR MECANICO";
        long n;
        n=edao.leerEq(nomeq);
        System.out.println(n);*/
        CamaDAO cdao = new CamaDAO();
        
        for(int i = 0; i < 15; i++){ // CAMAS UCI
            Camas cama = new Camas();
            cama.setUbicacion("10-"+Integer.toString(i));
            cama.setPabellon("UCI");
            cama.setEstado(false);
            cdao.crear(cama);
        }
        
        for(int i = 0; i < 15; i++){ // CAMAS UCIM
            Camas cama = new Camas();
            cama.setUbicacion("20-"+Integer.toString(i));
            cama.setPabellon("UCIM");
            cama.setEstado(false);
            cdao.crear(cama);
        }
        
    }
}
