/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Frontera;

/**
 *
 * @author tech
 */
public class FramePrincipalPersonalMedico extends javax.swing.JFrame {

    /**
     * Creates new form FramePrincipalPersonalMedico
     */
     private IngresoPaciente ingresoP = new IngresoPaciente();
     private ActualizarPaciente actualizarP = new ActualizarPaciente();
      private EgresoPaciente egresoP = new EgresoPaciente();
      private Login login = new Login();
    public FramePrincipalPersonalMedico() {
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

        panelPrincipal = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jToolBar1 = new javax.swing.JToolBar();
        ingresoB = new javax.swing.JButton();
        egresoB = new javax.swing.JButton();
        actualizacionB = new javax.swing.JButton();
        reporteB = new javax.swing.JButton();
        logoutB = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(780, 630));
        setResizable(false);

        panelPrincipal.setBackground(new java.awt.Color(255, 255, 255));
        panelPrincipal.setLayout(new java.awt.BorderLayout());

        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/login.png"))); // NOI18N
        panelPrincipal.add(jLabel4, java.awt.BorderLayout.PAGE_END);

        jPanel1.setBackground(new java.awt.Color(153, 153, 153));

        jToolBar1.setRollover(true);

        ingresoB.setText("Ingreso");
        ingresoB.setBorder(null);
        ingresoB.setFocusable(false);
        ingresoB.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        ingresoB.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        ingresoB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ingresoBActionPerformed(evt);
            }
        });
        jToolBar1.add(ingresoB);

        egresoB.setText("Egreso");
        egresoB.setBorder(null);
        egresoB.setFocusable(false);
        egresoB.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        egresoB.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        egresoB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                egresoBActionPerformed(evt);
            }
        });
        jToolBar1.add(egresoB);

        actualizacionB.setText("Actualización");
        actualizacionB.setBorder(null);
        actualizacionB.setFocusable(false);
        actualizacionB.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        actualizacionB.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        actualizacionB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                actualizacionBActionPerformed(evt);
            }
        });
        jToolBar1.add(actualizacionB);

        reporteB.setText("Reporte");
        reporteB.setBorder(null);
        reporteB.setFocusable(false);
        reporteB.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        reporteB.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jToolBar1.add(reporteB);

        logoutB.setText("Cerra sesión");
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
                .addContainerGap()
                .addComponent(jToolBar1, javax.swing.GroupLayout.DEFAULT_SIZE, 768, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(2, 2, 2)
                .addComponent(jToolBar1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
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
                .addComponent(panelPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, 597, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ingresoBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ingresoBActionPerformed
        panelPrincipal.setVisible(false);
        panelPrincipal.removeAll();
        panelPrincipal.add(ingresoP);
        panelPrincipal.setVisible(true);        // TODO add your handling code here:
    }//GEN-LAST:event_ingresoBActionPerformed

    private void actualizacionBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_actualizacionBActionPerformed
        panelPrincipal.setVisible(false);
        panelPrincipal.removeAll();
        panelPrincipal.add(actualizarP);
        panelPrincipal.setVisible(true);   // TODO add your handling code here:
    }//GEN-LAST:event_actualizacionBActionPerformed

    private void egresoBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_egresoBActionPerformed
          panelPrincipal.setVisible(false);
        panelPrincipal.removeAll();
        panelPrincipal.add(egresoP);
        panelPrincipal.setVisible(true); 
    }//GEN-LAST:event_egresoBActionPerformed

    private void logoutBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutBActionPerformed
       new Login().setVisible(true);
            this.dispose();
    }//GEN-LAST:event_logoutBActionPerformed

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
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JToolBar jToolBar1;
    private javax.swing.JButton logoutB;
    private javax.swing.JPanel panelPrincipal;
    private javax.swing.JButton reporteB;
    // End of variables declaration//GEN-END:variables
}
