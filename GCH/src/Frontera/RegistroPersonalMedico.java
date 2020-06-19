/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Frontera;

import Control.ValidarRegistroPersonalMedico;
import DAO.PersonalMedicoDAO;
import Entidad.PersonalMedico;
import javax.swing.JOptionPane;

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
        personalUsuarioTF = new javax.swing.JTextField();
        aceptarB = new javax.swing.JButton();
        cancelarB = new javax.swing.JButton();
        personalCargoCB = new javax.swing.JComboBox<>();
        personalReThusTF = new javax.swing.JTextField();
        personalNombreTF = new javax.swing.JTextField();
        personalApellidoTF = new javax.swing.JTextField();
        personalIdTF = new javax.swing.JTextField();
        personalCelularTF = new javax.swing.JTextField();
        personalDireccionlTF = new javax.swing.JTextField();
        personalNombreTF1 = new javax.swing.JTextField();
        personalApellidoTF1 = new javax.swing.JTextField();
        tipoSangreCB = new javax.swing.JComboBox<>();
        mensajeUsuario = new javax.swing.JLabel();
        mensajeUsuario1 = new javax.swing.JLabel();
        mensajeUsuario2 = new javax.swing.JLabel();
        mensajeUsuario3 = new javax.swing.JLabel();
        mensajeUsuario4 = new javax.swing.JLabel();
        mensajeUsuario6 = new javax.swing.JLabel();
        mensajeUsuario7 = new javax.swing.JLabel();
        mensajeUsuario8 = new javax.swing.JLabel();
        mensajeUsuario9 = new javax.swing.JLabel();
        mensajeUsuario10 = new javax.swing.JLabel();
        mensajeUsuario11 = new javax.swing.JLabel();
        mensajeUsuario12 = new javax.swing.JLabel();
        mensajeUsuario5 = new javax.swing.JLabel();
        mensajeUsuario13 = new javax.swing.JLabel();
        personalContrasenniaTF = new javax.swing.JPasswordField();
        personalContrasenniaTF1 = new javax.swing.JPasswordField();
        jLabel14 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(204, 204, 204));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        personalEmailTF.setFont(new java.awt.Font("Century Gothic", 0, 23)); // NOI18N
        personalEmailTF.setForeground(new java.awt.Color(16, 65, 56));
        personalEmailTF.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        personalEmailTF.setBorder(null);
        add(personalEmailTF, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 200, 230, 30));

        personalUsuarioTF.setFont(new java.awt.Font("Century Gothic", 0, 36)); // NOI18N
        personalUsuarioTF.setForeground(new java.awt.Color(16, 65, 56));
        personalUsuarioTF.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        personalUsuarioTF.setBorder(null);
        add(personalUsuarioTF, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 255, 220, 30));

        aceptarB.setBackground(new java.awt.Color(204, 204, 204));
        aceptarB.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/Aceptar.png"))); // NOI18N
        aceptarB.setBorder(null);
        aceptarB.setBorderPainted(false);
        aceptarB.setContentAreaFilled(false);
        aceptarB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aceptarBActionPerformed(evt);
            }
        });
        add(aceptarB, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 430, 90, -1));

        cancelarB.setBackground(new java.awt.Color(204, 204, 204));
        cancelarB.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/Cancelar.png"))); // NOI18N
        cancelarB.setToolTipText("");
        cancelarB.setBorder(null);
        cancelarB.setContentAreaFilled(false);
        cancelarB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelarBActionPerformed(evt);
            }
        });
        add(cancelarB, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 430, 90, -1));

        personalCargoCB.setBackground(new java.awt.Color(204, 204, 204));
        personalCargoCB.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        personalCargoCB.setForeground(new java.awt.Color(16, 65, 56));
        personalCargoCB.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " ", "Asistente enfermería", "Asistente médico profesional", "Médico especialista", "Médico general", "Profesional en enfermería" }));
        personalCargoCB.setBorder(null);
        personalCargoCB.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        personalCargoCB.setDoubleBuffered(true);
        personalCargoCB.setOpaque(false);
        personalCargoCB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                personalCargoCBActionPerformed(evt);
            }
        });
        add(personalCargoCB, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 360, 180, 30));

        personalReThusTF.setBackground(new java.awt.Color(63, 191, 168));
        personalReThusTF.setFont(new java.awt.Font("Century Gothic", 0, 23)); // NOI18N
        personalReThusTF.setForeground(new java.awt.Color(255, 255, 255));
        personalReThusTF.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        personalReThusTF.setBorder(null);
        personalReThusTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                personalReThusTFActionPerformed(evt);
            }
        });
        add(personalReThusTF, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 415, 240, 30));

        personalNombreTF.setBackground(new java.awt.Color(63, 191, 168));
        personalNombreTF.setFont(new java.awt.Font("Century Gothic", 0, 23)); // NOI18N
        personalNombreTF.setForeground(new java.awt.Color(255, 255, 255));
        personalNombreTF.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        personalNombreTF.setBorder(null);
        personalNombreTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                personalNombreTFActionPerformed(evt);
            }
        });
        add(personalNombreTF, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 90, 240, 30));

        personalApellidoTF.setBackground(new java.awt.Color(63, 191, 168));
        personalApellidoTF.setFont(new java.awt.Font("Century Gothic", 0, 23)); // NOI18N
        personalApellidoTF.setForeground(new java.awt.Color(255, 255, 255));
        personalApellidoTF.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        personalApellidoTF.setBorder(null);
        add(personalApellidoTF, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 195, 240, 30));

        personalIdTF.setBackground(new java.awt.Color(63, 191, 168));
        personalIdTF.setFont(new java.awt.Font("Century Gothic", 0, 23)); // NOI18N
        personalIdTF.setForeground(new java.awt.Color(255, 255, 255));
        personalIdTF.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        personalIdTF.setBorder(null);
        add(personalIdTF, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 300, 240, 30));

        personalCelularTF.setFont(new java.awt.Font("Century Gothic", 0, 23)); // NOI18N
        personalCelularTF.setForeground(new java.awt.Color(16, 65, 56));
        personalCelularTF.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        personalCelularTF.setBorder(null);
        add(personalCelularTF, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 150, 220, 30));

        personalDireccionlTF.setFont(new java.awt.Font("Century Gothic", 0, 23)); // NOI18N
        personalDireccionlTF.setForeground(new java.awt.Color(16, 65, 56));
        personalDireccionlTF.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        personalDireccionlTF.setBorder(null);
        add(personalDireccionlTF, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 80, 220, 30));

        personalNombreTF1.setBackground(new java.awt.Color(63, 191, 168));
        personalNombreTF1.setFont(new java.awt.Font("Century Gothic", 0, 23)); // NOI18N
        personalNombreTF1.setForeground(new java.awt.Color(255, 255, 255));
        personalNombreTF1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        personalNombreTF1.setBorder(null);
        personalNombreTF1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                personalNombreTF1ActionPerformed(evt);
            }
        });
        add(personalNombreTF1, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 140, 240, 30));

        personalApellidoTF1.setBackground(new java.awt.Color(63, 191, 168));
        personalApellidoTF1.setFont(new java.awt.Font("Century Gothic", 0, 23)); // NOI18N
        personalApellidoTF1.setForeground(new java.awt.Color(255, 255, 255));
        personalApellidoTF1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        personalApellidoTF1.setBorder(null);
        personalApellidoTF1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                personalApellidoTF1ActionPerformed(evt);
            }
        });
        add(personalApellidoTF1, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 250, 240, 30));

        tipoSangreCB.setBackground(new java.awt.Color(204, 204, 204));
        tipoSangreCB.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        tipoSangreCB.setForeground(new java.awt.Color(16, 65, 56));
        tipoSangreCB.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " ", "O +", "O -", "A -", "A +", "B -", "B +", "AB -", "AB +" }));
        tipoSangreCB.setBorder(null);
        tipoSangreCB.setDoubleBuffered(true);
        tipoSangreCB.setOpaque(false);
        add(tipoSangreCB, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 360, 70, 30));

        mensajeUsuario.setFont(new java.awt.Font("DejaVu Sans", 0, 8)); // NOI18N
        mensajeUsuario.setForeground(new java.awt.Color(255, 0, 0));
        add(mensajeUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 130, -1, -1));

        mensajeUsuario1.setFont(new java.awt.Font("DejaVu Sans", 0, 8)); // NOI18N
        mensajeUsuario1.setForeground(new java.awt.Color(255, 0, 0));
        add(mensajeUsuario1, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 185, -1, -1));

        mensajeUsuario2.setFont(new java.awt.Font("DejaVu Sans", 0, 8)); // NOI18N
        mensajeUsuario2.setForeground(new java.awt.Color(255, 0, 0));
        add(mensajeUsuario2, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 240, -1, -1));

        mensajeUsuario3.setFont(new java.awt.Font("DejaVu Sans", 0, 8)); // NOI18N
        mensajeUsuario3.setForeground(new java.awt.Color(255, 0, 0));
        add(mensajeUsuario3, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 290, -1, -1));

        mensajeUsuario4.setFont(new java.awt.Font("DejaVu Sans", 0, 8)); // NOI18N
        mensajeUsuario4.setForeground(new java.awt.Color(255, 0, 0));
        add(mensajeUsuario4, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 345, -1, -1));

        mensajeUsuario6.setFont(new java.awt.Font("DejaVu Sans", 0, 8)); // NOI18N
        mensajeUsuario6.setForeground(new java.awt.Color(255, 0, 0));
        add(mensajeUsuario6, new org.netbeans.lib.awtextra.AbsoluteConstraints(1100, 295, -1, -1));

        mensajeUsuario7.setFont(new java.awt.Font("DejaVu Sans", 0, 8)); // NOI18N
        mensajeUsuario7.setForeground(new java.awt.Color(255, 0, 0));
        add(mensajeUsuario7, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 395, -1, -1));

        mensajeUsuario8.setFont(new java.awt.Font("DejaVu Sans", 0, 8)); // NOI18N
        mensajeUsuario8.setForeground(new java.awt.Color(255, 0, 0));
        add(mensajeUsuario8, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 120, -1, -1));

        mensajeUsuario9.setFont(new java.awt.Font("DejaVu Sans", 0, 8)); // NOI18N
        mensajeUsuario9.setForeground(new java.awt.Color(255, 0, 0));
        add(mensajeUsuario9, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 460, -1, -1));

        mensajeUsuario10.setFont(new java.awt.Font("DejaVu Sans", 0, 10)); // NOI18N
        mensajeUsuario10.setForeground(new java.awt.Color(255, 0, 0));
        add(mensajeUsuario10, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 190, -1, -1));

        mensajeUsuario11.setFont(new java.awt.Font("DejaVu Sans", 0, 10)); // NOI18N
        mensajeUsuario11.setForeground(new java.awt.Color(255, 0, 0));
        add(mensajeUsuario11, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 240, -1, -1));

        mensajeUsuario12.setFont(new java.awt.Font("DejaVu Sans", 0, 10)); // NOI18N
        mensajeUsuario12.setForeground(new java.awt.Color(255, 0, 0));
        add(mensajeUsuario12, new org.netbeans.lib.awtextra.AbsoluteConstraints(695, 350, -1, -1));

        mensajeUsuario5.setFont(new java.awt.Font("DejaVu Sans", 0, 10)); // NOI18N
        mensajeUsuario5.setForeground(new java.awt.Color(255, 0, 0));
        add(mensajeUsuario5, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 395, -1, -1));

        mensajeUsuario13.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        mensajeUsuario13.setForeground(new java.awt.Color(255, 102, 102));
        add(mensajeUsuario13, new org.netbeans.lib.awtextra.AbsoluteConstraints(755, 400, -1, -1));

        personalContrasenniaTF.setFont(new java.awt.Font("Century Gothic", 0, 23)); // NOI18N
        personalContrasenniaTF.setForeground(new java.awt.Color(16, 65, 56));
        personalContrasenniaTF.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        personalContrasenniaTF.setBorder(null);
        add(personalContrasenniaTF, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 360, 240, 30));

        personalContrasenniaTF1.setFont(new java.awt.Font("Century Gothic", 0, 23)); // NOI18N
        personalContrasenniaTF1.setForeground(new java.awt.Color(16, 65, 56));
        personalContrasenniaTF1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        personalContrasenniaTF1.setBorder(null);
        add(personalContrasenniaTF1, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 305, 230, 30));

        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/Registro_Personal_Medico.jpg"))); // NOI18N
        add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));
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
        personal.setPasswordAux(String.valueOf(personalContrasenniaTF.getPassword()));

        ValidarRegistroPersonalMedico validar = new ValidarRegistroPersonalMedico();
        System.out.println("-------");
        String resultado = validar.VerificarRegistroPersonalMedico(personal);
        System.out.println(resultado);
        
        if (!validar.VerificarLongitudNombre1personalMedico(personalNombreTF.getText())) {
            mensajeUsuario.setText("Longitud primer nombre incorrecta");
        } else {
            mensajeUsuario.setText("");
        }
          if (!validar.VerificarLongitudNombre2personalMedico(personalNombreTF1.getText())) {
            mensajeUsuario1.setText("Longitud segundo nombre incorrecta");
        } else {
            mensajeUsuario1.setText("");
        }
            if (!validar.VerificarLongitudApellido1personalMedico(personalApellidoTF.getText())) {
            mensajeUsuario2.setText("Longitud primer apellido incorrecta");
        } else {
            mensajeUsuario2.setText("");
        }
            if (!validar.VerificarLongitudApellido2personalMedico(personalApellidoTF1.getText())) {
            mensajeUsuario3.setText("Longitud segundo apellido incorrecta");
        } else {
            mensajeUsuario3.setText("");
        }    
            if (!validar.VerificarLongitudNIpersonalMedico(personalIdTF.getText())) {
            mensajeUsuario4.setText("Logitud de identificación incorrecta");
        } else {
            mensajeUsuario4.setText("");
        }    
         if (!validar.VerificarLongitudCelularpersonalMedico(personalCelularTF.getText())) {
            mensajeUsuario6.setText("Longitud Celular incorrecta");
        } else {
            mensajeUsuario6.setText("");
        }  
            if (" ".equals(tipoSangreCB.getSelectedItem().toString())) {
            mensajeUsuario5.setText("No se ha seleccionado un tipo de sangre");
        } else {
            mensajeUsuario5.setText("");
        } 
             if (!validar.VerificarLongitudCelularpersonalMedico(personalCelularTF.getText())) {
            mensajeUsuario8.setText("Longitud dirección incorrecta");
        } else {
            mensajeUsuario8.setText("");
        } 
            
           if (" ".equals(personalCargoCB.getSelectedItem().toString())) {
            mensajeUsuario7.setText("No se ha seleccionado un cargo");
        } else {
            mensajeUsuario7.setText("");
        } 
                if (!validar.VerificarLongitudDireccionpersonalMedico(personalDireccionlTF.getText())) {
            mensajeUsuario10.setText("Formato de correo incorrecto");
        } else {
            mensajeUsuario10.setText("");
        } 
                    if (!validar.VerificarLongitudReTHUSpersonalMedico(personalReThusTF.getText())) {
            mensajeUsuario9.setText("Longitud ReTHUS incorrecta");
        } else {
            mensajeUsuario9.setText("");
        } 
                if (!validar.VerificarLongitudUsuariopersonalMedico(personalUsuarioTF.getText())) {
            mensajeUsuario11.setText("Longitud usuario incorrecta");
        } else {
            mensajeUsuario11.setText("");
        } 
                     if (!validar.VerificarLongitudContraseniapersonalMedico(String.valueOf(personalContrasenniaTF.getPassword()))) {
            mensajeUsuario12.setText("Longitud contraseña incorrecta");
        } else {
            mensajeUsuario12.setText("");
        }  
          if (!validar.VerificarSimilitudContrasenia(String.valueOf(personalContrasenniaTF.getPassword()),String.valueOf(personalContrasenniaTF1.getPassword()))) {
            mensajeUsuario10.setText("La contraseña no coincide");
        } else {
            mensajeUsuario10.setText("");
        }
        if (resultado == "Datos ingresados correctamente") {
            personalDAO.crear(personal);
            JOptionPane.showMessageDialog(null,personalCargoCB.getSelectedItem().toString() +" Registrado", "", JOptionPane.INFORMATION_MESSAGE);
            borrar();
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
        borrar();

        // TODO add your handling code here:
    }//GEN-LAST:event_cancelarBActionPerformed

    private void personalCargoCBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_personalCargoCBActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_personalCargoCBActionPerformed

    private void personalApellidoTF1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_personalApellidoTF1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_personalApellidoTF1ActionPerformed
    public void borrar(){
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
        tipoSangreCB.setSelectedItem(" ");
        personalCargoCB.setSelectedItem(" ");
        mensajeUsuario.setText("");
        mensajeUsuario1.setText("");
        mensajeUsuario2.setText("");
        mensajeUsuario3.setText("");
        mensajeUsuario4.setText("");
        mensajeUsuario5.setText("");
        mensajeUsuario6.setText("");
        mensajeUsuario7.setText("");
        mensajeUsuario8.setText("");
        mensajeUsuario9.setText("");
        mensajeUsuario10.setText("");
        mensajeUsuario11.setText("");
        mensajeUsuario12.setText("");
        mensajeUsuario13.setText("");
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton aceptarB;
    private javax.swing.JButton cancelarB;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel mensajeUsuario;
    private javax.swing.JLabel mensajeUsuario1;
    private javax.swing.JLabel mensajeUsuario10;
    private javax.swing.JLabel mensajeUsuario11;
    private javax.swing.JLabel mensajeUsuario12;
    private javax.swing.JLabel mensajeUsuario13;
    private javax.swing.JLabel mensajeUsuario2;
    private javax.swing.JLabel mensajeUsuario3;
    private javax.swing.JLabel mensajeUsuario4;
    private javax.swing.JLabel mensajeUsuario5;
    private javax.swing.JLabel mensajeUsuario6;
    private javax.swing.JLabel mensajeUsuario7;
    private javax.swing.JLabel mensajeUsuario8;
    private javax.swing.JLabel mensajeUsuario9;
    private javax.swing.JTextField personalApellidoTF;
    private javax.swing.JTextField personalApellidoTF1;
    private javax.swing.JComboBox<String> personalCargoCB;
    private javax.swing.JTextField personalCelularTF;
    private javax.swing.JPasswordField personalContrasenniaTF;
    private javax.swing.JPasswordField personalContrasenniaTF1;
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
