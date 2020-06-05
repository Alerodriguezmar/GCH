/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Entidad.EgresoPaciente;
import java.util.HashSet;
import java.util.Set;
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
    }

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

    public EgresoPaciente leer(EgresoPaciente par) {
        EntityManager em = emf.createEntityManager();
        EgresoPaciente usuario = null;
        Query q = em.createQuery("SELECT u FROM EgresoPacientes u " +
                    "WHERE u.ingresopaciente_idingresopaciente LIKE :id" +
                    " AND u.fecha LIKE :fecha" + 
                    " AND u.observaciones LIKE: obs")
                    .setParameter("id", par.getIngresoP())
                    .setParameter("fecha", par.getFecha())
                    .setParameter("obs", par.getObservaciones());
        try {
            usuario = (EgresoPaciente) q.getSingleResult();
        } catch (NonUniqueResultException e) {
            usuario = (EgresoPaciente) q.getResultList().get(0);
        } catch (Exception e){
            e.printStackTrace();
        }finally {
            em.close();
            return usuario;
        }
    }

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
