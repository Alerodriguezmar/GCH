/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Frontera;

import Control.ValidarRegistroAdministrador;
import DAO.AdminDAO;
import Entidad.Administrador;
import java.util.HashSet;
import java.util.Set;
import javax.swing.JOptionPane;

/**
 *
 * @author tech
 */
public class RegistroAdmin extends javax.swing.JFrame {

    /**
     * Creates new form RegistroAdmin1
     */
    public RegistroAdmin() {
        initComponents();
        setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        mensajeUsuario = new javax.swing.JLabel();
        mensajeUsuario1 = new javax.swing.JLabel();
        mensajeUsuario2 = new javax.swing.JLabel();
        mensajeUsuario3 = new javax.swing.JLabel();
        mensajeUsuario5 = new javax.swing.JLabel();
        mensajeUsuario6 = new javax.swing.JLabel();
        mensajeUsuario7 = new javax.swing.JLabel();
        mensajeUsuario8 = new javax.swing.JLabel();
        mensajeUsuario9 = new javax.swing.JLabel();
        mensajeUsuario10 = new javax.swing.JLabel();
        adminNombre1TF = new javax.swing.JTextField();
        adminApellido1TF = new javax.swing.JTextField();
        adminIdTF = new javax.swing.JTextField();
        adminCelularTF = new javax.swing.JTextField();
        aceptarB = new javax.swing.JButton();
        adminEmailTF = new javax.swing.JTextField();
        cancelarB = new javax.swing.JButton();
        adminUsuarioTF = new javax.swing.JTextField();
        adminNombre2TF = new javax.swing.JTextField();
        adminApellido2TF = new javax.swing.JTextField();
        ingresarAdminB = new javax.swing.JButton();
        ingresarPersonalB = new javax.swing.JButton();
        adminContrasenniaTF = new javax.swing.JPasswordField();
        adminContrasenniaTF1 = new javax.swing.JPasswordField();
        Fondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        mensajeUsuario.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        mensajeUsuario.setForeground(new java.awt.Color(255, 102, 102));
        jPanel1.add(mensajeUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 455, -1, -1));

        mensajeUsuario1.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        mensajeUsuario1.setForeground(new java.awt.Color(255, 102, 102));
        jPanel1.add(mensajeUsuario1, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 290, -1, -1));

        mensajeUsuario2.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        mensajeUsuario2.setForeground(new java.awt.Color(255, 102, 102));
        jPanel1.add(mensajeUsuario2, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 375, -1, -1));

        mensajeUsuario3.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        mensajeUsuario3.setForeground(new java.awt.Color(255, 102, 102));
        jPanel1.add(mensajeUsuario3, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 630, -1, -1));

        mensajeUsuario5.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        mensajeUsuario5.setForeground(new java.awt.Color(255, 102, 102));
        jPanel1.add(mensajeUsuario5, new org.netbeans.lib.awtextra.AbsoluteConstraints(1100, 295, -1, -1));

        mensajeUsuario6.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        mensajeUsuario6.setForeground(new java.awt.Color(255, 102, 102));
        jPanel1.add(mensajeUsuario6, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 545, -1, -1));

        mensajeUsuario7.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        mensajeUsuario7.setForeground(new java.awt.Color(255, 102, 102));
        jPanel1.add(mensajeUsuario7, new org.netbeans.lib.awtextra.AbsoluteConstraints(1100, 380, -1, -1));

        mensajeUsuario8.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        mensajeUsuario8.setForeground(new java.awt.Color(255, 102, 102));
        jPanel1.add(mensajeUsuario8, new org.netbeans.lib.awtextra.AbsoluteConstraints(1100, 465, -1, -1));

        mensajeUsuario9.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        mensajeUsuario9.setForeground(new java.awt.Color(255, 102, 102));
        jPanel1.add(mensajeUsuario9, new org.netbeans.lib.awtextra.AbsoluteConstraints(1100, 545, -1, -1));

        mensajeUsuario10.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        mensajeUsuario10.setForeground(new java.awt.Color(255, 102, 102));
        jPanel1.add(mensajeUsuario10, new org.netbeans.lib.awtextra.AbsoluteConstraints(1190, 630, -1, -1));

        adminNombre1TF.setBackground(new java.awt.Color(63, 191, 168));
        adminNombre1TF.setFont(new java.awt.Font("Century Gothic", 0, 36)); // NOI18N
        adminNombre1TF.setForeground(new java.awt.Color(255, 255, 255));
        adminNombre1TF.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        adminNombre1TF.setBorder(null);
        adminNombre1TF.setSelectedTextColor(new java.awt.Color(16, 65, 56));
        adminNombre1TF.setSelectionColor(new java.awt.Color(255, 255, 255));
        adminNombre1TF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                adminNombre1TFActionPerformed(evt);
            }
        });
        jPanel1.add(adminNombre1TF, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 230, 370, 60));

        adminApellido1TF.setBackground(new java.awt.Color(63, 191, 168));
        adminApellido1TF.setFont(new java.awt.Font("Century Gothic", 0, 36)); // NOI18N
        adminApellido1TF.setForeground(new java.awt.Color(255, 255, 255));
        adminApellido1TF.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        adminApellido1TF.setBorder(null);
        adminApellido1TF.setSelectedTextColor(new java.awt.Color(16, 65, 56));
        adminApellido1TF.setSelectionColor(new java.awt.Color(255, 255, 255));
        jPanel1.add(adminApellido1TF, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 410, 370, 50));

        adminIdTF.setBackground(new java.awt.Color(63, 191, 168));
        adminIdTF.setFont(new java.awt.Font("Century Gothic", 0, 36)); // NOI18N
        adminIdTF.setForeground(new java.awt.Color(255, 255, 255));
        adminIdTF.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        adminIdTF.setBorder(null);
        adminIdTF.setSelectedTextColor(new java.awt.Color(16, 65, 56));
        adminIdTF.setSelectionColor(new java.awt.Color(255, 255, 255));
        jPanel1.add(adminIdTF, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 570, 370, 50));

        adminCelularTF.setFont(new java.awt.Font("Century Gothic", 0, 36)); // NOI18N
        adminCelularTF.setForeground(new java.awt.Color(16, 65, 56));
        adminCelularTF.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        adminCelularTF.setBorder(null);
        adminCelularTF.setSelectedTextColor(new java.awt.Color(63, 191, 168));
        adminCelularTF.setSelectionColor(new java.awt.Color(16, 65, 56));
        jPanel1.add(adminCelularTF, new org.netbeans.lib.awtextra.AbsoluteConstraints(1100, 235, 370, 50));

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
        jPanel1.add(aceptarB, new org.netbeans.lib.awtextra.AbsoluteConstraints(1070, 690, 190, 70));

        adminEmailTF.setFont(new java.awt.Font("Century Gothic", 0, 36)); // NOI18N
        adminEmailTF.setForeground(new java.awt.Color(16, 65, 56));
        adminEmailTF.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        adminEmailTF.setBorder(null);
        adminEmailTF.setSelectedTextColor(new java.awt.Color(63, 191, 168));
        adminEmailTF.setSelectionColor(new java.awt.Color(16, 65, 56));
        jPanel1.add(adminEmailTF, new org.netbeans.lib.awtextra.AbsoluteConstraints(1100, 320, 370, 50));

        cancelarB.setBackground(new java.awt.Color(204, 204, 204));
        cancelarB.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/Cancelar.png"))); // NOI18N
        cancelarB.setBorder(null);
        cancelarB.setBorderPainted(false);
        cancelarB.setContentAreaFilled(false);
        cancelarB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelarBActionPerformed(evt);
            }
        });
        jPanel1.add(cancelarB, new org.netbeans.lib.awtextra.AbsoluteConstraints(1320, 690, 190, 70));

        adminUsuarioTF.setFont(new java.awt.Font("Century Gothic", 0, 36)); // NOI18N
        adminUsuarioTF.setForeground(new java.awt.Color(16, 65, 56));
        adminUsuarioTF.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        adminUsuarioTF.setBorder(null);
        adminUsuarioTF.setSelectedTextColor(new java.awt.Color(63, 191, 168));
        adminUsuarioTF.setSelectionColor(new java.awt.Color(16, 65, 56));
        jPanel1.add(adminUsuarioTF, new org.netbeans.lib.awtextra.AbsoluteConstraints(1100, 405, 370, 50));

        adminNombre2TF.setBackground(new java.awt.Color(63, 191, 168));
        adminNombre2TF.setFont(new java.awt.Font("Century Gothic", 0, 36)); // NOI18N
        adminNombre2TF.setForeground(new java.awt.Color(255, 255, 255));
        adminNombre2TF.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        adminNombre2TF.setBorder(null);
        adminNombre2TF.setPreferredSize(new java.awt.Dimension(6, 19));
        adminNombre2TF.setSelectedTextColor(new java.awt.Color(16, 65, 56));
        adminNombre2TF.setSelectionColor(new java.awt.Color(255, 255, 255));
        jPanel1.add(adminNombre2TF, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 325, 370, 50));

        adminApellido2TF.setBackground(new java.awt.Color(63, 191, 168));
        adminApellido2TF.setFont(new java.awt.Font("Century Gothic", 0, 36)); // NOI18N
        adminApellido2TF.setForeground(new java.awt.Color(255, 255, 255));
        adminApellido2TF.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        adminApellido2TF.setBorder(null);
        adminApellido2TF.setSelectedTextColor(new java.awt.Color(16, 65, 56));
        adminApellido2TF.setSelectionColor(new java.awt.Color(255, 255, 255));
        jPanel1.add(adminApellido2TF, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 490, 360, 50));

        ingresarAdminB.setBackground(new java.awt.Color(204, 204, 204));
        ingresarAdminB.setFont(new java.awt.Font("Century Gothic", 0, 24)); // NOI18N
        ingresarAdminB.setForeground(new java.awt.Color(255, 255, 255));
        ingresarAdminB.setText("Iniciar sesión administrador");
        ingresarAdminB.setBorder(null);
        ingresarAdminB.setContentAreaFilled(false);
        ingresarAdminB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ingresarAdminBActionPerformed(evt);
            }
        });
        jPanel1.add(ingresarAdminB, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 50, 330, -1));

        ingresarPersonalB.setBackground(new java.awt.Color(204, 204, 204));
        ingresarPersonalB.setFont(new java.awt.Font("Century Gothic", 0, 24)); // NOI18N
        ingresarPersonalB.setForeground(new java.awt.Color(255, 255, 255));
        ingresarPersonalB.setText("Iniciar sesión personal médico");
        ingresarPersonalB.setBorder(null);
        ingresarPersonalB.setContentAreaFilled(false);
        ingresarPersonalB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ingresarPersonalBActionPerformed(evt);
            }
        });
        jPanel1.add(ingresarPersonalB, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 50, 370, 30));

        adminContrasenniaTF.setEchoChar('\u25CF');
        adminContrasenniaTF.setFont(new java.awt.Font("Century Gothic", 0, 36)); // NOI18N
        adminContrasenniaTF.setForeground(new java.awt.Color(16, 65, 56));
        adminContrasenniaTF.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        adminContrasenniaTF.setBorder(null);
        adminContrasenniaTF.setSelectedTextColor(new java.awt.Color(63, 191, 168));
        adminContrasenniaTF.setSelectionColor(new java.awt.Color(16, 65, 56));
        jPanel1.add(adminContrasenniaTF, new org.netbeans.lib.awtextra.AbsoluteConstraints(1100, 485, 370, 50));

        adminContrasenniaTF1.setEchoChar('\u25CF');
        adminContrasenniaTF1.setFont(new java.awt.Font("Century Gothic", 0, 36)); // NOI18N
        adminContrasenniaTF1.setForeground(new java.awt.Color(16, 65, 56));
        adminContrasenniaTF1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        adminContrasenniaTF1.setBorder(null);
        adminContrasenniaTF1.setSelectedTextColor(new java.awt.Color(63, 191, 168));
        adminContrasenniaTF1.setSelectionColor(new java.awt.Color(16, 65, 56));
        jPanel1.add(adminContrasenniaTF1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1190, 570, 370, 50));

        Fondo.setFont(new java.awt.Font("Century Gothic", 0, 36)); // NOI18N
        Fondo.setForeground(new java.awt.Color(255, 255, 255));
        Fondo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/Registro_Admin.jpg"))); // NOI18N
        jPanel1.add(Fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 800));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1582, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 800, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ingresarPersonalBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ingresarPersonalBActionPerformed
        new Login().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_ingresarPersonalBActionPerformed

    private void ingresarAdminBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ingresarAdminBActionPerformed
        new LoginAdmin().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_ingresarAdminBActionPerformed

    private void cancelarBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelarBActionPerformed
        new Login().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_cancelarBActionPerformed

    private void aceptarBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aceptarBActionPerformed
        Administrador admin = new Administrador();
        AdminDAO dao = new AdminDAO();
        admin.setNombre1(adminNombre1TF.getText());
        admin.setNombre2(adminNombre2TF.getText());
        admin.setApellido1(adminApellido1TF.getText());
        admin.setApellido2(adminApellido2TF.getText());
        admin.setNidentificacion(adminIdTF.getText());
        admin.setCelular(adminCelularTF.getText());
        admin.setEmail(adminEmailTF.getText());
        admin.setUsuario(adminUsuarioTF.getText());
        admin.setContrasenia(String.valueOf(adminContrasenniaTF.getPassword()));

        ValidarRegistroAdministrador validar = new ValidarRegistroAdministrador();
        System.out.println("-------");
        String resultado = validar.VerificarRegistroAdministrador(admin);

        if (!validar.VerificarLongitudNombre1Admin(adminNombre1TF.getText())) {
            mensajeUsuario1.setText("Longitud primer nombre incorrecta");
        } else {
            mensajeUsuario1.setText("");
        }
        if (!validar.VerificarLongitudNombre2Admin(adminNombre2TF.getText())) {
            mensajeUsuario2.setText("Longitud segundo nombre incorrecta");
        } else {
            mensajeUsuario2.setText("");
        }
        if (!validar.VerificarLongitudApellido1Admin(adminApellido1TF.getText())) {
            mensajeUsuario.setText("Longitud primer apellido incorrecta");
        } else {
            mensajeUsuario.setText("");
        }
        if (!validar.VerificarLongitudApellido2Admin(adminApellido2TF.getText())) {
            mensajeUsuario6.setText("Longitud segundo apellido incorrecta");
        } else {
            mensajeUsuario6.setText("");
        }
        if (!validar.VerificarLongitudEmailAdmin(adminEmailTF.getText())) {
            mensajeUsuario7.setText("Formato de correo incorrecto");
        } else {
            mensajeUsuario7.setText("");
        }
        if (!validar.VerificarLongitudNIAdmin(adminIdTF.getText())) {
            mensajeUsuario3.setText("Formato de correo incorrecto");
        } else {
            mensajeUsuario3.setText("");
        }
        if (!validar.VerificarLongitudCelularAdmin(adminCelularTF.getText())) {
            mensajeUsuario5.setText("Longitud celular incorrecta");
        } else {
            mensajeUsuario5.setText("");
        }
        if (!validar.VerificarLongitudUsuarioAdmin(adminUsuarioTF.getText())) {
            mensajeUsuario8.setText("Longitud usuario incorrecta");
        } else {
            mensajeUsuario8.setText("");
        }
        if (!validar.VerificarLongitudContraseniaAdmin(String.valueOf(adminContrasenniaTF.getPassword()))) {
            mensajeUsuario9.setText("Longitud contraseña incorrecta o\n" + " incluye caracteres especiales");
        } else {
            mensajeUsuario9.setText("");
        }
        if (!validar.VerificarSimilitudContrasenia(String.valueOf(adminContrasenniaTF.getPassword()),String.valueOf(adminContrasenniaTF1.getPassword()))) {
            mensajeUsuario10.setText("La contraseña no coincide");
        } else {
            mensajeUsuario10.setText("");
        }

        if ("Datos ingresados correctamente".equals(resultado)) {
            dao.crear(admin);
            JOptionPane.showMessageDialog(null, "Adminitrador Registrado", "", JOptionPane.INFORMATION_MESSAGE);
            new Login().setVisible(true);
            this.dispose();
        }
        System.out.println(resultado);
    }//GEN-LAST:event_aceptarBActionPerformed

    private void adminNombre1TFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_adminNombre1TFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_adminNombre1TFActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(RegistroAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RegistroAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RegistroAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RegistroAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RegistroAdmin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Fondo;
    private javax.swing.JButton aceptarB;
    private javax.swing.JTextField adminApellido1TF;
    private javax.swing.JTextField adminApellido2TF;
    private javax.swing.JTextField adminCelularTF;
    private javax.swing.JPasswordField adminContrasenniaTF;
    private javax.swing.JPasswordField adminContrasenniaTF1;
    private javax.swing.JTextField adminEmailTF;
    private javax.swing.JTextField adminIdTF;
    private javax.swing.JTextField adminNombre1TF;
    private javax.swing.JTextField adminNombre2TF;
    private javax.swing.JTextField adminUsuarioTF;
    private javax.swing.JButton cancelarB;
    private javax.swing.JButton ingresarAdminB;
    private javax.swing.JButton ingresarPersonalB;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel mensajeUsuario;
    private javax.swing.JLabel mensajeUsuario1;
    private javax.swing.JLabel mensajeUsuario10;
    private javax.swing.JLabel mensajeUsuario2;
    private javax.swing.JLabel mensajeUsuario3;
    private javax.swing.JLabel mensajeUsuario5;
    private javax.swing.JLabel mensajeUsuario6;
    private javax.swing.JLabel mensajeUsuario7;
    private javax.swing.JLabel mensajeUsuario8;
    private javax.swing.JLabel mensajeUsuario9;
    // End of variables declaration//GEN-END:variables
}
