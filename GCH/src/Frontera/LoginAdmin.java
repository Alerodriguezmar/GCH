/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Frontera;

import Control.ValidarLoginAdmin;
import Entidad.Administrador;

/**
 *
 * @author DAVID
 */
public class LoginAdmin extends javax.swing.JFrame {

    /**
     * Creates new form LoginAdmin
     */
    public LoginAdmin() {
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
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        usuarioAdminTF = new javax.swing.JTextField();
        contraseniaAdminTF = new javax.swing.JTextField();
        iconLabel = new javax.swing.JLabel();
        ingresarB = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        registrarAdminB = new javax.swing.JButton();
        iniciarPersonalB = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Autenticación Administrador");

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setFocusCycleRoot(true);
        jPanel1.setPreferredSize(new java.awt.Dimension(504, 419));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Usuario administrador");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 80, -1, -1));

        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Contraseña");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 120, -1, -1));

        usuarioAdminTF.setBackground(new java.awt.Color(204, 204, 204));
        usuarioAdminTF.setForeground(new java.awt.Color(0, 0, 0));
        usuarioAdminTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usuarioAdminTFActionPerformed(evt);
            }
        });
        jPanel1.add(usuarioAdminTF, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 70, 101, -1));

        contraseniaAdminTF.setBackground(new java.awt.Color(204, 204, 204));
        contraseniaAdminTF.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.add(contraseniaAdminTF, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 110, 101, -1));

        iconLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/login.png"))); // NOI18N
        iconLabel.setText(" ");
        jPanel1.add(iconLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(264, 182, -1, -1));

        ingresarB.setBackground(new java.awt.Color(204, 204, 204));
        ingresarB.setForeground(new java.awt.Color(0, 0, 0));
        ingresarB.setText("Ingresar");
        ingresarB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ingresarBActionPerformed(evt);
            }
        });
        jPanel1.add(ingresarB, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 160, 101, -1));

        jLabel3.setText("Version 1.");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(23, 417, -1, -1));

        registrarAdminB.setBackground(new java.awt.Color(204, 204, 204));
        registrarAdminB.setForeground(new java.awt.Color(0, 0, 0));
        registrarAdminB.setText("Registrar un administrador");
        registrarAdminB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registrarAdminBActionPerformed(evt);
            }
        });
        jPanel1.add(registrarAdminB, new org.netbeans.lib.awtextra.AbsoluteConstraints(34, 359, 218, -1));

        iniciarPersonalB.setBackground(new java.awt.Color(204, 204, 204));
        iniciarPersonalB.setForeground(new java.awt.Color(0, 0, 0));
        iniciarPersonalB.setText("Iniciar sesión personal médico");
        iniciarPersonalB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                iniciarPersonalBActionPerformed(evt);
            }
        });
        jPanel1.add(iniciarPersonalB, new org.netbeans.lib.awtextra.AbsoluteConstraints(34, 320, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void usuarioAdminTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usuarioAdminTFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_usuarioAdminTFActionPerformed

    private void iniciarPersonalBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_iniciarPersonalBActionPerformed
        new Login().setVisible(true);
            this.dispose();
    }//GEN-LAST:event_iniciarPersonalBActionPerformed

    private void registrarAdminBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registrarAdminBActionPerformed
        new RegistroAdmin().setVisible(true);
            this.dispose();
    }//GEN-LAST:event_registrarAdminBActionPerformed

    private void ingresarBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ingresarBActionPerformed
        Administrador usuario = new Administrador();
        usuario.setUsuario(usuarioAdminTF.getText());
        usuario.setContrasenia(contraseniaAdminTF.getText());
         
         ValidarLoginAdmin Validar = new ValidarLoginAdmin();
         
         System.out.println("---------------------------------------------------**-");
         String resultado = Validar.verificarLogin(usuario);
         if (resultado.equals("Bienvenido")){
          new FramePrincipalAdmin().setVisible(true);
            this.dispose(); 
         }
         
         System.out.println(resultado);
    }//GEN-LAST:event_ingresarBActionPerformed

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
            java.util.logging.Logger.getLogger(LoginAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LoginAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LoginAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LoginAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LoginAdmin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField contraseniaAdminTF;
    private javax.swing.JLabel iconLabel;
    private javax.swing.JButton ingresarB;
    private javax.swing.JButton iniciarPersonalB;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton registrarAdminB;
    private javax.swing.JTextField usuarioAdminTF;
    // End of variables declaration//GEN-END:variables
}
