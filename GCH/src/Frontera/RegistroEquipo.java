/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Frontera;

import Control.ValidarRegistroEquipo;
import Entidad.Equipo;

/**
 *
 * @author user
 */
public class RegistroEquipo extends javax.swing.JPanel {

    /**
     * Creates new form RegistroEquipo
     */
    public RegistroEquipo() {
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

        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        equipoMarcaTF = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        equipoNombreTF = new javax.swing.JTextField();
        equipoTipoCB = new javax.swing.JComboBox<>();
        equipoRegistroTF = new javax.swing.JTextField();
        aceptarB = new javax.swing.JButton();
        equipoCantidadTF = new javax.swing.JTextField();
        cancelarB = new javax.swing.JButton();
        equipoDescripcionTF = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));

        jLabel2.setBackground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Marca");

        jLabel3.setBackground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Tipo de uso");

        jLabel4.setBackground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("Registro Sanitario");

        jLabel5.setBackground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("Cantidad");

        equipoMarcaTF.setBackground(new java.awt.Color(102, 102, 102));

        jLabel6.setBackground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("Descripción");

        equipoNombreTF.setBackground(new java.awt.Color(102, 102, 102));

        equipoTipoCB.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " ", "Soporte de vida", "Quirúrgica", "Cuidados intensivos", "Terapia física", "Equipos de tratamiento", "Monitorización quirúrgica", "Monitorización de Cuidados intensivos", "Monitorización general", "Diagnósticos fisiológicos", "Analítica de laboratorio", "Accesorios de laboratorio", "Procesado de datos del paciente", "Otro" }));
        equipoTipoCB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                equipoTipoCBActionPerformed(evt);
            }
        });

        equipoRegistroTF.setBackground(new java.awt.Color(102, 102, 102));

        aceptarB.setText("Aceptar");
        aceptarB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aceptarBActionPerformed(evt);
            }
        });

        equipoCantidadTF.setBackground(new java.awt.Color(102, 102, 102));

        cancelarB.setText("Cancelar");

        equipoDescripcionTF.setBackground(new java.awt.Color(102, 102, 102));

        jLabel1.setBackground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Nombre");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(111, 111, 111)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel1)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6))
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(equipoDescripcionTF, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(equipoTipoCB, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(equipoMarcaTF)
                        .addComponent(equipoRegistroTF, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(equipoCantidadTF, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(equipoNombreTF)))
                .addContainerGap(243, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(cancelarB, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(aceptarB, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(101, 101, 101))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(equipoNombreTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(equipoMarcaTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(equipoTipoCB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(equipoRegistroTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(equipoCantidadTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(equipoDescripcionTF, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addGap(86, 86, 86)
                .addComponent(aceptarB)
                .addGap(18, 18, 18)
                .addComponent(cancelarB)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void equipoTipoCBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_equipoTipoCBActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_equipoTipoCBActionPerformed

    private void aceptarBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aceptarBActionPerformed
        Equipo equipo = new Equipo();
        equipo.setNombreEquipo(equipoNombreTF.getText());
        equipo.setMarca(equipoMarcaTF.getText());
        equipo.setTipoUso(equipoTipoCB.getSelectedItem().toString());
        equipo.setRegistroSanitario(equipoRegistroTF.getText());
        equipo.setDescripcionEquipo(equipoDescripcionTF.getText());
        
        ValidarRegistroEquipo validar = new ValidarRegistroEquipo();
        System.out.println("-------");
        String resultado = validar.VerificarRegistroEquipo(equipo);
        System.out.println(resultado);
    }//GEN-LAST:event_aceptarBActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton aceptarB;
    private javax.swing.JButton cancelarB;
    private javax.swing.JTextField equipoCantidadTF;
    private javax.swing.JTextField equipoDescripcionTF;
    private javax.swing.JTextField equipoMarcaTF;
    private javax.swing.JTextField equipoNombreTF;
    private javax.swing.JTextField equipoRegistroTF;
    private javax.swing.JComboBox<String> equipoTipoCB;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    // End of variables declaration//GEN-END:variables
}
