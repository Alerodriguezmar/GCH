
package Frontera;

import Control.ValidarLoginAdmin;
import Entidad.Administrador;
import javax.swing.JOptionPane;

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

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel3 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        mensajeUsuario1 = new javax.swing.JLabel();
        usuarioAdminTF = new javax.swing.JTextField();
        registrarAdminB = new javax.swing.JButton();
        iniciarPersonalB = new javax.swing.JButton();
        ingresarB = new javax.swing.JButton();
        mensajeUsuario = new javax.swing.JLabel();
        contraseniaAdminTF = new javax.swing.JPasswordField();
        jLabel5 = new javax.swing.JLabel();
        Fondo = new javax.swing.JLabel();

        jLabel3.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(18, 62, 54));
        jLabel3.setText("Version 2.");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Autenticación Administrador");

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setFocusCycleRoot(true);
        jPanel1.setPreferredSize(new java.awt.Dimension(504, 419));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(63, 191, 168));
        jLabel4.setText("Administrador");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 170, -1, -1));

        mensajeUsuario1.setFont(new java.awt.Font("DejaVu Sans", 0, 10)); // NOI18N
        mensajeUsuario1.setForeground(new java.awt.Color(255, 51, 51));
        jPanel1.add(mensajeUsuario1, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 140, -1, -1));

        usuarioAdminTF.setBackground(new java.awt.Color(16, 65, 56));
        usuarioAdminTF.setFont(new java.awt.Font("Century Gothic", 0, 24)); // NOI18N
        usuarioAdminTF.setForeground(new java.awt.Color(63, 191, 168));
        usuarioAdminTF.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        usuarioAdminTF.setText("Usuario");
        usuarioAdminTF.setBorder(null);
        usuarioAdminTF.setFocusCycleRoot(true);
        usuarioAdminTF.setOpaque(false);
        usuarioAdminTF.setSelectedTextColor(new java.awt.Color(16, 65, 56));
        usuarioAdminTF.setSelectionColor(new java.awt.Color(63, 191, 168));
        usuarioAdminTF.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                usuarioAdminTFFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                usuarioAdminTFFocusLost(evt);
            }
        });
        usuarioAdminTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usuarioAdminTFActionPerformed(evt);
            }
        });
        jPanel1.add(usuarioAdminTF, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 210, 170, 30));

        registrarAdminB.setBackground(new java.awt.Color(204, 204, 204));
        registrarAdminB.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        registrarAdminB.setForeground(new java.awt.Color(63, 191, 168));
        registrarAdminB.setText("Registrar un administrador");
        registrarAdminB.setContentAreaFilled(false);
        registrarAdminB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registrarAdminBActionPerformed(evt);
            }
        });
        jPanel1.add(registrarAdminB, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 420, 220, -1));

        iniciarPersonalB.setBackground(new java.awt.Color(204, 204, 204));
        iniciarPersonalB.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        iniciarPersonalB.setForeground(new java.awt.Color(63, 191, 168));
        iniciarPersonalB.setText("Iniciar sesión cómo personal médico");
        iniciarPersonalB.setBorder(null);
        iniciarPersonalB.setContentAreaFilled(false);
        iniciarPersonalB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                iniciarPersonalBActionPerformed(evt);
            }
        });
        jPanel1.add(iniciarPersonalB, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 390, -1, -1));

        ingresarB.setBackground(new java.awt.Color(18, 62, 54));
        ingresarB.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/Iniciar_sesion.png"))); // NOI18N
        ingresarB.setBorder(null);
        ingresarB.setContentAreaFilled(false);
        ingresarB.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        ingresarB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ingresarBActionPerformed(evt);
            }
        });
        jPanel1.add(ingresarB, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 350, 220, -1));

        mensajeUsuario.setFont(new java.awt.Font("DejaVu Sans", 0, 10)); // NOI18N
        mensajeUsuario.setForeground(new java.awt.Color(255, 51, 51));
        jPanel1.add(mensajeUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 97, -1, -1));

        contraseniaAdminTF.setBackground(new java.awt.Color(16, 65, 56));
        contraseniaAdminTF.setEchoChar('\u25CF');
        contraseniaAdminTF.setFont(new java.awt.Font("Century Gothic", 0, 24)); // NOI18N
        contraseniaAdminTF.setForeground(new java.awt.Color(63, 191, 168));
        contraseniaAdminTF.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        contraseniaAdminTF.setText("contraseña");
        contraseniaAdminTF.setBorder(null);
        contraseniaAdminTF.setOpaque(false);
        contraseniaAdminTF.setSelectedTextColor(new java.awt.Color(16, 65, 56));
        contraseniaAdminTF.setSelectionColor(new java.awt.Color(63, 191, 168));
        contraseniaAdminTF.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                contraseniaAdminTFFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                contraseniaAdminTFFocusLost(evt);
            }
        });
        contraseniaAdminTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                contraseniaAdminTFActionPerformed(evt);
            }
        });
        jPanel1.add(contraseniaAdminTF, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 280, 180, 40));

        jLabel5.setFont(new java.awt.Font("Century Gothic", 0, 8)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(18, 62, 54));
        jLabel5.setText("Version 2.");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 490, -1, -1));

        Fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/Login.jpg"))); // NOI18N
        jPanel1.add(Fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 333, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 500, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
   
    //instrucción cierra la ventana actual y liberas los recursos que esa ventana
    //Muestra en pantalla la ventana RegistroAdmin y Oculta la ventana LoginAdmin
    private void registrarAdminBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registrarAdminBActionPerformed
        new RegistroAdmin().setVisible(true);
            this.dispose();
    }//GEN-LAST:event_registrarAdminBActionPerformed

    
    private void usuarioAdminTFFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_usuarioAdminTFFocusGained
        if(usuarioAdminTF.getText().trim().toLowerCase().equals("usuario"))
        {
            usuarioAdminTF.setText("");
            usuarioAdminTF.setForeground(new java.awt.Color(63, 191, 168));
        }
    }//GEN-LAST:event_usuarioAdminTFFocusGained

    private void usuarioAdminTFFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_usuarioAdminTFFocusLost
        if(usuarioAdminTF.getText().trim().toLowerCase().equals("usuario")||usuarioAdminTF.getText().trim().toLowerCase().equals(""))
        {
            usuarioAdminTF.setText("Usuario");
            usuarioAdminTF.setForeground(new java.awt.Color(63, 191, 168));
        }
    }//GEN-LAST:event_usuarioAdminTFFocusLost

    private void usuarioAdminTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usuarioAdminTFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_usuarioAdminTFActionPerformed

    private void contraseniaAdminTFFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_contraseniaAdminTFFocusGained
        if(contraseniaAdminTF.getText().trim().toLowerCase().equals("contraseña"))
        {
            contraseniaAdminTF.setText("");
            contraseniaAdminTF.setForeground(new java.awt.Color(63, 191, 168));
        }
    }//GEN-LAST:event_contraseniaAdminTFFocusGained

    private void contraseniaAdminTFFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_contraseniaAdminTFFocusLost
        if(contraseniaAdminTF.getText().trim().toLowerCase().equals("contraseña")||contraseniaAdminTF.getText().trim().toLowerCase().equals(""))
        {
            contraseniaAdminTF.setText("contraseña");
            contraseniaAdminTF.setForeground(new java.awt.Color(63, 191, 168));
        }
    }//GEN-LAST:event_contraseniaAdminTFFocusLost

    private void contraseniaAdminTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_contraseniaAdminTFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_contraseniaAdminTFActionPerformed
//Metodo que verficia si se encuntra el usuario y si las credenciales son correctas.
// Utiliza la clase Validar e introduce los valores de los text en el Validar.
    private void ingresarBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ingresarBActionPerformed
        Administrador usuario = new Administrador();
        usuario.setUsuario(usuarioAdminTF.getText());
        usuario.setContrasenia(String.valueOf(contraseniaAdminTF.getPassword()));

        ValidarLoginAdmin Validar = new ValidarLoginAdmin();
        if (!Validar.VerificarLongitudNombre(usuarioAdminTF.getText())) {
            mensajeUsuario.setText("Longitud de nombre incorrecta");
        }else{
            mensajeUsuario.setText("");
        }
        if (!Validar.VerificarLongitudPassword(String.valueOf(contraseniaAdminTF.getPassword()))) {
            mensajeUsuario1.setText("Longitud de contraseña incorrecto");
        }else{
            mensajeUsuario1.setText("");
        }
        System.out.println("---------------------------------------------------**-");
        String resultado = Validar.verificarLogin(usuario);
        if (resultado.equals("Bienvenido")){
            new FramePrincipalAdmin().setVisible(true);
            this.dispose();
        }
        if (resultado.equals("Datos incorrectos")) {
            JOptionPane.showMessageDialog(null, "Datos incorrectos", "Advertencia", JOptionPane.WARNING_MESSAGE);
        }
        System.out.println(resultado);     // TODO add your handling code here:
    }//GEN-LAST:event_ingresarBActionPerformed

    //instrucción cierra la ventana actual y liberas los recursos que esa ventana
    //Muestra en pantalla la ventana Login y Oculta la ventana LoginAdmin
    private void iniciarPersonalBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_iniciarPersonalBActionPerformed
        new Login().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_iniciarPersonalBActionPerformed

   
    
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
    private javax.swing.JLabel Fondo;
    private javax.swing.JPasswordField contraseniaAdminTF;
    private javax.swing.JButton ingresarB;
    private javax.swing.JButton iniciarPersonalB;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel mensajeUsuario;
    private javax.swing.JLabel mensajeUsuario1;
    private javax.swing.JButton registrarAdminB;
    private javax.swing.JTextField usuarioAdminTF;
    // End of variables declaration//GEN-END:variables
}
