/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Entidad.Paciente;
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
public class PacienteDAO {
   private static EntityManagerFactory
            emf = Persistence.createEntityManagerFactory("GCHPU");
    // método para crear un dato en la tabla paciente
    public void crear(Paciente object) {

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
        System.out.println("DATOS DEL PACIENTE REGISTRADOS");
    }
    //metodo para eliminar un dato de la tabla paciente
    public boolean eliminar(Paciente object) {
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
    //Método para consultar información de un paciente determinado
    public Paciente leer(Paciente par) {
        EntityManager em = emf.createEntityManager();
        Paciente usuario = null;
        Query q = em.createQuery("SELECT u FROM Pacientes u " +
                    "WHERE u.idPaciente LIKE :idPaciente" +
                    " AND u.nombre1 LIKE :nombre1" +
                    " AND u.nombre2 LIKE :nombre2" +
                    " AND u.apellido1 LIKE :apellido1" +
                    " AND u.apellido2 LIKE :apellido2"+ 
                    " AND u.TipoSangre LIKE :TipoSangre")
                    .setParameter("idPaciente", par.getIdPaciente())
                    .setParameter("nombre1", par.getNombrePaciente1())
                    .setParameter("nombre2", par.getNombrePaciente2())
                    .setParameter("apellido1", par.getApellidoPaciente1())
                    .setParameter("apellido2", par.getApellidoPaciente2())
                    .setParameter("TipoSangre", par.getTipoSangre());
                   
        try {
            usuario = (Paciente) q.getSingleResult();
        } catch (NonUniqueResultException e) {
            usuario = (Paciente) q.getResultList().get(0);
        } catch (Exception e){
            e.printStackTrace();
        }finally {
            em.close();
            return usuario;
        }
    }
    //método para actualizar atributos de un dato de la tabla de pacientes
    public boolean actualizar(Paciente object, Paciente nuevoObjeto) {
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();
        boolean ret = false;
        try {
            object = leer(object);
            object.setIdPaciente(nuevoObjeto.getIdPaciente());
            object.setNombrePaciente1(nuevoObjeto.getNombrePaciente1());
            object.setNombrePaciente2(nuevoObjeto.getNombrePaciente2());
            object.setApellidoPaciente1(nuevoObjeto.getApellidoPaciente1());
            object.setApellidoPaciente2(nuevoObjeto.getApellidoPaciente2());
            object.setTipoSangre(nuevoObjeto.getTipoSangre());
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
    //Método consulta para buscar los datos de un paciente con su identificación
    public Paciente leerPorId(String id){
        Paciente p = new Paciente();
        String query = "SELECT * FROM PACIENTES WHERE IDPACIENTE="+id;
        String url = "jdbc:derby://localhost:1527/GCHDB_JPA";
        String username = "root";
        String password = "123456";
        Connection conn = null;
        Statement stmt = null;
        try {
            conn = DriverManager.getConnection(url, username, password);
            stmt = conn.createStatement();
            ResultSet res = stmt.executeQuery(query);
                
            System.out.println("Datos del paciente: ");
            if (res.next()) {
                System.out.println(res.getInt("idPaciente") +
                        res.getString("nombre1") + ", " +
                        res.getString("nombre2") + ", " +
                        res.getString("apellido1") + ", "+
                        res.getString("apellido2") + ", "+
                        res.getString("tiposangre"));
                //creo paciente
                        p.setIdPaciente(res.getInt("idPaciente"));
                        p.setNombrePaciente2(res.getString("nombre2"));
                        p.setNombrePaciente1(res.getString("nombre1"));
                        p.setApellidoPaciente1(res.getString("apellido1"));
                        p.setApellidoPaciente2(res.getString("apellido2"));   
                        p.setTipoSangre(res.getString("tiposangre"));

            }
            res.close();
            stmt.execute(query);
            conn.close();
            stmt.close();
        } catch (SQLException e) {
            e.printStackTrace();
        } 
        return p;
    }
    
}
