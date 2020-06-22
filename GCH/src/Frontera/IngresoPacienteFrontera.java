package Frontera;

import Control.ValidarIngresoPaciente;
import DAO.CamaDAO;
import DAO.EquipoDAO;
import DAO.EquiposUsadosDAO;
import DAO.IngresoPacienteDAO;
import DAO.PacienteDAO;
import DAO.PersonalMedicoDAO;
import Entidad.Camas;
import Entidad.Equipo;
import Entidad.EquiposUsados;
import Entidad.IngresoPaciente;
import Entidad.Paciente;
import Entidad.PersonalMedico;
import static java.lang.Integer.parseInt;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author tech
 */

public class IngresoPacienteFrontera extends javax.swing.JPanel {

    private ValidarIngresoPaciente validarIngresoPaciente;
    private Paciente paciente = new Paciente();
    private Camas cama = new Camas(); 
    private ArrayList <Equipo> equipos = new ArrayList();
    
    public IngresoPacienteFrontera() {
        //this.validarIngresoPaciente = new ValidarIngresoPaciente();
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        nombre1TF = new javax.swing.JTextField();
        identificacionTF = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        aceptarB = new javax.swing.JButton();
        cancelarB = new javax.swing.JButton();
        nombre2TF = new javax.swing.JTextField();
        apellido1TF = new javax.swing.JTextField();
        apellido2TF = new javax.swing.JTextField();
        tipoSangreCB = new javax.swing.JComboBox<>();
        tipoAtencionCB = new javax.swing.JComboBox<>();
        regitroL = new javax.swing.JLabel();
        fechaL = new javax.swing.JLabel();
        rethusL = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        equiposT = new javax.swing.JTable();
        jLabel4 = new javax.swing.JLabel();
        equiposNecesarios = new javax.swing.JPanel();
        jCheckBox1 = new javax.swing.JCheckBox();
        jCheckBox2 = new javax.swing.JCheckBox();
        jCheckBox3 = new javax.swing.JCheckBox();
        jCheckBox4 = new javax.swing.JCheckBox();
        jCheckBox5 = new javax.swing.JCheckBox();
        jCheckBox6 = new javax.swing.JCheckBox();
        jCheckBox7 = new javax.swing.JCheckBox();
        jCheckBox8 = new javax.swing.JCheckBox();
        jLabel5 = new javax.swing.JLabel();
        mensajeUsuario = new javax.swing.JLabel();
        mensajeUsuario1 = new javax.swing.JLabel();
        mensajeUsuario2 = new javax.swing.JLabel();
        mensajeUsuario3 = new javax.swing.JLabel();
        mensajeUsuario4 = new javax.swing.JLabel();
        mensajeUsuario5 = new javax.swing.JLabel();
        mensajeUsuario7 = new javax.swing.JLabel();
        buscarB = new javax.swing.JButton();
        observacionTF = new javax.swing.JTextArea();
        jLabel6 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(204, 204, 204));
        setMinimumSize(new java.awt.Dimension(755, 585));
        setPreferredSize(new java.awt.Dimension(765, 600));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        nombre1TF.setBackground(new java.awt.Color(63, 191, 168));
        nombre1TF.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        nombre1TF.setForeground(new java.awt.Color(255, 255, 255));
        nombre1TF.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        nombre1TF.setBorder(null);
        nombre1TF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nombre1TFActionPerformed(evt);
            }
        });
        add(nombre1TF, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 90, 170, 30));

        identificacionTF.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        identificacionTF.setForeground(new java.awt.Color(16, 65, 56));
        identificacionTF.setBorder(null);
        identificacionTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                identificacionTFActionPerformed(evt);
            }
        });
        add(identificacionTF, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 90, 140, 30));

        jLabel7.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Observaciones");
        add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 360, -1, -1));

        aceptarB.setBackground(new java.awt.Color(204, 204, 204));
        aceptarB.setForeground(new java.awt.Color(16, 65, 56));
        aceptarB.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/Aceptar.png"))); // NOI18N
        aceptarB.setBorder(null);
        aceptarB.setContentAreaFilled(false);
        aceptarB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aceptarBActionPerformed(evt);
            }
        });
        add(aceptarB, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 380, 83, -1));

        cancelarB.setBackground(new java.awt.Color(204, 204, 204));
        cancelarB.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/Cancelar.png"))); // NOI18N
        cancelarB.setBorder(null);
        cancelarB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelarBActionPerformed(evt);
            }
        });
        add(cancelarB, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 430, -1, -1));

        nombre2TF.setBackground(new java.awt.Color(63, 191, 168));
        nombre2TF.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        nombre2TF.setForeground(new java.awt.Color(255, 255, 255));
        nombre2TF.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        nombre2TF.setBorder(null);
        nombre2TF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nombre2TFActionPerformed(evt);
            }
        });
        add(nombre2TF, new org.netbeans.lib.awtextra.AbsoluteConstraints(135, 135, 170, 30));

        apellido1TF.setBackground(new java.awt.Color(63, 191, 168));
        apellido1TF.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        apellido1TF.setForeground(new java.awt.Color(255, 255, 255));
        apellido1TF.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        apellido1TF.setBorder(null);
        apellido1TF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                apellido1TFActionPerformed(evt);
            }
        });
        add(apellido1TF, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 180, 170, 30));

        apellido2TF.setBackground(new java.awt.Color(63, 191, 168));
        apellido2TF.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        apellido2TF.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        apellido2TF.setBorder(null);
        apellido2TF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                apellido2TFActionPerformed(evt);
            }
        });
        add(apellido2TF, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 225, 170, 30));

        tipoSangreCB.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        tipoSangreCB.setForeground(new java.awt.Color(16, 65, 56));
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
        add(tipoSangreCB, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 140, 70, 30));

        tipoAtencionCB.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        tipoAtencionCB.setForeground(new java.awt.Color(16, 65, 56));
        tipoAtencionCB.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Ucim", "Uci" }));
        tipoAtencionCB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tipoAtencionCBActionPerformed(evt);
            }
        });
        add(tipoAtencionCB, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 190, 90, -1));

        regitroL.setFont(new java.awt.Font("Century Gothic", 0, 11)); // NOI18N
        regitroL.setForeground(new java.awt.Color(255, 255, 255));
        regitroL.setText("Registro");
        add(regitroL, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 90, -1, -1));

        fechaL.setFont(new java.awt.Font("Century Gothic", 0, 11)); // NOI18N
        fechaL.setForeground(new java.awt.Color(255, 255, 255));
        fechaL.setText("Fecha");
        add(fechaL, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 120, -1, -1));

        rethusL.setFont(new java.awt.Font("Century Gothic", 0, 11)); // NOI18N
        rethusL.setForeground(new java.awt.Color(255, 255, 255));
        rethusL.setText("ReTHUS");
        add(rethusL, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 150, -1, -1));

        equiposT.setBackground(new java.awt.Color(236, 236, 236));
        equiposT.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        equiposT.setForeground(new java.awt.Color(16, 65, 56));
        equiposT.setModel(new javax.swing.table.DefaultTableModel(
            mostrar(),
            new String [] {
                "ID", "EQUIPO", "CANTIDAD"
            }
        ));
        equiposT.setGridColor(new java.awt.Color(255, 255, 255));
        equiposT.getColumnModel().getColumn(0).setPreferredWidth(2);
        equiposT.getColumnModel().getColumn(2).setPreferredWidth(3);
        jScrollPane1.setViewportView(equiposT);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 300, 300, 160));

        jLabel4.setBackground(new java.awt.Color(255, 255, 255));
        jLabel4.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Equipos necesarios");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 270, -1, -1));

        equiposNecesarios.setBackground(new java.awt.Color(63, 191, 168));

        jCheckBox1.setBackground(new java.awt.Color(63, 191, 168));
        jCheckBox1.setFont(new java.awt.Font("Century Gothic", 0, 11)); // NOI18N
        jCheckBox1.setForeground(new java.awt.Color(255, 255, 255));
        jCheckBox1.setText("Ventiladores");
        jCheckBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox1ActionPerformed(evt);
            }
        });

        jCheckBox2.setBackground(new java.awt.Color(63, 191, 168));
        jCheckBox2.setFont(new java.awt.Font("Century Gothic", 0, 11)); // NOI18N
        jCheckBox2.setForeground(new java.awt.Color(255, 255, 255));
        jCheckBox2.setText("Saturometros");
        jCheckBox2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox2ActionPerformed(evt);
            }
        });

        jCheckBox3.setBackground(new java.awt.Color(63, 191, 168));
        jCheckBox3.setFont(new java.awt.Font("Century Gothic", 0, 11)); // NOI18N
        jCheckBox3.setForeground(new java.awt.Color(255, 255, 255));
        jCheckBox3.setText("Balas de oxigeno");
        jCheckBox3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox3ActionPerformed(evt);
            }
        });

        jCheckBox4.setBackground(new java.awt.Color(63, 191, 168));
        jCheckBox4.setFont(new java.awt.Font("Century Gothic", 0, 11)); // NOI18N
        jCheckBox4.setForeground(new java.awt.Color(255, 255, 255));
        jCheckBox4.setText("monitor cardíaco");
        jCheckBox4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox4ActionPerformed(evt);
            }
        });

        jCheckBox5.setBackground(new java.awt.Color(63, 191, 168));
        jCheckBox5.setFont(new java.awt.Font("Century Gothic", 0, 11)); // NOI18N
        jCheckBox5.setForeground(new java.awt.Color(255, 255, 255));
        jCheckBox5.setText("Bomba de infusión continua");
        jCheckBox5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox5ActionPerformed(evt);
            }
        });

        jCheckBox6.setBackground(new java.awt.Color(63, 191, 168));
        jCheckBox6.setFont(new java.awt.Font("Century Gothic", 0, 11)); // NOI18N
        jCheckBox6.setForeground(new java.awt.Color(255, 255, 255));
        jCheckBox6.setText("Bomba de nutrición");
        jCheckBox6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox6ActionPerformed(evt);
            }
        });

        jCheckBox7.setBackground(new java.awt.Color(63, 191, 168));
        jCheckBox7.setFont(new java.awt.Font("Century Gothic", 0, 11)); // NOI18N
        jCheckBox7.setForeground(new java.awt.Color(255, 255, 255));
        jCheckBox7.setText("aspirador de secreciones");
        jCheckBox7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox7ActionPerformed(evt);
            }
        });

        jCheckBox8.setBackground(new java.awt.Color(63, 191, 168));
        jCheckBox8.setFont(new java.awt.Font("Century Gothic", 0, 11)); // NOI18N
        jCheckBox8.setForeground(new java.awt.Color(255, 255, 255));
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
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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

        add(equiposNecesarios, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 290, 200, -1));

        jLabel5.setBackground(new java.awt.Color(255, 255, 255));
        jLabel5.setFont(new java.awt.Font("Century Gothic", 0, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(16, 65, 56));
        jLabel5.setText("Equipos disponibles");
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 260, -1, -1));

        mensajeUsuario.setFont(new java.awt.Font("DejaVu Sans", 0, 10)); // NOI18N
        mensajeUsuario.setForeground(new java.awt.Color(255, 0, 0));
        add(mensajeUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 91, -1, -1));

        mensajeUsuario1.setFont(new java.awt.Font("DejaVu Sans", 0, 10)); // NOI18N
        mensajeUsuario1.setForeground(new java.awt.Color(255, 0, 0));
        add(mensajeUsuario1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 131, -1, -1));

        mensajeUsuario2.setFont(new java.awt.Font("DejaVu Sans", 0, 10)); // NOI18N
        mensajeUsuario2.setForeground(new java.awt.Color(255, 0, 0));
        add(mensajeUsuario2, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 52, -1, -1));

        mensajeUsuario3.setFont(new java.awt.Font("DejaVu Sans", 0, 10)); // NOI18N
        mensajeUsuario3.setForeground(new java.awt.Color(255, 0, 0));
        add(mensajeUsuario3, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 171, -1, -1));

        mensajeUsuario4.setFont(new java.awt.Font("DejaVu Sans", 0, 10)); // NOI18N
        mensajeUsuario4.setForeground(new java.awt.Color(255, 0, 0));
        add(mensajeUsuario4, new org.netbeans.lib.awtextra.AbsoluteConstraints(384, 52, -1, -1));

        mensajeUsuario5.setFont(new java.awt.Font("DejaVu Sans", 0, 10)); // NOI18N
        mensajeUsuario5.setForeground(new java.awt.Color(255, 0, 0));
        add(mensajeUsuario5, new org.netbeans.lib.awtextra.AbsoluteConstraints(384, 89, -1, -1));

        mensajeUsuario7.setFont(new java.awt.Font("DejaVu Sans", 0, 10)); // NOI18N
        mensajeUsuario7.setForeground(new java.awt.Color(255, 0, 0));
        add(mensajeUsuario7, new org.netbeans.lib.awtextra.AbsoluteConstraints(384, 124, -1, -1));

        buscarB.setForeground(new java.awt.Color(16, 65, 56));
        buscarB.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/Buscar.png"))); // NOI18N
        buscarB.setBorder(null);
        buscarB.setContentAreaFilled(false);
        buscarB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscarBActionPerformed(evt);
            }
        });
        add(buscarB, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 90, -1, 30));

        observacionTF.setBackground(new java.awt.Color(54, 166, 146));
        observacionTF.setColumns(20);
        observacionTF.setFont(new java.awt.Font("Century Gothic", 0, 13)); // NOI18N
        observacionTF.setRows(5);
        observacionTF.setBorder(null);
        add(observacionTF, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 390, 210, -1));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/Ingreso_Paciente.jpg"))); // NOI18N
        add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));
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
        
        PersonalMedico persm = new PersonalMedico();
        PersonalMedicoDAO persmDAO = new PersonalMedicoDAO();
        PacienteDAO pacientedao = new PacienteDAO();
        IngresoPaciente ingresoP = new IngresoPaciente();
        IngresoPacienteDAO ingresoPdao = new IngresoPacienteDAO();
        CamaDAO camadao = new CamaDAO();
        Equipo eqaux;
        EquipoDAO eqdao = new EquipoDAO();
        EquiposUsados equs = new EquiposUsados();
        EquiposUsadosDAO equsdao = new EquiposUsadosDAO();
        Camas camaaux = new Camas();
        ValidarIngresoPaciente validar = new ValidarIngresoPaciente();
        
        persm = persmDAO.leerPorId("1");
        System.out.println(persm.getNombre1());
        
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
        
        
        try {
            
            Integer.parseInt(identificacionTF.getText());
            Paciente pac = pacientedao.leerPorId(identificacionTF.getText());
            if(pac.getNombrePaciente1() != null){
                System.out.println("Paciente guardado en BD");
                paciente = pac;
            
            } else {
                  if (!validar.VerificarLongitudId(identificacionTF.getText())) {
                    mensajeUsuario4.setText("Longitud de identificación incorrecta");
                } else {
                    paciente.setIdPaciente(parseInt(identificacionTF.getText()));
                    mensajeUsuario4.setText("");
                }
                //validar nombre 1
                if (!validar.VerificarLongitudNombre1(nombre1TF.getText())) {
                    mensajeUsuario2.setText("Longitud primer nombre incorrecta");
                } else {
                    paciente.setNombrePaciente1(nombre1TF.getText());
                    mensajeUsuario2.setText("");
                }
                //validar nombre 2 
                if (!validar.VerificarLongitudNombre2(nombre2TF.getText())) {
                    mensajeUsuario.setText("Longitud primer nombre incorrecta");
                } else {
                    paciente.setNombrePaciente2(nombre2TF.getText());
                    mensajeUsuario.setText("");
                }
                //validar apellido 1
                if (!validar.VerificarLongitudApellido1(apellido1TF.getText())) {
                    mensajeUsuario1.setText("Longitud primer nombre incorrecta");
                } else {
                    paciente.setApellidoPaciente1(apellido1TF.getText());
                    mensajeUsuario1.setText("");
                }
                //validar apellido 2
                if (!validar.VerificarLongitudApellido2(apellido2TF.getText())) {
                    mensajeUsuario3.setText("Longitud primer nombre incorrecta");
                } else {
                    paciente.setApellidoPaciente2(apellido2TF.getText());
                    mensajeUsuario3.setText("");
                }
                //validar Tipo de Sangre
                if (!validar.VerificarSelectTipoSangre(tipoSangreCB.getSelectedItem().toString())) {
                    mensajeUsuario5.setText("");
                } else {
                    paciente.setTipoSangre(tipoSangreCB.getSelectedItem().toString());
                    mensajeUsuario5.setText("");
                }
                //validar Tipo de Atención
                if (!validar.VerificarSelectTipoAtencion(tipoAtencionCB.getSelectedItem().toString())) {
                    mensajeUsuario7.setText("");
                } else {

                    mensajeUsuario7.setText("");
                }
                String resultado = validar.VerificarIngresoPaciente_(paciente);
                if ("Datos del paciente ingresados correctamente".equals(resultado)) {
                    pacientedao.crear(paciente);
                    System.out.println("Paciente registrado con éxito en BD");

                }       
              
            }
            
            //VERIFICAR SI LA CAMA ESTÁ DISPONIBLE
            cama = camadao.leerCamasDisp();
            if(tipoAtencionCB.getSelectedItem().toString() == "Ucim"){
                cama = camadao.leerCamasDispTipo("UCIM");
            }
            else if(tipoAtencionCB.getSelectedItem().toString() == "Uci"){
                cama = camadao.leerCamasDispTipo("UCI");
            }
            else{
                cama = camadao.leerCamasDisp();
            }
            
            if(cama.getIdCamas()==0){
                
                System.out.println("NO HAY CAMAS DISPONIBLES");
            
            } else {
                //Tomar fecha
                DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
                LocalDateTime now = LocalDateTime.now();
                String fecha = now.format(dtf);
                System.out.println(fecha);
                
                //Generar Ingreso
                ingresoP.setPaciente(paciente);
                ingresoP.setCama(cama);
                ingresoP.setEstado(true);
                ingresoP.setFecha(fecha);
                ingresoP.setObservacion(observacionTF.getText());
                ingresoP.setPersonalm(persm);
                
                camaaux = cama;
                camaaux.setEstado(true);
                camadao.actualizar(cama, camaaux);
                
                ingresoPdao.crear(ingresoP);
                //CONSULTAR SI LOS EQUIPOS ESTÁN DISPONIBLES
                for(Equipo eq:equipos){
                    equs.setEquipo(eq);
                    equs.setIngresoP(ingresoP);
                    equsdao.crear(equs);
                    eqaux = eq;
                    eqaux.setEstadoEquipo(true);
                    eqdao.actualizar(eq, eqaux);
                }
                System.out.println("INGRESADO CON EXITO");
                //MENSAJE iNGRESO EXITOSO
            JOptionPane.showMessageDialog(null, "Ingreso de paciente exitoso", "", JOptionPane.INFORMATION_MESSAGE);
                DefaultTableModel model = new javax.swing.table.DefaultTableModel(
                    mostrar(),
                    new String [] {
                      "ID", "EQUIPO", "CANTIDAD"
                        }
                    );
                
                equiposT.setModel(model);
            }   
            
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
        Equipo ventilador = new Equipo();
        EquipoDAO eqdao = new EquipoDAO();
        if (jCheckBox1.isSelected()) {
        //    this.validarIngresoPaciente.setAspiradorSecreciones(true);
            ventilador = eqdao.leerEquiposDisp("VENTILADOR MECANICO");
            if(ventilador.getNombreEquipo()!=null){
                equipos.add(ventilador);
            } else {
                System.out.println("VENTILADOR MECANICO NO DISPONIBLE");
            }
            
        } else {
        //    this.validarIngresoPaciente.setAspiradorSecreciones(false);
            equipos.remove(ventilador);
            System.out.println("VENTILADOR REMOVIDO");
        }
    }//GEN-LAST:event_jCheckBox1ActionPerformed

    private void jCheckBox7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox7ActionPerformed
        Equipo aspiradorSec = new Equipo();
        EquipoDAO eqdao = new EquipoDAO();
        if (jCheckBox7.isSelected()) {
            aspiradorSec = eqdao.leerEquiposDisp("ASPIRADOR DE SECRECIONES");
            if(aspiradorSec.getNombreEquipo()!=null){
                equipos.add(aspiradorSec);
            } else {
                System.out.println("ASPIRADOR DE SECRECIONES NO DISPONIBLE");
            }
        } else {
        //    this.validarIngresoPaciente.setBombaInfucionContinua(false);
            equipos.remove(aspiradorSec);
            System.out.println("ASPIRADOR DE SECRECIONES REMOVIDO");
        }
    }//GEN-LAST:event_jCheckBox7ActionPerformed

    private void jCheckBox8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox8ActionPerformed
        Equipo eqIntub= new Equipo();
        EquipoDAO eqdao = new EquipoDAO();
        if (jCheckBox8.isSelected()) {
            eqIntub = eqdao.leerEquiposDisp("EQUIPO DE INTUBACION");
            if(eqIntub.getNombreEquipo()!=null){
                equipos.add(eqIntub);
            } else {
                System.out.println("EQUIPO DE INTUBACION NO DISPONIBLE");
            }
        } else {
        //    this.validarIngresoPaciente.setEquipoIntubacion(false);
            equipos.remove(eqIntub);
            System.out.println("EQUIPO DE INTUBACIÓN REMOVIDO");
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
        Equipo saturometro = new Equipo();
        EquipoDAO eqdao = new EquipoDAO();
        if (jCheckBox2.isSelected()) {
            saturometro = eqdao.leerEquiposDisp("SATUROMETRO");
            if(saturometro.getNombreEquipo()!=null){
                equipos.add(saturometro);
            } else {
                System.out.println("SATUROMETRO NO DISPONIBLE");
            }            
        } else {
            equipos.remove(saturometro);
            System.out.println("SATUROMETRO REMOVIDO");
        }   
    }//GEN-LAST:event_jCheckBox2ActionPerformed

    private void jCheckBox3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox3ActionPerformed
        Equipo balaOxig = new Equipo();
        EquipoDAO eqdao = new EquipoDAO();
        if (jCheckBox3.isSelected()) {
            balaOxig = eqdao.leerEquiposDisp("BALA OXIGENO");
            if(balaOxig.getNombreEquipo()!=null){
                equipos.add(balaOxig);
            } else {
                System.out.println("BALA OXIGENO NO DISPONIBLE");
            }
        } else {
            equipos.remove(balaOxig);
            System.out.println("BALA OXIGENO REMOVIDA");
            //this.validarIngresoPaciente.setBalasOxigeno(false);
        }
    }//GEN-LAST:event_jCheckBox3ActionPerformed

    private void jCheckBox4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox4ActionPerformed
        Equipo monitor = new Equipo();
            EquipoDAO eqdao = new EquipoDAO();
        if (jCheckBox4.isSelected()) {
            monitor = eqdao.leerEquiposDisp("MONITOR");
            if(monitor.getNombreEquipo()!=null){
                equipos.add(monitor);
            } else {
                System.out.println("MONITOR NO DISPONIBLE");
            }
        } else {
            equipos.remove(monitor);
            System.out.println("MONITOR REMOVIDO");
            //this.validarIngresoPaciente.setMonitor(false);
        }
    }//GEN-LAST:event_jCheckBox4ActionPerformed

    private void jCheckBox5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox5ActionPerformed
        Equipo bombaInfC = new Equipo();
        EquipoDAO eqdao = new EquipoDAO();
        if (jCheckBox5.isSelected()) {
            bombaInfC = eqdao.leerEquiposDisp("BOMBA INFUSION CONTINUA");
            if(bombaInfC.getNombreEquipo()!=null){
                equipos.add(bombaInfC);
            } else {
                System.out.println("BOMBA INFUSION CONTINUA NO DISPONIBLE");
            }
        } else {
            equipos.remove(bombaInfC);
            System.out.println("BOMBA INFUSION CONTINUA REMOVIDA");
        }
    }//GEN-LAST:event_jCheckBox5ActionPerformed

    private void jCheckBox6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox6ActionPerformed
            Equipo bombaNutricion = new Equipo();
            EquipoDAO eqdao = new EquipoDAO(); 
        if (jCheckBox6.isSelected()) {
            bombaNutricion = eqdao.leerEquiposDisp("BOMBA NUTRICION ENTERAL");
            if(bombaNutricion.getNombreEquipo()!=null){
                equipos.add(bombaNutricion);
            } else {
                System.out.println("BOMBA NUTRICION ENTERAL NO DISPONIBLE");
            }
        } else {
            equipos.remove(bombaNutricion);
            System.out.println("BOMBA NUTRICION ENTERAL REMOVIDA");
            //this.validarIngresoPaciente.setBombasNutricion(false);
        }
    }//GEN-LAST:event_jCheckBox6ActionPerformed

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
        this.paciente = null;
        this.cama = null;
        this.equipos = null;
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
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel mensajeUsuario;
    private javax.swing.JLabel mensajeUsuario1;
    private javax.swing.JLabel mensajeUsuario2;
    private javax.swing.JLabel mensajeUsuario3;
    private javax.swing.JLabel mensajeUsuario4;
    private javax.swing.JLabel mensajeUsuario5;
    private javax.swing.JLabel mensajeUsuario7;
    private javax.swing.JTextField nombre1TF;
    private javax.swing.JTextField nombre2TF;
    private javax.swing.JTextArea observacionTF;
    private javax.swing.JLabel regitroL;
    private javax.swing.JLabel rethusL;
    private javax.swing.JComboBox<String> tipoAtencionCB;
    private javax.swing.JComboBox<String> tipoSangreCB;
    // End of variables declaration//GEN-END:variables

    //Modelo para jTable
    public String [][] mostrar(){
        EquipoDAO edao = new EquipoDAO();
        List<Equipo> eqs = new ArrayList();
        
        String[] nombres = new String[] {"EQUIPO DE INTUBACION", "SATUROMETRO", "BALA OXIGENO", "MONITOR", "BOMBA INFUSION CONTINUA", "BOMBA NUTRICION ENTERAL", "ASPIRADOR DE SECRECIONES","VENTILADOR MECANICO" };
        for(int i = 0; i < nombres.length; i++){
            Equipo e = new Equipo();
            e.setIdEquipo(i);
            e.setNombreEquipo(nombres[i]);
            eqs.add(e);
          
        }
        
        String[][] matriz=new String[eqs.size()][3];
        for(int i = 0; i<eqs.size(); i++){
            matriz[i][0] = Integer.toString(eqs.get(i).getIdEquipo());
            matriz[i][1] = eqs.get(i).getNombreEquipo();
            matriz[i][2] = Long.toString(edao.leerEq(eqs.get(i).getNombreEquipo()));//10 se debe reemplazar por la consulta SQL
        }
        
        return matriz;
    }
}
