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
        btnQueVisitar = new javax.swing.JButton();
        btnMovilidad = new javax.swing.JButton();
        btnDormir = new javax.swing.JButton();
        btnActividadesCuenca = new javax.swing.JButton();
        btnVGastronomia = new javax.swing.JButton();
        btnVCultura = new javax.swing.JButton();
        btnVAventuras = new javax.swing.JButton();
        btnNoticias = new javax.swing.JButton();
        btnBlog = new javax.swing.JButton();
        btnVFiestas = new javax.swing.JButton();
        btnVFamilia = new javax.swing.JButton();
        btnCerrarSesion = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Golden Vacation - Sistema de Turismo");
        setResizable(false);
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
        btnContratarGuia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnContratarGuiaActionPerformed(evt);
            }
        });
        jPanel2.add(btnContratarGuia, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 0, 100, 80));

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
        btnMovilidad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMovilidadActionPerformed(evt);
            }
        });
        jPanel2.add(btnMovilidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 0, 100, 80));

        btnDormir.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnDormir.setText("<html>¿Dónde<br><small>Dormir?</small></html>");
        btnDormir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDormirActionPerformed(evt);
            }
        });
        jPanel2.add(btnDormir, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 0, 100, 80));

        btnActividadesCuenca.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnActividadesCuenca.setText("<html>Actividades<br><small>en Cuenca</small></html>");
        btnActividadesCuenca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActividadesCuencaActionPerformed(evt);
            }
        });
        jPanel2.add(btnActividadesCuenca, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 0, 110, 80));

        btnVGastronomia.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnVGastronomia.setText("<html>Viaje por<br><small>Gastronomía</small></html>");
        btnVGastronomia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVGastronomiaActionPerformed(evt);
            }
        });
        jPanel2.add(btnVGastronomia, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 200, 110, 60));

        btnVCultura.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnVCultura.setText("<html>Viaje por<br><small>Cultura</small></html>");
        jPanel2.add(btnVCultura, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 200, 110, 60));

        btnVAventuras.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnVAventuras.setText("<html>Viaje por Aventuras<br><small></small></html>");
        jPanel2.add(btnVAventuras, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 200, 110, 60));

        btnNoticias.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnNoticias.setText("Noticias");
        jPanel2.add(btnNoticias, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 0, 80, 80));

        btnBlog.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnBlog.setText("<html>Blog<br><small>Turistico</small></html>");
        jPanel2.add(btnBlog, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 0, 80, 80));

        btnVFiestas.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnVFiestas.setText("<html>Viaje por<br><small>Fiestas</small></html>");
        btnVFiestas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVFiestasActionPerformed(evt);
            }
        });
        jPanel2.add(btnVFiestas, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 320, 130, 60));

        btnVFamilia.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnVFamilia.setText("<html>Viaje con<br><small>Familia</small></html>");
        btnVFamilia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVFamiliaActionPerformed(evt);
            }
        });
        jPanel2.add(btnVFamilia, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 320, 130, 60));

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

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/image-removebg-preview (11) (1).png"))); // NOI18N
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(-30, 280, 290, 390));

        jButton2.setText("<html>Clima de la Ciudad<br><small></small></html>\"");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 80, 80, 50));

        jButton1.setText("MAPA");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 80, 80, 50));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCerrarSesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCerrarSesionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnCerrarSesionActionPerformed

    private void btnVFamiliaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVFamiliaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnVFamiliaActionPerformed

    private void btnVFiestasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVFiestasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnVFiestasActionPerformed

    private void btnQueVisitarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnQueVisitarActionPerformed
        // TODO add your handling code here:
         QueVisitarCuenca quevisitarcuenca = new QueVisitarCuenca();
        quevisitarcuenca.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnQueVisitarActionPerformed

    private void btnContratarGuiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnContratarGuiaActionPerformed
        // TODO add your handling code here:
         VerGuias verguias = new VerGuias();
        verguias.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnContratarGuiaActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        Frm_Recommendations clima = new Frm_Recommendations();
        clima.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
  Frm_map mapa = new Frm_map();
        mapa.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btnMovilidadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMovilidadActionPerformed
        // TODO add your handling code here:
          Movilizacion moverse = new Movilizacion();
        moverse.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnMovilidadActionPerformed

    private void btnVGastronomiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVGastronomiaActionPerformed
        // TODO add your handling code here:
          FoodTrip1 food1 = new FoodTrip1();
        food1.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnVGastronomiaActionPerformed

    private void btnActividadesCuencaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActividadesCuencaActionPerformed
        // TODO add your handling code here:
        proximoCuenca proCuenca = new proximoCuenca();
        proCuenca.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnActividadesCuencaActionPerformed

    private void btnDormirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDormirActionPerformed
        // TODO add your handling code here:
          dormirCuenca dormirCuenca1 = new dormirCuenca();
        dormirCuenca1.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnDormirActionPerformed

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
    private javax.swing.JButton btnVAventuras;
    private javax.swing.JButton btnVCultura;
    private javax.swing.JButton btnVFamilia;
    private javax.swing.JButton btnVFiestas;
    private javax.swing.JButton btnVGastronomia;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    // End of variables declaration//GEN-END:variables
}
