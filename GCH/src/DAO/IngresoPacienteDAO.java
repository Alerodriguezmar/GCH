/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Entidad.Camas;
import Entidad.IngresoPaciente;
import Entidad.Paciente;
import Entidad.PersonalMedico;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
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
    // método para crear un dato en la tabla
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
        System.out.println("INGRESO REALIZADO");
    }
    //mÉtodo para eliminar un dato de la tabla
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
    //Método para realizar una consulta de un ingreso
    public IngresoPaciente leer(IngresoPaciente par) {
        EntityManager em = emf.createEntityManager();
        IngresoPaciente usuario = null;
        System.out.println("CONSULTANDO INGRESO...");
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
    //método para actualizar atributos de un dato de la tabla de base de datos
    public boolean actualizar(IngresoPaciente object, IngresoPaciente nuevoObjeto) {
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();
        boolean ret = false;
        try {
            object = leerPorId(Long.toString(object.getIdIngreso()));
            object.setIdIngreso(nuevoObjeto.getIdIngreso());
            object.setPaciente(nuevoObjeto.getPaciente());
            object.setPersonalm(nuevoObjeto.getPersonalm());
            object.setFecha(nuevoObjeto.getFecha());
            object.setObservacion("PRUEBA");
            object.setCama(nuevoObjeto.getCama());
            object.setEstado(false);
            
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
    
    //Método para consultar un paciente por su numero de indnetificación
    public Paciente leerPacientePorId(String id){    
        System.out.println("BUSCANDO PACIENTE...");
        Paciente p = new Paciente();
        String query = "SELECT * FROM INGRESO_PACIENTE WHERE PACIENTE_IDPACIENTE="+id+" AND ESTADO = 1";
        String url = "jdbc:derby://localhost:1527/GCHDB_JPA";
        String username = "root";
        String password = "123456";
        Connection conn = null;
        Statement stmt = null;
        try {
            conn = DriverManager.getConnection(url, username, password);
            stmt = conn.createStatement();
            ResultSet res = stmt.executeQuery(query);
                
            if(res.next() == true){
                query = "SELECT * FROM PACIENTES WHERE IDPACIENTE="+id;
                try {
                    res = stmt.executeQuery(query);
                    if(res.next()){
                        System.out.println("Paciente Encontrado...");
                        System.out.println(res.getInt("idPaciente") +      
                        res.getString("nombre1") + ", " +
                        res.getString("nombre2") + ", " +
                        res.getString("apellido1") + ", "+
                        res.getString("apellido2") + ", "+
                        res.getString("tiposangre"));
                //creo paciente
                        p.setNombrePaciente2(res.getString("nombre2"));
                        p.setNombrePaciente1(res.getString("nombre1"));
                        p.setApellidoPaciente1(res.getString("apellido1"));
                        p.setApellidoPaciente2(res.getString("apellido2"));   
                        p.setTipoSangre(res.getString("tiposangre"));

                        System.out.println("Id: "+p.getIdPaciente()+" Nombre: "+p.getNombrePaciente1());
                    }
                    else{
                        System.out.println("Paciente NO ENCONTRADO");
                    }
                }
                catch(SQLException e){
                    e.printStackTrace();
                }
                
            }else{ 
                System.out.println("INGRESO no encontrado");          
            }
            res.close();
            stmt.execute(query);
            conn.close();
            stmt.close();
        } catch (SQLException e) {
            e.printStackTrace();
        } 
        return p;
    }
    
    //BUSCAR SELECT * FROM INGRESOPACIENTE WHERE PACIENTE_IDPACIENTE = idpaciente AND ESTADO = true;
    public IngresoPaciente leerPorPaciente(String id){
        System.out.println("BUSCANDO PACIENTE EN INGRESO_PACIENTE...");
        IngresoPaciente ingp = new IngresoPaciente();
        String query = "SELECT * FROM INGRESO_PACIENTE WHERE PACIENTE_IDPACIENTE="+id+" AND ESTADO = 1";
        String url = "jdbc:derby://localhost:1527/GCHDB_JPA";
        String username = "root";
        String password = "123456";
        Connection conn = null;
        Statement stmt = null;
        try {
            conn = DriverManager.getConnection(url, username, password);
            stmt = conn.createStatement();
            ResultSet res = stmt.executeQuery(query);
                
            if(res.next() == true){
                System.out.println("ID: " + Long.toString(res.getLong("idIngreso")) + 
                        " IdPaciente: " + Integer.toString(res.getInt("Paciente_IdPaciente")) +
                        " IdPersonalm: " + Integer.toString(res.getInt("personalm_id")) +
                        " IdCama: " + Integer.toString(res.getInt("cama_idcamas")) + 
                        " Fecha: " + res.getString("fecha") +
                        " Observacion: " + res.getString("observacion") +
                        " Estado: " + Boolean.toString(res.getBoolean("estado")));
                //CREO INGRESOPACIENTE
                    Paciente paciente = new Paciente();
                    PacienteDAO pdao = new PacienteDAO();
                    paciente = pdao.leerPorId(Integer.toString(res.getInt("Paciente_IdPaciente")));
                    
                    Camas cama = new Camas();
                    CamaDAO cdao = new CamaDAO();
                    cama = cdao.leerPorId(Integer.toString(res.getInt("cama_idcamas")));
                    
                    PersonalMedico personalm = new PersonalMedico();
                    PersonalMedicoDAO perdao = new PersonalMedicoDAO();
                    personalm = perdao.leerPorId(Integer.toString(res.getInt("personalm_id")));
                    
                    ingp.setIdIngreso(res.getLong("idIngreso"));
                    ingp.setPaciente(paciente);
                    ingp.setCama(cama);
                    ingp.setPersonalm(personalm);
                    ingp.setFecha(res.getString("fecha"));
                    ingp.setObservacion(res.getString("observacion"));
                    ingp.setEstado(res.getBoolean("estado"));
                   
            }else{ 
                System.out.println("INGRESO_PACIENTE NO ENCONTRADO");          
            }
            res.close();
            stmt.execute(query);
            conn.close();
            stmt.close();
        } catch (SQLException e) {
            e.printStackTrace();
        } 
        return ingp;
    }
    
    public IngresoPaciente leerPorId(String id){
        System.out.println("BUSCANDO PACIENTE EN INGRESO_PACIENTE...");
        IngresoPaciente ingp = new IngresoPaciente();
        String query = "SELECT * FROM INGRESO_PACIENTE WHERE IDINGRESO="+id;
        String url = "jdbc:derby://localhost:1527/GCHDB_JPA";
        String username = "root";
        String password = "123456";
        Connection conn = null;
        Statement stmt = null;
        try {
            conn = DriverManager.getConnection(url, username, password);
            stmt = conn.createStatement();
            ResultSet res = stmt.executeQuery(query);
                
            if(res.next() == true){
                System.out.println("ID: " + Long.toString(res.getLong("idIngreso")) + 
                        " IdPaciente: " + Integer.toString(res.getInt("Paciente_IdPaciente")) +
                        " IdPersonalm: " + Integer.toString(res.getInt("personalm_id")) +
                        " IdCama: " + Integer.toString(res.getInt("cama_idcamas")) + 
                        " Fecha: " + res.getString("fecha") +
                        " Observacion: " + res.getString("observacion") +
                        " Estado: " + Boolean.toString(res.getBoolean("estado")));
                //CREO INGRESOPACIENTE
                    Paciente paciente = new Paciente();
                    PacienteDAO pdao = new PacienteDAO();
                    paciente = pdao.leerPorId(Integer.toString(res.getInt("Paciente_IdPaciente")));
                    
                    Camas cama = new Camas();
                    CamaDAO cdao = new CamaDAO();
                    cama = cdao.leerPorId(Integer.toString(res.getInt("cama_idcamas")));
                    
                    PersonalMedico personalm = new PersonalMedico();
                    PersonalMedicoDAO perdao = new PersonalMedicoDAO();
                    personalm = perdao.leerPorId(Integer.toString(res.getInt("personalm_id")));
                    
                    ingp.setIdIngreso(res.getLong("idIngreso"));
                    ingp.setPaciente(paciente);
                    ingp.setCama(cama);
                    ingp.setPersonalm(personalm);
                    ingp.setFecha(res.getString("fecha"));
                    ingp.setObservacion(res.getString("observacion"));
                    ingp.setEstado(res.getBoolean("estado"));
                   
            }else{ 
                System.out.println("INGRESO_PACIENTE NO ENCONTRADO");          
            }
            res.close();
            stmt.execute(query);
            conn.close();
            stmt.close();
        } catch (SQLException e) {
            e.printStackTrace();
        } 
        return ingp;
    }
    
}
