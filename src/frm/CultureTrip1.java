/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package frm;

/**
 *
 * @author Usuario
 */
public class CultureTrip1 extends javax.swing.JFrame {
    
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(CultureTrip1.class.getName());

    /**
     * Creates new form CultureTrip1
     */
    public CultureTrip1() {
        initComponents();
        setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        btnPrincipio = new javax.swing.JButton();
        btnRegresar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        btnVFamilia1 = new javax.swing.JButton();
        btnVFamilia2 = new javax.swing.JButton();
        btnVFamilia5 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(51, 51, 51));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnPrincipio.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnPrincipio.setText("Ir a la página principal");
        btnPrincipio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPrincipioActionPerformed(evt);
            }
        });
        jPanel2.add(btnPrincipio, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 170, 50));

        btnRegresar.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnRegresar.setText("Regresar\n");
        btnRegresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegresarActionPerformed(evt);
            }
        });
        jPanel2.add(btnRegresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 410, 120, 60));

        jLabel1.setFont(new java.awt.Font("Segoe UI Black", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Viaje por Cultura");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 40, -1, -1));

        btnVFamilia1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnVFamilia1.setText("Semana Santa");
        btnVFamilia1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVFamilia1ActionPerformed(evt);
            }
        });
        jPanel2.add(btnVFamilia1, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 180, 180, 100));

        btnVFamilia2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnVFamilia2.setText("<html>Viaja en el Tiempo: Visitando las Casas Patrimoniales<br><small></small></html>");
        btnVFamilia2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVFamilia2ActionPerformed(evt);
            }
        });
        jPanel2.add(btnVFamilia2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 180, 200, 100));

        btnVFamilia5.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnVFamilia5.setText("<html>Vacaciones en Cuenca: Vive, explora y disfruta!<br><small></small></html>");
        btnVFamilia5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVFamilia5ActionPerformed(evt);
            }
        });
        jPanel2.add(btnVFamilia5, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 180, 190, 100));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 790, 480));

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
        ExperienciasTrip experienciastrip = new ExperienciasTrip();
        experienciastrip.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnRegresarActionPerformed

    private void btnVFamilia1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVFamilia1ActionPerformed
        // TODO add your handling code here:
         ViveSanto1 vivesanto1 = new ViveSanto1();
        vivesanto1.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnVFamilia1ActionPerformed

    private void btnVFamilia2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVFamilia2ActionPerformed
        // TODO add your handling code here:
        CasasPatrimoniales1 casapatri = new CasasPatrimoniales1();
        casapatri.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnVFamilia2ActionPerformed

    private void btnVFamilia5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVFamilia5ActionPerformed
        // TODO add your handling code here:
         VacacionesCuenca1 vacacionesCuenca1 = new VacacionesCuenca1();
        vacacionesCuenca1.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnVFamilia5ActionPerformed

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
        java.awt.EventQueue.invokeLater(() -> new CultureTrip1().setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnPrincipio;
    private javax.swing.JButton btnRegresar;
    private javax.swing.JButton btnVFamilia1;
    private javax.swing.JButton btnVFamilia2;
    private javax.swing.JButton btnVFamilia5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}
