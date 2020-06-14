/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Entidad.Equipo;
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
 * @author Diego
 */
public class EquipoDAO {
    private static EntityManagerFactory
        emf = Persistence.createEntityManagerFactory("GCHPU");

    public void crear(Equipo object) {

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

    public boolean eliminar(Equipo object) {
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

    public Equipo leerE(Equipo par) {
        EntityManager em = emf.createEntityManager();
        Equipo usuario = null;
        Query q = em.createQuery("SELECT u FROM Equipo u " +
                    " WHERE CAST(u.idEquipo as CHAR) LIKE :idEquipo" +
                    " AND u.nombreEquipo LIKE :nombreEquipo" +
                    " AND u.Marca LIKE :Marca" +
                    " AND u.RegistroSanitario LIKE :RegistroSanitario" +
                    " AND u.DescripcionEquipo LIKE :DescripcionEquipo"+ 
                    " AND u.EstadoEquipo LIKE :EstadoEquipo"
                    + " AND u.TipoUso LIKE :TipoUso")
                    .setParameter("nombreEquipo", par.getNombreEquipo())
                    .setParameter("Marca", par.getMarca())
                    .setParameter("RegistroSanitario", par.getRegistroSanitario())
                    .setParameter("DescripcionEquipo", par.getDescripcionEquipo())
                    .setParameter("EstadoEquipo", par.getEstadoEquipo())
                    .setParameter("TipoUso", par.getTipoUso())
                    .setParameter("idEquipo", par.getIdEquipo()) ;
        try {
            usuario = (Equipo) q.getSingleResult();
        } catch (NonUniqueResultException e) {
            usuario = (Equipo) q.getResultList().get(0);
        } catch (Exception e){
            e.printStackTrace();
        }finally {
            em.close();
            return usuario;
        }
    }
    
    //otro metodo LEER
    public Equipo leer(Equipo equipo){
        Equipo eq = new Equipo();
        String query = "SELECT * FROM EQUIPO WHERE NOMBREEQUIPO="+"'"+equipo.getNombreEquipo()+"'"+" AND IDEQUIPO="+equipo.getIdEquipo();
        String url = "jdbc:derby://localhost:1527/GCHDB_JPA";
        String username = "root";
        String password = "123456";
        Connection conn = null;
        Statement stmt = null;
        try {
            conn = DriverManager.getConnection(url, username, password);
            stmt = conn.createStatement();
            ResultSet res = stmt.executeQuery(query);
                
            System.out.println("LEYENDO EQUIPO POR ID Y NOMBRE...");
            if (res.next()) {
                System.out.println("DATOS DEL EQUIPO: ");
                System.out.println("Id: " + res.getInt("idEquipo") +
                        " Nombre: " + res.getString("nombreEquipo") + ", " +
                        " Marca: " + res.getString("Marca") + ", " +
                        " Registro: " + res.getString("RegistroSanitario") + ", " +
                        " Desc: " + res.getString("DescripcionEquipo") + ", " +
                        " Estado: " + res.getBoolean("EstadoEquipo") + ", " + 
                        " Tipo Uso: " + res.getString("TipoUso"));
                //creo paciente
                        eq.setIdEquipo(res.getInt("idEquipo"));
                        eq.setNombreEquipo(res.getString("nombreEquipo"));
                        eq.setMarca(res.getString("Marca"));
                        eq.setRegistroSanitario(res.getString("RegistroSanitario"));
                        eq.setEstadoEquipo(res.getBoolean("EstadoEquipo"));
                        eq.setTipoUso(res.getString("TipoUso"));
                        

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
 //consulta para revisar si equipos disponibles disponibles
      public Equipo leerDisponibles() {
        EntityManager em = emf.createEntityManager();
        Equipo usuario = null;
        
        Query q = em.createQuery("SELECT COUNT (u) FROM Equipo u "
                + "WHERE u.EstadoEquipo LIKE :estado")
                .setParameter("estado", false);
                
        try {
            usuario = (Equipo) q.getSingleResult();
        } catch (NonUniqueResultException e) {
            usuario = (Equipo) q.getResultList().get(0);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            em.close();
            return usuario;
        }
    }
      
    public boolean actualizar(Equipo object, Equipo nuevoObjeto) {
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();
        boolean ret = false;
        try {
            object = leer(object);
            object.setIdEquipo(nuevoObjeto.getIdEquipo());
            object.setNombreEquipo(nuevoObjeto.getNombreEquipo());
            object.setMarca(nuevoObjeto.getMarca());
            object.setRegistroSanitario(nuevoObjeto.getRegistroSanitario());
            object.setDescripcionEquipo(nuevoObjeto.getDescripcionEquipo());
            object.setEstadoEquipo(nuevoObjeto.getEstadoEquipo());
            object.setTipoUso(nuevoObjeto.getTipoUso());
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
    
    public Equipo leerEquiposDisp(String nombre){
        Equipo eq = new Equipo();
        String query = "SELECT * FROM EQUIPO WHERE NOMBREEQUIPO="+"'"+nombre+"'"+" AND EstadoEquipo=0";
        String url = "jdbc:derby://localhost:1527/GCHDB_JPA";
        String username = "root";
        String password = "123456";
        Connection conn = null;
        Statement stmt = null;
        try {
            conn = DriverManager.getConnection(url, username, password);
            stmt = conn.createStatement();
            ResultSet res = stmt.executeQuery(query);
                
            System.out.println("Datos del equipo: ");
            if (res.next()) {
                System.out.println(res.getInt("idEquipo") +
                        res.getString("nombreEquipo") + ", " +
                        res.getString("Marca") + ", " +
                        res.getString("RegistroSanitario") + ", " +
                        res.getString("DescripcionEquipo") + ", " +
                        res.getBoolean("EstadoEquipo") + ", " + 
                        res.getString("TipoUso"));
                //creo paciente
                        eq.setIdEquipo(res.getInt("idEquipo"));
                        eq.setNombreEquipo(res.getString("nombreEquipo"));
                        eq.setMarca(res.getString("Marca"));
                        eq.setRegistroSanitario(res.getString("RegistroSanitario"));
                        eq.setEstadoEquipo(res.getBoolean("EstadoEquipo"));
                        eq.setTipoUso(res.getString("TipoUso"));
         
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
    
    //Leer Equipos con x nombre disponibles
    public long leerEq(String nomeq) {
        long eq=-1;
        String query = "SELECT COUNT(ESTADOEQUIPO) AS CANTIDAD FROM ROOT.EQUIPO WHERE NOMBREEQUIPO='"+nomeq+"' AND ESTADOEQUIPO=0";
        String url = "jdbc:derby://localhost:1527/GCHDB_JPA";
        String username = "root";
        String password = "123456";
        Connection conn = null;
        Statement stmt = null;
        try {
            conn = DriverManager.getConnection(url, username, password);
            stmt = conn.createStatement();
            ResultSet res = stmt.executeQuery(query);
                
            System.out.println("CALCULANDO EQUIPOS \"" + nomeq + "\" DISPONIBLES...");
            if (res.next()) {
                eq=res.getLong("CANTIDAD");
                System.out.println("CANTIDAD DE " + nomeq + " DISPONIBLES: " + Long.toString(eq));
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
    
    public boolean actualizarEstadoF(Equipo object, Equipo nuevoObjeto) {
        
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();
        boolean ret = false;
        try {
            object = leerPorId(Integer.toString(object.getIdEquipo()));
            object.setIdEquipo(nuevoObjeto.getIdEquipo());
            object.setNombreEquipo(nuevoObjeto.getNombreEquipo());
            object.setMarca(nuevoObjeto.getMarca());
            object.setRegistroSanitario(nuevoObjeto.getRegistroSanitario());
            object.setDescripcionEquipo(nuevoObjeto.getDescripcionEquipo());
            object.setEstadoEquipo(false);
            object.setTipoUso(nuevoObjeto.getTipoUso());
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

    public Equipo leerPorId(String idEquipo) {
        Equipo c = new Equipo();
        String query = "SELECT * FROM EQUIPO WHERE IDEQUIPO ="+idEquipo;
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
                System.out.println("EQUIPO ENCONTRADO");
                //creo paciente
                        c.setIdEquipo(res.getInt("idEquipo"));
                        c.setDescripcionEquipo(res.getString("DescripcionEquipo"));
                        c.setTipoUso(res.getString("TipoUso"));
                        c.setEstadoEquipo(res.getBoolean("EstadoEquipo"));
                        c.setMarca(res.getString("Marca"));
                        c.setRegistroSanitario(res.getString("RegistroSanitario"));
                        c.setNombreEquipo(res.getString("nombreEquipo"));
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
    
}

    
    

