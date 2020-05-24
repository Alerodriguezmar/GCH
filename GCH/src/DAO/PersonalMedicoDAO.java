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
}
