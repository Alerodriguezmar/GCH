/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Inicializacion;

import DAO.AdminDAO;
import DAO.CamaDAO;
import Entidad.Administrador;
import java.util.ArrayList;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Administrador
 */
public class Camas {
    
    public Camas() {
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
        
         CamaDAO dao = new CamaDAO();
         ArrayList<Entidad.Camas> Cama = new ArrayList<Entidad.Camas>();
        
         Entidad.Camas b = new Entidad.Camas();
         Entidad.Camas a = new Entidad.Camas();
        b.setIdCamas(23);
        b.setEstado(false);
        b.setPabellon("UCIM");
        b.setUbicacion("201");
        
        a.setIdCamas(56);
        a.setEstado(true);
        a.setPabellon("UCI");
        a.setUbicacion("659");
        
        
        Cama.add(a);
        Cama.add(b);
     
        for (Entidad.Camas u: Cama){
            System.out.println(u.getIdCamas());
            System.out.println(u.isEstado());
            System.out.println("--------------------------------");
            dao.crear(u);
        }
    }
}

/*

*/
