/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vistas;

import gestores.GestorConcepto;
import gestores.GestorEmpleado;
import gestores.GestorFamilia;
import gestores.GestorLiquidacion;
import gestores.GestorUsuario;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import modelo.Concepto;
import modelo.Empleado;
import modelo.Familia;
import modelo.Liquidacion;
import modelo.LiquidacionLinea;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.view.JRViewer;
import proyectociber.ProyectoCiber;
import reportes.JDialogImpresion;

/**
 *
 * @author abel
 */
public class VentanaLiquidacion extends javax.swing.JDialog {

    /**
     * Creates new form VentanaLiquidacion
     */
    public VentanaLiquidacion(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        ponerconceptos();
        limpiar();
        limpiarfamilia();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        comboaño = new javax.swing.JComboBox<>();
        combomes = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        lbldni = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        lblnombre = new javax.swing.JLabel();
        lblcargo = new javax.swing.JLabel();
        lblsueldo = new javax.swing.JLabel();
        lblingreso = new javax.swing.JLabel();
        lblantiguedad = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablafamilia = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        comboconcepto = new javax.swing.JComboBox<>();
        txtcantidad = new javax.swing.JTextField();
        jButton3 = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tablaliquidacion = new javax.swing.JTable();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        lblsuma = new javax.swing.JLabel();
        lblresta = new javax.swing.JLabel();
        lblneto = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setBackground(new java.awt.Color(204, 204, 205));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        comboaño.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "2017", "2018", "2019" }));
        getContentPane().add(comboaño, new org.netbeans.lib.awtextra.AbsoluteConstraints(395, 17, 65, -1));

        combomes.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "ENERO", "FEBRERO", "MARZO", "ABRIL", "MAYO", "JUNIO", "JULIO", "AGOSTO", "SEPTIEMBRE", "OCTUBRE", "NOVIEMBRE", "DICIEMBRE" }));
        combomes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                combomesActionPerformed(evt);
            }
        });
        getContentPane().add(combomes, new org.netbeans.lib.awtextra.AbsoluteConstraints(186, 17, 99, -1));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("MES");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 17, 62, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("AÑO");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(345, 17, -1, -1));

        jPanel5.setBackground(new java.awt.Color(204, 204, 255));

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Datos del Empleado", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 14))); // NOI18N

        jLabel3.setText("DNI:");

        lbldni.setForeground(new java.awt.Color(0, 0, 255));
        lbldni.setText("DNI:");

        jLabel4.setText("NOMBRE:");

        jLabel5.setText("CARGO:");

        jLabel6.setText("SUELDO:");

        jLabel7.setText("ANTIGUEDAD:");

        jLabel8.setText("INGRESO:");

        lblnombre.setForeground(new java.awt.Color(0, 0, 255));
        lblnombre.setText("NOMBRE:");

        lblcargo.setForeground(new java.awt.Color(0, 0, 255));
        lblcargo.setText("CARGO:");

        lblsueldo.setForeground(new java.awt.Color(0, 0, 255));
        lblsueldo.setText("CARGO:");

        lblingreso.setForeground(new java.awt.Color(0, 0, 255));
        lblingreso.setText("INGRESO:");

        lblantiguedad.setForeground(new java.awt.Color(0, 0, 255));
        lblantiguedad.setText("ANTIGUEDAD:");

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/buscar.png"))); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblcargo, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblsueldo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblnombre, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lbldni, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblingreso, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblantiguedad, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(lbldni))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblnombre)
                            .addComponent(jLabel4)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblcargo)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblsueldo)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(lblingreso))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(lblantiguedad))
                .addContainerGap(55, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(204, 204, 204));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Datos de la Familia", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 14))); // NOI18N

        tablafamilia.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(tablafamilia);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jScrollPane1)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel3.setBackground(new java.awt.Color(204, 204, 204));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Item de Liquidacion", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 14))); // NOI18N
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.add(comboconcepto, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 47, 170, -1));
        jPanel3.add(txtcantidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(247, 47, 32, -1));

        jButton3.setText("Agregar");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 43, 90, 30));

        jLabel9.setText("Cant.");
        jPanel3.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 50, -1, -1));

        jPanel4.setBackground(new java.awt.Color(204, 204, 204));
        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Datos de Liquidacion", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 14))); // NOI18N
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tablaliquidacion.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(tablaliquidacion);

        jPanel4.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(5, 30, 580, 118));

        jLabel10.setText("HABERES:");
        jPanel4.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(27, 172, -1, -1));

        jLabel11.setText("DESCUENTO:");
        jPanel4.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(196, 172, -1, -1));

        jLabel12.setText("SUELDO NETO:");
        jPanel4.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(395, 172, -1, -1));

        lblsuma.setForeground(new java.awt.Color(0, 0, 255));
        lblsuma.setText("jLabel13");
        jPanel4.add(lblsuma, new org.netbeans.lib.awtextra.AbsoluteConstraints(86, 172, -1, -1));

        lblresta.setForeground(new java.awt.Color(0, 0, 255));
        lblresta.setText("jLabel13");
        jPanel4.add(lblresta, new org.netbeans.lib.awtextra.AbsoluteConstraints(278, 172, 111, -1));

        lblneto.setForeground(new java.awt.Color(0, 0, 255));
        lblneto.setText("jLabel13");
        jPanel4.add(lblneto, new org.netbeans.lib.awtextra.AbsoluteConstraints(501, 172, -1, -1));

        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Clear.png"))); // NOI18N
        jButton4.setText("Borrar Linea");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel4.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 204, 166, 43));

        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Cancel.png"))); // NOI18N
        jButton5.setText("Cancelar");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Touch.png"))); // NOI18N
        jButton2.setText(" Liquidacion Por Defecto");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/if_Save_as_131762.png"))); // NOI18N
        jButton6.setText("Guardar");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, 439, Short.MAX_VALUE)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 593, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(232, 232, 232))))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(62, 62, 62)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(29, 29, 29)
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(19, 19, 19)
                        .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(24, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1070, 590));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        VentanaBuscarEmpleado v = new VentanaBuscarEmpleado(this, true);
        v.setVisible(true);
        if(v.getAceptado()==1){
            empleado.setId(v.getId());
            gestorEmpleado.recuperar(empleado);
            lblantiguedad.setText(""+empleado.getAntiguedad()+" AÑOS");
            lblcargo.setText(""+empleado.getCategoria().getCategoria());
            lbldni.setText(""+empleado.getDni());
            lblingreso.setText(""+empleado.getIngreso());
            lblnombre.setText(""+empleado.getNombre());
            lblsueldo.setText("$"+empleado.getCategoria().getBasico());
            mostrarfamilia();
        
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        if(lblnombre.getText().equalsIgnoreCase("Nombre:"))JOptionPane.showMessageDialog(this, "Debe seleccionar un empleado");
        else{
        gestorLiquidacion.cargarliquidacion(liquidacion,listaconceptos,empleado);
        mostrarliquidacion();
        
        
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed

    if(txtcantidad.getText().isEmpty())JOptionPane.showMessageDialog(this, "Debe ingresar la cantidad");
    else{
    int cantidad = Integer.parseInt(txtcantidad.getText());
    
    if(cantidad<1)JOptionPane.showMessageDialog(this, "La cantidad ingresada debe ser positiva");
    
    else{
    Concepto x = gestorConcepto.buscar(comboconcepto.getSelectedItem().toString());
    gestorLiquidacion.agregarLinea(liquidacion, x, cantidad, 0, 0, empleado);
    mostrarliquidacion();
    }
    }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
       int fila =  tablaliquidacion.getSelectedRow();
       if(fila == -1 )JOptionPane.showMessageDialog(this, "Debe seleccionar una fila");
       else
       {int r = JOptionPane.showConfirmDialog(this, "Desea borrar el concepto","confirme", JOptionPane.YES_NO_OPTION);
       if(r==JOptionPane.YES_OPTION)
       { gestorLiquidacion.borrarLinea(fila,liquidacion);
            mostrarliquidacion();
       
       }
       }
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        liquidacion.getLineas().clear();
        mostrarliquidacion();
        limpiar();
    }//GEN-LAST:event_jButton5ActionPerformed

    private void combomesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_combomesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_combomesActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        if(lblantiguedad.getText().isEmpty())JOptionPane.showMessageDialog(this, "Debe seleccionar un empleado");
        else
            if(tablaliquidacion.getRowCount()==0)JOptionPane.showMessageDialog(this, "Debe agregar los conceptos");
        else
        {
         liquidacion.setAnio(comboaño.getSelectedItem().toString());
         liquidacion.setEmpleado(empleado);
         liquidacion.setFecha(new java.util.Date());
         liquidacion.setMes(combomes.getSelectedItem().toString());
         liquidacion.setUsuario(GestorUsuario.logeado.getEmpleado());// el empleado que esta logeado en el sistema
         gestorLiquidacion.agregar(liquidacion);
         if(JOptionPane.showConfirmDialog(this, "Desea imprimir esta liquidacion", "Confirme", JOptionPane.YES_NO_OPTION)==JOptionPane.YES_OPTION)
         {imprimir();
         }
         liquidacion.getLineas().clear();
        mostrarliquidacion();
        limpiar();
        }
    }//GEN-LAST:event_jButton6ActionPerformed

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
            java.util.logging.Logger.getLogger(VentanaLiquidacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaLiquidacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaLiquidacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaLiquidacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                VentanaLiquidacion dialog = new VentanaLiquidacion(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> comboaño;
    private javax.swing.JComboBox<String> comboconcepto;
    private javax.swing.JComboBox<String> combomes;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblantiguedad;
    private javax.swing.JLabel lblcargo;
    private javax.swing.JLabel lbldni;
    private javax.swing.JLabel lblingreso;
    private javax.swing.JLabel lblneto;
    private javax.swing.JLabel lblnombre;
    private javax.swing.JLabel lblresta;
    private javax.swing.JLabel lblsueldo;
    private javax.swing.JLabel lblsuma;
    private javax.swing.JTable tablafamilia;
    private javax.swing.JTable tablaliquidacion;
    private javax.swing.JTextField txtcantidad;
    // End of variables declaration//GEN-END:variables

private GestorEmpleado gestorEmpleado =  new GestorEmpleado();
private Empleado empleado = new Empleado();
private GestorFamilia gestorFamilia = new GestorFamilia();
private GestorConcepto gestorConcepto = new GestorConcepto();
private GestorLiquidacion gestorLiquidacion = new GestorLiquidacion();
private Liquidacion liquidacion = new Liquidacion();

private ArrayList<Concepto > listaconceptos; // arraylist de los conceptos
    private void mostrarfamilia() {
    DefaultTableModel matriz = new DefaultTableModel();
        matriz.addColumn("Id");
        matriz.addColumn("Dni");
        matriz.addColumn("Nombre");
        matriz.addColumn("Parentesco");
        matriz.addColumn("Empleado");
       
        ArrayList<Familia> lista = gestorFamilia.ObtenerLista(empleado.getId());
        for (Familia f : lista) {
            matriz.addRow(new Object[]{ 
                f.getId(),
                f.getDni(),
                f.getNombre(),
                f.getParentesco(),
                f.getEmpleado().getNombre(),
                
            });
        }
        tablafamilia.setModel(matriz);   
    }

    private void ponerconceptos() {
        listaconceptos=gestorConcepto.ObtenerLista();
        
     comboconcepto.removeAllItems();
        for (Concepto c : listaconceptos) {
            comboconcepto.addItem(c.getDescripcion());
            
        }
    }

    private void mostrarliquidacion() {
       DefaultTableModel matriz = new DefaultTableModel();
        matriz.addColumn("Codigo");
        matriz.addColumn("Descripcion");
        matriz.addColumn("Valor");
        matriz.addColumn("Cantidad");
        matriz.addColumn("Haberes");
        matriz.addColumn("Descuento");
       
        ArrayList<LiquidacionLinea> lista = liquidacion.getLineas();
        for (LiquidacionLinea l : lista) {
            matriz.addRow(new Object[]{ 
                l.getConcepto().getCodigo(),
                l.getConcepto().getDescripcion(),
                l.getValor(),
                l.getCantidad(),
                l.getSuma(),
                l.getResta()
                
            });
        }
        tablaliquidacion.setModel(matriz);
        liquidacion.calcular();
        lblsuma.setText("$"+liquidacion.getAporte());
        lblresta.setText("$"+liquidacion.getDescuento());
        lblneto.setText("$"+liquidacion.getNeto());
        
        
        
    }

    private void limpiar() {
        lblantiguedad.setText("");
        lblcargo.setText("");
        lbldni.setText("");
        lblingreso.setText("");
        lblneto.setText("");
        lblnombre.setText("");
        lblresta.setText("");
        lblsueldo.setText("");
        lblsuma.setText("");
        limpiarfamilia();
    }

    private void limpiarfamilia() {
        
     DefaultTableModel matriz = new DefaultTableModel();
        matriz.addColumn("Id");
        matriz.addColumn("Dni");
        matriz.addColumn("Nombre");
        matriz.addColumn("Parentesco");
        matriz.addColumn("Empleado");
       
        
        tablafamilia.setModel(matriz);   
    }

    private void imprimir() {
          ProyectoCiber cn = new ProyectoCiber();
         Map parameters = new HashMap();
           parameters.put("Id",liquidacion.getId());
           System.out.print("Id="+liquidacion.getId());
            String REPORTE ="C:\\Users\\abel\\Documents\\NetBeansProjects\\ProyectoCiber\\src\\reportes\\Liquidacion.jrxml";
            
      try{
                JasperReport jasperReport =JasperCompileManager.compileReport(REPORTE);
                
                JasperPrint jasperPrint=JasperFillManager.fillReport(jasperReport, parameters, cn.getConexion());
                JRViewer jrv=new JRViewer(jasperPrint);
            JDialogImpresion j;
            j = new JDialogImpresion(this,jrv);
           
            j.setVisible(true);
            
            }catch(JRException d){
                d.printStackTrace();
            }
    }


}
