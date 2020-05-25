/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;


import Entidad.Camas;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.NonUniqueResultException;
import javax.persistence.Persistence;
import javax.persistence.Query;

/**
 *
 * @author tech
 */
public class CamaDAO {
     private static EntityManagerFactory
            emf = Persistence.createEntityManagerFactory("GCHPU");

    public void crear(Camas object) {

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

    public boolean eliminar(Camas object) {
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

    public Camas leer(Camas par) {
        EntityManager em = emf.createEntityManager();
        Camas usuario = null;
        Query q = em.createQuery("SELECT u FROM Camas u " +
                    "WHERE u.Ubicacion LIKE :ubicacion")
                    .setParameter("ubicacion", par.getUbicacion());
                  
        try {
           
            usuario = (Camas) q.getSingleResult();
         
        } catch (NonUniqueResultException e) {
            
            usuario = (Camas) q.getResultList().get(0);
          
        } catch (Exception e){
            e.printStackTrace();
        }finally {
            em.close();
            return usuario;
        }
    }

    
     public  boolean leerE(Camas par) {
        EntityManager em = emf.createEntityManager();
       long no = 0;
        Query q = em.createQuery("SELECT COUNT (u) FROM Camas u " +
                    "WHERE u.Ubicacion LIKE :ubicacion"+
                  " AND u.pabellon LIKE :pabellon")
                .setParameter("pabellon", par.getPabellon())
                    .setParameter("ubicacion", par.getUbicacion());
                  
      
          no =  (long) q.getSingleResult();
         
        em.close();
            return( no == 0) ;
        
    }
    
    public boolean actualizar(Camas object, Camas nuevoObjeto) {
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();
        boolean ret = false;
        try {
            object = leer(object);
            object.setEstado(nuevoObjeto.isEstado());
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
