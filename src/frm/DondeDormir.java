/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package frm;

import java.util.HashMap;
import javax.swing.DefaultListModel;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

public class DondeDormir extends javax.swing.JFrame {

    private DefaultListModel<String> modeloLista = new DefaultListModel<>();
    private HashMap<String, String> infoHoteles = new HashMap<>();

    public DondeDormir() {
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
                "Es un Hotel de marca internacional que pertenece a la cadena Marriott International Inc...\n" +
                        "Servicios:\n- Parqueo\n- Acceso para discapacidad\n- Admiten mascotas\n" +
                        "Adicionales:\n- Restaurante Cook’s\n- Piscina temperada\n- Sauna – Turco\n- Fitness center\n" +
                        "Precios: $85 a $110");

        infoHoteles.put("El Dorado",
                "El Dorado Hotel entrega una cordial bienvenida...\n" +
                        "Servicios:\n- Parqueo\n- Acceso para discapacidad\n" +
                        "Adicionales:\n- Turco – Sauna\n- Gimnasio\n" +
                        "Precios: $70 a $160");

        infoHoteles.put("Itza Hotel Boutique Internacional",
                "Ubicado en el corazón de Cuenca. Lujosa casa restaurada con 15 habitaciones...\n" +
                        "Servicios:\n- Parqueo\n- Acceso para discapacidad\n- Admiten mascotas\n" +
                        "Adicionales:\n- Rooftop Zaza 360\n- Restaurante gourmet SANTO PLACER\n- Whisky Lounge\n" +
                        "Precios: $120 a $550");

        infoHoteles.put("Hotel Oro Verde Cuenca",
                "Con más de tres décadas de experiencia en servicio cinco estrellas...\n" +
                        "Servicios:\n- Parqueo\n- Acceso para discapacidad\n- Admiten mascotas\n" +
                        "Adicionales:\n- Piscina y Spa\n- Gimnasio\n" +
                        "Precios: $90 a $150");

        // 4 estrellas
        infoHoteles.put("Hotel Los Balcones",
                "Hotel Boutique Los Balcones, es una joya de la arquitectura colonial y patrimonio de la ciudad...\n" +
                        "Servicios:\n- Parqueo\n- Acceso para discapacidad\n" +
                        "Adicionales:\n- Restaurante\n" +
                        "Precios: $50 a $150");

        infoHoteles.put("Hotel Boutique Mansión Alcazár",
                "La Mansión es una de las pocas casas del Centro Histórico que conserva sus jardines originales...\n" +
                        "Servicios:\n- Parqueadero\n- Acceso para discapacidad\n- Admite mascotas\n" +
                        "Adicionales:\n- Restaurante – bar\n- Spa\n" +
                        "Precios: $115 a $500");

        infoHoteles.put("Hotel Boutique Santa Lucía",
                "El Hotel Boutique Santa Lucía lleva más de 22 años operando en Cuenca...\n" +
                        "Servicios:\n- Parqueadero\n- Acceso para discapacidad\n- Admite mascotas\n" +
                        "Adicionales:\n- Restaurante internacional\n- Bar lounge\n" +
                        "Precios: $90 a $240");

        infoHoteles.put("Felicia Hotel & Suites",
                "Ubicado en el centro histórico de Cuenca, a una cuadra del Parque Calderón...\n" +
                        "Servicios:\n- Parqueo\n- Acceso para discapacidad\n- Admite mascotas\n" +
                        "Adicionales:\n- Turco – Hidromasaje\n- Salón de eventos\n" +
                        "Precios: $50 a $150");

        // 3 estrellas
        infoHoteles.put("Hotel Casa San Rafael",
                "Casa San Rafael cuenta con 13 habitaciones con estilo coloniales...\n" +
                        "Servicios:\n- Acceso para discapacidad\n- Admite mascotas\n" +
                        "Precios: $40 a $115");

        infoHoteles.put("Suite La Fabrique",
                "Suite Le Fabrique es una casa patrimonial del año 1890, ganadora del premio Ornato...\n" +
                        "Servicios:\n- Acceso para discapacidad\n- Lavandería\n- Zona de café ilimitado\n" +
                        "Precios: $35 a $100");

        infoHoteles.put("Nass Pinas del Lago",
                "Hotel moderno ubicado en la mejor zona residencial de Cuenca...\n" +
                        "Servicios:\n- Parqueadero\n- Admite mascotas\n- Salón de eventos\n" +
                        "Precios: $45 a $90");

        // 2 estrellas
        infoHoteles.put("Hostal Amancay",
                "Se encuentra en el corazón de Cuenca, frente a la parada del tranvía...\n" +
                        "Adicionales:\n- Mirador hacia las cúpulas de Santo Domingo\n" +
                        "Precios: desde $25");

        infoHoteles.put("Hotel Mariscal",
                "Ubicado en el corazón de la ciudad, habitaciones cómodas...\n" +
                        "Servicios:\n- Parqueadero\n- Lavandería\n- Admite mascotas\n" +
                        "Precios: $25 a $120");

        infoHoteles.put("Nass Central Garden",
                "Hostal de la cadena Nass ubicado en el Centro Histórico...\n" +
                        "Servicios:\n- Parqueadero\n- Acceso para discapacidad\n- Admite mascotas\n" +
                        "Adicionales:\n- Estación de café y té ilimitado\n" +
                        "Precios: $35 a $120");

        infoHoteles.put("Hostal Los Álamos",
                "Acogedoras habitaciones frente al Terminal Terrestre...\n" +
                        "Servicios:\n- Parqueo\n- Acceso para discapacidad\n- Admite mascotas\n" +
                        "Precios: $15 a $30");

        // 1 estrella
        infoHoteles.put("Hostal Huayna Cápac",
                "Habitaciones simples, dobles, triples y matrimoniales...\n" +
                        "Precios: $15 a $25");

        infoHoteles.put("Hostal Haro",
                "Habitaciones acogedoras, siéntete como en casa...\n" +
                        "Servicios:\n- Parqueo\n- Admite mascotas\n" +
                        "Precios: $20 a $50");

        infoHoteles.put("Hostal Hurtado de Mendoza",
                "Hostal Hurtado de Mendoza, siéntete como en casa, ven y disfruta de nuestras habitaciones acogedoras.\n" +
                        "Precios: $20 a $50");
    }


    // Resto del código generado automáticamente no ha cambiado

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
        jScrollPane1 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList<>();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        btnBuscarHotel = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new java.awt.GridLayout());

        cmbCategoria.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccionar categoría", "5 Estrellas", "4 Estrellas", "3 Estrellas", "2 Estrellas", "1 Estrella" }));
        cmbCategoria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbCategoriaActionPerformed(evt);
            }
        });

        jLabel1.setText("Buscar por categoría");

        jList1.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                jList1AncestorAdded(evt);
            }
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        jScrollPane1.setViewportView(jList1);

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jTextArea1.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                jTextArea1AncestorAdded(evt);
            }
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        jScrollPane2.setViewportView(jTextArea1);

        btnBuscarHotel.setText("Buscar");
        btnBuscarHotel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarHotelActionPerformed(evt);
            }
        });

        jLabel2.setText("Selecciona el Hotel ");

        jLabel3.setText("Información del hotel");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cmbCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(btnBuscarHotel))
                    .addComponent(jLabel2)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 22, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(34, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(256, 256, 256)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(cmbCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(25, 25, 25)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(33, 33, 33)
                        .addComponent(btnBuscarHotel)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 19, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 346, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnBuscarHotelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarHotelActionPerformed
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
        

    }//GEN-LAST:event_btnBuscarHotelActionPerformed

    private void cmbCategoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbCategoriaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbCategoriaActionPerformed

    private void jList1AncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_jList1AncestorAdded
        // TODO add your handling code here:
    }//GEN-LAST:event_jList1AncestorAdded

    private void jTextArea1AncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_jTextArea1AncestorAdded
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextArea1AncestorAdded

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
            java.util.logging.Logger.getLogger(DondeDormir.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DondeDormir.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DondeDormir.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DondeDormir.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DondeDormir().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscarHotel;
    private javax.swing.JComboBox<String> cmbCategoria;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JList<String> jList1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea jTextArea1;
    // End of variables declaration//GEN-END:variables
}
