package Frontera;

import Control.ValidarIngresoPaciente;
import DAO.PacienteDAO;
import java.awt.event.ActionEvent;

/**
 *
 * @author tech
 */
public class IngresoPaciente extends javax.swing.JPanel {
    
    ValidarIngresoPaciente validarIngresoPaciente;
    public IngresoPaciente() {
        this.validarIngresoPaciente = new ValidarIngresoPaciente();
        initComponents();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        nombre1TF = new javax.swing.JTextField();
        identificacionTF = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        observacionTF = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        aceptarB = new javax.swing.JButton();
        cancelarB = new javax.swing.JButton();
        nombre2TF = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        apellido1TF = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        apellido2TF = new javax.swing.JTextField();
        tipoSangreCB = new javax.swing.JComboBox<>();
        tipoAtencionCB = new javax.swing.JComboBox<>();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        noCamaCB = new javax.swing.JComboBox<>();
        regitroL = new javax.swing.JLabel();
        fechaL = new javax.swing.JLabel();
        rethusL = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        equiposT = new javax.swing.JTable();
        equiposNecesarios = new javax.swing.JPanel();
        jCheckBox1 = new javax.swing.JCheckBox();
        jCheckBox2 = new javax.swing.JCheckBox();
        jCheckBox3 = new javax.swing.JCheckBox();
        jCheckBox4 = new javax.swing.JCheckBox();
        jCheckBox5 = new javax.swing.JCheckBox();
        jCheckBox6 = new javax.swing.JCheckBox();
        jCheckBox7 = new javax.swing.JCheckBox();
        jCheckBox8 = new javax.swing.JCheckBox();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setMinimumSize(new java.awt.Dimension(755, 585));
        setPreferredSize(new java.awt.Dimension(755, 585));

        nombre1TF.setBackground(new java.awt.Color(102, 102, 102));
        nombre1TF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nombre1TFActionPerformed(evt);
            }
        });

        identificacionTF.setBackground(new java.awt.Color(102, 102, 102));
        identificacionTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                identificacionTFActionPerformed(evt);
            }
        });

        jLabel1.setBackground(new java.awt.Color(0, 0, 0));
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Nombre 1");

        jLabel2.setBackground(new java.awt.Color(0, 0, 0));
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Tipo sangre");

        jLabel3.setBackground(new java.awt.Color(0, 0, 0));
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("No. Identificación");

        observacionTF.setBackground(new java.awt.Color(102, 102, 102));
        observacionTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                observacionTFActionPerformed(evt);
            }
        });

        jLabel7.setForeground(new java.awt.Color(0, 0, 0));
        jLabel7.setText("Observaciones");

        aceptarB.setText("Aceptar");
        aceptarB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aceptarBActionPerformed(evt);
            }
        });

        cancelarB.setText("Cancelar");

        nombre2TF.setBackground(new java.awt.Color(102, 102, 102));
        nombre2TF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nombre2TFActionPerformed(evt);
            }
        });

        jLabel8.setBackground(new java.awt.Color(0, 0, 0));
        jLabel8.setForeground(new java.awt.Color(0, 0, 0));
        jLabel8.setText("Nombre 2");

        apellido1TF.setBackground(new java.awt.Color(102, 102, 102));
        apellido1TF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                apellido1TFActionPerformed(evt);
            }
        });

        jLabel9.setBackground(new java.awt.Color(0, 0, 0));
        jLabel9.setForeground(new java.awt.Color(0, 0, 0));
        jLabel9.setText("Apellido 1");

        jLabel10.setBackground(new java.awt.Color(0, 0, 0));
        jLabel10.setForeground(new java.awt.Color(0, 0, 0));
        jLabel10.setText("Apellido 2");

        apellido2TF.setBackground(new java.awt.Color(102, 102, 102));
        apellido2TF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                apellido2TFActionPerformed(evt);
            }
        });

        tipoSangreCB.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "O +", "O -", "A -", "A +", "B -", "B +", "AB -", "AB +" }));
        tipoSangreCB.addContainerListener(new java.awt.event.ContainerAdapter() {
            public void componentAdded(java.awt.event.ContainerEvent evt) {
                tipoSangreCBComponentAdded(evt);
            }
        });
        tipoSangreCB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tipoSangreCBActionPerformed(evt);
            }
        });

        tipoAtencionCB.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Uci (intermedio)", "Uci" }));
        tipoAtencionCB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tipoAtencionCBActionPerformed(evt);
            }
        });

        jLabel11.setBackground(new java.awt.Color(0, 0, 0));
        jLabel11.setForeground(new java.awt.Color(0, 0, 0));
        jLabel11.setText("Tipo de atención");

        jLabel12.setBackground(new java.awt.Color(0, 0, 0));
        jLabel12.setForeground(new java.awt.Color(0, 0, 0));
        jLabel12.setText("No. de cama");

        noCamaCB.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] {"1","2","3","4","5","6","7","8","9","10"}));
        noCamaCB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                noCamaCBActionPerformed(evt);
            }
        });

        regitroL.setForeground(new java.awt.Color(0, 0, 0));
        regitroL.setText("Registro");

        fechaL.setForeground(new java.awt.Color(0, 0, 0));
        fechaL.setText("Fecha");

        rethusL.setForeground(new java.awt.Color(0, 0, 0));
        rethusL.setText("ReTHUS");

        equiposT.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(equiposT);

        jCheckBox1.setText("Ventiladores");
        jCheckBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox1ActionPerformed(evt);
            }
        });

        jCheckBox2.setText("Saturometros");
        jCheckBox2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox2ActionPerformed(evt);
            }
        });

        jCheckBox3.setText("Balas de oxigeno");
        jCheckBox3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox3ActionPerformed(evt);
            }
        });

        jCheckBox4.setText("monitor cardíaco");
        jCheckBox4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox4ActionPerformed(evt);
            }
        });

        jCheckBox5.setText("Bomba de infusión continua");
        jCheckBox5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox5ActionPerformed(evt);
            }
        });

        jCheckBox6.setText("Bomba de nutrición");
        jCheckBox6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox6ActionPerformed(evt);
            }
        });

        jCheckBox7.setText("aspirador de secreciones");
        jCheckBox7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox7ActionPerformed(evt);
            }
        });

        jCheckBox8.setText("equipo de intubacón");
        jCheckBox8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox8ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout equiposNecesariosLayout = new javax.swing.GroupLayout(equiposNecesarios);
        equiposNecesarios.setLayout(equiposNecesariosLayout);
        equiposNecesariosLayout.setHorizontalGroup(
            equiposNecesariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(equiposNecesariosLayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(equiposNecesariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jCheckBox8)
                    .addComponent(jCheckBox1)
                    .addComponent(jCheckBox2)
                    .addComponent(jCheckBox3)
                    .addComponent(jCheckBox4)
                    .addComponent(jCheckBox5)
                    .addComponent(jCheckBox6)
                    .addComponent(jCheckBox7))
                .addContainerGap(26, Short.MAX_VALUE))
        );
        equiposNecesariosLayout.setVerticalGroup(
            equiposNecesariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(equiposNecesariosLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jCheckBox1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jCheckBox2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jCheckBox3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jCheckBox4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jCheckBox5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jCheckBox6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jCheckBox7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jCheckBox8)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel4.setBackground(new java.awt.Color(255, 255, 255));
        jLabel4.setFont(new java.awt.Font("DejaVu Sans", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("Equipos necesarios");

        jLabel5.setBackground(new java.awt.Color(255, 255, 255));
        jLabel5.setFont(new java.awt.Font("DejaVu Sans", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("Equipos disponibles");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(84, 84, 84)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel5)
                .addGap(144, 144, 144))
            .addGroup(layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(jLabel7)
                        .addGap(41, 41, 41)
                        .addComponent(observacionTF, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(102, 102, 102)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cancelarB, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(aceptarB, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel1)
                                        .addGap(18, 18, 18)
                                        .addComponent(nombre1TF, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel8)
                                        .addGap(18, 18, 18)
                                        .addComponent(nombre2TF, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel9)
                                        .addGap(18, 18, 18)
                                        .addComponent(apellido1TF, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel10)
                                        .addGap(18, 18, 18)
                                        .addComponent(apellido2TF, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel11)
                                    .addComponent(jLabel12)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(13, 13, 13)
                                .addComponent(equiposNecesarios, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(tipoSangreCB, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(identificacionTF)
                                    .addComponent(tipoAtencionCB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(26, 26, 26)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(rethusL)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(fechaL)
                                        .addComponent(regitroL))))
                            .addComponent(noCamaCB, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 316, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(75, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(regitroL)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(nombre1TF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1)
                            .addComponent(jLabel3)
                            .addComponent(identificacionTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(nombre2TF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8)
                            .addComponent(tipoSangreCB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(fechaL)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(rethusL)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(apellido1TF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9)
                    .addComponent(tipoAtencionCB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(apellido2TF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10)
                    .addComponent(noCamaCB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12))
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(equiposNecesarios, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(observacionTF, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(aceptarB)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cancelarB)))
                        .addGap(54, 54, 54))))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void aceptarBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aceptarBActionPerformed
        PacienteDAO pdao = new PacienteDAO();
        IngresoPaciente ingresar = new IngresoPaciente();
        identificacionTFActionPerformed(evt);
        nombre1TFActionPerformed(evt);
        nombre2TFActionPerformed(evt);
        apellido1TFActionPerformed(evt);
        apellido2TFActionPerformed(evt);
        jCheckBox1ActionPerformed(evt);
        jCheckBox2ActionPerformed(evt);
        jCheckBox3ActionPerformed(evt);
        jCheckBox4ActionPerformed(evt);
        jCheckBox5ActionPerformed(evt);
        jCheckBox6ActionPerformed(evt);
        jCheckBox7ActionPerformed(evt);
        jCheckBox8ActionPerformed(evt);
        tipoAtencionCBActionPerformed(evt);
        tipoSangreCBActionPerformed(evt);
        observacionTFActionPerformed(evt);
        pdao.ingresar(this.validarIngresoPaciente.getIdPaciente(),this.validarIngresoPaciente.getNombre1(), this.validarIngresoPaciente.getNombre2(),
                      this.validarIngresoPaciente.getApellido1(),this.validarIngresoPaciente.getApellido2(),
                      this.validarIngresoPaciente.getTipoSangre(),this.validarIngresoPaciente.getTipoAtencion(),
                      this.validarIngresoPaciente.isRespirador(),this.validarIngresoPaciente.isEquipoIntubacion(),
                      this.validarIngresoPaciente.isAspiradorSecreciones(), this.validarIngresoPaciente.isBombasNutricion(),
                      this.validarIngresoPaciente.isMonitor(),this.validarIngresoPaciente.isBombaInfucionContinua(),
                      this.validarIngresoPaciente.isSaturometros(),this.validarIngresoPaciente.isBalasOxigeno());
    }//GEN-LAST:event_aceptarBActionPerformed

    private void tipoAtencionCBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tipoAtencionCBActionPerformed
        String itemSeleccionado = (String)tipoAtencionCB.getSelectedItem();
        if ("Uci (intermedio)".equals(itemSeleccionado)) {
            this.validarIngresoPaciente.setTipoAtencion("Uci (intermedio)");        
        }
        if ("Uci".equals(itemSeleccionado)) {
            this.validarIngresoPaciente.setTipoAtencion("Uci");        
        }
    }//GEN-LAST:event_tipoAtencionCBActionPerformed

    private void noCamaCBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_noCamaCBActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_noCamaCBActionPerformed

    private void jCheckBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox1ActionPerformed
        if (jCheckBox1.isSelected()) {
            this.validarIngresoPaciente.setAspiradorSecreciones(true);
        } else {
            this.validarIngresoPaciente.setAspiradorSecreciones(false);
        }
    }//GEN-LAST:event_jCheckBox1ActionPerformed
    
    private void jCheckBox7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox7ActionPerformed
        if (jCheckBox7.isSelected()) {
            this.validarIngresoPaciente.setBombaInfucionContinua(true);
        } else {
            this.validarIngresoPaciente.setBombaInfucionContinua(false);
        }
    }//GEN-LAST:event_jCheckBox7ActionPerformed

    private void jCheckBox8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox8ActionPerformed
        if (jCheckBox8.isSelected()) {
            this.validarIngresoPaciente.setEquipoIntubacion(true);
        } else {
            this.validarIngresoPaciente.setEquipoIntubacion(false);
        }
    }//GEN-LAST:event_jCheckBox8ActionPerformed

    private void tipoSangreCBComponentAdded(java.awt.event.ContainerEvent evt) {//GEN-FIRST:event_tipoSangreCBComponentAdded

    }//GEN-LAST:event_tipoSangreCBComponentAdded

    private void nombre1TFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nombre1TFActionPerformed
        this.validarIngresoPaciente.setNombre1(nombre1TF.getText());
        System.out.println(nombre1TF.getText());
    }//GEN-LAST:event_nombre1TFActionPerformed

    private void nombre2TFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nombre2TFActionPerformed
        if(nombre2TF.getText() != null){
            this.validarIngresoPaciente.setNombre2(nombre2TF.getText());
        }
        else if(nombre2TF.getText() == null){
            this.validarIngresoPaciente.setNombre2(null);
        }
    }//GEN-LAST:event_nombre2TFActionPerformed

    private void apellido1TFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_apellido1TFActionPerformed
        this.validarIngresoPaciente.setApellido1(apellido1TF.getText());
    }//GEN-LAST:event_apellido1TFActionPerformed

    private void apellido2TFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_apellido2TFActionPerformed
        this.validarIngresoPaciente.setApellido2(apellido2TF.getText());
    }//GEN-LAST:event_apellido2TFActionPerformed

    private void jCheckBox2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox2ActionPerformed
        if (jCheckBox2.isSelected()) {
            this.validarIngresoPaciente.setSaturometros(true);
        } else {
            this.validarIngresoPaciente.setSaturometros(false);
        }
    }//GEN-LAST:event_jCheckBox2ActionPerformed

    private void jCheckBox3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox3ActionPerformed
        if (jCheckBox3.isSelected()) {
            this.validarIngresoPaciente.setBalasOxigeno(true);
        } else {
            this.validarIngresoPaciente.setBalasOxigeno(false);
        }
    }//GEN-LAST:event_jCheckBox3ActionPerformed

    private void jCheckBox4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox4ActionPerformed
        if (jCheckBox4.isSelected()) {
            this.validarIngresoPaciente.setMonitor(true);
        } else {
            this.validarIngresoPaciente.setMonitor(false);
        }
    }//GEN-LAST:event_jCheckBox4ActionPerformed

    private void jCheckBox5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox5ActionPerformed
        if (jCheckBox5.isSelected()) {
            this.validarIngresoPaciente.setBombaInfucionContinua(true);
        } else {
            this.validarIngresoPaciente.setBombaInfucionContinua(false);
        }
    }//GEN-LAST:event_jCheckBox5ActionPerformed

    private void jCheckBox6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox6ActionPerformed
        if (jCheckBox6.isSelected()) {
            this.validarIngresoPaciente.setBombasNutricion(true);
        } else {
            this.validarIngresoPaciente.setBombasNutricion(false);
        }
    }//GEN-LAST:event_jCheckBox6ActionPerformed

    private void observacionTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_observacionTFActionPerformed
        if(observacionTF.getText() != null){
            this.validarIngresoPaciente.setObservaciones(observacionTF.getText());
        }
        else if(observacionTF.getText() == null){
            this.validarIngresoPaciente.setObservaciones(null);
        }
    }//GEN-LAST:event_observacionTFActionPerformed

    private void identificacionTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_identificacionTFActionPerformed
        this.validarIngresoPaciente.setIdPaciente(Integer.parseInt(identificacionTF.getText().trim()));
    }//GEN-LAST:event_identificacionTFActionPerformed

    private void tipoSangreCBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tipoSangreCBActionPerformed
        String itemSeleccionado = (String)tipoSangreCB.getSelectedItem();
        if ("O +".equals(itemSeleccionado)) {
            this.validarIngresoPaciente.setTipoSangre("O +");        
        }
        if ("O -".equals(itemSeleccionado)) {
            this.validarIngresoPaciente.setTipoSangre("O -");        
        }
        if ("A +".equals(itemSeleccionado)) {
            this.validarIngresoPaciente.setTipoSangre("A +");        
        }
        if ("A -".equals(itemSeleccionado)) {
            this.validarIngresoPaciente.setTipoSangre("A -");        
        }
        if ("B +".equals(itemSeleccionado)) {
            this.validarIngresoPaciente.setTipoSangre("B +");        
        }
        if ("B -".equals(itemSeleccionado)) {
            this.validarIngresoPaciente.setTipoSangre("B -");        
        }
        if ("AB +".equals(itemSeleccionado)) {
            this.validarIngresoPaciente.setTipoSangre("AB +");        
        }
        if ("AB -".equals(itemSeleccionado)) {
            this.validarIngresoPaciente.setTipoSangre("AB -");        
        }
    }//GEN-LAST:event_tipoSangreCBActionPerformed
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton aceptarB;
    private javax.swing.JTextField apellido1TF;
    private javax.swing.JTextField apellido2TF;
    private javax.swing.JButton cancelarB;
    private javax.swing.JPanel equiposNecesarios;
    private javax.swing.JTable equiposT;
    private javax.swing.JLabel fechaL;
    private javax.swing.JTextField identificacionTF;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JCheckBox jCheckBox2;
    private javax.swing.JCheckBox jCheckBox3;
    private javax.swing.JCheckBox jCheckBox4;
    private javax.swing.JCheckBox jCheckBox5;
    private javax.swing.JCheckBox jCheckBox6;
    private javax.swing.JCheckBox jCheckBox7;
    private javax.swing.JCheckBox jCheckBox8;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JComboBox<String> noCamaCB;
    private javax.swing.JTextField nombre1TF;
    private javax.swing.JTextField nombre2TF;
    private javax.swing.JTextField observacionTF;
    private javax.swing.JLabel regitroL;
    private javax.swing.JLabel rethusL;
    private javax.swing.JComboBox<String> tipoAtencionCB;
    private javax.swing.JComboBox<String> tipoSangreCB;
    // End of variables declaration//GEN-END:variables
    
    
}

