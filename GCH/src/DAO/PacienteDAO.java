/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Entidad.Paciente;
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
    }

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
}
