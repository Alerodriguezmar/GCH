/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import DAO.CamaDAO;
import Entidad.Camas;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author DAVID
 * 
 */
public class testCamas {
    
    public testCamas() {
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
        CamaDAO cdao = new CamaDAO();
        Camas cama = new Camas();
        cama = cdao.leerCamasDisp();
        System.out.println("ID: "+Integer.toString(cama.getIdCamas()) + " PABELLON: "+ cama.getPabellon()+" UBICACION: "+cama.getUbicacion()+" ESTADO: "+Boolean.toString(cama.isEstado()));
    }
}
