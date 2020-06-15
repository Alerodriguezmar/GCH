/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Entidad.Administrador;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.NonUniqueResultException;
import javax.persistence.Persistence;
import javax.persistence.Query;

/**
 *
 * @author tech
 */
public class AdminDAO {
    private static EntityManagerFactory
            emf = Persistence.createEntityManagerFactory("GCHPU");
// método para crear un dato en la tabla
    public void crear(Administrador object) {

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
        System.out.println("ADMINISTRADOR INGRESADO");
    }
    //metodo para eliminar un dato de la tabla
    public boolean eliminar(Administrador object) {
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
    //consulta para buscar si el usuario y contraseña están en la base de datos
    public Administrador leerd(Administrador par){
        EntityManager em = emf.createEntityManager();
        Administrador usuario = null;
        System.out.println("CONSULTANDO ADMINISTRADOR...");
        Query q = em.createQuery("SELECT u FROM Administrador u " +
                    "WHERE u.usuario LIKE :nombre" +
                    " AND u.contrasenia LIKE :password")
                    .setParameter("nombre", par.getUsuario())
                    .setParameter("password", par.getContrasenia());
        try {
            usuario = (Administrador) q.getSingleResult();
        } catch (NonUniqueResultException e) {
            usuario = (Administrador) q.getResultList().get(0);
        } catch (Exception e){
            e.printStackTrace();
        }finally {
            em.close();
            return usuario;
        }
    }
    //consulta para buscar los datos de un administrador
    public Administrador leer(Administrador par) {
        EntityManager em = emf.createEntityManager();
        Administrador usuario = null;
        Query q = em.createQuery("SELECT u FROM Administrador u " +
                    "WHERE u.nombre1 LIKE :nombre1" +
                    " AND u.nombre2 LIKE :nombre2" +
                    " AND u.apellido1 LIKE :apellido1" +
                    " AND u.apellido2 LIKE :apellido2" +
                    " AND u.email LIKE :email" +
                    " AND u.nidentificacion LIKE :nidentificacion" +
                    " AND u.celular LIKE :celular" +
                    " AND u.usuario LIKE :usuario" +
                    " AND u.contrasenia LIKE :contrasenia")
                    .setParameter("nombre1", par.getNombre1())
                    .setParameter("nombre2", par.getNombre2())
                    .setParameter("apellido1", par.getApellido1())
                    .setParameter("apellido2", par.getApellido2())
                    .setParameter("email", par.getEmail())
                    .setParameter("nidentificacion", par.getNidentificacion())
                    .setParameter("celular", par.getCelular())
                    .setParameter("usuario", par.getUsuario())
                    .setParameter("contrasenia", par.getContrasenia());
        System.out.println("CONSULTANDO ADMINISTRADOR...");
        try {
            usuario = (Administrador) q.getSingleResult();
        } catch (NonUniqueResultException e) {
            usuario = (Administrador) q.getResultList().get(0);
        } catch (Exception e){
            e.printStackTrace();
        }finally {
            em.close();
            return usuario;
        }
    }
    //método para actualizar atributos de un dato de la tabla administrador de base de datos
    public boolean actualizar(Administrador object, Administrador nuevoObjeto) {
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
            object.setNidentificacion(nuevoObjeto.getNidentificacion());
            object.setUsuario(nuevoObjeto.getUsuario());
            object.setContrasenia(nuevoObjeto.getContrasenia());
            em.merge(object);
            em.getTransaction().commit();
            ret = true;
             System.out.println("ACTUALIZANDO ADMINISTRADOR...");
        } catch (Exception e) {
            e.printStackTrace();
            em.getTransaction().rollback();
        } finally {
            em.close();
            return ret;
        }
    }
}
