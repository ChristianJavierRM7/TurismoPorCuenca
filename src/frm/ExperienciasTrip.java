/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package frm;

/**
 *
 * @author Usuario
 */
public class ExperienciasTrip extends javax.swing.JFrame {
    
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(ExperienciasTrip.class.getName());

    /**
     * Creates new form ExperienciasTrip
     */
    public ExperienciasTrip() {
        initComponents();
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
        btnPrincipio = new javax.swing.JButton();
        btnRegresar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        btnVAventuras = new javax.swing.JButton();
        btnVGastronomia = new javax.swing.JButton();
        btnVCultura = new javax.swing.JButton();
        btnVNegocios = new javax.swing.JButton();
        btnVDeportes = new javax.swing.JButton();
        btnVFamilia = new javax.swing.JButton();
        btnVRelajarse = new javax.swing.JButton();
        btnVCompras = new javax.swing.JButton();
        btnVAmor = new javax.swing.JButton();
        btnVFiestas = new javax.swing.JButton();

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
        btnRegresar.setText("Regresar\n");
        btnRegresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegresarActionPerformed(evt);
            }
        });
        jPanel1.add(btnRegresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 410, 120, 60));

        jLabel1.setFont(new java.awt.Font("Segoe UI Black", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Experiencias Trip");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 10, 300, 70));

        btnVAventuras.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnVAventuras.setText("<html>Viaje por<br><small>Aventuras</small></html>");
        jPanel1.add(btnVAventuras, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 110, 110, 60));

        btnVGastronomia.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnVGastronomia.setText("<html>Viaje por<br><small>Gastronomía</small></html>");
        btnVGastronomia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVGastronomiaActionPerformed(evt);
            }
        });
        jPanel1.add(btnVGastronomia, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 110, 110, 60));

        btnVCultura.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnVCultura.setText("<html>Viaje por<br><small>Cultura</small></html>");
        jPanel1.add(btnVCultura, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 110, 110, 60));

        btnVNegocios.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnVNegocios.setText("<html>Viaje por<br><small>Negocios</small></html>");
        btnVNegocios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVNegociosActionPerformed(evt);
            }
        });
        jPanel1.add(btnVNegocios, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 110, 110, 60));

        btnVDeportes.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnVDeportes.setText("<html>Viaje por<br><small>Deportes</small></html>");
        btnVDeportes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVDeportesActionPerformed(evt);
            }
        });
        jPanel1.add(btnVDeportes, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 220, 130, 60));

        btnVFamilia.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnVFamilia.setText("<html>Viaje con<br><small>Familia</small></html>");
        btnVFamilia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVFamiliaActionPerformed(evt);
            }
        });
        jPanel1.add(btnVFamilia, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 230, 130, 60));

        btnVRelajarse.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnVRelajarse.setText("<html>Viaje para<br><small>Relajarse</small></html>");
        btnVRelajarse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVRelajarseActionPerformed(evt);
            }
        });
        jPanel1.add(btnVRelajarse, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 330, 130, 60));

        btnVCompras.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnVCompras.setText("<html>Viaje por<br><small>Compras</small></html>");
        btnVCompras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVComprasActionPerformed(evt);
            }
        });
        jPanel1.add(btnVCompras, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 330, 130, 60));

        btnVAmor.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnVAmor.setText("<html>Viaje por<br><small>Amor</small></html>");
        btnVAmor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVAmorActionPerformed(evt);
            }
        });
        jPanel1.add(btnVAmor, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 230, 130, 60));

        btnVFiestas.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnVFiestas.setText("<html>Viaje por<br><small>Fiestas</small></html>");
        btnVFiestas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVFiestasActionPerformed(evt);
            }
        });
        jPanel1.add(btnVFiestas, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 230, 130, 60));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 790, 490));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnPrincipioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPrincipioActionPerformed
        // TODO add your handling code here:
        FrmPrincipal paginaPrincipal = new FrmPrincipal();
        paginaPrincipal.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnPrincipioActionPerformed

    private void btnRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegresarActionPerformed
        // TODO add your handling code here:
        QueVisitarCuenca quevisitarCuenca = new QueVisitarCuenca();
        quevisitarCuenca.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnRegresarActionPerformed

    private void btnVNegociosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVNegociosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnVNegociosActionPerformed

    private void btnVDeportesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVDeportesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnVDeportesActionPerformed

    private void btnVFamiliaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVFamiliaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnVFamiliaActionPerformed

    private void btnVRelajarseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVRelajarseActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnVRelajarseActionPerformed

    private void btnVComprasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVComprasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnVComprasActionPerformed

    private void btnVAmorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVAmorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnVAmorActionPerformed

    private void btnVFiestasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVFiestasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnVFiestasActionPerformed

    private void btnVGastronomiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVGastronomiaActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_btnVGastronomiaActionPerformed

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
        java.awt.EventQueue.invokeLater(() -> new ExperienciasTrip().setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnPrincipio;
    private javax.swing.JButton btnRegresar;
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
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
