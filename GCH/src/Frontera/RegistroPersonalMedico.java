/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Frontera;

import Control.ValidarRegistroPersonalMedico;
import DAO.PersonalMedicoDAO;
import Entidad.PersonalMedico;

/**
 *
 * @author user
 */
public class RegistroPersonalMedico extends javax.swing.JPanel {

    /**
     * Creates new form RegistroPersonalMedico
     */
    public RegistroPersonalMedico() {
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

        personalEmailTF = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        personalUsuarioTF = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        personalContrasenniaTF = new javax.swing.JTextField();
        aceptarB = new javax.swing.JButton();
        cancelarB = new javax.swing.JButton();
        personalCargoCB = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        personalReThusTF = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        personalNombreTF = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        personalApellidoTF = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        personalIdTF = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        personalCelularTF = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        personalDireccionlTF = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        personalNombreTF1 = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        personalApellidoTF1 = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        tipoSangreCB = new javax.swing.JComboBox<>();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        personalEmailTF.setBackground(new java.awt.Color(204, 204, 204));
        personalEmailTF.setForeground(new java.awt.Color(0, 0, 0));
        add(personalEmailTF, new org.netbeans.lib.awtextra.AbsoluteConstraints(247, 269, 120, -1));

        jLabel6.setBackground(new java.awt.Color(0, 0, 0));
        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("Email");
        add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(111, 275, -1, -1));

        personalUsuarioTF.setBackground(new java.awt.Color(204, 204, 204));
        personalUsuarioTF.setForeground(new java.awt.Color(0, 0, 0));
        add(personalUsuarioTF, new org.netbeans.lib.awtextra.AbsoluteConstraints(247, 314, 120, -1));

        jLabel7.setForeground(new java.awt.Color(0, 0, 0));
        jLabel7.setText("Usuario");
        add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(111, 320, -1, -1));

        personalContrasenniaTF.setBackground(new java.awt.Color(204, 204, 204));
        personalContrasenniaTF.setForeground(new java.awt.Color(0, 0, 0));
        add(personalContrasenniaTF, new org.netbeans.lib.awtextra.AbsoluteConstraints(247, 359, 120, -1));

        aceptarB.setBackground(new java.awt.Color(204, 204, 204));
        aceptarB.setForeground(new java.awt.Color(0, 0, 0));
        aceptarB.setText("Aceptar");
        aceptarB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aceptarBActionPerformed(evt);
            }
        });
        add(aceptarB, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 459, 102, -1));

        cancelarB.setBackground(new java.awt.Color(204, 204, 204));
        cancelarB.setForeground(new java.awt.Color(0, 0, 0));
        cancelarB.setText("Cancelar");
        cancelarB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelarBActionPerformed(evt);
            }
        });
        add(cancelarB, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 504, 102, -1));

        personalCargoCB.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " ", "Asistente enfermería", "Asistente médico profesional", "Médico especialista", "Médico general", "Profesional en enfermería" }));
        add(personalCargoCB, new org.netbeans.lib.awtextra.AbsoluteConstraints(541, 181, -1, -1));

        jLabel8.setForeground(new java.awt.Color(0, 0, 0));
        jLabel8.setText("Contraseña");
        add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(111, 365, -1, -1));

        personalReThusTF.setBackground(new java.awt.Color(204, 204, 204));
        personalReThusTF.setForeground(new java.awt.Color(0, 0, 0));
        personalReThusTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                personalReThusTFActionPerformed(evt);
            }
        });
        add(personalReThusTF, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 224, 117, -1));

        jLabel9.setForeground(new java.awt.Color(0, 0, 0));
        jLabel9.setText("Tipo de sangre");
        add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(405, 143, -1, -1));

        personalNombreTF.setBackground(new java.awt.Color(204, 204, 204));
        personalNombreTF.setForeground(new java.awt.Color(0, 0, 0));
        personalNombreTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                personalNombreTFActionPerformed(evt);
            }
        });
        add(personalNombreTF, new org.netbeans.lib.awtextra.AbsoluteConstraints(247, 44, 120, -1));

        jLabel1.setBackground(new java.awt.Color(0, 0, 0));
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Primer nombre");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(111, 50, -1, -1));

        jLabel10.setForeground(new java.awt.Color(0, 0, 0));
        jLabel10.setText("Cargo");
        add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(405, 186, -1, -1));

        personalApellidoTF.setBackground(new java.awt.Color(204, 204, 204));
        personalApellidoTF.setForeground(new java.awt.Color(0, 0, 0));
        add(personalApellidoTF, new org.netbeans.lib.awtextra.AbsoluteConstraints(247, 89, 120, -1));

        jLabel2.setBackground(new java.awt.Color(0, 0, 0));
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Primer apellido");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(111, 95, -1, -1));

        jLabel11.setForeground(new java.awt.Color(0, 0, 0));
        jLabel11.setText("ReTHUS");
        add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(405, 230, -1, -1));

        personalIdTF.setBackground(new java.awt.Color(204, 204, 204));
        personalIdTF.setForeground(new java.awt.Color(0, 0, 0));
        add(personalIdTF, new org.netbeans.lib.awtextra.AbsoluteConstraints(247, 134, 120, -1));

        jLabel3.setBackground(new java.awt.Color(0, 0, 0));
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("No. Identificación");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(111, 140, -1, -1));

        personalCelularTF.setBackground(new java.awt.Color(204, 204, 204));
        personalCelularTF.setForeground(new java.awt.Color(0, 0, 0));
        add(personalCelularTF, new org.netbeans.lib.awtextra.AbsoluteConstraints(247, 179, 120, -1));

        jLabel4.setBackground(new java.awt.Color(0, 0, 0));
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("Celular");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(111, 185, -1, -1));

        personalDireccionlTF.setBackground(new java.awt.Color(204, 204, 204));
        personalDireccionlTF.setForeground(new java.awt.Color(0, 0, 0));
        add(personalDireccionlTF, new org.netbeans.lib.awtextra.AbsoluteConstraints(247, 224, 120, -1));

        jLabel5.setBackground(new java.awt.Color(0, 0, 0));
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("Dirección");
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(111, 230, -1, -1));

        personalNombreTF1.setBackground(new java.awt.Color(204, 204, 204));
        personalNombreTF1.setForeground(new java.awt.Color(0, 0, 0));
        personalNombreTF1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                personalNombreTF1ActionPerformed(evt);
            }
        });
        add(personalNombreTF1, new org.netbeans.lib.awtextra.AbsoluteConstraints(541, 44, 116, -1));

        jLabel12.setBackground(new java.awt.Color(0, 0, 0));
        jLabel12.setForeground(new java.awt.Color(0, 0, 0));
        jLabel12.setText("Segundo nombre");
        add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(405, 50, -1, -1));

        personalApellidoTF1.setBackground(new java.awt.Color(204, 204, 204));
        personalApellidoTF1.setForeground(new java.awt.Color(0, 0, 0));
        add(personalApellidoTF1, new org.netbeans.lib.awtextra.AbsoluteConstraints(541, 89, 116, -1));

        jLabel13.setBackground(new java.awt.Color(0, 0, 0));
        jLabel13.setForeground(new java.awt.Color(0, 0, 0));
        jLabel13.setText("Segundo apellido");
        add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(405, 95, -1, -1));

        tipoSangreCB.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "O +", "O -", "A -", "A +", "B -", "B +", "AB -", "AB +" }));
        add(tipoSangreCB, new org.netbeans.lib.awtextra.AbsoluteConstraints(541, 138, 92, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void aceptarBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aceptarBActionPerformed
        PersonalMedicoDAO personalDAO = new PersonalMedicoDAO();
        PersonalMedico personal = new PersonalMedico();
        personal.setNombre1(personalNombreTF.getText());
        personal.setNombre2(personalNombreTF1.getText());
        personal.setApellido1(personalApellidoTF.getText());
        personal.setApellido2(personalApellidoTF1.getText());
        personal.setId(Integer.parseInt(personalIdTF.getText()));
        personal.setCelular(personalCelularTF.getText());
        personal.setEmail(personalEmailTF.getText());
        personal.setTipo_sangre(tipoSangreCB.getSelectedItem().toString());
        personal.setCargo(personalCargoCB.getSelectedItem().toString());
        personal.setReTHUS(personalReThusTF.getText());
        personal.setNomUsuario(personalUsuarioTF.getText());
        personal.setPasswordAux(personalContrasenniaTF.getText());

        ValidarRegistroPersonalMedico validar = new ValidarRegistroPersonalMedico();
        System.out.println("-------");
        String resultado = validar.VerificarRegistroPersonalMedico(personal);
        System.out.println(resultado);
        if (resultado == "Datos ingresados correctamente") {
            personalDAO.crear(personal);
        }
    }//GEN-LAST:event_aceptarBActionPerformed

    private void personalReThusTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_personalReThusTFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_personalReThusTFActionPerformed

    private void personalNombreTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_personalNombreTFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_personalNombreTFActionPerformed

    private void personalNombreTF1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_personalNombreTF1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_personalNombreTF1ActionPerformed

    private void cancelarBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelarBActionPerformed
        personalApellidoTF.setText("");
        personalApellidoTF1.setText("");
        personalContrasenniaTF.setText("");
        personalDireccionlTF.setText("");
        personalEmailTF.setText("");
        personalIdTF.setText("");
        personalNombreTF.setText("");
        personalNombreTF1.setText("");
        personalReThusTF.setText("");
        personalUsuarioTF.setText("");
        personalCelularTF.setText("");

        // TODO add your handling code here:
    }//GEN-LAST:event_cancelarBActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton aceptarB;
    private javax.swing.JButton cancelarB;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField personalApellidoTF;
    private javax.swing.JTextField personalApellidoTF1;
    private javax.swing.JComboBox<String> personalCargoCB;
    private javax.swing.JTextField personalCelularTF;
    private javax.swing.JTextField personalContrasenniaTF;
    private javax.swing.JTextField personalDireccionlTF;
    private javax.swing.JTextField personalEmailTF;
    private javax.swing.JTextField personalIdTF;
    private javax.swing.JTextField personalNombreTF;
    private javax.swing.JTextField personalNombreTF1;
    private javax.swing.JTextField personalReThusTF;
    private javax.swing.JTextField personalUsuarioTF;
    private javax.swing.JComboBox<String> tipoSangreCB;
    // End of variables declaration//GEN-END:variables
}
