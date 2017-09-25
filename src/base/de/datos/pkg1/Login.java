package base.de.datos.pkg1;

import javax.mail.PasswordAuthentication;
import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;

public class Login extends javax.swing.JFrame {

    String To = "";
    String Mensaje = "";
    Connection myConn = null;
    Statement myStmt = null;

    public Login() {
        System.out.println("hola");
        try {
            myConn = DriverManager.getConnection("jdbc:mysql://localhost:3306/DB_Taller?useSSL=true", "root", "FreePeriods123");
            myStmt = myConn.createStatement();
            System.out.println("conecta");
        } catch (SQLException e) {
            e.printStackTrace();
        }//Fin del try catch

        initComponents();
        this.setTitle("Login");
        this.setLocationRelativeTo(null);
        System.out.println("");
        CargarAutomoviles();
        CargarClientes();
        CargarEmpleados();
        AsignarCarros();
        SepararMecanicosAsesore();
        cb_mantenimiento.setVisible(false);
        cb_reparacion.setVisible(false);

    }//Fin del constructor general

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jd_administador = new javax.swing.JDialog();
        btn_Asesores = new javax.swing.JButton();
        btn_Mecanicos = new javax.swing.JButton();
        lbl_fondo = new javax.swing.JLabel();
        jd_admin_asesores = new javax.swing.JDialog();
        lbl_asess = new javax.swing.JLabel();
        lbl_pnomAes = new javax.swing.JLabel();
        lbl_snomAse = new javax.swing.JLabel();
        lbl_papAse = new javax.swing.JLabel();
        lbl_sapAses = new javax.swing.JLabel();
        tf_primer_nombrea = new javax.swing.JTextField();
        tf_primer_apellidoa = new javax.swing.JTextField();
        tf_segundo_nombrea = new javax.swing.JTextField();
        tf_segundo_apellidoa = new javax.swing.JTextField();
        lbl_numTelAse = new javax.swing.JLabel();
        tf_num_telefonoa = new javax.swing.JTextField();
        btn_asesores_agregar = new javax.swing.JButton();
        btn_asesor_modif = new javax.swing.JButton();
        btn_asesor_eliminar = new javax.swing.JButton();
        lbl_modAses = new javax.swing.JLabel();
        lbl_agrgAse = new javax.swing.JLabel();
        cb_asesor = new javax.swing.JComboBox<>();
        lbl_EliAse = new javax.swing.JLabel();
        cb_asesor_eliminar = new javax.swing.JComboBox<>();
        lbl_idenAse = new javax.swing.JLabel();
        tf_ida = new javax.swing.JTextField();
        lbl_fondoAse = new javax.swing.JLabel();
        jd_admin_mecanicos = new javax.swing.JDialog();
        btn_mecanico_agregar = new javax.swing.JButton();
        lbl_mecanico = new javax.swing.JLabel();
        lbl_papMec = new javax.swing.JLabel();
        btn_mecanico_modif = new javax.swing.JButton();
        btn_asesor_eliminar1 = new javax.swing.JButton();
        lbl_SNomMec = new javax.swing.JLabel();
        lbl_PapMec = new javax.swing.JLabel();
        lbl_ModMec = new javax.swing.JLabel();
        lbl_SApMec = new javax.swing.JLabel();
        lbl_agMec = new javax.swing.JLabel();
        tf_primer_nombre = new javax.swing.JTextField();
        tf_primer_apellido = new javax.swing.JTextField();
        cb_mecanico = new javax.swing.JComboBox<>();
        tf_segundo_nombre = new javax.swing.JTextField();
        lbl_elmMec = new javax.swing.JLabel();
        tf_segundo_apellido = new javax.swing.JTextField();
        lbl_NumTelMec = new javax.swing.JLabel();
        cb_mecanico_eliminar = new javax.swing.JComboBox<>();
        tf_num_telefono = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        tf_id = new javax.swing.JTextField();
        lbl_fondoMec = new javax.swing.JLabel();
        lbl_papMec1 = new javax.swing.JLabel();
        jd_principal_asesor = new javax.swing.JDialog();
        jLabel23 = new javax.swing.JLabel();
        jRadioButton1 = new javax.swing.JRadioButton();
        jd_citas = new javax.swing.JDialog();
        lbl_agreCit = new javax.swing.JLabel();
        lbl_pNom = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        lbl_tipoRep = new javax.swing.JLabel();
        lbl_SnomCi = new javax.swing.JLabel();
        lbl_papCi = new javax.swing.JLabel();
        lbl_sapci = new javax.swing.JLabel();
        tf_primer_nombre_cliente = new javax.swing.JTextField();
        tf_segundo_nombre_cliente = new javax.swing.JTextField();
        tf_primer_apellido_cliente = new javax.swing.JTextField();
        tf_Direccion = new javax.swing.JTextField();
        tf_num_telefono_cita = new javax.swing.JTextField();
        lbl_Estado = new javax.swing.JLabel();
        cb_EstadoAgregarCita = new javax.swing.JComboBox<>();
        lbl_FechaEntrada = new javax.swing.JLabel();
        lbl_FechaEntrega = new javax.swing.JLabel();
        btn_AgregarCita = new javax.swing.JButton();
        btn_ModificarEstadoCita = new javax.swing.JButton();
        jd_entrada = new org.jdesktop.swingx.JXDatePicker();
        jd_entrega = new org.jdesktop.swingx.JXDatePicker();
        lbl_sapci1 = new javax.swing.JLabel();
        tf_segundo_apellido_cliente = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        tf_email_cliente = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        tf_id_cliente_cita = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        cb_clientes = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        cb_automoviles = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        tf_seguimiento = new javax.swing.JTextField();
        sp_hora_citas = new javax.swing.JSpinner();
        rb_mantenimiento = new javax.swing.JRadioButton();
        rb_reparacion = new javax.swing.JRadioButton();
        cb_mantenimiento = new javax.swing.JComboBox<>();
        cb_reparacion = new javax.swing.JComboBox<>();
        lbl_fondoCitas = new javax.swing.JLabel();
        jd_ModificarEstado = new javax.swing.JDialog();
        lbl_modEst = new javax.swing.JLabel();
        lbl_nomClienteCitaMod = new javax.swing.JLabel();
        lbl_EstadoActual = new javax.swing.JLabel();
        cb_modificar_estado_cita = new javax.swing.JComboBox<>();
        txt_EstadoActualCita = new javax.swing.JTextField();
        lbl_NuevoEstado = new javax.swing.JLabel();
        cb_EstadoCitaMod = new javax.swing.JComboBox<>();
        btn_ModificarEstado = new javax.swing.JButton();
        lbl_fondoModEstado = new javax.swing.JLabel();
        jd_automovil = new javax.swing.JDialog();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        tf_placa = new javax.swing.JTextField();
        tf_num_motor = new javax.swing.JTextField();
        tf_modelo = new javax.swing.JFormattedTextField();
        buttonGroup1 = new javax.swing.ButtonGroup();
        lbl_login = new javax.swing.JLabel();
        lbl_user = new javax.swing.JLabel();
        lbl_Password = new javax.swing.JLabel();
        btn_login_ingresar = new javax.swing.JButton();
        txt_login_user = new javax.swing.JTextField();
        txt_login_password = new javax.swing.JPasswordField();
        lbl_Fondo = new javax.swing.JLabel();

        jd_administador.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btn_Asesores.setText("ASESORES");
        btn_Asesores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_AsesoresActionPerformed(evt);
            }
        });
        jd_administador.getContentPane().add(btn_Asesores, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 70, 99, -1));

        btn_Mecanicos.setText("MECANICOS");
        btn_Mecanicos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_MecanicosActionPerformed(evt);
            }
        });
        jd_administador.getContentPane().add(btn_Mecanicos, new org.netbeans.lib.awtextra.AbsoluteConstraints(146, 152, -1, -1));

        lbl_fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Fotos/NaranjaOscuro.jpg"))); // NOI18N
        jd_administador.getContentPane().add(lbl_fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 390, 260));

        jd_admin_asesores.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lbl_asess.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        lbl_asess.setForeground(new java.awt.Color(255, 255, 255));
        lbl_asess.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_asess.setText("Asesores");
        jd_admin_asesores.getContentPane().add(lbl_asess, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 0, -1, -1));

        lbl_pnomAes.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        lbl_pnomAes.setForeground(new java.awt.Color(255, 255, 255));
        lbl_pnomAes.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_pnomAes.setText("Primer Nombre");
        jd_admin_asesores.getContentPane().add(lbl_pnomAes, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, 129, 20));

        lbl_snomAse.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        lbl_snomAse.setForeground(new java.awt.Color(255, 255, 255));
        lbl_snomAse.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_snomAse.setText("Segundo Nombre");
        jd_admin_asesores.getContentPane().add(lbl_snomAse, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 160, 129, -1));

        lbl_papAse.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        lbl_papAse.setForeground(new java.awt.Color(255, 255, 255));
        lbl_papAse.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_papAse.setText("Primer Apellido");
        jd_admin_asesores.getContentPane().add(lbl_papAse, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 200, 120, -1));

        lbl_sapAses.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        lbl_sapAses.setForeground(new java.awt.Color(255, 255, 255));
        lbl_sapAses.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_sapAses.setText("Segundo Apellido");
        jd_admin_asesores.getContentPane().add(lbl_sapAses, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 240, 120, -1));
        jd_admin_asesores.getContentPane().add(tf_primer_nombrea, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 120, 150, -1));
        jd_admin_asesores.getContentPane().add(tf_primer_apellidoa, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 200, 150, -1));
        jd_admin_asesores.getContentPane().add(tf_segundo_nombrea, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 160, 150, -1));
        jd_admin_asesores.getContentPane().add(tf_segundo_apellidoa, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 240, 150, -1));

        lbl_numTelAse.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        lbl_numTelAse.setForeground(new java.awt.Color(255, 255, 255));
        lbl_numTelAse.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_numTelAse.setText("Numero de Telefono");
        jd_admin_asesores.getContentPane().add(lbl_numTelAse, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 280, -1, -1));
        jd_admin_asesores.getContentPane().add(tf_num_telefonoa, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 280, 150, -1));

        btn_asesores_agregar.setText("Agregar");
        btn_asesores_agregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_asesores_agregarActionPerformed(evt);
            }
        });
        jd_admin_asesores.getContentPane().add(btn_asesores_agregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 390, -1, -1));

        btn_asesor_modif.setText("Modificar");
        jd_admin_asesores.getContentPane().add(btn_asesor_modif, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 120, -1, -1));

        btn_asesor_eliminar.setText("Eliminar");
        jd_admin_asesores.getContentPane().add(btn_asesor_eliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 310, -1, -1));

        lbl_modAses.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        lbl_modAses.setForeground(new java.awt.Color(255, 255, 255));
        lbl_modAses.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_modAses.setText("Modificar Asesor");
        jd_admin_asesores.getContentPane().add(lbl_modAses, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 50, -1, -1));

        lbl_agrgAse.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        lbl_agrgAse.setForeground(new java.awt.Color(255, 255, 255));
        lbl_agrgAse.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_agrgAse.setText("Agregar Asesor");
        jd_admin_asesores.getContentPane().add(lbl_agrgAse, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 22, -1, -1));

        jd_admin_asesores.getContentPane().add(cb_asesor, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 80, 214, -1));

        lbl_EliAse.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        lbl_EliAse.setForeground(new java.awt.Color(255, 255, 255));
        lbl_EliAse.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_EliAse.setText("Eliminar Asesor");
        jd_admin_asesores.getContentPane().add(lbl_EliAse, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 230, -1, -1));

        jd_admin_asesores.getContentPane().add(cb_asesor_eliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 270, 214, -1));

        lbl_idenAse.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        lbl_idenAse.setForeground(new java.awt.Color(255, 255, 255));
        lbl_idenAse.setText("ID");
        jd_admin_asesores.getContentPane().add(lbl_idenAse, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 80, -1, -1));
        jd_admin_asesores.getContentPane().add(tf_ida, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 80, 150, -1));

        lbl_fondoAse.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Fotos/NaranjaOscuro.jpg"))); // NOI18N
        lbl_fondoAse.setText("jLabel1");
        jd_admin_asesores.getContentPane().add(lbl_fondoAse, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 720, 440));

        jd_admin_mecanicos.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btn_mecanico_agregar.setText("Agregar");
        btn_mecanico_agregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_mecanico_agregarActionPerformed(evt);
            }
        });
        jd_admin_mecanicos.getContentPane().add(btn_mecanico_agregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 340, -1, -1));

        lbl_mecanico.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        lbl_mecanico.setForeground(new java.awt.Color(255, 255, 255));
        lbl_mecanico.setText("Mecánicos");
        jd_admin_mecanicos.getContentPane().add(lbl_mecanico, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 10, -1, -1));

        lbl_papMec.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        lbl_papMec.setForeground(new java.awt.Color(255, 255, 255));
        lbl_papMec.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_papMec.setText("Primer Nombre");
        jd_admin_mecanicos.getContentPane().add(lbl_papMec, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 120, 120, -1));

        btn_mecanico_modif.setText("Modificar");
        jd_admin_mecanicos.getContentPane().add(btn_mecanico_modif, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 130, -1, -1));

        btn_asesor_eliminar1.setText("Eliminar");
        jd_admin_mecanicos.getContentPane().add(btn_asesor_eliminar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 310, -1, -1));

        lbl_SNomMec.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        lbl_SNomMec.setForeground(new java.awt.Color(255, 255, 255));
        lbl_SNomMec.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_SNomMec.setText("Segundo Nombre");
        jd_admin_mecanicos.getContentPane().add(lbl_SNomMec, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 160, 120, -1));

        lbl_PapMec.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        lbl_PapMec.setForeground(new java.awt.Color(255, 255, 255));
        lbl_PapMec.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_PapMec.setText("Primer Apellido");
        jd_admin_mecanicos.getContentPane().add(lbl_PapMec, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 200, 130, -1));

        lbl_ModMec.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        lbl_ModMec.setForeground(new java.awt.Color(255, 255, 255));
        lbl_ModMec.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_ModMec.setText("Modificar Mecánico");
        jd_admin_mecanicos.getContentPane().add(lbl_ModMec, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 40, -1, -1));

        lbl_SApMec.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        lbl_SApMec.setForeground(new java.awt.Color(255, 255, 255));
        lbl_SApMec.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_SApMec.setText("Segundo Apellido");
        jd_admin_mecanicos.getContentPane().add(lbl_SApMec, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 250, 130, -1));

        lbl_agMec.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        lbl_agMec.setForeground(new java.awt.Color(255, 255, 255));
        lbl_agMec.setText("Agregar Mecánico");
        jd_admin_mecanicos.getContentPane().add(lbl_agMec, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 40, -1, -1));
        jd_admin_mecanicos.getContentPane().add(tf_primer_nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 120, 150, 20));
        jd_admin_mecanicos.getContentPane().add(tf_primer_apellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 200, 150, 20));

        jd_admin_mecanicos.getContentPane().add(cb_mecanico, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 90, 199, -1));
        jd_admin_mecanicos.getContentPane().add(tf_segundo_nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 160, 150, 20));

        lbl_elmMec.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        lbl_elmMec.setForeground(new java.awt.Color(255, 255, 255));
        lbl_elmMec.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_elmMec.setText("Eliminar Mecánico");
        jd_admin_mecanicos.getContentPane().add(lbl_elmMec, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 230, -1, -1));
        jd_admin_mecanicos.getContentPane().add(tf_segundo_apellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 250, 150, 20));

        lbl_NumTelMec.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        lbl_NumTelMec.setForeground(new java.awt.Color(255, 255, 255));
        lbl_NumTelMec.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_NumTelMec.setText("Numero de Telefono");
        jd_admin_mecanicos.getContentPane().add(lbl_NumTelMec, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 300, -1, -1));

        jd_admin_mecanicos.getContentPane().add(cb_mecanico_eliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 270, 199, -1));
        jd_admin_mecanicos.getContentPane().add(tf_num_telefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 300, 150, 20));

        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("ID:");
        jd_admin_mecanicos.getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 90, -1, -1));
        jd_admin_mecanicos.getContentPane().add(tf_id, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 80, 150, -1));

        lbl_fondoMec.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Fotos/NaranjaOscuro.jpg"))); // NOI18N
        jd_admin_mecanicos.getContentPane().add(lbl_fondoMec, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 710, 470));

        lbl_papMec1.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        lbl_papMec1.setForeground(new java.awt.Color(255, 255, 255));
        lbl_papMec1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_papMec1.setText("Primer Nombre");
        jd_admin_mecanicos.getContentPane().add(lbl_papMec1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 120, 120, -1));

        javax.swing.GroupLayout jd_principal_asesorLayout = new javax.swing.GroupLayout(jd_principal_asesor.getContentPane());
        jd_principal_asesor.getContentPane().setLayout(jd_principal_asesorLayout);
        jd_principal_asesorLayout.setHorizontalGroup(
            jd_principal_asesorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jd_principal_asesorLayout.setVerticalGroup(
            jd_principal_asesorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        jLabel23.setText("jLabel23");

        jRadioButton1.setText("jRadioButton1");

        jd_citas.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lbl_agreCit.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        lbl_agreCit.setForeground(new java.awt.Color(255, 255, 255));
        lbl_agreCit.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_agreCit.setText("Citas");
        jd_citas.getContentPane().add(lbl_agreCit, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 10, 150, 40));

        lbl_pNom.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        lbl_pNom.setForeground(new java.awt.Color(255, 255, 255));
        lbl_pNom.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_pNom.setText("Primer Nombre");
        jd_citas.getContentPane().add(lbl_pNom, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 170, -1, -1));

        jLabel1.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Teléfono");
        jd_citas.getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 330, -1, -1));

        lbl_tipoRep.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        lbl_tipoRep.setForeground(new java.awt.Color(255, 255, 255));
        lbl_tipoRep.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_tipoRep.setText("Tipo Reparación");
        jd_citas.getContentPane().add(lbl_tipoRep, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 250, -1, -1));

        lbl_SnomCi.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        lbl_SnomCi.setForeground(new java.awt.Color(255, 255, 255));
        lbl_SnomCi.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_SnomCi.setText("Segundo Nombre");
        jd_citas.getContentPane().add(lbl_SnomCi, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 200, -1, -1));

        lbl_papCi.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        lbl_papCi.setForeground(new java.awt.Color(255, 255, 255));
        lbl_papCi.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_papCi.setText("Primer Apellido");
        jd_citas.getContentPane().add(lbl_papCi, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 230, 120, 20));

        lbl_sapci.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        lbl_sapci.setForeground(new java.awt.Color(255, 255, 255));
        lbl_sapci.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_sapci.setText("Segundo Apellido");
        jd_citas.getContentPane().add(lbl_sapci, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 290, -1, -1));
        jd_citas.getContentPane().add(tf_primer_nombre_cliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 170, 140, -1));
        jd_citas.getContentPane().add(tf_segundo_nombre_cliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 200, 140, -1));
        jd_citas.getContentPane().add(tf_primer_apellido_cliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 230, 140, -1));
        jd_citas.getContentPane().add(tf_Direccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 260, 140, -1));
        jd_citas.getContentPane().add(tf_num_telefono_cita, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 330, 140, -1));

        lbl_Estado.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        lbl_Estado.setForeground(new java.awt.Color(255, 255, 255));
        lbl_Estado.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_Estado.setText("Estado");
        jd_citas.getContentPane().add(lbl_Estado, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 370, -1, -1));

        cb_EstadoAgregarCita.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        cb_EstadoAgregarCita.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "NO INGRESADO", "INGRESADO", "EN REPARACIÓN", "EN MANTENIMIENTO", "PENDIENTE DE REPUESTOS", "LISTO", "AUTO RETIRADO", "CANCELADA" }));
        jd_citas.getContentPane().add(cb_EstadoAgregarCita, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 360, 140, -1));

        lbl_FechaEntrada.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        lbl_FechaEntrada.setForeground(new java.awt.Color(255, 255, 255));
        lbl_FechaEntrada.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_FechaEntrada.setText("Fecha de Entrada");
        jd_citas.getContentPane().add(lbl_FechaEntrada, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 170, -1, -1));

        lbl_FechaEntrega.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        lbl_FechaEntrega.setForeground(new java.awt.Color(255, 255, 255));
        lbl_FechaEntrega.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_FechaEntrega.setText("Fecha de Entrega");
        jd_citas.getContentPane().add(lbl_FechaEntrega, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 210, -1, -1));

        btn_AgregarCita.setText("Agregar Cita");
        btn_AgregarCita.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_AgregarCitaActionPerformed(evt);
            }
        });
        jd_citas.getContentPane().add(btn_AgregarCita, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 420, 120, -1));

        btn_ModificarEstadoCita.setText("Modificar Estado");
        btn_ModificarEstadoCita.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ModificarEstadoCitaActionPerformed(evt);
            }
        });
        jd_citas.getContentPane().add(btn_ModificarEstadoCita, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 420, -1, -1));
        jd_citas.getContentPane().add(jd_entrada, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 170, 200, -1));
        jd_citas.getContentPane().add(jd_entrega, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 210, 200, -1));

        lbl_sapci1.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        lbl_sapci1.setForeground(new java.awt.Color(255, 255, 255));
        lbl_sapci1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_sapci1.setText("Direccion");
        jd_citas.getContentPane().add(lbl_sapci1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 260, -1, -1));
        jd_citas.getContentPane().add(tf_segundo_apellido_cliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 290, 140, -1));

        jLabel3.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Email:");
        jd_citas.getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 370, -1, -1));
        jd_citas.getContentPane().add(tf_email_cliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 370, 140, -1));

        jLabel4.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Id_cliente");
        jd_citas.getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 140, -1, -1));
        jd_citas.getContentPane().add(tf_id_cliente_cita, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 140, 140, -1));

        jLabel5.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Buscar Clientes:");
        jd_citas.getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, -1, -1));

        cb_clientes.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cb_clientesItemStateChanged(evt);
            }
        });
        jd_citas.getContentPane().add(cb_clientes, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 70, 190, -1));

        jLabel6.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Carros del cliente:");
        jd_citas.getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 70, -1, -1));

        jd_citas.getContentPane().add(cb_automoviles, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 70, 200, -1));

        jButton1.setText("Agregar Cliente");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jd_citas.getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 410, -1, -1));

        jButton2.setText("Crear Automovil");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jd_citas.getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 410, -1, -1));

        jButton4.setText("Seleccionar");
        jd_citas.getContentPane().add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 70, -1, -1));

        jLabel10.setFont(new java.awt.Font("DialogInput", 0, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Id de seguimiendo");
        jd_citas.getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 120, -1, -1));
        jd_citas.getContentPane().add(tf_seguimiento, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 120, 140, -1));

        sp_hora_citas.setModel(new javax.swing.SpinnerNumberModel(7, 7, 17, 1));
        jd_citas.getContentPane().add(sp_hora_citas, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 170, -1, -1));

        buttonGroup1.add(rb_mantenimiento);
        rb_mantenimiento.setText("Mantenimiento");
        rb_mantenimiento.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                rb_mantenimientoItemStateChanged(evt);
            }
        });
        jd_citas.getContentPane().add(rb_mantenimiento, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 250, -1, -1));

        buttonGroup1.add(rb_reparacion);
        rb_reparacion.setText("Reparacion");
        rb_reparacion.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                rb_reparacionItemStateChanged(evt);
            }
        });
        jd_citas.getContentPane().add(rb_reparacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 250, -1, -1));

        jd_citas.getContentPane().add(cb_mantenimiento, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 300, -1, -1));

        jd_citas.getContentPane().add(cb_reparacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 300, -1, -1));

        lbl_fondoCitas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Fotos/NaranjaOscuro.jpg"))); // NOI18N
        jd_citas.getContentPane().add(lbl_fondoCitas, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -20, 850, 480));

        jd_ModificarEstado.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lbl_modEst.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        lbl_modEst.setForeground(new java.awt.Color(255, 255, 255));
        lbl_modEst.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_modEst.setText("Modificar Estado de Cita");
        jd_ModificarEstado.getContentPane().add(lbl_modEst, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 20, -1, -1));

        lbl_nomClienteCitaMod.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        lbl_nomClienteCitaMod.setForeground(new java.awt.Color(255, 255, 255));
        lbl_nomClienteCitaMod.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_nomClienteCitaMod.setText("Id Cita:");
        jd_ModificarEstado.getContentPane().add(lbl_nomClienteCitaMod, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 70, -1, -1));

        lbl_EstadoActual.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        lbl_EstadoActual.setForeground(new java.awt.Color(255, 255, 255));
        lbl_EstadoActual.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_EstadoActual.setText("Estado Actual");
        jd_ModificarEstado.getContentPane().add(lbl_EstadoActual, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 180, 120, -1));

        jd_ModificarEstado.getContentPane().add(cb_modificar_estado_cita, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 70, 170, -1));

        txt_EstadoActualCita.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_EstadoActualCita.setEnabled(false);
        jd_ModificarEstado.getContentPane().add(txt_EstadoActualCita, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 180, 170, -1));

        lbl_NuevoEstado.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        lbl_NuevoEstado.setForeground(new java.awt.Color(255, 255, 255));
        lbl_NuevoEstado.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_NuevoEstado.setText("Nuevo Estado");
        jd_ModificarEstado.getContentPane().add(lbl_NuevoEstado, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 180, -1, -1));

        cb_EstadoCitaMod.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "NO INGRESADO", "INGRESADO", "EN REPARACIÓN", "EN MANTENIMIENTO", "PENDIENTE DE REPUESTOS", "LISTO", "AUTO RETIRADO", "CANCELADA" }));
        jd_ModificarEstado.getContentPane().add(cb_EstadoCitaMod, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 180, 180, -1));

        btn_ModificarEstado.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        btn_ModificarEstado.setText("Modificar");
        jd_ModificarEstado.getContentPane().add(btn_ModificarEstado, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 250, -1, -1));

        lbl_fondoModEstado.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Fotos/ColorAzul.jpg"))); // NOI18N
        jd_ModificarEstado.getContentPane().add(lbl_fondoModEstado, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 740, 300));

        jLabel7.setText("Placa");

        jLabel8.setText("Modelo");

        jLabel9.setText("Numero Motor");

        jButton3.setText("Ingresar");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        tf_modelo.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0"))));

        javax.swing.GroupLayout jd_automovilLayout = new javax.swing.GroupLayout(jd_automovil.getContentPane());
        jd_automovil.getContentPane().setLayout(jd_automovilLayout);
        jd_automovilLayout.setHorizontalGroup(
            jd_automovilLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jd_automovilLayout.createSequentialGroup()
                .addGroup(jd_automovilLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jd_automovilLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jd_automovilLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel9)
                            .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(18, 18, 18)
                        .addGroup(jd_automovilLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(tf_placa, javax.swing.GroupLayout.DEFAULT_SIZE, 184, Short.MAX_VALUE)
                            .addComponent(tf_num_motor)
                            .addComponent(tf_modelo)))
                    .addGroup(jd_automovilLayout.createSequentialGroup()
                        .addGap(83, 83, 83)
                        .addComponent(jButton3)))
                .addContainerGap(19, Short.MAX_VALUE))
        );
        jd_automovilLayout.setVerticalGroup(
            jd_automovilLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jd_automovilLayout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(jd_automovilLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(tf_placa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jd_automovilLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(tf_modelo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jd_automovilLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel9)
                    .addComponent(tf_num_motor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jButton3)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lbl_login.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        lbl_login.setForeground(new java.awt.Color(255, 255, 255));
        lbl_login.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_login.setText("LOGIN");
        getContentPane().add(lbl_login, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 30, 100, 50));

        lbl_user.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        lbl_user.setForeground(new java.awt.Color(255, 255, 255));
        lbl_user.setText("USER");
        getContentPane().add(lbl_user, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 130, -1, -1));

        lbl_Password.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        lbl_Password.setForeground(new java.awt.Color(255, 255, 255));
        lbl_Password.setText("PASSWORD");
        getContentPane().add(lbl_Password, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 190, -1, -1));

        btn_login_ingresar.setFont(new java.awt.Font("Dialog", 0, 16)); // NOI18N
        btn_login_ingresar.setText("INGRESAR");
        btn_login_ingresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_login_ingresarActionPerformed(evt);
            }
        });
        getContentPane().add(btn_login_ingresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 260, 120, 30));
        getContentPane().add(txt_login_user, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 130, 120, -1));
        getContentPane().add(txt_login_password, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 190, 120, -1));

        lbl_Fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Fotos/ColorAzul.jpg"))); // NOI18N
        getContentPane().add(lbl_Fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 560, 380));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_login_ingresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_login_ingresarActionPerformed
        String user = txt_login_user.getText();
        String password = txt_login_password.getText();
        if (user.contentEquals("admin") && password.contentEquals("1234")) {
            jd_administador.setModal(true);
            jd_administador.pack();
            jd_administador.setVisible(true);
        }//Fin del if
    }//GEN-LAST:event_btn_login_ingresarActionPerformed

    private void btn_AsesoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_AsesoresActionPerformed
        jd_admin_asesores.setModal(true);
        jd_admin_asesores.pack();
        jd_admin_asesores.setVisible(true);
    }//GEN-LAST:event_btn_AsesoresActionPerformed

    private void btn_MecanicosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_MecanicosActionPerformed
        jd_admin_mecanicos.setModal(true);
        jd_admin_mecanicos.pack();
        jd_admin_mecanicos.setVisible(true);
    }//GEN-LAST:event_btn_MecanicosActionPerformed

    private void btn_ModificarEstadoCitaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ModificarEstadoCitaActionPerformed
        this.jd_ModificarEstado.setTitle("Modificar Estado");
        this.jd_ModificarEstado.pack();
        this.jd_ModificarEstado.setModal(true);
        this.jd_ModificarEstado.setLocationRelativeTo(null);
        this.jd_ModificarEstado.setVisible(true);
    }//GEN-LAST:event_btn_ModificarEstadoCitaActionPerformed

    private void btn_mecanico_agregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_mecanico_agregarActionPerformed
        try {
            // TODO add your handling code here:
            String id_empleado, primer_nombre, segundo_nombre, primer_apellido, segundo_apellido, num_telefono;
            id_empleado = tf_id.getText();
            primer_nombre = tf_primer_nombre.getText();
            segundo_nombre = tf_segundo_nombre.getText();
            primer_apellido = tf_primer_apellido.getText();
            segundo_apellido = tf_segundo_apellido.getText();
            num_telefono = tf_num_telefono.getText();

            String sql = "INSERT INTO empleado " + "(Id_Empleado, Primer_Nombre, Segundo_nombre, Primer_Apellido, Segundo_Apellido, Tel_asignado, Empleado_Id_Asesor)"
                    + "values  ('" + id_empleado + "','" + primer_nombre + "','" + segundo_nombre + "','" + primer_apellido + "','" + segundo_apellido + "','" + num_telefono + "','M1')";
            myStmt.executeUpdate(sql);
            JOptionPane.showMessageDialog(this, "Mecanico Agregado exitosamente");
            tf_id.setText("");
            tf_primer_nombre.setText("");
            tf_segundo_nombre.setText("");
            tf_primer_apellido.setText("");
            tf_segundo_apellido.setText("");
            tf_num_telefono.setText("");
            LLenarMecanicosComboBox();
        } catch (SQLException ex) {
            Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btn_mecanico_agregarActionPerformed

    private void btn_asesores_agregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_asesores_agregarActionPerformed
        try {
            String id_empleado, primer_nombre, segundo_nombre, primer_apellido, segundo_apellido, num_telefono;
            id_empleado = tf_ida.getText();
            primer_nombre = tf_primer_nombrea.getText();
            segundo_nombre = tf_segundo_nombrea.getText();
            primer_apellido = tf_primer_apellidoa.getText();
            segundo_apellido = tf_segundo_apellidoa.getText();
            num_telefono = tf_num_telefonoa.getText();
            String sql = "INSERT INTO empleado " + "(Id_Empleado, Primer_Nombre, Segundo_nombre, Primer_Apellido, Segundo_Apellido, Tel_asignado, Empleado_Id_Asesor)"
                    + "values  ('" + id_empleado + "','" + primer_nombre + "','" + segundo_nombre + "','" + primer_apellido + "','" + segundo_apellido + "','" + num_telefono + "','" + id_empleado + "')";
            myStmt.executeUpdate(sql);
            JOptionPane.showMessageDialog(this, "Asesor Agregado exitosamente");
            tf_id.setText("");
            tf_primer_nombre.setText("");
            tf_segundo_nombre.setText("");
            tf_primer_apellido.setText("");
            tf_segundo_apellido.setText("");
            tf_num_telefono.setText("");
            LLenarAsesoresComboBox();
        } catch (SQLException ex) {
            Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btn_asesores_agregarActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        if (tf_id_cliente_cita.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "El campo id_cliente esta vacio");
        } else {
            jd_automovil.pack();
            jd_automovil.setModal(rootPaneCheckingEnabled);
            jd_automovil.setVisible(true);
        }

    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        try {
            if (cb_clientes.getSelectedItem() instanceof Clientes && tf_id_cliente_cita.getText().equals("")) {
                String placa, modelo, num_motor, id_cliente;
                placa = tf_placa.getText();
                modelo = tf_modelo.getText();
                num_motor = tf_num_motor.getText();
                id_cliente = ((Clientes) cb_clientes.getSelectedItem()).getId_Cliente();
                String sql = "INSERT INTO empleado " + "(Placa, Modelo, Numero_motor, Id_Cliente)"
                        + "values  ('" + placa + "','" + modelo + "','" + num_motor + "','" + id_cliente + "')";
                myStmt.executeUpdate(sql);
                JOptionPane.showMessageDialog(this, "Automovil Agregado exitosamente");
                CargarAutomoviles();
                LLenarAutomovilComboBox(((Clientes) cb_clientes.getSelectedItem()));
            } else if (cb_clientes.getSelectedIndex() == 0 && !tf_id_cliente_cita.getText().equals("")) {
                String placa, modelo, num_motor, id_cliente;
                placa = tf_placa.getText();
                modelo = tf_modelo.getText();
                num_motor = tf_num_motor.getText();
                id_cliente = tf_id_cliente_cita.getText();
                String sql = "INSERT INTO empleado " + "(Placa, Modelo, Numero_motor, Id_Cliente)"
                        + "values  ('" + placa + "','" + modelo + "','" + num_motor + "','" + id_cliente + "')";
                myStmt.executeUpdate(sql);
                JOptionPane.showMessageDialog(this, "Automovil Agregado exitosamente");
            } else {
                JOptionPane.showMessageDialog(this, "llene el campo id_cliente");
            }
            

        } catch (SQLException ex) {
            Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void cb_clientesItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cb_clientesItemStateChanged
        // TODO add your handling code here:
        if (cb_clientes.getSelectedIndex() == 0) {
            tf_id_cliente_cita.setText("");
            tf_primer_nombre_cliente.setText("");
            tf_segundo_nombre_cliente.setText("");
            tf_primer_apellido_cliente.setText("");
            tf_segundo_apellido_cliente.setText("");
            tf_num_telefono_cita.setText("");
            tf_email_cliente.setText("");
            cb_automoviles.setSelectedIndex(0);
        } else {
            tf_id_cliente_cita.setText(((Clientes) cb_clientes.getSelectedItem()).getId_Cliente());
            tf_primer_nombre_cliente.setText(((Clientes) cb_clientes.getSelectedItem()).getPrimer_nombre());
            tf_segundo_nombre_cliente.setText(((Clientes) cb_clientes.getSelectedItem()).getSegundo_nombre());
            tf_primer_apellido_cliente.setText(((Clientes) cb_clientes.getSelectedItem()).getPrimer_apellido());
            tf_segundo_apellido_cliente.setText(((Clientes) cb_clientes.getSelectedItem()).getSegundo_Apellido());
            tf_num_telefono_cita.setText(((Clientes) cb_clientes.getSelectedItem()).getTelefono());
            tf_email_cliente.setText(((Clientes) cb_clientes.getSelectedItem()).getEmail());
            LLenarAutomovilComboBox((Clientes)cb_clientes.getSelectedItem());
        }

    }//GEN-LAST:event_cb_clientesItemStateChanged

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        CrearCliente(tf_id_cliente_cita.getText(), tf_primer_nombre.getText(), tf_segundo_nombre_cliente.getText(), tf_primer_apellido_cliente.getText(), 
                tf_segundo_apellido_cliente.getText(), tf_Direccion.getText(), tf_num_telefono_cita.getText(), tf_email_cliente.getText());
        CargarClientes();
        LLenarClientesComboBox();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btn_AgregarCitaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_AgregarCitaActionPerformed
        // TODO add your handling code here:
        String Id_Cita, Nombre_Cliente, Num_telefono, Tipo_Cita, Fecha_hora_entrada;
        Date Fecha_entrega;
        String Estado, Cliente_Id_Cliente, Id_empleado_cita, Automovil_placa, id_CitaMantenimiento, id_CitaReparacion;
//        String sql = "INSERT INTO cita " + "(Id_Cita, Nombre_Cliente, Num_telefono, Tipo_cita, Fecha_hora_entrada, Fecha_entrega, Estado, Cliente_Id_Cliente, Id_empleado_cita, Automovil_Placa, id_CitaMantenimiento, id_CitaReparacion)"
//                        + "values  ('" + placa + "','" + modelo + "','" + num_motor + "','" + id_cliente + "')";
//                myStmt.executeUpdate(sql);
//                JOptionPane.showMessageDialog(this, "Automovil Agregado exitosamente");
        
    }//GEN-LAST:event_btn_AgregarCitaActionPerformed

    private void rb_mantenimientoItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_rb_mantenimientoItemStateChanged
        // TODO add your handling code here:
        cb_mantenimiento.setVisible(true);
        cb_reparacion.setVisible(false);
    }//GEN-LAST:event_rb_mantenimientoItemStateChanged

    private void rb_reparacionItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_rb_reparacionItemStateChanged
        // TODO add your handling code here:
        cb_mantenimiento.setVisible(false);
        cb_reparacion.setVisible(true);
    }//GEN-LAST:event_rb_reparacionItemStateChanged
    public void SendMail() {
        Properties props = new Properties();
        props.put("mail.smtp.auth", "true");
        props.put("mail.smtp.starttls.enable", "true");
        props.put("mail.smtp.host", "smtp.gmail.com");
        props.put("mail.smtp.port", "587");

        Session session = Session.getInstance(props,
                new javax.mail.Authenticator() {
            @Override
            protected PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication("jordi.mairena@gmail.com", "iexterminator159");
            }
        });

        try {

            Message message = new MimeMessage(session);
            message.setFrom(new InternetAddress("jordi.mairena@gmail.com"));
            message.setRecipients(Message.RecipientType.TO, InternetAddress.parse(To));
            message.setSubject("Informe Sobre la cita");
            message.setText(Mensaje);

            Transport.send(message);
            JOptionPane.showMessageDialog(this, "Su mensaje ha sido enviado");

        } catch (MessagingException e) {
            throw new RuntimeException(e);
        }
    }

    public static void main(String args[]) {
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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    public void CargarClientes() {
        try {
            //llenando ArrayList de Clientes
            Clientes cliente;
            String id_Cliente;
            String Primer_nombre;
            String Segundo_nombre;
            String Primer_apellido;
            String Segundo_Apellido;
            String codigo_seguimiento;
            String Direccion;
            String telefono;
            String email;
            String sql3 = "SELECT * FROM cliente";
            ResultSet rs = myStmt.executeQuery(sql3);
            while (rs.next()) {
                id_Cliente = rs.getString("Id_Cliente");
                Primer_nombre = rs.getString("Primer_Nombre");
                Segundo_nombre = rs.getString("Segundo_Nombre");
                Primer_apellido = rs.getString("Primer_Apellido");
                Segundo_Apellido = rs.getString("Segundo_Apellido");
                codigo_seguimiento = rs.getString("codigo_seguimiento");
                Direccion = rs.getString("Direccion");
                telefono = rs.getString("Num_telefono");
                email = rs.getString("email");
                cliente = new Clientes(id_Cliente, Primer_nombre, Segundo_nombre, Primer_apellido, Segundo_Apellido, codigo_seguimiento, Direccion, telefono, email);
                clientes.add(cliente);
            }
        } catch (SQLException ex) {
            Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void CargarEmpleados() {
        try {
            //llenando ArrayList de empleados
            Empleado combo;
            String empleado_id = "";
            String id_empleado;
            String primer_nombre;
            String segundo_nombre;
            String primer_apellido;
            String segundo_apellido;
            String num_telefono;
            String sql1 = "SELECT * FROM empleado";
            ResultSet rs = myStmt.executeQuery(sql1);
            while (rs.next()) {
                id_empleado = rs.getString("Id_Empleado");
                primer_nombre = rs.getString("Primer_Nombre");
                segundo_nombre = rs.getString("Segundo_Nombre");
                primer_apellido = rs.getString("Primer_Apellido");
                segundo_apellido = rs.getString("Segundo_Apellido");
                num_telefono = rs.getString("Tel_asignado");
                empleado_id = rs.getString("Empleado_Id_Asesor");
                combo = new Empleado(id_empleado, empleado_id, primer_nombre, segundo_nombre, primer_apellido, segundo_apellido, num_telefono);
                empleados.add(combo);
            }
        } catch (SQLException ex) {
            Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void CargarAutomoviles() {
        try {
            //llenando ArrayList de Automovil
            Automovil auto;
            String Placa;
            String modelo;
            int num_motor;
            String id_cliente;
            String sql2 = "SELECT * FROM automovil";
            ResultSet rs = myStmt.executeQuery(sql2);
            while (rs.next()) {
                Placa = rs.getNString("Placa");
                modelo = rs.getString("Modelo");
                num_motor = rs.getInt("Numero_motor");
                id_cliente = rs.getString("Cliente_Id_Cliente");
                auto = new Automovil(Placa, modelo, num_motor, id_cliente);
                automoviles.add(auto);
            }
        } catch (SQLException ex) {
            Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public void AsignarCarros(){
        for (int i = 0; i < clientes.size(); i++) {
            for (int j = 0; j < automoviles.size(); j++) {
                if (clientes.get(i).getId_Cliente().equals(automoviles.get(j).getId_cliente())) {
                    clientes.get(i).setCarros(automoviles.get(j));
                }
            }
        }
    }

    public void LLenarAsesoresComboBox() {
        DefaultComboBoxModel model = new DefaultComboBoxModel();
        model.addElement("--Seleccione un Asesor--");
        for (int i = 0; i < asesores.size(); i++) {
            model.addElement(asesores.get(i));
        }
        cb_asesor.setModel(model);
        cb_asesor_eliminar.setModel(model);
    }
    public void LLenarClientesComboBox(){
        DefaultComboBoxModel model = new DefaultComboBoxModel();
        model.addElement("--Seleccione un Cliente--");
        for (int i = 0; i < clientes.size(); i++) {
            model.addElement(clientes.get(i));
        }
        cb_clientes.setModel(model);
    }
    public void LLenarMecanicosComboBox() {
        DefaultComboBoxModel model = new DefaultComboBoxModel();
        model.addElement("--Seleccione un Mecanico--");
        for (int i = 0; i < mecanicos.size(); i++) {
            model.addElement(mecanicos.get(i));
        }
        cb_mecanico.setModel(model);
        cb_mecanico_eliminar.setModel(model);
    }
    public void LLenarAutomovilComboBox(Clientes cliente){
        DefaultComboBoxModel model = new DefaultComboBoxModel();
        model.addElement("--Seleccione un Automovil--");
        for (int i = 0; i < cliente.getCarros().size(); i++) {
            model.addElement(cliente.getCarros().get(i));
        }
        cb_automoviles.setModel(model);
    }
    public void CargarMantenimiento(){
        try {
            //llenando cb_mantenimiento
            String idCitaMantenimiento;
            String tipo_mantenimiento;
            String sql2 = "SELECT * FROM mantenimiento";
            ResultSet rs = myStmt.executeQuery(sql2);
            DefaultComboBoxModel model = new DefaultComboBoxModel();
            while (rs.next()) {
                idCitaMantenimiento = rs.getNString("Placa");
                tipo_mantenimiento = rs.getString("Modelo");
                model.addElement(tipo_mantenimiento);
            }
          cb_mantenimiento.setModel(model);  
        } catch (SQLException ex) {
            Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public void CargarReparacion(){
        try {
            //llenando cb_mantenimiento
            String idCitaReparacion;
            String tipo_reparacion;
            String sql2 = "SELECT * FROM reparacion";
            ResultSet rs = myStmt.executeQuery(sql2);
            DefaultComboBoxModel model = new DefaultComboBoxModel();
            while (rs.next()) {
                idCitaReparacion = rs.getNString("Placa");
                tipo_reparacion = rs.getString("Modelo");
                model.addElement(tipo_reparacion);
            }
          cb_reparacion.setModel(model);  
        } catch (SQLException ex) {
            Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public void SepararMecanicosAsesore() {
        //separando los mecanicos y asesores
        for (int i = 0; i < empleados.size(); i++) {
            if (empleados.get(i).getId_asesor().equals("M1")) {
                mecanicos.add(empleados.get(i));
            } else {
                asesores.add(empleados.get(i));
            }
        }
    }

    public void CrearCliente(String Id_Cliente, String Primer_Nombre, String Segundo_Nombre, String Primer_Apellido, String Segundo_Apellido, String Direccion, 
            String Num_telefono, String email) {
        try (PreparedStatement pstm = myConn.prepareStatement("{call INSERTAR_CLIENTES (?,?,?,?,?,?,?,?)}")) {
            pstm.setString(1, Id_Cliente);
            pstm.setString(2, Primer_Nombre);
            pstm.setString(3, Segundo_Nombre);
            pstm.setString(4, Primer_Apellido);
            pstm.setString(5, Segundo_Apellido);
            pstm.setString(6, Direccion);
            pstm.setString(7, Num_telefono);
            pstm.setString(8, email);
            ResultSet rs = pstm.executeQuery();
            while (rs.next()) {
                System.out.println(rs.getString("Id_Cliente"));
            }
        } catch (SQLException ex) {
            Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void EliminarCliente(String Id_Cliente) {
        try (PreparedStatement pstm = myConn.prepareStatement("{call ELIMINAR_CLIENTES (?)}")) {
            pstm.setString(1, Id_Cliente);
            pstm.executeQuery();
        } catch (SQLException ex) {
            Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void ModificarCliente(String Id_Cliente, String Primer_Nombre, String Segundo_Nombre, String Primer_Apellido, String Segundo_Apellido, String Direccion, String Num_telefono, String email) {
        try (PreparedStatement pstm = myConn.prepareStatement("{call MODIFICAR_CLIENTES (?,?,?,?,?,?,?,?)}")) {
            pstm.setString(1, Id_Cliente);
            pstm.setString(2, Primer_Nombre);
            pstm.setString(3, Segundo_Nombre);
            pstm.setString(4, Primer_Apellido);
            pstm.setString(5, Segundo_Apellido);
            pstm.setString(6, Direccion);
            pstm.setString(7, Num_telefono);
            pstm.setString(8, email);
            ResultSet rs = pstm.executeQuery();
            while (rs.next()) {
                System.out.println(rs.getString("Id_Cliente"));
            }
        } catch (SQLException ex) {
            Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
        }
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_AgregarCita;
    private javax.swing.JButton btn_Asesores;
    private javax.swing.JButton btn_Mecanicos;
    private javax.swing.JButton btn_ModificarEstado;
    private javax.swing.JButton btn_ModificarEstadoCita;
    private javax.swing.JButton btn_asesor_eliminar;
    private javax.swing.JButton btn_asesor_eliminar1;
    private javax.swing.JButton btn_asesor_modif;
    private javax.swing.JButton btn_asesores_agregar;
    private javax.swing.JButton btn_login_ingresar;
    private javax.swing.JButton btn_mecanico_agregar;
    private javax.swing.JButton btn_mecanico_modif;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JComboBox<String> cb_EstadoAgregarCita;
    private javax.swing.JComboBox<String> cb_EstadoCitaMod;
    private javax.swing.JComboBox<String> cb_asesor;
    private javax.swing.JComboBox<String> cb_asesor_eliminar;
    private javax.swing.JComboBox<String> cb_automoviles;
    private javax.swing.JComboBox<String> cb_clientes;
    private javax.swing.JComboBox<String> cb_mantenimiento;
    private javax.swing.JComboBox<String> cb_mecanico;
    private javax.swing.JComboBox<String> cb_mecanico_eliminar;
    private javax.swing.JComboBox<String> cb_modificar_estado_cita;
    private javax.swing.JComboBox<String> cb_reparacion;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JDialog jd_ModificarEstado;
    private javax.swing.JDialog jd_admin_asesores;
    private javax.swing.JDialog jd_admin_mecanicos;
    private javax.swing.JDialog jd_administador;
    private javax.swing.JDialog jd_automovil;
    private javax.swing.JDialog jd_citas;
    private org.jdesktop.swingx.JXDatePicker jd_entrada;
    private org.jdesktop.swingx.JXDatePicker jd_entrega;
    private javax.swing.JDialog jd_principal_asesor;
    private javax.swing.JLabel lbl_EliAse;
    private javax.swing.JLabel lbl_Estado;
    private javax.swing.JLabel lbl_EstadoActual;
    private javax.swing.JLabel lbl_FechaEntrada;
    private javax.swing.JLabel lbl_FechaEntrega;
    private javax.swing.JLabel lbl_Fondo;
    private javax.swing.JLabel lbl_ModMec;
    private javax.swing.JLabel lbl_NuevoEstado;
    private javax.swing.JLabel lbl_NumTelMec;
    private javax.swing.JLabel lbl_PapMec;
    private javax.swing.JLabel lbl_Password;
    private javax.swing.JLabel lbl_SApMec;
    private javax.swing.JLabel lbl_SNomMec;
    private javax.swing.JLabel lbl_SnomCi;
    private javax.swing.JLabel lbl_agMec;
    private javax.swing.JLabel lbl_agreCit;
    private javax.swing.JLabel lbl_agrgAse;
    private javax.swing.JLabel lbl_asess;
    private javax.swing.JLabel lbl_elmMec;
    private javax.swing.JLabel lbl_fondo;
    private javax.swing.JLabel lbl_fondoAse;
    private javax.swing.JLabel lbl_fondoCitas;
    private javax.swing.JLabel lbl_fondoMec;
    private javax.swing.JLabel lbl_fondoModEstado;
    private javax.swing.JLabel lbl_idenAse;
    private javax.swing.JLabel lbl_login;
    private javax.swing.JLabel lbl_mecanico;
    private javax.swing.JLabel lbl_modAses;
    private javax.swing.JLabel lbl_modEst;
    private javax.swing.JLabel lbl_nomClienteCitaMod;
    private javax.swing.JLabel lbl_numTelAse;
    private javax.swing.JLabel lbl_pNom;
    private javax.swing.JLabel lbl_papAse;
    private javax.swing.JLabel lbl_papCi;
    private javax.swing.JLabel lbl_papMec;
    private javax.swing.JLabel lbl_papMec1;
    private javax.swing.JLabel lbl_pnomAes;
    private javax.swing.JLabel lbl_sapAses;
    private javax.swing.JLabel lbl_sapci;
    private javax.swing.JLabel lbl_sapci1;
    private javax.swing.JLabel lbl_snomAse;
    private javax.swing.JLabel lbl_tipoRep;
    private javax.swing.JLabel lbl_user;
    private javax.swing.JRadioButton rb_mantenimiento;
    private javax.swing.JRadioButton rb_reparacion;
    private javax.swing.JSpinner sp_hora_citas;
    private javax.swing.JTextField tf_Direccion;
    private javax.swing.JTextField tf_email_cliente;
    private javax.swing.JTextField tf_id;
    private javax.swing.JTextField tf_id_cliente_cita;
    private javax.swing.JTextField tf_ida;
    private javax.swing.JFormattedTextField tf_modelo;
    private javax.swing.JTextField tf_num_motor;
    private javax.swing.JTextField tf_num_telefono;
    private javax.swing.JTextField tf_num_telefono_cita;
    private javax.swing.JTextField tf_num_telefonoa;
    private javax.swing.JTextField tf_placa;
    private javax.swing.JTextField tf_primer_apellido;
    private javax.swing.JTextField tf_primer_apellido_cliente;
    private javax.swing.JTextField tf_primer_apellidoa;
    private javax.swing.JTextField tf_primer_nombre;
    private javax.swing.JTextField tf_primer_nombre_cliente;
    private javax.swing.JTextField tf_primer_nombrea;
    private javax.swing.JTextField tf_seguimiento;
    private javax.swing.JTextField tf_segundo_apellido;
    private javax.swing.JTextField tf_segundo_apellido_cliente;
    private javax.swing.JTextField tf_segundo_apellidoa;
    private javax.swing.JTextField tf_segundo_nombre;
    private javax.swing.JTextField tf_segundo_nombre_cliente;
    private javax.swing.JTextField tf_segundo_nombrea;
    private javax.swing.JTextField txt_EstadoActualCita;
    private javax.swing.JPasswordField txt_login_password;
    private javax.swing.JTextField txt_login_user;
    // End of variables declaration//GEN-END:variables
    ArrayList<Empleado> empleados = new ArrayList();
    ArrayList<Empleado> mecanicos = new ArrayList();
    ArrayList<Empleado> asesores = new ArrayList();
    ArrayList<Automovil> automoviles = new ArrayList();
    ArrayList<Clientes> clientes = new ArrayList();
}//FIn de la clase
