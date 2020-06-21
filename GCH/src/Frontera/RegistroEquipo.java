/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Frontera;

import Control.ValidarRegistroEquipo;
import DAO.EquipoDAO;
import Entidad.Equipo;
import javax.swing.JOptionPane;

/**
 *
 * @author Diero I
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

        mensajeUsuario = new javax.swing.JLabel();
        mensajeUsuario1 = new javax.swing.JLabel();
        mensajeUsuario2 = new javax.swing.JLabel();
        mensajeUsuario3 = new javax.swing.JLabel();
        mensajeUsuario4 = new javax.swing.JLabel();
        mensajeUsuario5 = new javax.swing.JLabel();
        equipoMarcaTF = new javax.swing.JTextField();
        equipoDescripcionTF = new javax.swing.JTextArea();
        equipoTipoCB = new javax.swing.JComboBox<>();
        equipoRegistroTF = new javax.swing.JTextField();
        aceptarB = new javax.swing.JButton();
        equipoCantidadTF = new javax.swing.JTextField();
        cancelarB = new javax.swing.JButton();
        TipoEquipo = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setMinimumSize(new java.awt.Dimension(1000, 506));
        setPreferredSize(new java.awt.Dimension(1000, 506));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        mensajeUsuario.setFont(new java.awt.Font("DejaVu Sans", 0, 8)); // NOI18N
        mensajeUsuario.setForeground(new java.awt.Color(255, 0, 0));
        add(mensajeUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 185, -1, -1));

        mensajeUsuario1.setFont(new java.awt.Font("DejaVu Sans", 0, 8)); // NOI18N
        mensajeUsuario1.setForeground(new java.awt.Color(255, 0, 0));
        add(mensajeUsuario1, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 240, -1, -1));

        mensajeUsuario2.setFont(new java.awt.Font("DejaVu Sans", 0, 8)); // NOI18N
        mensajeUsuario2.setForeground(new java.awt.Color(255, 0, 0));
        add(mensajeUsuario2, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 295, -1, -1));

        mensajeUsuario3.setFont(new java.awt.Font("DejaVu Sans", 0, 8)); // NOI18N
        mensajeUsuario3.setForeground(new java.awt.Color(255, 0, 0));
        add(mensajeUsuario3, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 350, -1, -1));

        mensajeUsuario4.setFont(new java.awt.Font("DejaVu Sans", 0, 8)); // NOI18N
        mensajeUsuario4.setForeground(new java.awt.Color(255, 0, 0));
        add(mensajeUsuario4, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 400, -1, -1));

        mensajeUsuario5.setFont(new java.awt.Font("DejaVu Sans", 0, 8)); // NOI18N
        mensajeUsuario5.setForeground(new java.awt.Color(255, 0, 0));
        add(mensajeUsuario5, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 430, -1, -1));

        equipoMarcaTF.setBackground(new java.awt.Color(63, 191, 168));
        equipoMarcaTF.setFont(new java.awt.Font("Century Gothic", 0, 23)); // NOI18N
        equipoMarcaTF.setForeground(new java.awt.Color(255, 255, 255));
        equipoMarcaTF.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        equipoMarcaTF.setBorder(null);
        add(equipoMarcaTF, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 200, 230, 30));

        equipoDescripcionTF.setBackground(new java.awt.Color(236, 236, 236));
        equipoDescripcionTF.setColumns(20);
        equipoDescripcionTF.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        equipoDescripcionTF.setForeground(new java.awt.Color(16, 65, 56));
        equipoDescripcionTF.setLineWrap(true);
        equipoDescripcionTF.setRows(5);
        add(equipoDescripcionTF, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 180, 330, 240));

        equipoTipoCB.setBackground(new java.awt.Color(204, 204, 204));
        equipoTipoCB.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        equipoTipoCB.setForeground(new java.awt.Color(16, 65, 56));
        equipoTipoCB.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " ", "Soporte de vida", "Quirúrgica", "Cuidados intensivos", "Terapia física", "Equipos de tratamiento", "Monitorización quirúrgica", "Monitorización de Cuidados intensivos", "Monitorización general", "Diagnósticos fisiológicos", "Analítica de laboratorio", "Accesorios de laboratorio", "Procesado de datos del paciente", "Otro" }));
        equipoTipoCB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                equipoTipoCBActionPerformed(evt);
            }
        });
        add(equipoTipoCB, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 250, 230, 40));

        equipoRegistroTF.setBackground(new java.awt.Color(63, 191, 168));
        equipoRegistroTF.setFont(new java.awt.Font("Century Gothic", 0, 23)); // NOI18N
        equipoRegistroTF.setForeground(new java.awt.Color(255, 255, 255));
        equipoRegistroTF.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        equipoRegistroTF.setBorder(null);
        add(equipoRegistroTF, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 305, 230, 30));

        aceptarB.setBackground(new java.awt.Color(204, 204, 204));
        aceptarB.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/Aceptar.png"))); // NOI18N
        aceptarB.setContentAreaFilled(false);
        aceptarB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aceptarBActionPerformed(evt);
            }
        });
        add(aceptarB, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 440, 90, -1));

        equipoCantidadTF.setBackground(new java.awt.Color(63, 191, 168));
        equipoCantidadTF.setFont(new java.awt.Font("Century Gothic", 0, 23)); // NOI18N
        equipoCantidadTF.setForeground(new java.awt.Color(255, 255, 255));
        equipoCantidadTF.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        equipoCantidadTF.setBorder(null);
        add(equipoCantidadTF, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 355, 230, 30));

        cancelarB.setBackground(new java.awt.Color(204, 204, 204));
        cancelarB.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/Cancelar.png"))); // NOI18N
        cancelarB.setContentAreaFilled(false);
        cancelarB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelarBActionPerformed(evt);
            }
        });
        add(cancelarB, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 440, 90, -1));

        TipoEquipo.setBackground(new java.awt.Color(204, 204, 204));
        TipoEquipo.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        TipoEquipo.setForeground(new java.awt.Color(16, 65, 56));
        TipoEquipo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " ","VENTILADOR MECANICO", "SATUROMETRO", "BALA OXIGENO", "MONITOR", "BOMBA INFUSION CONTINUA", "BOMBA NUTRICION ENTERAL", "ASPIRADOR DE SECRECIONES","EQUIPO DE INTUBACION" }));
        TipoEquipo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TipoEquipoActionPerformed(evt);
            }
        });
        add(TipoEquipo, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 140, 230, 40));

        jLabel1.setBackground(new java.awt.Color(204, 204, 204));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/Registro_Equipo.jpg"))); // NOI18N
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 500));
    }// </editor-fold>//GEN-END:initComponents

    private void equipoTipoCBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_equipoTipoCBActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_equipoTipoCBActionPerformed

    private void aceptarBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aceptarBActionPerformed
        Equipo equipo = new Equipo();
        EquipoDAO dao = new EquipoDAO();
        int cantidad = 0;
        equipo.setNombreEquipo(TipoEquipo.getSelectedItem().toString());
        equipo.setMarca(equipoMarcaTF.getText());
        equipo.setTipoUso(equipoTipoCB.getSelectedItem().toString());
        equipo.setRegistroSanitario(equipoRegistroTF.getText());
        equipo.setDescripcionEquipo(equipoDescripcionTF.getText());
        equipo.setEstadoEquipo(false);

        ValidarRegistroEquipo validar = new ValidarRegistroEquipo();
        System.out.println("-------");
        String resultado = validar.VerificarRegistroEquipo(equipo);
        System.out.println(resultado);
        if (" ".equals(TipoEquipo.getSelectedItem().toString())) {
            mensajeUsuario.setText("No se ha seleccionado el tipo de equipo");
        } else {
            mensajeUsuario.setText("");
        }
        if (!validar.VerificarLongitudMarca(equipoMarcaTF.getText())) {
            mensajeUsuario1.setText("Longitud marca incorrecta");
        } else {
            mensajeUsuario1.setText("");
        }
        if (" ".equals(equipoTipoCB.getSelectedItem().toString())) {
            mensajeUsuario2.setText("No se ha seleccionado el tipo de uso");
        } else {
            mensajeUsuario2.setText("");
        }
        if (!validar.VerificarLongitudRegistroSanitarioEquipo(equipoRegistroTF.getText())) {
            mensajeUsuario3.setText("Longitud Registro Sanitario incorrecta");
        } else {
            mensajeUsuario3.setText("");
        }
        //por mejorar
        if (equipoCantidadTF.getText().length() == 0) {
            mensajeUsuario4.setText("No hay Cantidad");
        } else {
            if (!validar.VerificarLongitudCantidadEquipo(Integer.parseInt(equipoCantidadTF.getText()))) {
                mensajeUsuario4.setText("Longitud de cantidad incorrecta");
                cantidad = 0;
            } else {
                mensajeUsuario4.setText("");
                cantidad = Integer.parseInt(equipoCantidadTF.getText());
            }
        }
        if (!validar.VerificarLongitudRegistroSanitarioEquipo(equipoDescripcionTF.getText())) {
            mensajeUsuario4.setText("Longitud de descripción incorrecta");
        } else {
            mensajeUsuario4.setText("");
        }

        if (resultado == "Datos ingresados correctamente" && validar.VerificarLongitudCantidadEquipo(cantidad)) {
            for (int i = 1; i <= Integer.parseInt(equipoCantidadTF.getText()); i++) {
                dao.crear(equipo);
            }
            System.out.println("Equipos registrados correctamente");
            JOptionPane.showMessageDialog(null, "Equipos registrados correctamente", "", JOptionPane.INFORMATION_MESSAGE);
            borrar();
        }
    }//GEN-LAST:event_aceptarBActionPerformed

    private void cancelarBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelarBActionPerformed
        borrar();
    }//GEN-LAST:event_cancelarBActionPerformed

    private void TipoEquipoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TipoEquipoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TipoEquipoActionPerformed
    public void borrar() {
        equipoCantidadTF.setText("");
        equipoDescripcionTF.setText("");
        equipoMarcaTF.setText("");
        equipoRegistroTF.setText("");
        equipoTipoCB.setSelectedItem(" ");
        TipoEquipo.setSelectedItem(" ");
        mensajeUsuario.setText("");
        mensajeUsuario1.setText("");
        mensajeUsuario2.setText("");
        mensajeUsuario3.setText("");
        mensajeUsuario4.setText("");
        mensajeUsuario5.setText("");
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> TipoEquipo;
    private javax.swing.JButton aceptarB;
    private javax.swing.JButton cancelarB;
    private javax.swing.JTextField equipoCantidadTF;
    private javax.swing.JTextArea equipoDescripcionTF;
    private javax.swing.JTextField equipoMarcaTF;
    private javax.swing.JTextField equipoRegistroTF;
    private javax.swing.JComboBox<String> equipoTipoCB;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel mensajeUsuario;
    private javax.swing.JLabel mensajeUsuario1;
    private javax.swing.JLabel mensajeUsuario2;
    private javax.swing.JLabel mensajeUsuario3;
    private javax.swing.JLabel mensajeUsuario4;
    private javax.swing.JLabel mensajeUsuario5;
    // End of variables declaration//GEN-END:variables
}
