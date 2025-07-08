/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package frm;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import java.util.Date;
/**
 *
 * @author Usuario
 */
public class VerGuias extends javax.swing.JFrame {
    
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(VerGuias.class.getName());
DefaultTableModel modelo;
    private static boolean ga = false;
    /**
     * Creates new form VerGuias
     */
    public VerGuias() {
        initComponents();
        setLocationRelativeTo(null);
        mtd_prepararTabla();
        cargarDatosDesdeArchivo();
        txtEdadAndres.setVisible(false);
        txtEdadDavid.setVisible(false);
        txtEdadGabriela.setVisible(false);
        txtEdadKarla.setVisible(false);
        txtEdadSantiago.setVisible(false);
        txtEspAndres.setVisible(false);
        txtEspDavid.setVisible(false);
        txtEspGabriela.setVisible(false);
        txtEspKarla.setVisible(false);
        txtEspSantiago.setVisible(false);
        txtExpAndres.setVisible(false);
        txtExpDavid.setVisible(false);
        txtExpGabriela.setVisible(false);
        txtExpKarla.setVisible(false);
        txtExpSantiago.setVisible(false);
        txtIdiomaAndres.setVisible(false);
        txtIdiomaDavid.setVisible(false);
        txtIdiomaGabriela.setVisible(false);
        txtIdiomaKarla.setVisible(false);
        txtIdiomaSantiago.setVisible(false);
        txtPresentacionAndres1.setVisible(false);
        txtPresentacionAndres2.setVisible(false);
        txtPresentacionAndres3.setVisible(false);
        txtPresentacionAndres4.setVisible(false);
        txtPresentacionDavid1.setVisible(false);
        txtPresentacionDavid2.setVisible(false);
        txtPresentacionDavid3.setVisible(false);
        txtPresentacionGabriela1.setVisible(false);
        txtPresentacionGabriela2.setVisible(false);
        txtPresentacionGabriela3.setVisible(false);
        txtPresentacionKarla1.setVisible(false);
        txtPresentacionKarla2.setVisible(false);
        txtPresentacionKarla3.setVisible(false);
        txtPresentacionSantiago1.setVisible(false);
        txtPresentacionSantiago2.setVisible(false);
        txtPresentacionSantiago3.setVisible(false);
    }

     private void mtd_prepararTabla() {
        String titulos[] = {"Guia", "Fecha de inicio", "Fecha de fin"};
        modelo = new DefaultTableModel(null, titulos);
        tablita.setModel(modelo);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btnPrincipio = new javax.swing.JButton();
        btnRegresar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        cbGuias = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        txtEdadSantiago = new javax.swing.JLabel();
        txtEdadAndres = new javax.swing.JLabel();
        txtEdadKarla = new javax.swing.JLabel();
        txtEdadDavid = new javax.swing.JLabel();
        txtEdadGabriela = new javax.swing.JLabel();
        txtExpSantiago = new javax.swing.JLabel();
        txtExpAndres = new javax.swing.JLabel();
        txtExpKarla = new javax.swing.JLabel();
        txtExpDavid = new javax.swing.JLabel();
        txtExpGabriela = new javax.swing.JLabel();
        txtIdiomaSantiago = new javax.swing.JLabel();
        txtIdiomaAndres = new javax.swing.JLabel();
        txtIdiomaKarla = new javax.swing.JLabel();
        txtIdiomaDavid = new javax.swing.JLabel();
        txtIdiomaGabriela = new javax.swing.JLabel();
        txtEspSantiago = new javax.swing.JLabel();
        txtEspAndres = new javax.swing.JLabel();
        txtEspKarla = new javax.swing.JLabel();
        txtEspDavid = new javax.swing.JLabel();
        txtEspGabriela = new javax.swing.JLabel();
        txtPresentacionAndres4 = new javax.swing.JLabel();
        txtPresentacionAndres1 = new javax.swing.JLabel();
        txtPresentacionAndres2 = new javax.swing.JLabel();
        txtPresentacionAndres3 = new javax.swing.JLabel();
        txtPresentacionKarla3 = new javax.swing.JLabel();
        txtPresentacionKarla1 = new javax.swing.JLabel();
        txtPresentacionKarla2 = new javax.swing.JLabel();
        txtPresentacionSantiago3 = new javax.swing.JLabel();
        txtPresentacionDavid1 = new javax.swing.JLabel();
        txtPresentacionDavid2 = new javax.swing.JLabel();
        txtPresentacionDavid3 = new javax.swing.JLabel();
        txtPresentacionGabriela1 = new javax.swing.JLabel();
        txtPresentacionGabriela2 = new javax.swing.JLabel();
        txtPresentacionGabriela3 = new javax.swing.JLabel();
        txtPresentacionSantiago1 = new javax.swing.JLabel();
        txtPresentacionSantiago2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        dateInicioViaje = new com.toedter.calendar.JDateChooser();
        dateFinViaje = new com.toedter.calendar.JDateChooser();
        btnEliminarRegistroContrato = new javax.swing.JButton();
        btnContratarGuia = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablita = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnPrincipio.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnPrincipio.setText("Ir a la página principal");
        btnPrincipio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPrincipioActionPerformed(evt);
            }
        });
        jPanel1.add(btnPrincipio, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 170, 50));

        btnRegresar.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnRegresar.setText("Atrás");
        btnRegresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegresarActionPerformed(evt);
            }
        });
        jPanel1.add(btnRegresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 410, 70, 60));

        jLabel2.setFont(new java.awt.Font("Segoe UI Black", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Ver Guías");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 10, -1, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI Variable", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Fecha de fin del viaje");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 330, -1, -1));

        cbGuias.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccionar", "Andrés Jaramillo Vélez", "Karla Torres Ordóñez", "David Cordero Mera", "Gabriela Rojas Cabrera", "Santiago Llivisupa Guamán", " ", " ", " " }));
        cbGuias.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbGuiasActionPerformed(evt);
            }
        });
        jPanel1.add(cbGuias, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 90, -1, -1));

        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Elija el guía del que desea ver la información, puede realizar la contratación del mismo fácil y rápido.");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 60, 540, -1));

        txtEdadSantiago.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txtEdadSantiago.setForeground(new java.awt.Color(255, 255, 255));
        txtEdadSantiago.setText("Edad: 34 años");
        jPanel1.add(txtEdadSantiago, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 120, -1, 20));

        txtEdadAndres.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txtEdadAndres.setForeground(new java.awt.Color(255, 255, 255));
        txtEdadAndres.setText("Edad: 38 años");
        jPanel1.add(txtEdadAndres, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 120, -1, -1));

        txtEdadKarla.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txtEdadKarla.setForeground(new java.awt.Color(255, 255, 255));
        txtEdadKarla.setText("Edad: 32 años");
        jPanel1.add(txtEdadKarla, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 120, -1, -1));

        txtEdadDavid.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txtEdadDavid.setForeground(new java.awt.Color(255, 255, 255));
        txtEdadDavid.setText("Edad: 45 años");
        jPanel1.add(txtEdadDavid, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 120, -1, -1));

        txtEdadGabriela.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txtEdadGabriela.setForeground(new java.awt.Color(255, 255, 255));
        txtEdadGabriela.setText("Edad: 29 años");
        jPanel1.add(txtEdadGabriela, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 120, -1, 20));

        txtExpSantiago.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txtExpSantiago.setForeground(new java.awt.Color(255, 255, 255));
        txtExpSantiago.setText("Experiencia: 10 años en rutas culturales");
        jPanel1.add(txtExpSantiago, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 140, -1, -1));

        txtExpAndres.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txtExpAndres.setForeground(new java.awt.Color(255, 255, 255));
        txtExpAndres.setText("Experiencia: 12 años como guía certificado");
        jPanel1.add(txtExpAndres, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 140, -1, -1));

        txtExpKarla.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txtExpKarla.setForeground(new java.awt.Color(255, 255, 255));
        txtExpKarla.setText("Experiencia: 8 años en turismo comunitario");
        jPanel1.add(txtExpKarla, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 140, -1, -1));

        txtExpDavid.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txtExpDavid.setForeground(new java.awt.Color(255, 255, 255));
        txtExpDavid.setText("Experiencia: 20 años como guía nacional");
        jPanel1.add(txtExpDavid, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 140, -1, -1));

        txtExpGabriela.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txtExpGabriela.setForeground(new java.awt.Color(255, 255, 255));
        txtExpGabriela.setText("Experiencia: 6 años");
        jPanel1.add(txtExpGabriela, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 140, -1, -1));

        txtIdiomaSantiago.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txtIdiomaSantiago.setForeground(new java.awt.Color(255, 255, 255));
        txtIdiomaSantiago.setText("Idiomas: Español, kichwa, inglés básico");
        jPanel1.add(txtIdiomaSantiago, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 160, -1, -1));

        txtIdiomaAndres.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txtIdiomaAndres.setForeground(new java.awt.Color(255, 255, 255));
        txtIdiomaAndres.setText("Idiomas: Español, inglés intermedio");
        jPanel1.add(txtIdiomaAndres, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 160, -1, -1));

        txtIdiomaKarla.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txtIdiomaKarla.setForeground(new java.awt.Color(255, 255, 255));
        txtIdiomaKarla.setText("Idiomas: Español, inglés fluido");
        jPanel1.add(txtIdiomaKarla, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 160, -1, -1));

        txtIdiomaDavid.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txtIdiomaDavid.setForeground(new java.awt.Color(255, 255, 255));
        txtIdiomaDavid.setText("Idiomas: Español, inglés, francés");
        jPanel1.add(txtIdiomaDavid, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 160, -1, -1));

        txtIdiomaGabriela.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txtIdiomaGabriela.setForeground(new java.awt.Color(255, 255, 255));
        txtIdiomaGabriela.setText("Idiomas: Español, inglés, alemán");
        jPanel1.add(txtIdiomaGabriela, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 160, -1, -1));

        txtEspSantiago.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txtEspSantiago.setForeground(new java.awt.Color(255, 255, 255));
        txtEspSantiago.setText("Especialidad: Patrimonio indígena, rutas andinas, rituales ancestrales");
        jPanel1.add(txtEspSantiago, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 180, -1, -1));

        txtEspAndres.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txtEspAndres.setForeground(new java.awt.Color(255, 255, 255));
        txtEspAndres.setText("Especialidad: Centros históricos, rutas arquitectónicas, historia local");
        jPanel1.add(txtEspAndres, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 180, -1, -1));

        txtEspKarla.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txtEspKarla.setForeground(new java.awt.Color(255, 255, 255));
        txtEspKarla.setText("Especialidad: Turismo rural, tradiciones, gastronomía cuencana");
        jPanel1.add(txtEspKarla, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 180, -1, -1));

        txtEspDavid.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txtEspDavid.setForeground(new java.awt.Color(255, 255, 255));
        txtEspDavid.setText("Especialidad: Excursiones naturales, Cajas, turismo fotográfico");
        jPanel1.add(txtEspDavid, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 180, -1, -1));

        txtEspGabriela.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txtEspGabriela.setForeground(new java.awt.Color(255, 255, 255));
        txtEspGabriela.setText("Especialidad: Arte moderno, museos, tours familiares");
        jPanel1.add(txtEspGabriela, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 180, -1, -1));

        txtPresentacionAndres4.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        txtPresentacionAndres4.setForeground(new java.awt.Color(255, 255, 255));
        txtPresentacionAndres4.setText("la buena conversación.");
        jPanel1.add(txtPresentacionAndres4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 270, -1, 20));

        txtPresentacionAndres1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        txtPresentacionAndres1.setForeground(new java.awt.Color(255, 255, 255));
        txtPresentacionAndres1.setText("Soy cuencano de corazón, y me apasiona mostrar la riqueza patrimonial de mi ciudad. ");
        jPanel1.add(txtPresentacionAndres1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 210, -1, 20));

        txtPresentacionAndres2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        txtPresentacionAndres2.setForeground(new java.awt.Color(255, 255, 255));
        txtPresentacionAndres2.setText("Conmigo recorrerás las iglesias, museos y rincones más auténticos del centro histórico,");
        jPanel1.add(txtPresentacionAndres2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 230, -1, 20));

        txtPresentacionAndres3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        txtPresentacionAndres3.setForeground(new java.awt.Color(255, 255, 255));
        txtPresentacionAndres3.setText("declarado Patrimonio de la Humanidad. Ideal para quienes aman el arte, la historia y");
        jPanel1.add(txtPresentacionAndres3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 250, -1, 20));

        txtPresentacionKarla3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        txtPresentacionKarla3.setForeground(new java.awt.Color(255, 255, 255));
        txtPresentacionKarla3.setText("y la calidez de los mercados locales. Experiencias auténticas, vivencias inolvidables.");
        jPanel1.add(txtPresentacionKarla3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 250, -1, 20));

        txtPresentacionKarla1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        txtPresentacionKarla1.setForeground(new java.awt.Color(255, 255, 255));
        txtPresentacionKarla1.setText("Si quieres conocer Cuenca desde las vivencias de su gente, acompáñame a comunidades");
        jPanel1.add(txtPresentacionKarla1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 210, -1, 20));

        txtPresentacionKarla2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        txtPresentacionKarla2.setForeground(new java.awt.Color(255, 255, 255));
        txtPresentacionKarla2.setText("rurales donde aprenderás sobre el tejido de la paja toquilla, la elaboración de cascaritas");
        jPanel1.add(txtPresentacionKarla2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 230, -1, 20));

        txtPresentacionSantiago3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        txtPresentacionSantiago3.setForeground(new java.awt.Color(255, 255, 255));
        txtPresentacionSantiago3.setText("buscan un turismo consciente y respetuoso de las raíces del Ecuador.");
        jPanel1.add(txtPresentacionSantiago3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 250, -1, 20));

        txtPresentacionDavid1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        txtPresentacionDavid1.setForeground(new java.awt.Color(255, 255, 255));
        txtPresentacionDavid1.setText("Soy guía certificado por el Ministerio de Turismo. Mis rutas están diseñadas para que");
        jPanel1.add(txtPresentacionDavid1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 210, -1, 20));

        txtPresentacionDavid2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        txtPresentacionDavid2.setForeground(new java.awt.Color(255, 255, 255));
        txtPresentacionDavid2.setText("conectes con la naturaleza andina: caminatas en el Parque Nacional Cajas, avistamiento");
        jPanel1.add(txtPresentacionDavid2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 230, -1, 20));

        txtPresentacionDavid3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        txtPresentacionDavid3.setForeground(new java.awt.Color(255, 255, 255));
        txtPresentacionDavid3.setText("de aves, fotografía de paisajes. Ideal para aventureros y amantes de la biodiversidad.");
        jPanel1.add(txtPresentacionDavid3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 250, -1, 20));

        txtPresentacionGabriela1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        txtPresentacionGabriela1.setForeground(new java.awt.Color(255, 255, 255));
        txtPresentacionGabriela1.setText("Estudié Historia del Arte y me encanta guiar familias y grupos escolares por los museos");
        jPanel1.add(txtPresentacionGabriela1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 210, -1, 20));

        txtPresentacionGabriela2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        txtPresentacionGabriela2.setForeground(new java.awt.Color(255, 255, 255));
        txtPresentacionGabriela2.setText("más destacados de Cuenca, como el de Arte Moderno o Remigio Crespo. También realizo");
        jPanel1.add(txtPresentacionGabriela2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 230, -1, 20));

        txtPresentacionGabriela3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        txtPresentacionGabriela3.setForeground(new java.awt.Color(255, 255, 255));
        txtPresentacionGabriela3.setText("tours interactivos para niños y adultos mayores.");
        jPanel1.add(txtPresentacionGabriela3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 250, -1, 20));

        txtPresentacionSantiago1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        txtPresentacionSantiago1.setForeground(new java.awt.Color(255, 255, 255));
        txtPresentacionSantiago1.setText("Como parte de una comunidad kichwa, ofrezco tours distintos: rituales del Inti Raimy,");
        jPanel1.add(txtPresentacionSantiago1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 210, -1, 20));

        txtPresentacionSantiago2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        txtPresentacionSantiago2.setForeground(new java.awt.Color(255, 255, 255));
        txtPresentacionSantiago2.setText("caminatas ceremoniales, historia viva de los pueblos originarios. Ideal para quienes ");
        jPanel1.add(txtPresentacionSantiago2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 230, -1, 20));

        jLabel4.setFont(new java.awt.Font("Segoe UI Variable", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Guía");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 90, -1, -1));

        jLabel5.setFont(new java.awt.Font("Segoe UI Variable", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Fecha de inicio del viaje");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 300, -1, -1));
        jPanel1.add(dateInicioViaje, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 300, -1, -1));
        jPanel1.add(dateFinViaje, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 330, -1, -1));

        btnEliminarRegistroContrato.setText("<html>Eliminar registro de contratación de guía<br><small></small></html>");
        btnEliminarRegistroContrato.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarRegistroContratoActionPerformed(evt);
            }
        });
        jPanel1.add(btnEliminarRegistroContrato, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 370, 120, 50));

        btnContratarGuia.setText("Contratar guía");
        btnContratarGuia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnContratarGuiaActionPerformed(evt);
            }
        });
        jPanel1.add(btnContratarGuia, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 370, 110, 50));

        tablita.setBackground(new java.awt.Color(204, 255, 153));
        tablita.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(tablita);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 310, 400, 160));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 490));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cbGuiasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbGuiasActionPerformed
        String opcionSeleccionada = (String) cbGuias.getSelectedItem();
        txtEdadAndres.setVisible(false);
        txtEdadDavid.setVisible(false);
        txtEdadGabriela.setVisible(false);
        txtEdadKarla.setVisible(false);
        txtEdadSantiago.setVisible(false);
        txtEspAndres.setVisible(false);
        txtEspDavid.setVisible(false);
        txtEspGabriela.setVisible(false);
        txtEspKarla.setVisible(false);
        txtEspSantiago.setVisible(false);
        txtExpAndres.setVisible(false);
        txtExpDavid.setVisible(false);
        txtExpGabriela.setVisible(false);
        txtExpKarla.setVisible(false);
        txtExpSantiago.setVisible(false);
        txtIdiomaAndres.setVisible(false);
        txtIdiomaDavid.setVisible(false);
        txtIdiomaGabriela.setVisible(false);
        txtIdiomaKarla.setVisible(false);
        txtIdiomaSantiago.setVisible(false);
        txtPresentacionAndres1.setVisible(false);
        txtPresentacionAndres2.setVisible(false);
        txtPresentacionAndres3.setVisible(false);
        txtPresentacionAndres4.setVisible(false);
        txtPresentacionDavid1.setVisible(false);
        txtPresentacionDavid2.setVisible(false);
        txtPresentacionDavid3.setVisible(false);
        txtPresentacionGabriela1.setVisible(false);
        txtPresentacionGabriela2.setVisible(false);
        txtPresentacionGabriela3.setVisible(false);
        txtPresentacionKarla1.setVisible(false);
        txtPresentacionKarla2.setVisible(false);
        txtPresentacionKarla3.setVisible(false);
        txtPresentacionSantiago1.setVisible(false);
        txtPresentacionSantiago2.setVisible(false);
        txtPresentacionSantiago3.setVisible(false);

        switch (opcionSeleccionada) {
            case "Andrés Jaramillo Vélez":
            txtEdadAndres.setVisible(true);
            txtEspAndres.setVisible(true);
            txtExpAndres.setVisible(true);
            txtIdiomaAndres.setVisible(true);
            txtPresentacionAndres1.setVisible(true);
            txtPresentacionAndres2.setVisible(true);
            txtPresentacionAndres3.setVisible(true);
            txtPresentacionAndres4.setVisible(true);
            break;
            case "Karla Torres Ordóñez":
           txtEdadKarla.setVisible(true);
            txtEspKarla.setVisible(true);
            txtExpKarla.setVisible(true);
            txtIdiomaKarla.setVisible(true);
            txtPresentacionKarla1.setVisible(true);
            txtPresentacionKarla2.setVisible(true);
            txtPresentacionKarla3.setVisible(true);
            break;
            case "David Cordero Mera":
            txtEdadDavid.setVisible(true);
            txtEspDavid.setVisible(true);
            txtExpDavid.setVisible(true);
            txtIdiomaDavid.setVisible(true);
            txtPresentacionDavid1.setVisible(true);
            txtPresentacionDavid2.setVisible(true);
            txtPresentacionDavid3.setVisible(true);
            break;
            case "Gabriela Rojas Cabrera":
            txtEdadGabriela.setVisible(true);
            txtEspGabriela.setVisible(true);
            txtExpGabriela.setVisible(true);
            txtIdiomaGabriela.setVisible(true);
            txtPresentacionGabriela1.setVisible(true);
            txtPresentacionGabriela2.setVisible(true);
            txtPresentacionGabriela3.setVisible(true);
            break;
            case "Santiago Llivisupa Guamán":
            txtEdadSantiago.setVisible(true);
            txtEspSantiago.setVisible(true);
            txtExpSantiago.setVisible(true);
            txtIdiomaSantiago.setVisible(true);
            txtPresentacionSantiago1.setVisible(true);
            txtPresentacionSantiago2.setVisible(true);
            txtPresentacionSantiago3.setVisible(true);
            break;
            
        }
    }//GEN-LAST:event_cbGuiasActionPerformed

    private void btnRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegresarActionPerformed
        // TODO add your handling code here:
        MuseoRemigioCrespo museoremigiocrespo = new MuseoRemigioCrespo();
        museoremigiocrespo.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnRegresarActionPerformed

    private void btnPrincipioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPrincipioActionPerformed
        // TODO add your handling code here:
        QueVisitarCuenca quevisitarcuenca = new QueVisitarCuenca();
        quevisitarcuenca.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnPrincipioActionPerformed
private void guardarDatosEnArchivo() {
    try (BufferedWriter writer = new BufferedWriter(new FileWriter("losguias.txt"))) {
        for (int i = 0; i < modelo.getRowCount(); i++) {
            String guia = modelo.getValueAt(i, 0).toString();
            String fechaInicio = modelo.getValueAt(i, 1).toString();
            String fechaFin = modelo.getValueAt(i, 2).toString();
            writer.write(guia + "," + fechaInicio + "," + fechaFin);
            writer.newLine();
        }
    } catch (IOException e) {
        JOptionPane.showMessageDialog(null, "Error al guardar los datos: " + e.getMessage());
    }
}
private void cargarDatosDesdeArchivo() {
    try (BufferedReader reader = new BufferedReader(new FileReader("losguias.txt"))) {
        String linea;
        while ((linea = reader.readLine()) != null) {
            String[] datos = linea.split(",");
            if (datos.length == 3) {
                modelo.addRow(datos);
            }
        }
    } catch (IOException e) {
        JOptionPane.showMessageDialog(null, "Error al cargar los datos: " + e.getMessage());
    }
}
    private void btnEliminarRegistroContratoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarRegistroContratoActionPerformed
        // TODO add your handling code here:
        int filaSeleccionada = tablita.getSelectedRow();
    
    if (filaSeleccionada != -1) {
        modelo.removeRow(filaSeleccionada);
        guardarDatosEnArchivo(); // Guardar datos en el archivo
        JOptionPane.showMessageDialog(null, "Se ha eliminado el registro, si ya pasó tiempo el guía ya debió haberse contactado con usted.");
    } else {
        JOptionPane.showMessageDialog(null, "Seleccione un registro para eliminar.");
    }
    }//GEN-LAST:event_btnEliminarRegistroContratoActionPerformed

    private void btnContratarGuiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnContratarGuiaActionPerformed
if (cbGuias.getSelectedItem() != null && cbGuias.getSelectedItem().toString().length() > 0) {
    String guiasSeleccionados = cbGuias.getSelectedItem().toString();
    // Verificar que se haya seleccionado una fecha de inicio
    if (dateInicioViaje.getDate() != null) {
        Date fechaInicio = dateInicioViaje.getDate();
        // Verificar que se haya seleccionado una fecha de fin
        if (dateFinViaje.getDate() != null) {
            Date fechaFin = dateFinViaje.getDate();
            // Verificar que la fecha de fin no sea anterior a la fecha de inicio
            if (fechaFin.before(fechaInicio)) {
                JOptionPane.showMessageDialog(null, "La fecha de fin no puede ser anterior a la fecha de inicio.");
            } else {
                // Agregar la fila a la tabla
                String nuevaFila[] = {guiasSeleccionados, fechaInicio.toString(), fechaFin.toString()};
                modelo.addRow(nuevaFila);
                guardarDatosEnArchivo();
                JOptionPane.showMessageDialog(null, "Notificaremos al guía acerca de su reserva, este se pondra en contacto con usted lo antes posible.");
            }
        }
    }
}
    }//GEN-LAST:event_btnContratarGuiaActionPerformed

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
        } catch (ReflectiveOperationException | javax.swing.UnsupportedLookAndFeelException ex) {
            logger.log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> new VerGuias().setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnContratarGuia;
    private javax.swing.JButton btnEliminarRegistroContrato;
    private javax.swing.JButton btnPrincipio;
    private javax.swing.JButton btnRegresar;
    private javax.swing.JComboBox<String> cbGuias;
    private com.toedter.calendar.JDateChooser dateFinViaje;
    private com.toedter.calendar.JDateChooser dateInicioViaje;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tablita;
    private javax.swing.JLabel txtEdadAndres;
    private javax.swing.JLabel txtEdadDavid;
    private javax.swing.JLabel txtEdadGabriela;
    private javax.swing.JLabel txtEdadKarla;
    private javax.swing.JLabel txtEdadSantiago;
    private javax.swing.JLabel txtEspAndres;
    private javax.swing.JLabel txtEspDavid;
    private javax.swing.JLabel txtEspGabriela;
    private javax.swing.JLabel txtEspKarla;
    private javax.swing.JLabel txtEspSantiago;
    private javax.swing.JLabel txtExpAndres;
    private javax.swing.JLabel txtExpDavid;
    private javax.swing.JLabel txtExpGabriela;
    private javax.swing.JLabel txtExpKarla;
    private javax.swing.JLabel txtExpSantiago;
    private javax.swing.JLabel txtIdiomaAndres;
    private javax.swing.JLabel txtIdiomaDavid;
    private javax.swing.JLabel txtIdiomaGabriela;
    private javax.swing.JLabel txtIdiomaKarla;
    private javax.swing.JLabel txtIdiomaSantiago;
    private javax.swing.JLabel txtPresentacionAndres1;
    private javax.swing.JLabel txtPresentacionAndres2;
    private javax.swing.JLabel txtPresentacionAndres3;
    private javax.swing.JLabel txtPresentacionAndres4;
    private javax.swing.JLabel txtPresentacionDavid1;
    private javax.swing.JLabel txtPresentacionDavid2;
    private javax.swing.JLabel txtPresentacionDavid3;
    private javax.swing.JLabel txtPresentacionGabriela1;
    private javax.swing.JLabel txtPresentacionGabriela2;
    private javax.swing.JLabel txtPresentacionGabriela3;
    private javax.swing.JLabel txtPresentacionKarla1;
    private javax.swing.JLabel txtPresentacionKarla2;
    private javax.swing.JLabel txtPresentacionKarla3;
    private javax.swing.JLabel txtPresentacionSantiago1;
    private javax.swing.JLabel txtPresentacionSantiago2;
    private javax.swing.JLabel txtPresentacionSantiago3;
    // End of variables declaration//GEN-END:variables
}
