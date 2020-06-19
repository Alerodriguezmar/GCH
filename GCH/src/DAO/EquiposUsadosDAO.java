/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Entidad.Equipo;
import Entidad.EquiposUsados;
import DAO.EquipoDAO;
import Entidad.IngresoPaciente;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.NonUniqueResultException;
import javax.persistence.Persistence;
import javax.persistence.Query;

/**
 *
 * @author DAVID
 */
public class EquiposUsadosDAO {
    private static EntityManagerFactory
        emf = Persistence.createEntityManagerFactory("GCHPU");
    //crear registro de los equipos que están utilizando un paciente en 
    //determinado ingreso
    public void crear(EquiposUsados object) {

        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();
        try {
            em.persist(object);
            em.getTransaction().commit();
        } catch (Exception e) {
            e.printStackTrace();
            em.getTransaction().rollback();
        } finally {
            em.close();
        }
        System.out.println("EQUIPO USADO REGISTRADO");
    }
    //Eliminar un determinado registro de un equipo usado
    public boolean eliminar(EquiposUsados object) {
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();
        boolean ret = false;
        try {
            em.remove(object);
            em.getTransaction().commit();
            ret = true;
        } catch (Exception e) {
            e.printStackTrace();
            em.getTransaction().rollback();
        } finally {
            em.close();
            return ret;
        }
    }
    
    //Borrar los equipos que se utilizaron en  un ingreso
    public boolean borrarPorIngresoId(String idIngreso){
        Boolean ret = false;
        String query = "DELETE FROM EquiposUsados WHERE INGRESOP_IDINGRESO=" + idIngreso;
        String url = "jdbc:derby://localhost:1527/GCHDB_JPA";
        String username = "root";
        String password = "123456";
        Connection conn = null;
        Statement stmt = null;
        
        try {
            conn = DriverManager.getConnection(url, username, password);
            stmt = conn.createStatement();
            
            stmt.executeUpdate(query);
            
            ret = true;
            stmt.execute(query);
            conn.close();
            stmt.close();
        } catch (SQLException e) {
            e.printStackTrace();
        } 
        System.out.println("EQUIPOS USADOS BORRADOS");
        return ret;
    }
    
    //Consulta de los equipos usados en un  determinado ingreso
    public EquiposUsados leer(EquiposUsados par) {
        EntityManager em = emf.createEntityManager();
        EquiposUsados usuario = null;
        System.out.println("CONSULTANDO EQUIPO USADO...");
        Query q = em.createQuery("SELECT u FROM EquiposUsados u " +
                    "WHERE u.id LIKE :id" +
                    " AND u.ingresoP LIKE :ingresoP" +
                    " AND u.equipo LIKE :equipo")
                    .setParameter("id", par.getId())
                    .setParameter("ingresoP", par.getIngresoP())
                    .setParameter("equipo", par.getEquipo());
                   
        try {
            usuario = (EquiposUsados) q.getSingleResult();
        } catch (NonUniqueResultException e) {
            usuario = (EquiposUsados) q.getResultList().get(0);
        } catch (Exception e){
            e.printStackTrace();
        }finally {
            em.close();
            return usuario;
        }
    }
    //Método Actualizar los atributos de un dato dentro de la tabla equipos usados
    public boolean actualizar(EquiposUsados object, EquiposUsados nuevoObjeto) {
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();
        boolean ret = false;
        try {
            object = leer(object);
            object.setId(nuevoObjeto.getId());
            object.setIngresoP(nuevoObjeto.getIngresoP());
            object.setEquipo(nuevoObjeto.getEquipo());
            ret = true;
        } catch (Exception e) {
            e.printStackTrace();
            em.getTransaction().rollback();
        } finally {
            em.close();
            return ret;
        }
    }
    //metodo
    /////selecta
    //while(){ actualizar E}
     //Método actualizar los equipos que se usan dentro de un ingreso
    public void actualizarEquipos (String idingreso) {
        
        String query = "SELECT * FROM EquiposUsados WHERE INGRESOP_IDINGRESO=" + idingreso;
        String url = "jdbc:derby://localhost:1527/GCHDB_JPA";
        String username = "root";
        String password = "123456";
        Connection conn = null;
        Statement stmt = null;
        
        try {
            conn = DriverManager.getConnection(url, username, password);
            stmt = conn.createStatement();
            ResultSet res = stmt.executeQuery(query);
            System.out.println("Datos de la CAMA: ");
            while (res.next()) {
                Equipo equipo = new Equipo();
                EquipoDAO edao = new EquipoDAO();
                equipo = edao.leerPorId(Integer.toString(res.getInt("Equipo_idEquipo")));
                edao.actualizarEstadoF(equipo, equipo);
                System.out.println("Equipo id: "+Integer.toString(equipo.getIdEquipo()) + " Estado Actualizado");
            }
            res.close();
            stmt.execute(query);
            conn.close();
            stmt.close();
        } catch (SQLException e) {
            e.printStackTrace();
        } 
        System.out.println("EQUIUPOS USADOS ACTUALIZADOS");
        
    }
    
    //Busca todos los registros en equipos usados asociados a un ingreso
    public ArrayList<EquiposUsados> equiposUsadosPorIngreso (String idingreso) {
        ArrayList<EquiposUsados> equs = new ArrayList();
        
        String query = "SELECT * FROM EquiposUsados WHERE INGRESOP_IDINGRESO=" + idingreso;
        String url = "jdbc:derby://localhost:1527/GCHDB_JPA";
        String username = "root";
        String password = "123456";
        Connection conn = null;
        Statement stmt = null;
        
        try {
            conn = DriverManager.getConnection(url, username, password);
            stmt = conn.createStatement();
            ResultSet res = stmt.executeQuery(query);
                
            System.out.println("Datos del EQUIPO ");
            while (res.next()) {
                Equipo equipo = new Equipo();
                EquipoDAO edao = new EquipoDAO();
                equipo = edao.leerPorId(Integer.toString(res.getInt("Equipo_idEquipo")));
                IngresoPaciente ingp = new IngresoPaciente();
                IngresoPacienteDAO ingpdao = new IngresoPacienteDAO();
                ingp = ingpdao.leerPorId(Integer.toString(res.getInt("IngresoP_IdIngreso")));
                EquiposUsados equsados = new EquiposUsados();
                
                equsados.setId(res.getLong("ID"));
                equsados.setIngresoP(ingp);
                equsados.setEquipo(equipo);
                
                equs.add(equsados);
            }
            res.close();
            stmt.execute(query);
            conn.close();
            stmt.close();
        } catch (SQLException e) {
            e.printStackTrace();
        } 
        return equs;
    }
}
