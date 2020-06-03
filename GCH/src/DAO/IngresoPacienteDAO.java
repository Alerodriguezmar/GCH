/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Entidad.IngresoPaciente;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.NonUniqueResultException;
import javax.persistence.Persistence;
import javax.persistence.Query;

/**
 *
 * @author DAVID
 */
public class IngresoPacienteDAO {
    private static EntityManagerFactory
            emf = Persistence.createEntityManagerFactory("GCHPU");

    public void crear(IngresoPaciente object) {

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

    public boolean eliminar(IngresoPaciente object) {
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

    public IngresoPaciente leer(IngresoPaciente par) {
        EntityManager em = emf.createEntityManager();
        IngresoPaciente usuario = null;
        Query q = em.createQuery("SELECT u FROM Ingreso_Paciente u " +
                    "WHERE u.paciente LIKE :paciente" +
                    " AND u.personalm LIKE :personalm" +
                    " AND u.cama LIKE :cama" +
                    " AND u.observacion LIKE :observacion" +
                    " AND u.fecha LIKE :fecha"+ 
                    " AND u.idIngreso LIKE :idIngreso")
                    .setParameter("idIngreso", par.getIdIngreso())
                    .setParameter("paciente", par.getPaciente())
                    .setParameter("personalm", par.getPersonalm())
                    .setParameter("cama", par.getCama())
                    .setParameter("observacion", par.getObservacion())
                    .setParameter("fecha", par.getFecha());
                   
        try {
            usuario = (IngresoPaciente) q.getSingleResult();
        } catch (NonUniqueResultException e) {
            usuario = (IngresoPaciente) q.getResultList().get(0);
        } catch (Exception e){
            e.printStackTrace();
        }finally {
            em.close();
            return usuario;
        }
    }
    
    public boolean actualizar(IngresoPaciente object, IngresoPaciente nuevoObjeto) {
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();
        boolean ret = false;
        try {
            object = leer(object);
            object.setIdIngreso((int) nuevoObjeto.getIdIngreso());
            object.setPaciente(nuevoObjeto.getPaciente());
            object.setPersonalm(nuevoObjeto.getPersonalm());
            object.setFecha(nuevoObjeto.getFecha());
            object.setObservacion(nuevoObjeto.getObservacion());
            object.setCama(nuevoObjeto.getCama());
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
