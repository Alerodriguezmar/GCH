/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Entidad.EquiposUsados;
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
    }

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

    public EquiposUsados leer(EquiposUsados par) {
        EntityManager em = emf.createEntityManager();
        EquiposUsados usuario = null;
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
}
