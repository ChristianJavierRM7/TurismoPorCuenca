/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package frm;
import java.io.BufferedReader;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.List;
import javax.swing.JComboBox;


public class ReservaLugares extends javax.swing.JFrame {
    private String correoUsuario;
    private Arbol arbolLugares;
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(ReservaLugares.class.getName());
DefaultTableModel modelo;
    private static boolean ga = false;
    /**
     * Creates new form ReservaLugares
     */
    public ReservaLugares() {
        initComponents();
        setLocationRelativeTo(null);
        mtd_prepararTabla();
        arbolLugares = new Arbol("Lugares");
    inicializarArbol();
         cbMuseos.setVisible(false);
    cbRestaurantes.setVisible(false);
    cbCafeterias.setVisible(false);
    cbMercados.setVisible(false);
    cbMiradores.setVisible(false);
    cbTermales.setVisible(false);
    cbPatrimonios.setVisible(false);
    cbArtesania.setVisible(false);
    cbHoteles.setVisible(false);
    cbIglesias.setVisible(false);
    cbParques.setVisible(false);
    cbCultura.setVisible(false);
    cargarDatosDesdeArchivo();
    }
    private void inicializarArbol() {
    // Agregar lugares al árbol
    arbolLugares.agregarLugar("Lugares", "Museos");
    arbolLugares.agregarLugar("Museos", "Museo de Arte Moderno");
    arbolLugares.agregarLugar("Museos", "Museo del Sombrero de Paja Toquilla");
    arbolLugares.agregarLugar("Museos", "Museo Universitario");
    arbolLugares.agregarLugar("Museos", "Museo Historia de La Medicina");
    arbolLugares.agregarLugar("Museos", "Casa Museo Remigio Crespo Toral");
    arbolLugares.agregarLugar("Museos", "Museo de las Culturas Aborigenes");
    arbolLugares.agregarLugar("Museos", "Museo y Parque Ancestral Pumapungo");
    arbolLugares.agregarLugar("Museos", "Museo de la Gastronomia Ecuatoriana");
    arbolLugares.agregarLugar("Museos", "Museo Catedral Vieja");
    arbolLugares.agregarLugar("Museos", "Museo del Sombrero Homero Ortega");
    arbolLugares.agregarLugar("Museos", "Museo Municipal de la Paja Toquilla y el Sombrero");
    arbolLugares.agregarLugar("Museos", "Museo de La Ciudad");
    arbolLugares.agregarLugar("Museos", "Amalia Uriguen");
    arbolLugares.agregarLugar("Museos", "Museo del Cacao");
    arbolLugares.agregarLugar("Museos", "Museo de las Conceptas");
    arbolLugares.agregarLugar("Museos", "Museo de antigüedades “Zoila Quezada”");
    arbolLugares.agregarLugar("Lugares", "Restaurantes");
    arbolLugares.agregarLugar("Restaurantes", "Tiesto’s Café-Restaurant");
 
    // Agrega más lugares según sea necesario
}
    private void cargarDatosDesdeArchivo() {
    try (BufferedReader reader = new BufferedReader(new FileReader("registroAventura.txt"))) {
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
    private void guardarDatosEnArchivo() {
    try (BufferedWriter writer = new BufferedWriter(new FileWriter("registroAventura.txt"))) {
        for (int i = 0; i < modelo.getRowCount(); i++) {
            String tipo = modelo.getValueAt(i, 0).toString();
            String nombre = modelo.getValueAt(i, 1).toString();
            String fecha = modelo.getValueAt(i, 2).toString();
            writer.write(tipo + "," + nombre + "," + fecha);
            writer.newLine();
        }
    } catch (IOException e) {
        JOptionPane.showMessageDialog(null, "Error al guardar los datos: " + e.getMessage());
    }
}
    
   private void guardarDatosUsuarioReserva(String nombres, String apellidos, String email, String telefono, String tipoReserva, String nombreLugar, Date fechaReserva, String guia, Date fechaInicio, Date fechaFin) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("usuariosReservas.txt", true))) {
            String datosUsuario = String.format("%s,%s,%s,%s,%s,%s,%s,%s,%s,%s%n", 
                nombres, apellidos, email, telefono, tipoReserva, nombreLugar, fechaReserva.toString(), guia, fechaInicio != null ? fechaInicio.toString() : "", fechaFin != null ? fechaFin.toString() : "");
            writer.write(datosUsuario);
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, "Error al guardar los datos del usuario: " + e.getMessage());
        }
    }
 private void mtd_prepararTabla() {
        String titulos[] = {"Tipo", "Nombre", "Fecha"};
        modelo = new DefaultTableModel(null, titulos);
        tablita.setModel(modelo);
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
        jLabel2 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        btnEliminar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablita = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtFecha = new com.toedter.calendar.JDateChooser();
        btnAgregar = new javax.swing.JButton();
        cbMuseos = new javax.swing.JComboBox<>();
        cbRestaurantes = new javax.swing.JComboBox<>();
        cbCafeterias = new javax.swing.JComboBox<>();
        cbMercados = new javax.swing.JComboBox<>();
        cbTermales = new javax.swing.JComboBox<>();
        cbArtesania = new javax.swing.JComboBox<>();
        cbMiradores = new javax.swing.JComboBox<>();
        cbPatrimonios = new javax.swing.JComboBox<>();
        btnOrdenar = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        cbHoteles = new javax.swing.JComboBox<>();
        cbIglesias = new javax.swing.JComboBox<>();
        cbParques = new javax.swing.JComboBox<>();
        cbTipo = new javax.swing.JComboBox<>();
        cbCultura = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();

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

        jLabel2.setFont(new java.awt.Font("Segoe UI Black", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Planificación de lugares por visitar");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 20, -1, -1));

        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("mejor recorrido por la ciudad, para ello, pulsa aquí.");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 110, 340, 20));

        btnEliminar.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnEliminar.setText("Eliminar");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });
        jPanel1.add(btnEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 410, 100, 60));

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

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 210, 720, 180));

        jLabel1.setFont(new java.awt.Font("Segoe UI Variable", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Fecha:");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 170, -1, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI Variable", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Tipo:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 90, -1, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI Variable", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Lugar:");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 130, -1, -1));
        jPanel1.add(txtFecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 170, -1, -1));

        btnAgregar.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnAgregar.setText("Agregar");
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });
        jPanel1.add(btnAgregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 410, 100, 60));

        cbMuseos.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccionar", "Museo de Arte Moderno", "Casa Museo La Condamine", "Museo del Sombrero de Paja Toquilla", "Museo Universitario", "Museo Historia de La Medicina", "Casa Museo Remigio Crespo Toral ", "Museo de las Artes Populares De America", "Museo de las Culturas Aborigenes", "Museo y Parque Ancestral Pumapungo", "Museo de la Gastronomia Ecuatoriana", "Museo Catedral Vieja", "Museo del Sombrero Homero Ortega", "Museo Municipal de la Paja Toquilla y el Sombrero", "Museo de La Ciudad", "Amalia Uriguen", "Museo del Cacao", "Museo de las Conceptas", "Museo de antigüedades “Zoila Quezada”" }));
        jPanel1.add(cbMuseos, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 130, -1, -1));

        cbRestaurantes.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccionar", "Tiesto’s Café-Restaurant", "El Mercado", "Raymipampa", "Café del Museo", "Dos Sucres", "Goza Espresso Bar", "La María Cocina de Huerta", "Jodoco Belgian Bistro", "Fabianos Pizzería", "Café San Sebas" }));
        cbRestaurantes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbRestaurantesActionPerformed(evt);
            }
        });
        jPanel1.add(cbRestaurantes, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 130, -1, -1));

        cbCafeterias.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccionar", "Café de la Sucre", "Café del Zaguán", "Café de San Sebas", "Dulcet", "Paccari" }));
        jPanel1.add(cbCafeterias, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 130, -1, -1));

        cbMercados.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccionar", "Mall del Río", "Milenium Plaza", "Mall Monay Shopping", "Mercado 10 de Agosto", "Mercado 9 de Octubre", "Plaza Rotary", "Mercado El Arenal", "Mercado 27 de Febrero", "Centro Comercial El Vergel", "Mercado de Artesanías CIDAP", " ", " " }));
        jPanel1.add(cbMercados, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 130, -1, -1));

        cbTermales.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccionar", "Piedra de Agua", "Hosteria y Balneario Durán", "Hosteria Termal Rodas", "Novaqua Spa", "Hosteria Agapantos", "Balneario Riñón" }));
        jPanel1.add(cbTermales, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 130, -1, -1));

        cbArtesania.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccionar", "PRAC - EDEC", "CEMUART", "Plaza Rotary", "CIDAP" }));
        jPanel1.add(cbArtesania, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 130, -1, -1));

        cbMiradores.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccionar", "Mirador de Turi", "Parque Nacional Cajas", "Mirador El Calvario", "Mirador Icto Cruz", "Mirador Jalshi de Nulti", "El Boquerón", "Río Tomebamba", "Zoológico Yurak Allpa", "Amaru Bioparque", "Sendero de El Cajas – Laguna Toreadora" }));
        jPanel1.add(cbMiradores, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 130, -1, -1));

        cbPatrimonios.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccionar", "Casa Patrimonial de La Lira", "Casa Patrimonial Quinta Bolívar", "Casa Patrimonial de las Posadas", "Casa Patrimonial Municipal del Alfarero", "Casa Patrimonial Chaguarchimbana", "Casa Patrimonial Municipal del Artista", "Antigua Escuela Central", "Casa Patrimonial Márquez" }));
        jPanel1.add(cbPatrimonios, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 130, -1, -1));

        btnOrdenar.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        btnOrdenar.setText("Ordenar por tipo");
        btnOrdenar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOrdenarActionPerformed(evt);
            }
        });
        jPanel1.add(btnOrdenar, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 410, 160, 60));

        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Seleccione el lugar que desea guardar en sus proximas visitas para agregarlo a la tabla:");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 60, 480, -1));

        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Es recomendable que busques un guía que te ayude a tener un");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 90, 340, 20));

        jButton1.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        jButton1.setText("Ver guías");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 140, 130, 30));

        cbHoteles.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccionar", "Hotel Oro Verde Cuenca", "Mansión Alcázar", "Hotel Carvallo", "Four Points by Sheraton Cuenca", "Hotel Boutique Santa Lucía", "Hotel Cruz del Vado", "San Juan Hotel", "Hotel Victoria", "Hotel El Conquistador", "Hotel Forum" }));
        jPanel1.add(cbHoteles, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 130, -1, -1));

        cbIglesias.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccionar", "Catedral Nueva (Inmaculada Concepción)", "Catedral Vieja (El Sagrario)", "Iglesia de Santo Domingo", "Iglesia de San Blas", "Iglesia de San Alfonso", "Iglesia de San Sebastián", "Iglesia del Cenáculo", "Iglesia de Todos Santos", "Iglesia de El Vergel", "Iglesia de La Merced" }));
        jPanel1.add(cbIglesias, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 130, -1, -1));

        cbParques.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccionar", "Parque Calderón", "Parque de La Madre", "Parque El Paraíso", "Parque Lineal Yanuncay", "Plaza San Francisco", "Plaza del Otorongo", "Plaza Rotary", "Parque Miraflores", "Parque La Libertad", "Parque Luis Cordero" }));
        jPanel1.add(cbParques, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 130, -1, -1));

        cbTipo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccionar", "Museos", "Restaurantes", "Cafeterias", "Mercados", "Miradores", "Termales", "Patrimonios", "Artesania", "Hoteles", "Iglesias", "Parques", "Cultura" }));
        cbTipo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbTipoActionPerformed(evt);
            }
        });
        jPanel1.add(cbTipo, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 90, -1, -1));

        cbCultura.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccionar", "Teatro Casa de la Cultura", "Teatro Pumapungo", "Teatro Sucre", "Centro Cultural CIDAP", "Sala Proceso", "Casa de los Arcos", "Museo de Arte Moderno (también sede de teatro)", "Centro Cultural El Ángel", "Centro Cultural El Alfarero", "La Guarida" }));
        jPanel1.add(cbCultura, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 130, -1, -1));

        jLabel5.setFont(new java.awt.Font("Segoe UI Black", 1, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Elija el tipo");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 130, -1, -1));

        jButton2.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        jButton2.setText("Buscar Lugares");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 410, 160, 60));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 490));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnPrincipioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPrincipioActionPerformed
        // TODO add your handling code here:
        QueVisitarCuenca quevisitarcuenca = new QueVisitarCuenca();
        quevisitarcuenca.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnPrincipioActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        int filaSeleccionada = tablita.getSelectedRow();
    
    if (filaSeleccionada != -1) {
        modelo.removeRow(filaSeleccionada);
        guardarDatosEnArchivo(); // Guardar datos en el archivo
        JOptionPane.showMessageDialog(null, "Fila eliminada exitosamente.");
    } else {
        JOptionPane.showMessageDialog(null, "Seleccione una fila para eliminar.");
    }
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
 if (cbTipo.getSelectedItem() != null && cbTipo.getSelectedItem().toString().length() > 0) {
        String tipoLugar = cbTipo.getSelectedItem().toString();
        String lugarSeleccionado = "";
        if ("Museos".equals(tipoLugar)) {
            lugarSeleccionado = cbMuseos.getSelectedItem().toString();
        } else if ("Restaurantes".equals(tipoLugar)) {
            lugarSeleccionado = cbRestaurantes.getSelectedItem().toString();
        } else if ("Cafeterias".equals(tipoLugar)) {
            lugarSeleccionado = cbCafeterias.getSelectedItem().toString();
        } else if ("Mercados".equals(tipoLugar)) {
            lugarSeleccionado = cbMercados.getSelectedItem().toString();
        } else if ("Miradores".equals(tipoLugar)) {
            lugarSeleccionado = cbMiradores.getSelectedItem().toString();
        } else if ("Termales".equals(tipoLugar)) {
            lugarSeleccionado = cbTermales.getSelectedItem().toString();
        } else if ("Patrimonios".equals(tipoLugar)) {
            lugarSeleccionado = cbPatrimonios.getSelectedItem().toString();
        } else if ("Artesania".equals(tipoLugar)) {
       lugarSeleccionado = cbArtesania.getSelectedItem().toString();
        }else if("Hoteles".equals(tipoLugar)){
            lugarSeleccionado = cbHoteles.getSelectedItem().toString();
        }else if("Iglesias".equals(tipoLugar)){
            lugarSeleccionado = cbIglesias.getSelectedItem().toString();
        }else if("Parques".equals(tipoLugar)){
            lugarSeleccionado = cbParques.getSelectedItem().toString();
        }else if("Cultura".equals(tipoLugar)){
            lugarSeleccionado = cbCultura.getSelectedItem().toString();
        }
        
        // Verificar que se haya seleccionado una fecha
        if (txtFecha.getDate() != null) {
            Date fechaVisita = txtFecha.getDate();
            String nuevaFila[] = {tipoLugar, lugarSeleccionado, fechaVisita.toString()};
            modelo.addRow(nuevaFila);
            guardarDatosEnArchivo();
            String[] datosUsuario = obtenerDatosUsuario(); // Método que obtenga los datos del usuario
                guardarDatosUsuarioReserva(datosUsuario[0], datosUsuario[1], datosUsuario[2], datosUsuario[3], tipoLugar, lugarSeleccionado, fechaVisita, null, null, null);
            mtd_limpiar();
        } else {
            JOptionPane.showMessageDialog(null, "Seleccione una fecha de visita");
        }
    } else {
        JOptionPane.showMessageDialog(null, "Ingrese el tipo de lugar a visitar");
    }     
      
    }//GEN-LAST:event_btnAgregarActionPerformed
private void mtd_limpiar() {
        cbTipo.setSelectedIndex(0);
        cbMuseos.setSelectedIndex(0);
        cbRestaurantes.setSelectedIndex(0);
        txtFecha.setDate(null);
    }
 private String[] obtenerDatosUsuario() {
        String[] datos = new String[4]; // Nombre, Apellido, Correo, Teléfono
        try (BufferedReader br = new BufferedReader(new FileReader("cuentausers.txt"))) {
            String linea;
            while ((linea = br.readLine()) != null) {
                String[] partes = linea.split(",");
                if (partes.length == 6 && partes[2].equals(correoUsuario)) { // Verifica que el correo coincida
                    datos[0] = partes[0]; // Nombre
                    datos[1] = partes[1]; // Apellido
                    datos[2] = partes[2]; // Correo
                    datos[3] = partes[3]; // Teléfono
                    break;
                }
            }
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, "Error al leer los datos del usuario: " + e.getMessage());
        }
        return datos;
    }
 class Nodo {
    String nombre;
    List<Nodo> hijos;

    public Nodo(String nombre) {
        this.nombre = nombre;
        this.hijos = new ArrayList<>();
    }

    public void agregarHijo(Nodo hijo) {
        hijos.add(hijo);
    }
}

class Arbol {
    Nodo raiz;

    public Arbol(String nombreRaiz) {
        raiz = new Nodo(nombreRaiz);
    }

    public void agregarLugar(String nombrePadre, String nombreHijo) {
        Nodo padre = buscarNodo(raiz, nombrePadre);
        if (padre != null) {
            padre.agregarHijo(new Nodo(nombreHijo));
        }
    }

    private Nodo buscarNodo(Nodo nodo, String nombre) {
        if (nodo.nombre.equals(nombre)) {
            return nodo;
        }
        for (Nodo hijo : nodo.hijos) {
            Nodo resultado = buscarNodo(hijo, nombre);
            if (resultado != null) {
                return resultado;
            }
        }
        return null;
    }

    public List<String> buscarLugares(String nombre) {
        List<String> resultados = new ArrayList<>();
        buscarLugaresRecursivo(raiz, nombre, resultados);
        return resultados;
    }

    private void buscarLugaresRecursivo(Nodo nodo, String nombre, List<String> resultados) {
        if (nodo.nombre.toLowerCase().contains(nombre.toLowerCase())) {
            resultados.add(nodo.nombre);
        }
        for (Nodo hijo : nodo.hijos) {
            buscarLugaresRecursivo(hijo, nombre, resultados);
        }
    }
}

private void ordenarPorFecha() {
    int n = modelo.getRowCount();
    List<Object[]> filas = new ArrayList<>();

    // Guardar las filas en una lista
    for (int i = 0; i < n; i++) {
        Object[] fila = new Object[modelo.getColumnCount()];
        for (int j = 0; j < modelo.getColumnCount(); j++) {
            fila[j] = modelo.getValueAt(i, j);
        }
        filas.add(fila);
    }

    // Ordenar la lista por fecha
    Collections.sort(filas, new Comparator<Object[]>() {
        @Override
        public int compare(Object[] fila1, Object[] fila2) {
            Date fecha1 = (Date) fila1[2]; // Columna de fecha
            Date fecha2 = (Date) fila2[2]; // Columna de fecha
            return fecha1.compareTo(fecha2);
        }
    });

    // Limpiar el modelo y volver a agregar las filas ordenadas
    modelo.setRowCount(0); // Limpiar el modelo
    for (Object[] fila : filas) {
        modelo.addRow(fila);
    }
}


 

    private void cbTipoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbTipoActionPerformed
        String opcionSeleccionada = (String) cbTipo.getSelectedItem();
    
    cbMuseos.setVisible(false);
    cbRestaurantes.setVisible(false);
    cbCafeterias.setVisible(false);
    cbMercados.setVisible(false);
    cbMiradores.setVisible(false);
    cbTermales.setVisible(false);
    cbPatrimonios.setVisible(false);
    cbArtesania.setVisible(false);
    cbHoteles.setVisible(false);
    cbIglesias.setVisible(false);
    cbParques.setVisible(false);
    cbCultura.setVisible(false);
    switch (opcionSeleccionada) {
        case "Museos":
            cbMuseos.setVisible(true);
            break;
        case "Restaurantes":
            cbRestaurantes.setVisible(true);
            break;
            case "Cafeterias":
            cbCafeterias.setVisible(true);
            break;
        case "Mercados":
            cbMercados.setVisible(true);
            break;
        case "Miradores":
            cbMiradores.setVisible(true);
            break;
        case "Termales":
            cbTermales.setVisible(true);
            break;
        case "Patrimonios":
            cbPatrimonios.setVisible(true);
            break;
        case "Artesania":
            cbArtesania.setVisible(true);
            break;
        case "Hoteles":
            cbHoteles.setVisible(true);
            break;
        case "Iglesias":
            cbIglesias.setVisible(true);
            break;   
        case "Parques":
            cbIglesias.setVisible(true);
            break;   
            case "Cultura":
            cbCultura.setVisible(true);
            break;    
    }
    }//GEN-LAST:event_cbTipoActionPerformed
private void ordenarPorTipo() {
    int n = modelo.getRowCount();
    boolean intercambiado;

    do {
        intercambiado = false;
        for (int i = 0; i < n - 1; i++) {
            String tipo1 = modelo.getValueAt(i, 0).toString();
            String tipo2 = modelo.getValueAt(i + 1, 0).toString();
            if (tipo1.compareTo(tipo2) > 0) {
               
                for (int j = 0; j < modelo.getColumnCount(); j++) {
                    Object temp = modelo.getValueAt(i, j);
                    modelo.setValueAt(modelo.getValueAt(i + 1, j), i, j);
                    modelo.setValueAt(temp, i + 1, j);
                }
                intercambiado = true;
            }
        }
        n--; 
    } while (intercambiado);
}

    private void btnOrdenarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOrdenarActionPerformed
        // TODO add your handling code here:
        ordenarPorTipo();
    JOptionPane.showMessageDialog(null, "Datos ordenados por tipo de lugar.");
    }//GEN-LAST:event_btnOrdenarActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        VerGuias guias = new VerGuias();
        guias.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
                                                
    String nombreLugar = JOptionPane.showInputDialog("Ingrese el nombre del lugar a buscar:");
    if (nombreLugar != null && !nombreLugar.trim().isEmpty()) {
        List<String> resultados = new ArrayList<>();
        
        // Buscar en cada ComboBox
        buscarEnComboBox(cbMuseos, nombreLugar, resultados);
        buscarEnComboBox(cbRestaurantes, nombreLugar, resultados);
        buscarEnComboBox(cbCafeterias, nombreLugar, resultados);
        buscarEnComboBox(cbMercados, nombreLugar, resultados);
        buscarEnComboBox(cbMiradores, nombreLugar, resultados);
        buscarEnComboBox(cbTermales, nombreLugar, resultados);
        buscarEnComboBox(cbPatrimonios, nombreLugar, resultados);
        buscarEnComboBox(cbArtesania, nombreLugar, resultados);
        buscarEnComboBox(cbHoteles, nombreLugar, resultados);
        buscarEnComboBox(cbIglesias, nombreLugar, resultados);
        buscarEnComboBox(cbParques, nombreLugar, resultados);
        buscarEnComboBox(cbCultura, nombreLugar, resultados);
        
        // Mostrar resultados
        if (resultados.isEmpty()) {
            JOptionPane.showMessageDialog(null, "No se encontraron lugares.");
        } else {
            StringBuilder mensaje = new StringBuilder("Lugares encontrados:\n");
            for (String lugar : resultados) {
                mensaje.append(lugar).append("\n");
            }
            JOptionPane.showMessageDialog(null, mensaje.toString());
        }
    } else {
        JOptionPane.showMessageDialog(null, "Por favor, ingrese un nombre para buscar.");
    }

    }//GEN-LAST:event_jButton2ActionPerformed
private void buscarEnComboBox(JComboBox<String> comboBox, String nombreLugar, List<String> resultados) {
    for (int i = 0; i < comboBox.getItemCount(); i++) {
        String item = comboBox.getItemAt(i);
        if (item.toLowerCase().contains(nombreLugar.toLowerCase()) && !item.equals("Seleccionar")) {
            resultados.add(item);
        }
    }
}

    private void cbRestaurantesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbRestaurantesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbRestaurantesActionPerformed

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
        java.awt.EventQueue.invokeLater(() -> new ReservaLugares().setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnOrdenar;
    private javax.swing.JButton btnPrincipio;
    private javax.swing.JComboBox<String> cbArtesania;
    private javax.swing.JComboBox<String> cbCafeterias;
    private javax.swing.JComboBox<String> cbCultura;
    private javax.swing.JComboBox<String> cbHoteles;
    private javax.swing.JComboBox<String> cbIglesias;
    private javax.swing.JComboBox<String> cbMercados;
    private javax.swing.JComboBox<String> cbMiradores;
    private javax.swing.JComboBox<String> cbMuseos;
    private javax.swing.JComboBox<String> cbParques;
    private javax.swing.JComboBox<String> cbPatrimonios;
    private javax.swing.JComboBox<String> cbRestaurantes;
    private javax.swing.JComboBox<String> cbTermales;
    private javax.swing.JComboBox<String> cbTipo;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tablita;
    private com.toedter.calendar.JDateChooser txtFecha;
    // End of variables declaration//GEN-END:variables
}
