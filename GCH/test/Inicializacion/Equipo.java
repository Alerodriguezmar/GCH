/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Inicializacion;

import DAO.EquipoDAO;
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
public class Equipo {
    
    public Equipo() {
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
     public void Equipo() {
        EquipoDAO dao= new EquipoDAO();
        ArrayList<Entidad.Equipo> equipos = new ArrayList<Entidad.Equipo>();
        
        Entidad.Equipo a = new Entidad.Equipo();
        Entidad.Equipo b = new Entidad.Equipo();
        
        a.setIdEquipo(500);
        a.setMarca("Mitsu");
        a.setRegistroSanitario("12345678");
        a.setNombreEquipo("Tapabocas");
        a.setTipoUso("Sopote de Vida");
        a.setDescripcionEquipo("Usado");
        a.setEstadoEquipo(true);
       
        equipos.add(a);
        
          for (Entidad.Equipo u: equipos ){
            System.out.println(u.getIdEquipo());
            System.out.println(u.getEstadoEquipo());
            System.out.println("--------------------------------");
            dao.crear(u);
        }
        
     
     
     
     }
}
