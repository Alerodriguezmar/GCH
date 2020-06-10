/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Entidad.Camas;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.NonUniqueResultException;
import javax.persistence.Persistence;
import javax.persistence.Query;

/**
 *
 * @author DAVID
 */
public class CamaDAO {

    private static EntityManagerFactory emf = Persistence.createEntityManagerFactory("GCHPU");

    public void crear(Camas object) {
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
    }

    public boolean eliminar(Camas object) {
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

    public Camas leer(Camas par) {
        EntityManager em = emf.createEntityManager();
        Camas usuario = null;
        Query q = em.createQuery("SELECT u FROM Camas u "
                + "WHERE CAST(u.idCamas as VARCHAR(10)) LIKE :idCamas"
                + " AND u.Ubicacion LIKE :Ubicacion"
                + " AND u.pabellon LIKE :pabellon"
                + " AND u.estado LIKE :estado")
                .setParameter("idCamas", par.getIdCamas())
                .setParameter("Ubicacion", par.getUbicacion())
                .setParameter("pabellon", par.getPabellon())
                .setParameter("estado", par.isEstado());
        try {
            usuario = (Camas) q.getSingleResult();
        } catch (NonUniqueResultException e) {
            usuario = (Camas) q.getResultList().get(0);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            em.close();
            return usuario;
        }
    }

    public boolean leerE(Camas par) {
        EntityManager em = emf.createEntityManager();
        long no = 0;
        Query q = em.createQuery("SELECT COUNT (u) FROM Camas u "
                + "WHERE u.Ubicacion LIKE :ubicacion"
                + " AND u.pabellon LIKE :pabellon")
                .setParameter("pabellon", par.getPabellon())
                .setParameter("ubicacion", par.getUbicacion());

        no = (long) q.getSingleResult();

        em.close();
        return (no == 0);

    }
    //consulta para revisar camas disponibles
      public Camas leerDisponibles() {
        EntityManager em = emf.createEntityManager();
        Camas usuario = null;
        
        Query q = em.createQuery("SELECT COUNT (u) FROM Camas u "
                + "WHERE u.estado LIKE :estado")
                .setParameter("estado", false);
                
        try {
            usuario = (Camas) q.getSingleResult();
        } catch (NonUniqueResultException e) {
            usuario = (Camas) q.getResultList().get(0);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            em.close();
            return usuario;
        }
    }

    public Camas leerCamasDisp(){
        Camas c = new Camas();
        String query = "SELECT * FROM CAMAS WHERE ESTADO = 0";
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
            if (res.next()) {
                System.out.println(res.getInt("idCamas") +
                        res.getString("Ubicacion") + ", " +
                        res.getString("pabellon") + ", " +
                        res.getBoolean("estado"));
                //creo paciente
                        c.setIdCamas(res.getInt("idCamas"));
                        c.setUbicacion(res.getString("Ubicacion"));
                        c.setPabellon(res.getString("pabellon"));
                        c.setEstado(res.getBoolean("estado"));

            }
            res.close();
            stmt.execute(query);
            conn.close();
            stmt.close();
        } catch (SQLException e) {
            e.printStackTrace();
        } 
        return c;
    }
       
    public boolean actualizar(Camas object, Camas nuevoObjeto) {
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();
        boolean ret = false;
        try {
            object = leerPorId(Integer.toString(object.getIdCamas()));
            object.setIdCamas(nuevoObjeto.getIdCamas());
            object.setUbicacion(nuevoObjeto.getUbicacion());
            object.setPabellon(nuevoObjeto.getPabellon());
            object.setEstado(nuevoObjeto.isEstado());
            em.merge(object);
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
    
    public Camas leerPorId(String idCama){
        Camas c = new Camas();
        String query = "SELECT * FROM CAMAS WHERE IDCAMAS ="+idCama;
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
            if (res.next()) {
                System.out.println(res.getInt("idCamas") +
                        res.getString("Ubicacion") + ", " +
                        res.getString("pabellon") + ", " +
                        res.getBoolean("estado"));
                //creo paciente
                        c.setIdCamas(res.getInt("idCamas"));
                        c.setUbicacion(res.getString("Ubicacion"));
                        c.setPabellon(res.getString("pabellon"));
                        c.setEstado(res.getBoolean("estado"));

            }
            res.close();
            stmt.execute(query);
            conn.close();
            stmt.close();
        } catch (SQLException e) {
            e.printStackTrace();
        } 
        return c;
    }
    
    public long leerCamasDisponibles(String nomca) {
        long eq=-1;
        String query = "SELECT COUNT(PABELLON) AS CANTIDAD FROM ROOT.CAMAS WHERE PABELLON='"+nomca+"' AND ESTADO=0";
        String url = "jdbc:derby://localhost:1527/GCHDB_JPA";
        String username = "root";
        String password = "123456";
        Connection conn = null;
        Statement stmt = null;
        try {
            conn = DriverManager.getConnection(url, username, password);
            stmt = conn.createStatement();
            ResultSet res = stmt.executeQuery(query);
                
            System.out.println("CANTIDAD DE LAS CAMAS DISPONIBLES: ");
            if (res.next()) {
                eq=res.getLong("CANTIDAD");
            }
            res.close();
            stmt.execute(query);
            conn.close();
            stmt.close();
        } catch (SQLException e) {
            e.printStackTrace();
        } 
        return eq;
    }
    
    public long leerCamasOcupadas(String nomca) {
        long eq=-1;
        String query = "SELECT COUNT(PABELLON) AS CANTIDAD FROM ROOT.CAMAS WHERE PABELLON='"+nomca+"' AND ESTADO=1";
        String url = "jdbc:derby://localhost:1527/GCHDB_JPA";
        String username = "root";
        String password = "123456";
        Connection conn = null;
        Statement stmt = null;
        try {
            conn = DriverManager.getConnection(url, username, password);
            stmt = conn.createStatement();
            ResultSet res = stmt.executeQuery(query);
                
            System.out.println("CANTIDAD DE LAS CAMAS DISPONIBLES: ");
            if (res.next()) {
                eq=res.getLong("CANTIDAD");
            }
            res.close();
            stmt.execute(query);
            conn.close();
            stmt.close();
        } catch (SQLException e) {
            e.printStackTrace();
        } 
        return eq;
    }
    
}

