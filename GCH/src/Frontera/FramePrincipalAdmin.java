package Frontera;

public class FramePrincipalAdmin extends javax.swing.JFrame {

    //Inicializacion de las Clases a utilizar
    private RegistroPersonalMedico ingresoPM = new RegistroPersonalMedico();
    private RegistroEquipo ingresoE = new RegistroEquipo();
    private RegistroCamas ingresoC = new RegistroCamas();
    private GenerarReportes genReportes;
    private Login login = new Login();

    public FramePrincipalAdmin() {
        initComponents();
        setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelPrincipal = new javax.swing.JPanel();
        Fondo = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jToolBar1 = new javax.swing.JToolBar();
        ingresoPersonalB = new javax.swing.JButton();
        ingresoEquiposB = new javax.swing.JButton();
        ingresoCamas = new javax.swing.JButton();
        reporteB = new javax.swing.JButton();
        logoutB = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        panelPrincipal.setBackground(new java.awt.Color(63, 191, 168));
        panelPrincipal.setOpaque(false);
        panelPrincipal.setLayout(new java.awt.BorderLayout());

        Fondo.setBackground(new java.awt.Color(204, 255, 255));
        Fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/Bienvenido.jpg"))); // NOI18N
        panelPrincipal.add(Fondo, java.awt.BorderLayout.CENTER);

        jPanel1.setBackground(new java.awt.Color(166, 199, 232));

        jToolBar1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jToolBar1.setFloatable(false);
        jToolBar1.setRollover(true);
        jToolBar1.setBorderPainted(false);
        jToolBar1.setOpaque(false);

        ingresoPersonalB.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        ingresoPersonalB.setForeground(new java.awt.Color(16, 65, 56));
        ingresoPersonalB.setText("  Ingreso Personal  ");
        ingresoPersonalB.setToolTipText("");
        ingresoPersonalB.setActionCommand("Ingreso Personal");
        ingresoPersonalB.setBorder(null);
        ingresoPersonalB.setFocusable(false);
        ingresoPersonalB.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        ingresoPersonalB.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        ingresoPersonalB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ingresoPersonalBActionPerformed(evt);
            }
        });
        jToolBar1.add(ingresoPersonalB);

        ingresoEquiposB.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        ingresoEquiposB.setForeground(new java.awt.Color(16, 65, 56));
        ingresoEquiposB.setText("  Ingreso Equipos  ");
        ingresoEquiposB.setActionCommand("Ingreso Equipos");
        ingresoEquiposB.setBorder(null);
        ingresoEquiposB.setFocusable(false);
        ingresoEquiposB.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        ingresoEquiposB.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        ingresoEquiposB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ingresoEquiposBActionPerformed(evt);
            }
        });
        jToolBar1.add(ingresoEquiposB);

        ingresoCamas.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        ingresoCamas.setForeground(new java.awt.Color(16, 65, 56));
        ingresoCamas.setText("  Ingreso Camas  ");
        ingresoCamas.setBorder(null);
        ingresoCamas.setFocusable(false);
        ingresoCamas.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        ingresoCamas.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        ingresoCamas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ingresoCamasActionPerformed(evt);
            }
        });
        jToolBar1.add(ingresoCamas);

        reporteB.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        reporteB.setForeground(new java.awt.Color(16, 65, 56));
        reporteB.setText("  Reporte  ");
        reporteB.setBorder(null);
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
        logoutB.setText("  Cerrar sesión  ");
        logoutB.setBorder(null);
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
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jToolBar1, javax.swing.GroupLayout.PREFERRED_SIZE, 998, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jToolBar1, javax.swing.GroupLayout.DEFAULT_SIZE, 47, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    //Muestra en pantalla la ventana RegistroPersonalMedico y Oculta la ventana FramePrincipalAdmin
    private void ingresoPersonalBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ingresoPersonalBActionPerformed
        panelPrincipal.setVisible(false);
        panelPrincipal.removeAll();
        panelPrincipal.add(ingresoPM);
        panelPrincipal.setVisible(true);        // TODO add your handling code here:
    }//GEN-LAST:event_ingresoPersonalBActionPerformed

    //Muestra en pantalla la ventana RegistroCamas y Oculta la ventana LoginAdmin
    private void ingresoCamasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ingresoCamasActionPerformed
        panelPrincipal.setVisible(false);
        panelPrincipal.removeAll();
        panelPrincipal.add(ingresoC);
        panelPrincipal.setVisible(true);   // TODO add your handling code here:
    }//GEN-LAST:event_ingresoCamasActionPerformed

    //Muestra en pantalla la ventana RegistroEquipos y Oculta la ventana LoginAdmin
    private void ingresoEquiposBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ingresoEquiposBActionPerformed
        panelPrincipal.setVisible(false);
        panelPrincipal.removeAll();
        panelPrincipal.add(ingresoE);
        panelPrincipal.setVisible(true);
    }//GEN-LAST:event_ingresoEquiposBActionPerformed
    //instrucción cierra la ventana actual y liberas los recursos que esa ventana
    private void logoutBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutBActionPerformed
        new Login().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_logoutBActionPerformed

    //Muestra en pantalla la ventana GenerarReporte y Oculta la ventana LoginAdmin
    private void reporteBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reporteBActionPerformed
        genReportes = new GenerarReportes();
        panelPrincipal.setVisible(false);
        panelPrincipal.removeAll();
        panelPrincipal.add(genReportes);
        panelPrincipal.setVisible(true);
    }//GEN-LAST:event_reporteBActionPerformed

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
            java.util.logging.Logger.getLogger(FramePrincipalAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FramePrincipalAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FramePrincipalAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FramePrincipalAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FramePrincipalAdmin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Fondo;
    private javax.swing.JButton ingresoCamas;
    private javax.swing.JButton ingresoEquiposB;
    private javax.swing.JButton ingresoPersonalB;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JToolBar jToolBar1;
    private javax.swing.JButton logoutB;
    private javax.swing.JPanel panelPrincipal;
    private javax.swing.JButton reporteB;
    // End of variables declaration//GEN-END:variables
}
