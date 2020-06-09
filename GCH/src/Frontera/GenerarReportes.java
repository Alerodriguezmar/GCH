/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Frontera;

import DAO.EquipoDAO;
import DAO.PersonalMedicoDAO;
import Entidad.Equipo;
import Entidad.PersonalMedico;
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
        aceptarB = new javax.swing.JButton();
        cancelarB = new javax.swing.JButton();
        jlabel6 = new javax.swing.JLabel();
        registroEquiposT = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        registroPersonalT = new javax.swing.JScrollPane();
        jTable3 = new javax.swing.JTable();
        registroUciT = new javax.swing.JScrollPane();
        jTable4 = new javax.swing.JTable();
        registoUcimT = new javax.swing.JScrollPane();
        jTable5 = new javax.swing.JTable();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();

        jLabel4.setBackground(new java.awt.Color(255, 255, 255));
        jLabel4.setFont(new java.awt.Font("DejaVu Sans", 0, 18)); // NOI18N
        jLabel4.setText("Equipos usados");

        setBackground(new java.awt.Color(255, 255, 255));
        setForeground(new java.awt.Color(204, 204, 204));
        setMinimumSize(new java.awt.Dimension(755, 585));
        setPreferredSize(new java.awt.Dimension(755, 585));

        jLabel3.setBackground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Registro");

        aceptarB.setText("Aceptar");
        aceptarB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aceptarBActionPerformed(evt);
            }
        });

        cancelarB.setText("Cancelar");

        jlabel6.setText("Fecha");

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
        registroEquiposT.setViewportView(jTable2);

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
        registroPersonalT.setViewportView(jTable3);

        jTable4.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {"Disponibles", null},
                {"Ocupadas", null}
            },
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
        registroUciT.setViewportView(jTable4);

        jTable5.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {"Disponibles", null},
                {"Ocupadas", null}
            },
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
        registoUcimT.setViewportView(jTable5);

        jLabel5.setBackground(new java.awt.Color(255, 255, 255));
        jLabel5.setFont(new java.awt.Font("DejaVu Sans", 0, 18)); // NOI18N
        jLabel5.setText("Personal médico");

        jLabel6.setBackground(new java.awt.Color(255, 255, 255));
        jLabel6.setFont(new java.awt.Font("DejaVu Sans", 0, 18)); // NOI18N
        jLabel6.setText("Camas UCI");

        jLabel7.setBackground(new java.awt.Color(255, 255, 255));
        jLabel7.setFont(new java.awt.Font("DejaVu Sans", 0, 18)); // NOI18N
        jLabel7.setText("Equipos disponibles");

        jLabel8.setBackground(new java.awt.Color(255, 255, 255));
        jLabel8.setFont(new java.awt.Font("DejaVu Sans", 0, 18)); // NOI18N
        jLabel8.setText("Camas UCIM");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(registroPersonalT, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(registroEquiposT, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel7))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(111, 111, 111)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jlabel6)
                            .addComponent(registoUcimT, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(registroUciT, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6)
                            .addComponent(jLabel8))
                        .addContainerGap(156, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(aceptarB, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cancelarB))
                        .addGap(50, 50, 50))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addComponent(jLabel3))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addComponent(jlabel6)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(registroUciT, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(registroEquiposT, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel8))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(registroPersonalT, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(60, 60, 60))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(registoUcimT, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(aceptarB)
                        .addGap(18, 18, 18)
                        .addComponent(cancelarB)
                        .addGap(49, 49, 49))))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void aceptarBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aceptarBActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_aceptarBActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton aceptarB;
    private javax.swing.JButton cancelarB;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JTable jTable2;
    private javax.swing.JTable jTable3;
    private javax.swing.JTable jTable4;
    private javax.swing.JTable jTable5;
    private javax.swing.JLabel jlabel6;
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
}

