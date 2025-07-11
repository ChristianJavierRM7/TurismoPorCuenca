package frm;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

import java.util.HashMap;
import javax.swing.DefaultListModel;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
/**
 *
 * @author danielgualan
 */
public class DondeComer2 extends javax.swing.JFrame {

    private DefaultListModel<String> modeloLista = new DefaultListModel<>();
    private HashMap<String, String> infoComida = new HashMap<>();

    /**
     * Creates new form DondeComer
     */
    public DondeComer2() {
        initComponents();
        setLocationRelativeTo(null);
        cargarInformacionComida();
        jList1.setModel(modeloLista);

        jList1.addListSelectionListener(new ListSelectionListener() {
            public void valueChanged(ListSelectionEvent e) {
                String seleccionado = jList1.getSelectedValue();
                if (seleccionado != null && infoComida.containsKey(seleccionado)) {
                    txtInformacion.setText(infoComida.get(seleccionado));
                } else {
                    txtInformacion.setText("");
                }
            }
        });
    }
    private void cargarInformacionComida() {
        // 5 estrellas
        infoComida.put("Restaurantes en Parroquia Sayausi",
                "Sayausí es conocida por su trucha frita\n"
                        + "en diversas presentaciones.\n"
                        + "Se ubica en la vía al Parque\n"
                        + "Nacional Cajas y Guayaquil.\n"
                        + "Muchos restaurantes ofrecen\n"
                        + "pesca deportiva y preparación\n"
                        + "del plato en el lugar.");

        infoComida.put("Mercado 12 de Abril",
                "Con más de 35 años de historia, es uno\n"
                        + "de los mercados más modernos.\n"
                        + "Destaca por su variedad en\n"
                        + "comida típica, dulces tradicionales\n"
                        + " y un sistema de compras en línea.\n"
                        + "🕒 Abierto de 07:00 a 17:00.");

        infoComida.put("Mercado 10 de Agosto",
                "También llamado Mercado Galería.\n"
                        + "Alberga murales que reflejan\n"
                        + "la vida y tradiciones de Cuenca.\n"
                        + "Ofrece frutas, platos típicos\n"
                        + "y limpias ancestrales los martes y jueves.\n" 
                        +"🕒 Abierto de 07:00 a 17:00.");

        infoComida.put("Mercado 9 de Octubre",
                "El mercado más antiguo de Cuenca, ubicado\n"
                        + "en un barrio tradicional.\n"
                        + " Su edificio histórico fue\n"
                        + "construido en los años 30 y\n"
                        + " es símbolo del comercio local.\n" 
                        +"🕒 Abierto de 07:00 a 17:00.");

        infoComida.put("Mercado 3 de Noviembre",
                "Famoso por su oferta de granos secos y\n"
                        + "comida típica de la sierra y\n"
                        + "la costa a precios accesibles.\n"
                        + "Fácil acceso mediante el Tranvía.\n" 
                        +"🕒 Abierto de 07:00 a 16:00.");

        infoComida.put("Av. Don Bosco - Sur de la ciudad",
                "Zona tradicional donde se puede disfrutar\n"
                        + "de cuy asado, cascaritas, fritada,\n"
                        + "sancocho y llapingacho, acompañados\n"
                        + "con el clásico mote cuencano.");

        infoComida.put("Calle larga - Sur del centro Historico",
                "Calle emblemática de Cuenca con una amplia\n"
                        + " oferta gastronómica nacional e\n"
                        + " internacional. Ideal para quienes\n"
                        + "buscan asados, comida rápida o\n"
                        + "ambientes modernos.");

        infoComida.put("Parroquia San Sebastián",
                "Zona cultural con museos y galerías.\n"
                        + " Ofrece una gastronomía variada:\n"
                        + " comida ecuatoriana, belga,\n"
                        + " vietnamita, mexicana, entre\n"
                        + "otras. Destacan también los\n"
                        + "sánduches de pernil.");
        infoComida.put("Centro de Cuenca",
                "El centro ofrece una cocina que mezcla\n"
                        + " tradición y modernidad.\n"
                        + "Aquí puedes probar desde mote\n"
                        + "pillo y locro hasta fusiones\n"
                        + "creativas en restaurantes temáticos.");

        infoComida.put("Parroquia de Ricaurte",
                "Reconocida por su cuy asado con papas\n"
                        + "doradas. Es un destino gastronómico\n"
                        + "popular los fines de semana, ubicado\n"
                        + "al noreste de la ciudad.");

        infoComida.put("Sector el Estadio",
                "Zona con propuestas modernas de cocina,\n"
                        + "fusiones y temáticas innovadoras.\n"
                        + "Restaurantes dirigidos por una\n"
                        + "nueva generación de chefs.");

        infoComida.put("Parroquia de San Joaquín",
                "Famosa por sus carnes asadas con mote\n"
                        + " pillo y habas con queso.\n"
                        + "También se encuentran platos\n"
                        + "como papas con cuero y locro.\n"
                        + "Destaca el corredor turístico Barabón.");
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        btnBuscar = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        btnRegresar = new javax.swing.JButton();
        bntReiniciar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList<>();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtInformacion = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        cmbCategoria = new javax.swing.JComboBox<>();
        btnRegresar1 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBackground(new java.awt.Color(51, 51, 51));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnBuscar.setText("Buscar");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });
        jPanel3.add(btnBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 410, -1, -1));

        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Información del restaurante");
        jPanel3.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 90, -1, -1));

        btnRegresar.setText("Regresar");
        btnRegresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegresarActionPerformed(evt);
            }
        });
        jPanel3.add(btnRegresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 410, -1, -1));

        bntReiniciar.setText("Reiniciar");
        bntReiniciar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bntReiniciarActionPerformed(evt);
            }
        });
        jPanel3.add(bntReiniciar, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 410, -1, -1));

        jScrollPane1.setViewportView(jList1);

        jPanel3.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 200, 215, 162));

        txtInformacion.setColumns(20);
        txtInformacion.setRows(5);
        jScrollPane2.setViewportView(txtInformacion);

        jPanel3.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 110, 320, 352));

        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Buscar por Categoría");
        jPanel3.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 80, -1, -1));

        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Selecciona el Restaurante");
        jPanel3.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 150, -1, -1));

        cmbCategoria.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecciona una categoría", "La trucha - Parque Nacional Cajas", "Los sabores de los mercados", "Las Cascaritas de la Don Bosco", "Los grills de la Calle larga", "Tradicion y vanguardia de la Gastronomia en San Sebastián", "Gastronomía del Centro Historico" }));
        jPanel3.add(cmbCategoria, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 110, -1, -1));

        btnRegresar1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnRegresar1.setText("Añadir Visita");
        btnRegresar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegresar1ActionPerformed(evt);
            }
        });
        jPanel3.add(btnRegresar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 320, 150, 60));

        jLabel4.setFont(new java.awt.Font("Segoe UI Black", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Dónde Comer en Cuenca?");
        jPanel3.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, -1, -1));

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 490));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        // TODO add your handling code here:
        String seleccion = (String) cmbCategoria.getSelectedItem();
        modeloLista.clear();

        switch (seleccion) {
            case "La trucha - Parque Nacional Cajas":
            modeloLista.addElement("Restaurantes en Parroquia Sayausi");
            break;
            case "Los sabores de los mercados":
            modeloLista.addElement("Mercado 12 de Abril");
            modeloLista.addElement("Mercado 10 de Agosto");
            modeloLista.addElement("Mercado 9 de Octubre");
            modeloLista.addElement("Mercado 3 de Noviembre");
            break;
            case "Las Cascaritas de la Don Bosco":
            modeloLista.addElement("Av. Don Bosco - Sur de la ciudad");
            break;
            case "Los grills de la Calle larga":
            modeloLista.addElement("Calle larga - Sur del centro Historico");
            break;
            case "Tradicion y vanguardia de la Gastronomia en San Sebastián":
            modeloLista.addElement("Parroquia San Sebastián");
            break;
            case "Gastronomía del Centro Historico":
            modeloLista.addElement("Centro de Cuenca");
            break;
            case "El cuy asado de la Ricaurte":
            modeloLista.addElement("Parroquia de Ricaurte");
            break;
            case "Las fusiones gastronómicas del Sector del Estadio":
            modeloLista.addElement("Sector el Estadio");
            break;
            case "Comida típica de la Parroquia de San Joaquín":
            modeloLista.addElement("Parroquia de San Joaquín");
            break;
            case "Selecciona una categoría":
            modeloLista.addElement("Por favor seleccione una categoría válida.");
            break;

            default:
                
            modeloLista.addElement("No hay hoteles disponibles en esta categoría.");
        }
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void btnRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegresarActionPerformed
        // TODO add your handling code here:
        FrmPrincipal paginaPrincipal = new FrmPrincipal();
        paginaPrincipal.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnRegresarActionPerformed

    private void bntReiniciarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bntReiniciarActionPerformed
        // TODO add your handling code here:
        cmbCategoria.setSelectedIndex(0);
        txtInformacion.setText("");
    }//GEN-LAST:event_bntReiniciarActionPerformed

    private void btnRegresar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegresar1ActionPerformed
        // TODO add your handling code here:
        ReservaLugares reserva = new ReservaLugares();
        reserva.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnRegresar1ActionPerformed

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
            java.util.logging.Logger.getLogger(DondeComer2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DondeComer2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DondeComer2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DondeComer2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DondeComer2().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bntReiniciar;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnRegresar;
    private javax.swing.JButton btnRegresar1;
    private javax.swing.JComboBox<String> cmbCategoria;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JList<String> jList1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea txtInformacion;
    // End of variables declaration//GEN-END:variables
}
