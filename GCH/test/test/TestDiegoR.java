/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;


import DAO.EquipoDAO;
import Entidad.Equipo;
import java.util.ArrayList;
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
public class TestDiegoR {
    
    public TestDiegoR() {
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
    @Test
    
    public void initData() {
        EquipoDAO dao= new EquipoDAO();
        ArrayList<Equipo> equipos = new ArrayList<Equipo>();
        Equipo a = new Equipo();
        a.setNombreEquipo("Respi");  
        a.setMarca("Bayer");
        a.setRegistroSanitario("154");
        a.setDescripcionEquipo("Super Bueno");
        a.setEstadoEquipo(true);
        a.setTipoUso("Medico");
       
        
        equipos.add(a);
        for (Equipo u: equipos ){
            System.out.println(u.getNombreEquipo());
            System.out.println(u.getMarca());
            System.out.println(u.getDescripcionEquipo());
            System.out.println("--------------------------------");
            dao.crear(u);
        }
    }
    
}
