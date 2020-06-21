package Frontera;

public class FramePrincipalPersonalMedico extends javax.swing.JFrame {

    //Inicializacion de las Clases a utilizar
    private IngresoPacienteFrontera ingresoP = new IngresoPacienteFrontera();
    private ActualizarPaciente actualizarP = new ActualizarPaciente();
    private EgresoPacienteFrontera egresoP = new EgresoPacienteFrontera();
    private GenerarReportes genReportes = new GenerarReportes();
    private Login login = new Login();

    public FramePrincipalPersonalMedico() {
        initComponents();
        setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelPrincipal = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jToolBar1 = new javax.swing.JToolBar();
        ingresoB = new javax.swing.JButton();
        egresoB = new javax.swing.JButton();
        actualizacionB = new javax.swing.JButton();
        reporteB = new javax.swing.JButton();
        logoutB = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        panelPrincipal.setBackground(new java.awt.Color(255, 255, 255));
        panelPrincipal.setLayout(new java.awt.BorderLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/Bienvenido.jpg"))); // NOI18N
        panelPrincipal.add(jLabel1, java.awt.BorderLayout.CENTER);

        jPanel1.setBackground(new java.awt.Color(166, 199, 232));

        jToolBar1.setFloatable(false);
        jToolBar1.setBorderPainted(false);
        jToolBar1.setOpaque(false);

        ingresoB.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        ingresoB.setForeground(new java.awt.Color(16, 65, 56));
        ingresoB.setText("  Ingreso  ");
        ingresoB.setFocusable(false);
        ingresoB.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        ingresoB.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        ingresoB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ingresoBActionPerformed(evt);
            }
        });
        jToolBar1.add(ingresoB);

        egresoB.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        egresoB.setForeground(new java.awt.Color(16, 65, 56));
        egresoB.setText("  Egreso  ");
        egresoB.setFocusable(false);
        egresoB.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        egresoB.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        egresoB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                egresoBActionPerformed(evt);
            }
        });
        jToolBar1.add(egresoB);

        actualizacionB.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        actualizacionB.setForeground(new java.awt.Color(16, 65, 56));
        actualizacionB.setText("  Actualización  ");
        actualizacionB.setFocusable(false);
        actualizacionB.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        actualizacionB.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        actualizacionB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                actualizacionBActionPerformed(evt);
            }
        });
        jToolBar1.add(actualizacionB);

        reporteB.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        reporteB.setForeground(new java.awt.Color(16, 65, 56));
        reporteB.setText("  Reporte  ");
        reporteB.setFocusable(false);
        reporteB.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        reporteB.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        reporteB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reporteBActionPerformed(evt);
            }
        });
        jToolBar1.add(reporteB);

        logoutB.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        logoutB.setForeground(new java.awt.Color(16, 65, 56));
        logoutB.setText("Cerra sesión");
        logoutB.setActionCommand("  Cerra sesión  ");
        logoutB.setFocusable(false);
        logoutB.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        logoutB.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        logoutB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutBActionPerformed(evt);
            }
        });
        jToolBar1.add(logoutB);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jToolBar1, javax.swing.GroupLayout.PREFERRED_SIZE, 990, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(570, 570, 570))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jToolBar1, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1000, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    //Muestra en pantalla la ventana IngresoPacienteFrontera y Oculta la ventana FramePrincipalMedico
    private void ingresoBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ingresoBActionPerformed
        panelPrincipal.setVisible(false);
        panelPrincipal.removeAll();
        panelPrincipal.add(ingresoP);
        panelPrincipal.setVisible(true);        // TODO add your handling code here:
    }//GEN-LAST:event_ingresoBActionPerformed

    //Muestra en pantalla la ventana ActualizarPaciente y Oculta la ventana FramePrincipalMedico
    private void actualizacionBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_actualizacionBActionPerformed
        panelPrincipal.setVisible(false);
        panelPrincipal.removeAll();
        panelPrincipal.add(actualizarP);
        panelPrincipal.setVisible(true);   // TODO add your handling code here:
    }//GEN-LAST:event_actualizacionBActionPerformed

    //Muestra en pantalla la ventana EgresoPacienteFrontera y Oculta la ventana FramePrincipalMedico
    private void egresoBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_egresoBActionPerformed
        panelPrincipal.setVisible(false);
        panelPrincipal.removeAll();
        panelPrincipal.add(egresoP);
        panelPrincipal.setVisible(true);
    }//GEN-LAST:event_egresoBActionPerformed

    //instrucción cierra la ventana actual y liberas los recursos que esa ventana
    private void logoutBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutBActionPerformed
        new Login().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_logoutBActionPerformed

    //Muestra en pantalla la ventana GenerarReporte y Oculta la ventana FramePrincipalMedico
    private void reporteBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reporteBActionPerformed
        panelPrincipal.setVisible(false);
        panelPrincipal.removeAll();
        panelPrincipal.add(genReportes);
        panelPrincipal.setVisible(true);
    }//GEN-LAST:event_reporteBActionPerformed

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
            java.util.logging.Logger.getLogger(FramePrincipalPersonalMedico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FramePrincipalPersonalMedico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FramePrincipalPersonalMedico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FramePrincipalPersonalMedico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FramePrincipalPersonalMedico().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton actualizacionB;
    private javax.swing.JButton egresoB;
    private javax.swing.JButton ingresoB;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JToolBar jToolBar1;
    private javax.swing.JButton logoutB;
    private javax.swing.JPanel panelPrincipal;
    private javax.swing.JButton reporteB;
    // End of variables declaration//GEN-END:variables
}
