package frm;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author danielgualan
 */
import java.util.HashMap;
import javax.swing.DefaultListModel;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

public class dormirCuenca extends javax.swing.JFrame {

    private DefaultListModel<String> modeloLista = new DefaultListModel<>();
    private HashMap<String, String> infoHoteles = new HashMap<>();

    public dormirCuenca() {
        initComponents();
        setLocationRelativeTo(null);
        cargarInformacionHoteles();
        jList1.setModel(modeloLista);

        jList1.addListSelectionListener(new ListSelectionListener() {
            public void valueChanged(ListSelectionEvent e) {
                String seleccionado = jList1.getSelectedValue();
                if (seleccionado != null && infoHoteles.containsKey(seleccionado)) {
                    jTextArea1.setText(infoHoteles.get(seleccionado));
                } else {
                    jTextArea1.setText("");
                }
            }
        });
    }

    private void cargarInformacionHoteles() {
        // 5 estrellas
        infoHoteles.put("Four Points by Sheraton Cuenca",
                "Es un Hotel de marca internacional que pertenece a la cadena Marriott International Inc...\n"
                + "Servicios:\n- Parqueo\n- Acceso para discapacidad\n- Admiten mascotas\n"
                + "Adicionales:\n- Restaurante Cook’s\n- Piscina temperada\n- Sauna – Turco\n- Fitness center\n"
                + "Precios: $85 a $110");

        infoHoteles.put("El Dorado",
                "El Dorado Hotel entrega una cordial bienvenida...\n"
                + "Servicios:\n- Parqueo\n- Acceso para discapacidad\n"
                + "Adicionales:\n- Turco – Sauna\n- Gimnasio\n"
                + "Precios: $70 a $160");

        infoHoteles.put("Itza Hotel Boutique Internacional",
                "Ubicado en el corazón de Cuenca. Lujosa casa restaurada con 15 habitaciones...\n"
                + "Servicios:\n- Parqueo\n- Acceso para discapacidad\n- Admiten mascotas\n"
                + "Adicionales:\n- Rooftop Zaza 360\n- Restaurante gourmet SANTO PLACER\n- Whisky Lounge\n"
                + "Precios: $120 a $550");

        infoHoteles.put("Hotel Oro Verde Cuenca",
                "Con más de tres décadas de experiencia en servicio cinco estrellas...\n"
                + "Servicios:\n- Parqueo\n- Acceso para discapacidad\n- Admiten mascotas\n"
                + "Adicionales:\n- Piscina y Spa\n- Gimnasio\n"
                + "Precios: $90 a $150");

        // 4 estrellas
        infoHoteles.put("Hotel Los Balcones",
                "Hotel Boutique Los Balcones, es una joya de la arquitectura colonial y patrimonio de la ciudad...\n"
                + "Servicios:\n- Parqueo\n- Acceso para discapacidad\n"
                + "Adicionales:\n- Restaurante\n"
                + "Precios: $50 a $150");

        infoHoteles.put("Hotel Boutique Mansión Alcazár",
                "La Mansión es una de las pocas casas del Centro Histórico que conserva sus jardines originales...\n"
                + "Servicios:\n- Parqueadero\n- Acceso para discapacidad\n- Admite mascotas\n"
                + "Adicionales:\n- Restaurante – bar\n- Spa\n"
                + "Precios: $115 a $500");

        infoHoteles.put("Hotel Boutique Santa Lucía",
                "El Hotel Boutique Santa Lucía lleva más de 22 años operando en Cuenca...\n"
                + "Servicios:\n- Parqueadero\n- Acceso para discapacidad\n- Admite mascotas\n"
                + "Adicionales:\n- Restaurante internacional\n- Bar lounge\n"
                + "Precios: $90 a $240");

        infoHoteles.put("Felicia Hotel & Suites",
                "Ubicado en el centro histórico de Cuenca, a una cuadra del Parque Calderón...\n"
                + "Servicios:\n- Parqueo\n- Acceso para discapacidad\n- Admite mascotas\n"
                + "Adicionales:\n- Turco – Hidromasaje\n- Salón de eventos\n"
                + "Precios: $50 a $150");

        // 3 estrellas
        infoHoteles.put("Hotel Casa San Rafael",
                "Casa San Rafael cuenta con 13 habitaciones con estilo coloniales...\n"
                + "Servicios:\n- Acceso para discapacidad\n- Admite mascotas\n"
                + "Precios: $40 a $115");

        infoHoteles.put("Suite La Fabrique",
                "Suite Le Fabrique es una casa patrimonial del año 1890, ganadora del premio Ornato...\n"
                + "Servicios:\n- Acceso para discapacidad\n- Lavandería\n- Zona de café ilimitado\n"
                + "Precios: $35 a $100");

        infoHoteles.put("Nass Pinas del Lago",
                "Hotel moderno ubicado en la mejor zona residencial de Cuenca...\n"
                + "Servicios:\n- Parqueadero\n- Admite mascotas\n- Salón de eventos\n"
                + "Precios: $45 a $90");

        // 2 estrellas
        infoHoteles.put("Hostal Amancay",
                "Se encuentra en el corazón de Cuenca, frente a la parada del tranvía...\n"
                + "Adicionales:\n- Mirador hacia las cúpulas de Santo Domingo\n"
                + "Precios: desde $25");

        infoHoteles.put("Hotel Mariscal",
                "Ubicado en el corazón de la ciudad, habitaciones cómodas...\n"
                + "Servicios:\n- Parqueadero\n- Lavandería\n- Admite mascotas\n"
                + "Precios: $25 a $120");

        infoHoteles.put("Nass Central Garden",
                "Hostal de la cadena Nass ubicado en el Centro Histórico...\n"
                + "Servicios:\n- Parqueadero\n- Acceso para discapacidad\n- Admite mascotas\n"
                + "Adicionales:\n- Estación de café y té ilimitado\n"
                + "Precios: $35 a $120");

        infoHoteles.put("Hostal Los Álamos",
                "Acogedoras habitaciones frente al Terminal Terrestre...\n"
                + "Servicios:\n- Parqueo\n- Acceso para discapacidad\n- Admite mascotas\n"
                + "Precios: $15 a $30");

        // 1 estrella
        infoHoteles.put("Hostal Huayna Cápac",
                "Habitaciones simples, dobles, triples y matrimoniales...\n"
                + "Precios: $15 a $25");

        infoHoteles.put("Hostal Haro",
                "Habitaciones acogedoras, siéntete como en casa...\n"
                + "Servicios:\n- Parqueo\n- Admite mascotas\n"
                + "Precios: $20 a $50");

        infoHoteles.put("Hostal Hurtado de Mendoza",
                "Hostal Hurtado de Mendoza, siéntete como en casa, ven y disfruta de nuestras habitaciones acogedoras.\n"
                + "Precios: $20 a $50");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        cmbCategoria = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        btnBuscar = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        bntReiniciar = new javax.swing.JButton();
        btnRegresar = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jScrollPane1 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList<>();
        btnRegresar4 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        cmbCategoria.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecciona una categoría", "5 Estrellas", "4 Estrellas", "3 Estrellas", "2 Estrellas", "1 Estrella" }));
        jPanel1.add(cmbCategoria, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 100, -1, -1));

        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Buscar por Categoría");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 70, -1, -1));

        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Selecciona el Hotel");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 170, -1, -1));

        btnBuscar.setText("Buscar");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });
        jPanel1.add(btnBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 140, -1, -1));

        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Información del hotel");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 80, -1, -1));

        bntReiniciar.setText("Reiniciar");
        jPanel1.add(bntReiniciar, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 390, -1, -1));

        btnRegresar.setText("Regresar");
        btnRegresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegresarActionPerformed(evt);
            }
        });
        jPanel1.add(btnRegresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 440, -1, -1));

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane2.setViewportView(jTextArea1);

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 110, 320, 352));

        jScrollPane1.setViewportView(jList1);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 210, 215, 162));

        btnRegresar4.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnRegresar4.setText("Añadir Visita");
        btnRegresar4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegresar4ActionPerformed(evt);
            }
        });
        jPanel1.add(btnRegresar4, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 400, 150, 60));

        jLabel4.setFont(new java.awt.Font("Segoe UI Black", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Dónde Dormir en Cuenca?");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 480));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        // TODO add your handling code here:
        String seleccion = (String) cmbCategoria.getSelectedItem();
        modeloLista.clear();

        switch (seleccion) {
            case "5 Estrellas":
                modeloLista.addElement("Four Points by Sheraton Cuenca");
                modeloLista.addElement("El Dorado");
                modeloLista.addElement("Itza Hotel Boutique Internacional");
                modeloLista.addElement("Hotel Oro Verde Cuenca");
                break;
            case "4 Estrellas":
                modeloLista.addElement("Hotel Los Balcones");
                modeloLista.addElement("Hotel Boutique Mansión Alcazár");
                modeloLista.addElement("Hotel Boutique Santa Lucía");
                modeloLista.addElement("Felicia Hotel & Suites");
                break;
            case "3 Estrellas":
                modeloLista.addElement("Hotel Casa San Rafael");
                modeloLista.addElement("Suite La Fabrique");
                modeloLista.addElement("Nass Pinas del Lago");
                break;
            case "2 Estrellas":
                modeloLista.addElement("Hostal Amancay");
                modeloLista.addElement("Hotel Mariscal");
                modeloLista.addElement("Nass Central Garden");
                modeloLista.addElement("Hostal Los Álamos");
                break;
            case "1 Estrella":
                modeloLista.addElement("Hostal Huayna Cápac");
                modeloLista.addElement("Hostal Haro");
                modeloLista.addElement("Hostal Hurtado de Mendoza");
                break;
            default:
                modeloLista.addElement("No hay hoteles disponibles en esta categoría.");
        }

    }//GEN-LAST:event_btnBuscarActionPerformed

    private void btnRegresar4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegresar4ActionPerformed
        // TODO add your handling code here:
        ReservaLugares reservaLugares = new ReservaLugares();
        reservaLugares.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnRegresar4ActionPerformed

    private void btnRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegresarActionPerformed
        // TODO add your handling code here:
        FrmPrincipal frmprincipal = new FrmPrincipal();
        frmprincipal.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnRegresarActionPerformed

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
            java.util.logging.Logger.getLogger(dormirCuenca.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(dormirCuenca.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(dormirCuenca.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(dormirCuenca.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new dormirCuenca().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bntReiniciar;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnRegresar;
    private javax.swing.JButton btnRegresar4;
    private javax.swing.JComboBox<String> cmbCategoria;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JList<String> jList1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea jTextArea1;
    // End of variables declaration//GEN-END:variables
}
