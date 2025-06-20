package frm;

public class FrmPrincipal extends javax.swing.JFrame {
        private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(FrmPrincipal.class.getName());
    public FrmPrincipal() {
       
       
        initComponents();
        
        setLocationRelativeTo(null);
    }

  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        btnComer = new javax.swing.JButton();
        btnContratarGuia = new javax.swing.JButton();
        btnVRelajarse = new javax.swing.JButton();
        btnQueVisitar = new javax.swing.JButton();
        btnMovilidad = new javax.swing.JButton();
        btnDormir = new javax.swing.JButton();
        btnActividadesCuenca = new javax.swing.JButton();
        btnVGastronomia = new javax.swing.JButton();
        btnVCultura = new javax.swing.JButton();
        btnVAventuras = new javax.swing.JButton();
        btnNoticias = new javax.swing.JButton();
        btnBlog = new javax.swing.JButton();
        btnVNegocios = new javax.swing.JButton();
        btnVFiestas = new javax.swing.JButton();
        btnVAmor = new javax.swing.JButton();
        btnVFamilia = new javax.swing.JButton();
        btnVDeportes = new javax.swing.JButton();
        btnCerrarSesion = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        btnVCompras = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setMinimumSize(new java.awt.Dimension(1000, 600));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(0, 0, 0));
        jPanel2.setPreferredSize(new java.awt.Dimension(1000, 600));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/logoAppTurismo (1).png"))); // NOI18N
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 80, -1));

        btnComer.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnComer.setText("<html>¿Dónde<br><small>Comer?</small></html>");
        jPanel2.add(btnComer, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 0, 90, 80));

        btnContratarGuia.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnContratarGuia.setText("<html>Contratar<br><small>Guia</small></html>");
        jPanel2.add(btnContratarGuia, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 0, 100, 80));

        btnVRelajarse.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnVRelajarse.setText("<html>Viaje para<br><small>Relajarse</small></html>");
        btnVRelajarse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVRelajarseActionPerformed(evt);
            }
        });
        jPanel2.add(btnVRelajarse, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 400, 130, 60));

        btnQueVisitar.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnQueVisitar.setText("<html>¿Qué<br><small>Visitar?</small></html>\"");
        btnQueVisitar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnQueVisitarActionPerformed(evt);
            }
        });
        jPanel2.add(btnQueVisitar, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 0, 80, 80));

        btnMovilidad.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnMovilidad.setText("Movilidad\n");
        jPanel2.add(btnMovilidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 0, 100, 80));

        btnDormir.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnDormir.setText("<html>¿Dónde<br><small>Dormir?</small></html>");
        jPanel2.add(btnDormir, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 0, 100, 80));

        btnActividadesCuenca.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnActividadesCuenca.setText("<html>Actividades<br><small>en Cuenca</small></html>");
        jPanel2.add(btnActividadesCuenca, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 0, 110, 80));

        btnVGastronomia.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnVGastronomia.setText("<html>Viaje por<br><small>Gastronomía</small></html>");
        jPanel2.add(btnVGastronomia, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 180, 110, 60));

        btnVCultura.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnVCultura.setText("<html>Viaje por<br><small>Cultura</small></html>");
        jPanel2.add(btnVCultura, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 180, 110, 60));

        btnVAventuras.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnVAventuras.setText("<html>Viaje por<br><small>Aventuras</small></html>");
        jPanel2.add(btnVAventuras, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 180, 110, 60));

        btnNoticias.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnNoticias.setText("Noticias");
        jPanel2.add(btnNoticias, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 0, 80, 80));

        btnBlog.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnBlog.setText("<html>Blog<br><small>Turistico</small></html>");
        jPanel2.add(btnBlog, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 0, 80, 80));

        btnVNegocios.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnVNegocios.setText("<html>Viaje por<br><small>Negocios</small></html>");
        btnVNegocios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVNegociosActionPerformed(evt);
            }
        });
        jPanel2.add(btnVNegocios, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 180, 110, 60));

        btnVFiestas.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnVFiestas.setText("<html>Viaje por<br><small>Fiestas</small></html>");
        btnVFiestas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVFiestasActionPerformed(evt);
            }
        });
        jPanel2.add(btnVFiestas, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 300, 130, 60));

        btnVAmor.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnVAmor.setText("<html>Viaje por<br><small>Amor</small></html>");
        btnVAmor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVAmorActionPerformed(evt);
            }
        });
        jPanel2.add(btnVAmor, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 300, 130, 60));

        btnVFamilia.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnVFamilia.setText("<html>Viaje con<br><small>Familia</small></html>");
        btnVFamilia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVFamiliaActionPerformed(evt);
            }
        });
        jPanel2.add(btnVFamilia, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 300, 130, 60));

        btnVDeportes.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnVDeportes.setText("<html>Viaje por<br><small>Deportes</small></html>");
        btnVDeportes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVDeportesActionPerformed(evt);
            }
        });
        jPanel2.add(btnVDeportes, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 290, 130, 60));

        btnCerrarSesion.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnCerrarSesion.setText("<html>Cerrar sesión<br><small></small></html>");
        btnCerrarSesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCerrarSesionActionPerformed(evt);
            }
        });
        jPanel2.add(btnCerrarSesion, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 0, 80, 80));

        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Segoe UI Black", 1, 28)); // NOI18N
        jLabel2.setText("<html>Golden<br><small>Vacation</small></html>");
        jPanel3.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 80));

        jPanel2.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 0, 110, 80));

        btnVCompras.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnVCompras.setText("<html>Viaje por<br><small>Compras</small></html>");
        btnVCompras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVComprasActionPerformed(evt);
            }
        });
        jPanel2.add(btnVCompras, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 400, 130, 60));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/image-removebg-preview (11) (1).png"))); // NOI18N
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(-30, 280, 290, 390));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnVComprasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVComprasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnVComprasActionPerformed

    private void btnCerrarSesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCerrarSesionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnCerrarSesionActionPerformed

    private void btnVDeportesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVDeportesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnVDeportesActionPerformed

    private void btnVFamiliaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVFamiliaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnVFamiliaActionPerformed

    private void btnVAmorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVAmorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnVAmorActionPerformed

    private void btnVFiestasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVFiestasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnVFiestasActionPerformed

    private void btnVNegociosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVNegociosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnVNegociosActionPerformed

    private void btnVRelajarseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVRelajarseActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnVRelajarseActionPerformed

    private void btnQueVisitarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnQueVisitarActionPerformed
        // TODO add your handling code here:
         QueVisitarCuenca quevisitarcuenca = new QueVisitarCuenca();
        quevisitarcuenca.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnQueVisitarActionPerformed

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
        java.awt.EventQueue.invokeLater(() -> new FrmPrincipal().setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnActividadesCuenca;
    private javax.swing.JButton btnBlog;
    private javax.swing.JButton btnCerrarSesion;
    private javax.swing.JButton btnComer;
    private javax.swing.JButton btnContratarGuia;
    private javax.swing.JButton btnDormir;
    private javax.swing.JButton btnMovilidad;
    private javax.swing.JButton btnNoticias;
    private javax.swing.JButton btnQueVisitar;
    private javax.swing.JButton btnVAmor;
    private javax.swing.JButton btnVAventuras;
    private javax.swing.JButton btnVCompras;
    private javax.swing.JButton btnVCultura;
    private javax.swing.JButton btnVDeportes;
    private javax.swing.JButton btnVFamilia;
    private javax.swing.JButton btnVFiestas;
    private javax.swing.JButton btnVGastronomia;
    private javax.swing.JButton btnVNegocios;
    private javax.swing.JButton btnVRelajarse;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    // End of variables declaration//GEN-END:variables
}
