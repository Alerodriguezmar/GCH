/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Frontera;

import DAO.CamaDAO;
import DAO.EquipoDAO;
import DAO.PersonalMedicoDAO;
import Entidad.Equipo;
import Entidad.PersonalMedico;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author tech
 */
public class GenerarReportes extends javax.swing.JPanel {

    /**
     * Creates new form IngresoPaciente
     */
    public GenerarReportes() {
        initComponents();
        
        //Tomar fecha
                DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd");
                LocalDateTime now = LocalDateTime.now();
                String fecha = now.format(dtf);
                
        fechaL.setText("Fecha: "+fecha);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        fechaL = new javax.swing.JLabel();
        registroEquiposT = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        registroPersonalT = new javax.swing.JScrollPane();
        jTable3 = new javax.swing.JTable();
        registroUciT = new javax.swing.JScrollPane();
        jTableUCI = new javax.swing.JTable();
        registoUcimT = new javax.swing.JScrollPane();
        jTableUCIM = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();

        jLabel4.setBackground(new java.awt.Color(255, 255, 255));
        jLabel4.setFont(new java.awt.Font("DejaVu Sans", 0, 18)); // NOI18N
        jLabel4.setText("Equipos usados");

        setBackground(new java.awt.Color(204, 204, 204));
        setForeground(new java.awt.Color(204, 204, 204));
        setMinimumSize(new java.awt.Dimension(755, 585));
        setPreferredSize(new java.awt.Dimension(1582, 800));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setBackground(new java.awt.Color(0, 0, 0));
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Registro");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 10, -1, -1));

        fechaL.setForeground(new java.awt.Color(255, 255, 255));
        fechaL.setText("Fecha");
        add(fechaL, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 40, -1, -1));

        jTable2.setBackground(new java.awt.Color(59, 175, 154));
        jTable2.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jTable2.setForeground(new java.awt.Color(255, 255, 255));
        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            mostrarEquipo(),
            new String [] {
                "Equipos", "Cantidad"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable2.setToolTipText("");
        jTable2.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_ALL_COLUMNS);
        jTable2.setFillsViewportHeight(true);
        jTable2.setGridColor(new java.awt.Color(63, 191, 168));
        jTable2.setInheritsPopupMenu(true);
        jTable2.setOpaque(false);
        jTable2.setRowHeight(30);
        jTable2.setRowMargin(2);
        registroEquiposT.setViewportView(jTable2);

        add(registroEquiposT, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 120, 320, 180));

        jTable3.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jTable3.setForeground(new java.awt.Color(16, 65, 56));
        jTable3.setModel(new javax.swing.table.DefaultTableModel(
            mostrarPersonal(),
            new String [] {
                "Personal", "Cantidad"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable3.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_ALL_COLUMNS);
        jTable3.setOpaque(false);
        jTable3.setRowHeight(25);
        jTable3.setRowMargin(2);
        registroPersonalT.setViewportView(jTable3);

        add(registroPersonalT, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 120, 300, 180));

        jTableUCI.setBackground(new java.awt.Color(59, 175, 154));
        jTableUCI.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jTableUCI.setForeground(new java.awt.Color(255, 255, 255));
        jTableUCI.setModel(new javax.swing.table.DefaultTableModel(
            mostrarCamaUCI(),
            new String [] {
                "Estado", "Cantidad"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        registroUciT.setViewportView(jTableUCI);

        add(registroUciT, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 360, 170, 60));

        jTableUCIM.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jTableUCIM.setModel(new javax.swing.table.DefaultTableModel(
            mostrarCamaUCIM(),
            new String [] {
                "Estado", "Cantidad"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        registoUcimT.setViewportView(jTableUCIM);

        add(registoUcimT, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 360, 160, 60));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/Reporte.jpg"))); // NOI18N
        jLabel1.setFocusable(false);
        jLabel1.setInheritsPopupMenu(false);
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1000, -1));
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel fechaL;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JTable jTable2;
    private javax.swing.JTable jTable3;
    private javax.swing.JTable jTableUCI;
    private javax.swing.JTable jTableUCIM;
    private javax.swing.JScrollPane registoUcimT;
    private javax.swing.JScrollPane registroEquiposT;
    private javax.swing.JScrollPane registroPersonalT;
    private javax.swing.JScrollPane registroUciT;
    // End of variables declaration//GEN-END:variables
    public String [][] mostrarPersonal(){
        PersonalMedicoDAO pmdao = new PersonalMedicoDAO();
        List<PersonalMedico> pms = new ArrayList();
        
        
        String[] nombres = new String[] {"Asistente enfermería", "Asistente médico profesional", "Médico especialista", "Médico general", "Profesional en enfermería" };
        
        for(int i = 0; i < nombres.length; i++){
            PersonalMedico p = new PersonalMedico();
            p.setCargo(nombres[i]);
            pms.add(p);         
        }
        
        String[][] matriz=new String[pms.size()][2];
        for(int i = 0; i<pms.size(); i++){
            matriz[i][0] = pms.get(i).getCargo();
            matriz[i][1] = Long.toString(pmdao.leerPersMporCargo(pms.get(i).getCargo()));//10 se debe reemplazar por la consulta SQL
        }
        return matriz;        
    }
    
    public String [][] mostrarEquipo(){
        EquipoDAO edao = new EquipoDAO();
        List<Equipo> eqs = new ArrayList();
        
        String[] nombres = new String[] {"EQUIPO DE INTUBACION", "SATUROMETRO", "BALA OXIGENO", "MONITOR", "BOMBA INFUSION CONTINUA", "BOMBA NUTRICION ENTERAL", "ASPIRADOR DE SECRECIONES","VENTILADOR MECANICO" };
        for(int i = 0; i < nombres.length; i++){
            Equipo e = new Equipo();
            e.setIdEquipo(i);
            e.setNombreEquipo(nombres[i]);
            eqs.add(e); 
        }
        String[][] matriz=new String[eqs.size()][2];
        for(int i = 0; i<eqs.size(); i++){
            matriz[i][0] = eqs.get(i).getNombreEquipo();
            matriz[i][1] =Long.toString(edao.leerEq(eqs.get(i).getNombreEquipo()));//10 se debe reemplazar por la consulta SQL
        }
        return matriz;        
    }
    
    public String[][] mostrarCamaUCI(){
        CamaDAO cdao = new CamaDAO();
        String[][] matriz = new String[2][2];
        
        matriz[0][0] = "Disponible: ";
        matriz[0][1] = Long.toString(cdao.leerCamasDisponibles("UCI"));
        matriz[1][0] = "Ocupado: ";
        matriz[1][1] = Long.toString(cdao.leerCamasOcupadas("UCI"));
                
        return matriz;
    }
    
    public String[][] mostrarCamaUCIM(){
        CamaDAO cdao = new CamaDAO();
        String[][] matriz = new String[2][2];
        
        matriz[0][0] = "Disponible: ";
        matriz[0][1] = Long.toString(cdao.leerCamasDisponibles("UCIM"));
        matriz[1][0] = "Ocupado: ";
        matriz[1][1] = Long.toString(cdao.leerCamasOcupadas("UCIM"));
                
        return matriz;
    }
    
}

