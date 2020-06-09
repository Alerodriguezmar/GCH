/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Entidad.Administrador;
import Entidad.PersonalMedico;
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
 * @author user
 */
public class PersonalMedicoDAO {
    private static EntityManagerFactory
            emf = Persistence.createEntityManagerFactory("GCHPU");

    public void crear(PersonalMedico object) {

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

    public boolean eliminar(PersonalMedico object) {
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

    public PersonalMedico leer(PersonalMedico par) {
        EntityManager em = emf.createEntityManager();
        PersonalMedico usuario = null;
        Query q = em.createQuery("SELECT u FROM personalMedico u " +
                    "WHERE u.nombre1 LIKE :nombre1" +
                    " AND u.nombre2 LIKE :nombre2" +
                    " AND u.apellido1 LIKE :apellido1" +
                    " AND u.apellido2 LIKE :apellido2" +
                    " AND u.email LIKE :email" +
                    " AND u.direccion LIKE :direccion" +
                    " AND u.tipoSangre LIKE :tipoSangre" +
                    " AND u.ID LIKE :ID" +
                    " AND u.cargo LIKE :cargo" +
                    " AND u.ReThus LIKE :ReThus" +
                    " AND u.celular LIKE :celular" +
                    " AND u.usuario LIKE :usuario" +
                    " AND u.contrasenia LIKE :contrasenia")
                    .setParameter("nombre1", par.getNombre1())
                    .setParameter("nombre2", par.getNombre2())
                    .setParameter("apellido1", par.getApellido1())
                    .setParameter("apellido2", par.getApellido2())
                    .setParameter("email", par.getEmail())
                    .setParameter("direccion", par.getEmail())
                    .setParameter("tipoSangre", par.getTipo_sangre())
                    .setParameter("ID", par.getId())
                    .setParameter("cargo", par.getCargo())
                    .setParameter("ReThus", par.getReTHUS())
                    .setParameter("celular", par.getCelular())
                    .setParameter("usuario", par.getNomUsuario())
                    .setParameter("contrasenia", par.getPasswordAux());
        try {
            usuario = (PersonalMedico) q.getSingleResult();
        } catch (NonUniqueResultException e) {
            usuario = (PersonalMedico) q.getResultList().get(0);
        } catch (Exception e){
            e.printStackTrace();
        }finally {
            em.close();
            return usuario;
        }
    }

    public boolean actualizar(PersonalMedico object, PersonalMedico nuevoObjeto) {
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();
        boolean ret = false;
        try {
            object = leer(object);
            object.setNombre1(nuevoObjeto.getNombre1());
            object.setNombre2(nuevoObjeto.getNombre2());
            object.setApellido1(nuevoObjeto.getApellido1());
            object.setApellido2(nuevoObjeto.getApellido2());
            object.setEmail(nuevoObjeto.getEmail());
            object.setCelular(nuevoObjeto.getCelular());
            object.setReTHUS(nuevoObjeto.getReTHUS());
            object.setId(nuevoObjeto.getId());
            object.setCargo(nuevoObjeto.getCargo());
            object.setNomUsuario(nuevoObjeto.getNomUsuario());
            object.setPasswordAux(nuevoObjeto.getPasswordAux());
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
    
    public PersonalMedico leerd(PersonalMedico par){
        EntityManager em = emf.createEntityManager();
        PersonalMedico usuario = null;
        Query q = em.createQuery("SELECT u FROM PersonalMedico u " +
                    "WHERE u.nomUsuario LIKE :nombre" +
                    " AND u.passwordAux LIKE :password")
                    .setParameter("nombre", par.getNomUsuario())
                    .setParameter("password", par.getPasswordAux());
        try {
            usuario = (PersonalMedico) q.getSingleResult();
        } catch (NonUniqueResultException e) {
            usuario = (PersonalMedico) q.getResultList().get(0);
        } catch (Exception e){
            e.printStackTrace();
        }finally {
            em.close();
            return usuario;
        }
    }
    
    public PersonalMedico leerPorId(String id){
        PersonalMedico p = new PersonalMedico();
        String query = "SELECT * FROM PERSONALMEDICO WHERE ID="+id;
        String url = "jdbc:derby://localhost:1527/GCHDB_JPA";
        String username = "root";
        String password = "123456";
        Connection conn = null;
        Statement stmt = null;
        try {
            conn = DriverManager.getConnection(url, username, password);
            stmt = conn.createStatement();
            ResultSet res = stmt.executeQuery(query);
                
            System.out.println("Datos del personal medico: ");
            while (res.next()) {
                System.out.println(res.getInt("id") +
                        res.getString("nombre1") + ", " +
                        res.getString("nombre2") + ", " +
                        res.getString("apellido1") + ", "+
                        res.getString("apellido2") + ", "+
                        res.getString("tipo_sangre")+ ", " + 
                        res.getString("email")+ ", " + 
                        res.getString("direccion")+ ", " + 
                        res.getString("celular")+ ", " + 
                        res.getString("cargo")+ ", " + 
                        res.getString("reTHUS")+ ", " + 
                        res.getString("nomUsuario")+ ", " + 
                        res.getString("passwordAux"));
                //creo personal
                        p.setId(res.getInt("id"));
                        p.setNombre1(res.getString("nombre1"));
                        p.setNombre2(res.getString("nombre2"));
                        p.setApellido1(res.getString("apellido1"));
                        p.setApellido2(res.getString("apellido2"));   
                        p.setTipo_sangre(res.getString("tipo_sangre"));
                        p.setEmail(res.getString("email"));
                        p.setDireccion(res.getString("direccion"));
                        p.setCelular(res.getString("celular"));
                        p.setCargo(res.getString("cargo"));
                        p.setNomUsuario(res.getString("nomUsuario"));
                        p.setReTHUS(res.getString("reTHUS"));
                        p.setPasswordAux(res.getString("passwordAux"));

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
    //Leer PersonalM con x nombre disponibles
    public long leerPersMporCargo(String nomeq) {
        long eq=-1;
        String query = "SELECT COUNT(CARGO) AS CANTIDAD FROM ROOT.PERSONALMEDICO WHERE CARGO='"+nomeq+"'";
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

