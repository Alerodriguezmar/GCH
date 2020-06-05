/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;


import Entidad.PersonalMedico;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.NonUniqueResultException;
import javax.persistence.Persistence;
import javax.persistence.Query;

/**
 *
 * @author tech
 */
public class UsuarioDAO {
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

    public boolean actualizar(PersonalMedico object, PersonalMedico nuevoObjeto) {
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();
        boolean ret = false;
        try {
            object = leer(object);
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
}
