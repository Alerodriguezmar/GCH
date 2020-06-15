/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Entidad.EgresoPaciente;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.NonUniqueResultException;
import javax.persistence.Persistence;
import javax.persistence.Query;

/**
 *
 * @author DAVID
 */
public class EgresoPacienteDAO {
    private static EntityManagerFactory
            emf = Persistence.createEntityManagerFactory("GCHPU");

    // método para crear un dato en la tabla de EGRESOPACIENTE
    public void crear(EgresoPaciente object) {

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
        System.out.println("EGRESO REGISTRADO");
    }

    //metodo para eliminar un dato de la tabla
    public boolean eliminar(EgresoPaciente object) {
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

    //consulta para buscar el egreso de un determinado paciente que 
    //realizó un ingreso en centro hospitalario
    public EgresoPaciente leer(EgresoPaciente par) {
        EntityManager em = emf.createEntityManager();
        EgresoPaciente usuario = null;
        System.out.println("CONSULTANDO EGRESO...");
        Query q = em.createQuery("SELECT u FROM EgresoPacientes u "
                + "WHERE u.ingresopaciente_idingresopaciente LIKE :id"
                + " AND u.fecha LIKE :fecha"
                + " AND u.observaciones LIKE: obs")
                .setParameter("id", par.getIngresoP())
                .setParameter("fecha", par.getFecha())
                .setParameter("obs", par.getObservaciones());
        try {
            usuario = (EgresoPaciente) q.getSingleResult();
        } catch (NonUniqueResultException e) {
            usuario = (EgresoPaciente) q.getResultList().get(0);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            em.close();
            return usuario;
        }
    }

    //método para actualizar atributos de un dato de la tabla de EGRESOPACIENTE de la base de datos
    public boolean actualizar(EgresoPaciente object, EgresoPaciente nuevoObjeto) {
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();
        boolean ret = false;
        try {
            object = leer(object);
            object.setIngresoP(nuevoObjeto.getIngresoP());
            object.setFecha(nuevoObjeto.getFecha());
            object.setObservaciones(nuevoObjeto.getObservaciones());
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
}
