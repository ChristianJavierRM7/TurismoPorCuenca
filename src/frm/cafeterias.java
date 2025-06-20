/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package frm;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.FileReader;

/**
 *
 * @author RYZEN 7
 */
public class cafeterias extends javax.swing.JFrame {
DefaultTableModel modelo;
    private static boolean ga = false;
    
    
    public cafeterias() {
           initComponents();
        setLocationRelativeTo(null);
        mtd_prepararTabla();
        cargarOpcionesDesdeArchivo(); // Cargar opciones para JComboBox
        cargarDatosDesdeArchivo(); // Cargar datos en la tabla
        // Listener para tabla
        tablita.getSelectionModel().addListSelectionListener(new ListSelectionListener() {
            @Override
            public void valueChanged(ListSelectionEvent e) {
                if (tablita.getSelectedRow() != -1) {
                    int fila = tablita.getSelectedRow();
                    lugar.setSelectedItem(tablita.getValueAt(fila, 0).toString());
                    descripcion.setText(tablita.getValueAt(fila, 2).toString());
                    ubicacion.setText(tablita.getValueAt(fila, 1).toString());
                    calificacion.setSelectedItem(tablita.getValueAt(fila, 3).toString());
                    ga = true;
                }
            }
        });
    }
 private void cargarDatosDesdeArchivo() {
        String rutaArchivo = "Registros/datos_cafeterias.txt";
        try (BufferedReader reader = new BufferedReader(new FileReader(rutaArchivo))) {
            String linea;
            modelo.setRowCount(0); // Limpiar tabla antes de cargar
            while ((linea = reader.readLine()) != null) {
                String[] datos = linea.split(",", 4); // 4 columnas esperadas
                if (datos.length == 4) {
                    // Orden columna tabla: Nombre lugar, Ubicacion, Descripcion, Calificacion
                    modelo.addRow(new Object[]{datos[0], datos[1], datos[2], datos[3]});
                }
            }
        } catch (IOException e) {
            JOptionPane.showMessageDialog(this, "Error al cargar los datos: " + e.getMessage());
        }
    }

private void cargarOpcionesDesdeArchivo() {
        String rutaArchivo = "Registros/cafeterias.txt";
        try (BufferedReader reader = new BufferedReader(new FileReader(rutaArchivo))) {
            String linea;
            lugar.removeAllItems();
            lugar.addItem("Seleccionar");
            while ((linea = reader.readLine()) != null) {
                String[] datos = linea.split(",", 3);
                if (datos.length == 3) {
                    lugar.addItem(datos[0].trim());
                }
            }
        } catch (IOException e) {
            JOptionPane.showMessageDialog(this, "Error al cargar las opciones: " + e.getMessage());
        }
    }

   private void agregarOpcionAlArchivo(String nombre, String descripcionTxt, String ubicacionTxt, String calificacionTxt) {
        String rutaArchivo = "Registros/datos_cafeterias.txt";
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(rutaArchivo, true))) {
            // Guardar en orden: Nombre,Ubicacion,Descripcion,Calificacion
            writer.write(nombre + "," + ubicacionTxt + "," + descripcionTxt + "," + calificacionTxt);
            writer.newLine();
            JOptionPane.showMessageDialog(this, "Opción agregada exitosamente.");
        } catch (IOException e) {
            JOptionPane.showMessageDialog(this, "Error al agregar la opción: " + e.getMessage());
        }
    }



private void guardarDatosEnArchivo() {
        String rutaArchivo = "Registros/datos_cafeterias.txt";
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(rutaArchivo))) {
            for (int i = 0; i < modelo.getRowCount(); i++) {
                String nombreLugar = modelo.getValueAt(i, 0).toString();
                String ubicacionLugar = modelo.getValueAt(i, 1).toString();
                String descripcionLugar = modelo.getValueAt(i, 2).toString();
                String calificacionLugar = modelo.getValueAt(i, 3).toString();
                writer.write(nombreLugar + "," + ubicacionLugar + "," + descripcionLugar + "," + calificacionLugar);
                writer.newLine();
            }
            JOptionPane.showMessageDialog(this, "Datos guardados exitosamente.");
        } catch (IOException e) {
            JOptionPane.showMessageDialog(this, "Error al guardar los datos: " + e.getMessage());
        }
    }

private void mtd_prepararTabla() {
        String titulos[] = {"Nombre del lugar", "Ubicacion", "Descripcion", "Calificacion"};
        modelo = new DefaultTableModel(null, titulos);
        tablita.setModel(modelo);
    }
    private void mtd_limpiar() {
        lugar.setSelectedIndex(0);
        ubicacion.setText("");
        descripcion.setText("");
        calificacion.setSelectedIndex(0);
        ga = false;
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
        jLabel8 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        lugar = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        calificacion = new javax.swing.JComboBox<>();
        agregar = new javax.swing.JButton();
        editar = new javax.swing.JButton();
        eliminar = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        descripcion = new javax.swing.JTextArea();
        jScrollPane3 = new javax.swing.JScrollPane();
        ubicacion = new javax.swing.JTextArea();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablita = new javax.swing.JTable();
        btnRegresar = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel8.setFont(new java.awt.Font("Felix Titling", 1, 36)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Cafeteria");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 20, -1, -1));

        jLabel1.setFont(new java.awt.Font("Segoe UI Variable", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Nombre de lugar");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 80, -1, -1));

        lugar.setFont(new java.awt.Font("Segoe UI Variable", 1, 14)); // NOI18N
        lugar.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccionar", "Frato Cafe", "Cafe San Sebas", "Cafe de Ñucallacta", "Gozza Espresso Bar", "Coffe Cor - Cafe de Especialidad", "Jadoco Bistro", "Casa Azul Resto - Bar Gallery", "El frances" }));
        jPanel1.add(lugar, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 80, 206, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI Variable", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Ubicacion");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 260, -1, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI Variable", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Calificacion");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 120, -1, -1));

        calificacion.setFont(new java.awt.Font("Segoe UI Variable", 1, 14)); // NOI18N
        calificacion.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Califique ", "1", "2", "3", "4", "5" }));
        jPanel1.add(calificacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 120, 114, -1));

        agregar.setBackground(new java.awt.Color(0, 0, 255));
        agregar.setFont(new java.awt.Font("Segoe UI Variable", 1, 14)); // NOI18N
        agregar.setForeground(new java.awt.Color(255, 255, 255));
        agregar.setText("Agregar");
        agregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                agregarActionPerformed(evt);
            }
        });
        jPanel1.add(agregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 490, 110, 50));

        editar.setBackground(new java.awt.Color(153, 153, 255));
        editar.setFont(new java.awt.Font("Segoe UI Variable", 1, 14)); // NOI18N
        editar.setText("Editar");
        editar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editarActionPerformed(evt);
            }
        });
        jPanel1.add(editar, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 490, 110, 50));

        eliminar.setBackground(new java.awt.Color(255, 0, 0));
        eliminar.setFont(new java.awt.Font("Segoe UI Variable", 1, 14)); // NOI18N
        eliminar.setForeground(new java.awt.Color(255, 255, 255));
        eliminar.setText("Eliminar");
        eliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eliminarActionPerformed(evt);
            }
        });
        jPanel1.add(eliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 490, 110, 50));

        descripcion.setEditable(false);
        descripcion.setColumns(20);
        descripcion.setFont(new java.awt.Font("Segoe UI Variable", 1, 12)); // NOI18N
        descripcion.setRows(5);
        descripcion.setText("El texto se generará automáticamente al elegir el lugar a\nvisitar.");
        jScrollPane2.setViewportView(descripcion);

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 160, 350, 70));

        ubicacion.setEditable(false);
        ubicacion.setColumns(20);
        ubicacion.setFont(new java.awt.Font("Segoe UI Variable", 1, 12)); // NOI18N
        ubicacion.setRows(5);
        ubicacion.setText("El texto se generará automáticamente al elegir el lugar a\nvisitar.");
        jScrollPane3.setViewportView(ubicacion);

        jPanel1.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 260, 350, 60));

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

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 350, 520, 117));

        btnRegresar.setBackground(new java.awt.Color(204, 0, 0));
        btnRegresar.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        btnRegresar.setForeground(new java.awt.Color(255, 255, 255));
        btnRegresar.setText("Regresar");
        btnRegresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegresarActionPerformed(evt);
            }
        });
        jPanel1.add(btnRegresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 520, 170, 40));

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/logoAppTurismo (1).png"))); // NOI18N
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 20, 80, 80));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/45.png"))); // NOI18N
        jLabel5.setText("jLabel2");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, -450, 650, 580));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/45.png"))); // NOI18N
        jLabel6.setText("jLabel2");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 340, 650, 580));

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/162.png"))); // NOI18N
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(-660, -60, -1, -1));

        jLabel7.setFont(new java.awt.Font("Segoe UI Variable", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Descripcion");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 160, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 860, 590));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void agregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_agregarActionPerformed
 String nombreCafeteria = lugar.getSelectedItem() != null ? lugar.getSelectedItem().toString() : "";
        String descripcionTexto = descripcion.getText().trim();
        String ubicacionTexto = ubicacion.getText().trim();
        String calificacionTexto = calificacion.getSelectedItem() != null ? calificacion.getSelectedItem().toString() : "";
        if (!nombreCafeteria.equals("Seleccionar") && !descripcionTexto.isEmpty() && !ubicacionTexto.isEmpty() && !calificacionTexto.equals("Califique ")) {
            if (!ga) { // Modo agregar nuevo
                if (mtd_validacioningreso(nombreCafeteria)) {
                    JOptionPane.showMessageDialog(this, "Este lugar ya está agregado en la tabla.");
                    return;
                }
                // Agregar fila a la tabla
                modelo.addRow(new Object[]{nombreCafeteria, ubicacionTexto, descripcionTexto, calificacionTexto});
                // Guardar en archivo
                agregarOpcionAlArchivo(nombreCafeteria, descripcionTexto, ubicacionTexto, calificacionTexto);
                mtd_limpiar();
                } else {
                // En modo edición: actualizar fila seleccionada
                int filasel = tablita.getSelectedRow();
                if (filasel != -1) {
                    modelo.setValueAt(nombreCafeteria, filasel, 0);
                    modelo.setValueAt(ubicacionTexto, filasel, 1);
                    modelo.setValueAt(descripcionTexto, filasel, 2);
                    modelo.setValueAt(calificacionTexto, filasel, 3);
                    guardarDatosEnArchivo();
                    mtd_limpiar();
                } else {
                    JOptionPane.showMessageDialog(this, "Seleccione una fila para editar.");
                }
            }
        } else {
            JOptionPane.showMessageDialog(this, "Por favor complete todos los campos correctamente.");
        }



    }//GEN-LAST:event_agregarActionPerformed

    private void editarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editarActionPerformed
      int filasel = tablita.getSelectedRow();
        if (filasel == -1) {
            JOptionPane.showMessageDialog(this, "Por favor seleccione una fila!");
        } else {
            lugar.setSelectedItem(tablita.getValueAt(filasel, 0).toString());
            ubicacion.setText(tablita.getValueAt(filasel, 1).toString());
            descripcion.setText(tablita.getValueAt(filasel, 2).toString());
            calificacion.setSelectedItem(tablita.getValueAt(filasel, 3).toString());
            ga = true;
        }
    }//GEN-LAST:event_editarActionPerformed
   
private boolean mtd_validacioningreso(String dato_validacion) {
        boolean ban = false;
        for (int i = 0; i < modelo.getRowCount(); i++) {
            if (dato_validacion.equals(modelo.getValueAt(i, 0).toString())) {
                ban = true;
                break;
            }
        }
        return ban;
    }
    
    
    private void eliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eliminarActionPerformed
 int filasel = tablita.getSelectedRow();
        if (filasel == -1) {
            JOptionPane.showMessageDialog(this, "No hay ninguna fila seleccionada");
        } else {
            modelo.removeRow(filasel);
            guardarDatosEnArchivo();
        }
    }//GEN-LAST:event_eliminarActionPerformed

    private void btnRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegresarActionPerformed
        this.dispose();
        new plataformaPrincipal().setVisible(true);        // TODO add your handling code here:
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
            java.util.logging.Logger.getLogger(cafeterias.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(cafeterias.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(cafeterias.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(cafeterias.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new cafeterias().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton agregar;
    private javax.swing.JButton btnRegresar;
    private javax.swing.JComboBox<String> calificacion;
    private javax.swing.JTextArea descripcion;
    private javax.swing.JButton editar;
    private javax.swing.JButton eliminar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JComboBox<String> lugar;
    private javax.swing.JTable tablita;
    private javax.swing.JTextArea ubicacion;
    // End of variables declaration//GEN-END:variables
}
