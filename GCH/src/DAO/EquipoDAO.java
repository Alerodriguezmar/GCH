/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Entidad.Equipo;
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

    public Equipo leer(Equipo par) {
        EntityManager em = emf.createEntityManager();
        Equipo usuario = null;
        Query q = em.createQuery("SELECT u FROM Equipo u " +
                    "WHERE u.nombreEquipo LIKE :nombreEquipo" +
                    " AND u.Marca LIKE :Marca" +
                    " AND u.RegistroSanitario LIKE :RegistroSanitario" +
                    " AND u.DescripcionEquipo LIKE :DescripcionEquipo" +
                    " AND u.EstadoEquipo LIKE :EstadoEquipo"+ 
                    " AND u.TipoUso LIKE :TipoUso")
                    .setParameter("nombreEquipo", par.getNombreEquipo())
                    .setParameter("Marca", par.getMarca())
                    .setParameter("RegistroSanitario", par.getRegistroSanitario())
                    .setParameter("DescripcionEquipo", par.getDescripcionEquipo())
                    .setParameter("EstadoEquipo", par.getEstadoEquipo())
                    .setParameter("TipoUso", par.getTipoUso());
                   
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

    public boolean actualizar(Equipo object, Equipo nuevoObjeto) {
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();
        boolean ret = false;
        try {
            object = leer(object);
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
}

    
    

