package Frontera;

import Control.ValidarIngresoPaciente;
import DAO.CamaDAO;
import DAO.IngresoPacienteDAO;
import DAO.PacienteDAO;
import DAO.PacienteDAO_prov;
import Entidad.IngresoPaciente;
import Entidad.Paciente;
import java.awt.event.ActionEvent;
import static java.lang.Integer.parseInt;

/**
 *
 * @author tech
 */
public class IngresoPacienteFrontera extends javax.swing.JPanel {

    ValidarIngresoPaciente validarIngresoPaciente;
    Paciente paciente = new Paciente();
    
    public IngresoPacienteFrontera() {
        //this.validarIngresoPaciente = new ValidarIngresoPaciente();
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
        mensajeUsuario = new javax.swing.JLabel();
        mensajeUsuario1 = new javax.swing.JLabel();
        mensajeUsuario2 = new javax.swing.JLabel();
        mensajeUsuario3 = new javax.swing.JLabel();
        mensajeUsuario4 = new javax.swing.JLabel();
        mensajeUsuario5 = new javax.swing.JLabel();
        mensajeUsuario6 = new javax.swing.JLabel();
        mensajeUsuario7 = new javax.swing.JLabel();
        buscarB = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));
        setMinimumSize(new java.awt.Dimension(755, 585));
        setPreferredSize(new java.awt.Dimension(765, 600));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        nombre1TF.setBackground(new java.awt.Color(204, 204, 204));
        nombre1TF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nombre1TFActionPerformed(evt);
            }
        });
        add(nombre1TF, new org.netbeans.lib.awtextra.AbsoluteConstraints(118, 27, 120, -1));

        identificacionTF.setBackground(new java.awt.Color(204, 204, 204));
        identificacionTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                identificacionTFActionPerformed(evt);
            }
        });
        add(identificacionTF, new org.netbeans.lib.awtextra.AbsoluteConstraints(382, 27, 120, -1));

        jLabel1.setBackground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Nombre 1");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(39, 33, -1, -1));

        jLabel2.setBackground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Tipo sangre");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 70, -1, -1));

        jLabel3.setBackground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("No. Identificación");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(256, 33, -1, -1));

        observacionTF.setBackground(new java.awt.Color(204, 204, 204));
        observacionTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                observacionTFActionPerformed(evt);
            }
        });
        add(observacionTF, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 500, 234, 80));

        jLabel7.setText("Observaciones");
        add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 510, -1, -1));

        aceptarB.setBackground(new java.awt.Color(204, 204, 204));
        aceptarB.setText("Aceptar");
        aceptarB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aceptarBActionPerformed(evt);
            }
        });
        add(aceptarB, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 510, 83, -1));

        cancelarB.setBackground(new java.awt.Color(204, 204, 204));
        cancelarB.setText("Cancelar");
        cancelarB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelarBActionPerformed(evt);
            }
        });
        add(cancelarB, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 550, -1, -1));

        nombre2TF.setBackground(new java.awt.Color(204, 204, 204));
        nombre2TF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nombre2TFActionPerformed(evt);
            }
        });
        add(nombre2TF, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 65, 120, -1));

        jLabel8.setBackground(new java.awt.Color(0, 0, 0));
        jLabel8.setText("Nombre 2");
        add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 70, -1, -1));

        apellido1TF.setBackground(new java.awt.Color(204, 204, 204));
        apellido1TF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                apellido1TFActionPerformed(evt);
            }
        });
        add(apellido1TF, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 105, 120, -1));

        jLabel9.setBackground(new java.awt.Color(0, 0, 0));
        jLabel9.setText("Apellido 1");
        add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 110, -1, -1));

        jLabel10.setBackground(new java.awt.Color(0, 0, 0));
        jLabel10.setText("Apellido 2");
        add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 150, -1, -1));

        apellido2TF.setBackground(new java.awt.Color(204, 204, 204));
        apellido2TF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                apellido2TFActionPerformed(evt);
            }
        });
        add(apellido2TF, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 145, 120, -1));

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
        add(tipoSangreCB, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 65, -1, -1));

        tipoAtencionCB.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Ucim", "Uci" }));
        tipoAtencionCB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tipoAtencionCBActionPerformed(evt);
            }
        });
        add(tipoAtencionCB, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 100, 120, -1));

        jLabel11.setBackground(new java.awt.Color(0, 0, 0));
        jLabel11.setText("Tipo de atención");
        add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 110, -1, -1));

        regitroL.setText("Registro");
        add(regitroL, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 100, -1, -1));

        fechaL.setText("Fecha");
        add(fechaL, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 120, -1, -1));

        rethusL.setText("ReTHUS");
        add(rethusL, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 140, -1, -1));

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

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 220, 316, 194));

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

        add(equiposNecesarios, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 270, -1, -1));

        jLabel4.setBackground(new java.awt.Color(255, 255, 255));
        jLabel4.setFont(new java.awt.Font("DejaVu Sans", 0, 18)); // NOI18N
        jLabel4.setText("Equipos necesarios");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 230, -1, -1));

        jLabel5.setBackground(new java.awt.Color(255, 255, 255));
        jLabel5.setFont(new java.awt.Font("DejaVu Sans", 0, 18)); // NOI18N
        jLabel5.setText("Equipos disponibles");
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 193, -1, -1));

        mensajeUsuario.setFont(new java.awt.Font("DejaVu Sans", 0, 10)); // NOI18N
        mensajeUsuario.setForeground(new java.awt.Color(255, 0, 0));
        mensajeUsuario.setText("jLabel6");
        add(mensajeUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 91, -1, -1));

        mensajeUsuario1.setFont(new java.awt.Font("DejaVu Sans", 0, 10)); // NOI18N
        mensajeUsuario1.setForeground(new java.awt.Color(255, 0, 0));
        mensajeUsuario1.setText("jLabel6");
        add(mensajeUsuario1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 131, -1, -1));

        mensajeUsuario2.setFont(new java.awt.Font("DejaVu Sans", 0, 10)); // NOI18N
        mensajeUsuario2.setForeground(new java.awt.Color(255, 0, 0));
        mensajeUsuario2.setText("jLabel6");
        add(mensajeUsuario2, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 52, -1, -1));

        mensajeUsuario3.setFont(new java.awt.Font("DejaVu Sans", 0, 10)); // NOI18N
        mensajeUsuario3.setForeground(new java.awt.Color(255, 0, 0));
        mensajeUsuario3.setText("jLabel6");
        add(mensajeUsuario3, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 171, -1, -1));

        mensajeUsuario4.setFont(new java.awt.Font("DejaVu Sans", 0, 10)); // NOI18N
        mensajeUsuario4.setForeground(new java.awt.Color(255, 0, 0));
        mensajeUsuario4.setText("jLabel6");
        add(mensajeUsuario4, new org.netbeans.lib.awtextra.AbsoluteConstraints(384, 52, -1, -1));

        mensajeUsuario5.setFont(new java.awt.Font("DejaVu Sans", 0, 10)); // NOI18N
        mensajeUsuario5.setForeground(new java.awt.Color(255, 0, 0));
        mensajeUsuario5.setText("jLabel6");
        add(mensajeUsuario5, new org.netbeans.lib.awtextra.AbsoluteConstraints(384, 89, -1, -1));

        mensajeUsuario6.setFont(new java.awt.Font("DejaVu Sans", 0, 10)); // NOI18N
        mensajeUsuario6.setForeground(new java.awt.Color(255, 0, 0));
        mensajeUsuario6.setText("jLabel6");
        add(mensajeUsuario6, new org.netbeans.lib.awtextra.AbsoluteConstraints(384, 52, -1, -1));

        mensajeUsuario7.setFont(new java.awt.Font("DejaVu Sans", 0, 10)); // NOI18N
        mensajeUsuario7.setForeground(new java.awt.Color(255, 0, 0));
        mensajeUsuario7.setText("jLabel6");
        add(mensajeUsuario7, new org.netbeans.lib.awtextra.AbsoluteConstraints(384, 124, -1, -1));

        buscarB.setText("Buscar");
        buscarB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscarBActionPerformed(evt);
            }
        });
        add(buscarB, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 20, -1, 30));
    }// </editor-fold>//GEN-END:initComponents

    private void aceptarBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aceptarBActionPerformed
        /*PacienteDAO_prov pdao = new PacienteDAO_prov();
        IngresoPacienteFrontera ingresar = new IngresoPacienteFrontera();
        pdao.crear();
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
        pdao.ingresar(this.validarIngresoPaciente.getIdPaciente(), this.validarIngresoPaciente.getNombre1(), this.validarIngresoPaciente.getNombre2(),
                this.validarIngresoPaciente.getApellido1(), this.validarIngresoPaciente.getApellido2(),
                this.validarIngresoPaciente.getTipoSangre(), this.validarIngresoPaciente.getTipoAtencion(),
                this.validarIngresoPaciente.isRespirador(), this.validarIngresoPaciente.isEquipoIntubacion(),
                this.validarIngresoPaciente.isAspiradorSecreciones(), this.validarIngresoPaciente.isBombasNutricion(),
                this.validarIngresoPaciente.isMonitor(), this.validarIngresoPaciente.isBombaInfucionContinua(),
                this.validarIngresoPaciente.isSaturometros(), this.validarIngresoPaciente.isBalasOxigeno(),
                this.validarIngresoPaciente.getObservaciones());*/
        
        PacienteDAO pacientedao = new PacienteDAO();
        IngresoPaciente ingresoP = new IngresoPaciente();
        IngresoPacienteDAO ingresoPdao = new IngresoPacienteDAO();
        CamaDAO camadao = new CamaDAO();
        tipoSangreCBActionPerformed(evt);
         
        try {
            Integer.parseInt(identificacionTF.getText());
            Paciente pac = pacientedao.leerPorId(identificacionTF.getText());
            if(pac.getNombrePaciente1() != null){
                paciente = pac;
            } else {
                paciente.setIdPaciente(parseInt(identificacionTF.getText()));
                paciente.setNombrePaciente1(nombre1TF.getText());
                paciente.setNombrePaciente2(nombre2TF.getText());
                paciente.setApellidoPaciente1(apellido1TF.getText());
                paciente.setApellidoPaciente2(apellido2TF.getText());
                pacientedao.crear(paciente);
            }
            //VERIFICAR SI LA CAMA ESTÁ DISPONIBLE
            
            //CONSULTAR SI LOS EQUIPOS ESTÁN DISPONIBLES
            
            //paciente.setTipoSangre(tipoSangreCB.getSelectedItem());
        } catch (NumberFormatException excepcion) {
            System.out.println("Identificación debe ser numérica");
        }
    }//GEN-LAST:event_aceptarBActionPerformed

    private void tipoAtencionCBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tipoAtencionCBActionPerformed
        String itemSeleccionado = (String) tipoAtencionCB.getSelectedItem();
        if ("Ucim".equals(itemSeleccionado)) {
        //    this.validarIngresoPaciente.setTipoAtencion("Uci (intermedio)");
        
        }
        if ("Uci".equals(itemSeleccionado)) {
        //    this.validarIngresoPaciente.setTipoAtencion("Uci");
        }
    }//GEN-LAST:event_tipoAtencionCBActionPerformed

    private void jCheckBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox1ActionPerformed
        if (jCheckBox1.isSelected()) {
        //    this.validarIngresoPaciente.setAspiradorSecreciones(true);
        } else {
        //    this.validarIngresoPaciente.setAspiradorSecreciones(false);
        }
    }//GEN-LAST:event_jCheckBox1ActionPerformed

    private void jCheckBox7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox7ActionPerformed
        if (jCheckBox7.isSelected()) {
        //    this.validarIngresoPaciente.setBombaInfucionContinua(true);
        } else {
        //    this.validarIngresoPaciente.setBombaInfucionContinua(false);
        }
    }//GEN-LAST:event_jCheckBox7ActionPerformed

    private void jCheckBox8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox8ActionPerformed
        if (jCheckBox8.isSelected()) {
        //    this.validarIngresoPaciente.setEquipoIntubacion(true);
        } else {
        //    this.validarIngresoPaciente.setEquipoIntubacion(false);
        }
    }//GEN-LAST:event_jCheckBox8ActionPerformed

    private void tipoSangreCBComponentAdded(java.awt.event.ContainerEvent evt) {//GEN-FIRST:event_tipoSangreCBComponentAdded

    }//GEN-LAST:event_tipoSangreCBComponentAdded

    private void nombre1TFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nombre1TFActionPerformed
        //this.validarIngresoPaciente.setNombre1(nombre1TF.getText());
    }//GEN-LAST:event_nombre1TFActionPerformed

    private void nombre2TFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nombre2TFActionPerformed
        if (nombre2TF.getText() != null) {
        //    this.validarIngresoPaciente.setNombre2(nombre2TF.getText());
        } else if (nombre2TF.getText() == null) {
        //    this.validarIngresoPaciente.setNombre2(null);
        }
    }//GEN-LAST:event_nombre2TFActionPerformed

    private void apellido1TFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_apellido1TFActionPerformed
        //this.validarIngresoPaciente.setApellido1(apellido1TF.getText());
    }//GEN-LAST:event_apellido1TFActionPerformed

    private void apellido2TFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_apellido2TFActionPerformed
        //this.validarIngresoPaciente.setApellido2(apellido2TF.getText());
    }//GEN-LAST:event_apellido2TFActionPerformed

    private void jCheckBox2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox2ActionPerformed
        if (jCheckBox2.isSelected()) {
            //this.validarIngresoPaciente.setSaturometros(true);
        } else {
            //this.validarIngresoPaciente.setSaturometros(false);
        }
    }//GEN-LAST:event_jCheckBox2ActionPerformed

    private void jCheckBox3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox3ActionPerformed
        if (jCheckBox3.isSelected()) {
            //this.validarIngresoPaciente.setBalasOxigeno(true);
        } else {
            //this.validarIngresoPaciente.setBalasOxigeno(false);
        }
    }//GEN-LAST:event_jCheckBox3ActionPerformed

    private void jCheckBox4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox4ActionPerformed
        if (jCheckBox4.isSelected()) {
            //this.validarIngresoPaciente.setMonitor(true);
        } else {
            //this.validarIngresoPaciente.setMonitor(false);
        }
    }//GEN-LAST:event_jCheckBox4ActionPerformed

    private void jCheckBox5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox5ActionPerformed
        if (jCheckBox5.isSelected()) {
            //this.validarIngresoPaciente.setBombaInfucionContinua(true);
        } else {
            //this.validarIngresoPaciente.setBombaInfucionContinua(false);
        }
    }//GEN-LAST:event_jCheckBox5ActionPerformed

    private void jCheckBox6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox6ActionPerformed
        if (jCheckBox6.isSelected()) {
            //this.validarIngresoPaciente.setBombasNutricion(true);
        } else {
            //this.validarIngresoPaciente.setBombasNutricion(false);
        }
    }//GEN-LAST:event_jCheckBox6ActionPerformed

    private void observacionTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_observacionTFActionPerformed
        if (observacionTF.getText() != null) {
            //this.validarIngresoPaciente.setObservaciones(observacionTF.getText());
        } else if (observacionTF.getText() == null) {
            //this.validarIngresoPaciente.setObservaciones(null);
        }
    }//GEN-LAST:event_observacionTFActionPerformed

    private void identificacionTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_identificacionTFActionPerformed
        //this.validarIngresoPaciente.setIdPaciente(Integer.parseInt(identificacionTF.getText().trim()));
    }//GEN-LAST:event_identificacionTFActionPerformed

    private void tipoSangreCBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tipoSangreCBActionPerformed
        String itemSeleccionado = (String) tipoSangreCB.getSelectedItem();
        if ("O +".equals(itemSeleccionado)) {
            //this.validarIngresoPaciente.setTipoSangre("O +");
            this.paciente.setTipoSangre("O +");
        }
        if ("O -".equals(itemSeleccionado)) {
            //this.validarIngresoPaciente.setTipoSangre("O -");
            this.paciente.setTipoSangre("O -");
        }
        if ("A +".equals(itemSeleccionado)) {
            //this.validarIngresoPaciente.setTipoSangre("A +");
            this.paciente.setTipoSangre("A +");
        }
        if ("A -".equals(itemSeleccionado)) {
            //this.validarIngresoPaciente.setTipoSangre("A -");
            this.paciente.setTipoSangre("A -");
        }
        if ("B +".equals(itemSeleccionado)) {
            //this.validarIngresoPaciente.setTipoSangre("B +");
            this.paciente.setTipoSangre("B +");
        }
        if ("B -".equals(itemSeleccionado)) {
            //this.validarIngresoPaciente.setTipoSangre("B -");
            this.paciente.setTipoSangre("B -");
        }
        if ("AB +".equals(itemSeleccionado)) {
            //this.validarIngresoPaciente.setTipoSangre("AB +");
            this.paciente.setTipoSangre("AB +");
        }
        if ("AB -".equals(itemSeleccionado)) {
            //this.validarIngresoPaciente.setTipoSangre("AB -");
            this.paciente.setTipoSangre("AB -");
        }
    }//GEN-LAST:event_tipoSangreCBActionPerformed

    private void cancelarBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelarBActionPerformed
        nombre1TF.setText("");
        nombre2TF.setText("");
        apellido1TF.setText("");
        apellido2TF.setText("");
        identificacionTF.setText("");
        observacionTF.setText("");
        this.jCheckBox1.setSelected(false);
        this.jCheckBox2.setSelected(false);
        this.jCheckBox3.setSelected(false);
        this.jCheckBox4.setSelected(false);
        this.jCheckBox5.setSelected(false);
        this.jCheckBox6.setSelected(false);
        this.jCheckBox7.setSelected(false);
        this.jCheckBox8.setSelected(false);

// TODO add your handling code here:
    }//GEN-LAST:event_cancelarBActionPerformed

    private void buscarBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscarBActionPerformed
        String identificacion = identificacionTF.getText();
        PacienteDAO pdao = new PacienteDAO();
        Paciente paciente1 = pdao.leerPorId(identificacion);
        if(paciente1.getNombrePaciente1()!= null){
            nombre1TF.setText(paciente1.getNombrePaciente1());
            nombre2TF.setText(paciente1.getNombrePaciente2());
            apellido1TF.setText(paciente1.getApellidoPaciente1());
            apellido2TF.setText(paciente1.getApellidoPaciente2());
            tipoSangreCB.setSelectedItem(paciente1.getTipoSangre());
        } else {
            System.out.println("¡PACIENTE NO ENCONTRADO!");
        }
    }//GEN-LAST:event_buscarBActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton aceptarB;
    private javax.swing.JTextField apellido1TF;
    private javax.swing.JTextField apellido2TF;
    private javax.swing.JButton buscarB;
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
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel mensajeUsuario;
    private javax.swing.JLabel mensajeUsuario1;
    private javax.swing.JLabel mensajeUsuario2;
    private javax.swing.JLabel mensajeUsuario3;
    private javax.swing.JLabel mensajeUsuario4;
    private javax.swing.JLabel mensajeUsuario5;
    private javax.swing.JLabel mensajeUsuario6;
    private javax.swing.JLabel mensajeUsuario7;
    private javax.swing.JTextField nombre1TF;
    private javax.swing.JTextField nombre2TF;
    private javax.swing.JTextField observacionTF;
    private javax.swing.JLabel regitroL;
    private javax.swing.JLabel rethusL;
    private javax.swing.JComboBox<String> tipoAtencionCB;
    private javax.swing.JComboBox<String> tipoSangreCB;
    // End of variables declaration//GEN-END:variables

}
