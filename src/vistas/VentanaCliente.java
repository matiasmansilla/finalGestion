/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vistas;

import gestores.GestorCliente;
import gestores.GestorEmpleado;
import gestores.GestorLocalidad;
import gestores.GestorProvincia;
import java.util.Date;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

import modelo.Cliente;
import modelo.Localidad;
import modelo.Provincia;

/**
 *
 * @author abel
 */
public class VentanaCliente extends javax.swing.JDialog {

    /**
     * Creates new form VentanaCliente
     */
    public VentanaCliente(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        cargarProvincia();
        cargarLocalidad();
        mostrarcliente();
        cancelar();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtcuil = new javax.swing.JTextField();
        txtmail = new javax.swing.JTextField();
        txtnombre = new javax.swing.JTextField();
        txttelefono = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtnumero = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtcalle = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        txtpiso = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        combolocalidad = new javax.swing.JComboBox<>();
        jLabel11 = new javax.swing.JLabel();
        txtdepartamento = new javax.swing.JTextField();
        comboprovincia = new javax.swing.JComboBox<>();
        combofecha = new org.jdesktop.swingx.JXDatePicker();
        jSeparator1 = new javax.swing.JSeparator();
        jPanel1 = new javax.swing.JPanel();
        botonagregar = new javax.swing.JButton();
        botonmodificar = new javax.swing.JButton();
        botonborrar = new javax.swing.JButton();
        txtdni = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabla = new javax.swing.JTable();
        botoncancelar = new javax.swing.JButton();
        botonsalir = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Cliente");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("Cuil");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 50, 50, 23));

        jLabel2.setText("Alta");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(26, 200, 88, 23));

        jLabel3.setText("Nombre");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(26, 76, 88, 23));

        jLabel4.setText("Telefono");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(26, 117, 88, 23));

        jLabel5.setText("EMail");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(26, 151, 88, 23));

        txtcuil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtcuilActionPerformed(evt);
            }
        });
        txtcuil.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtcuilKeyTyped(evt);
            }
        });
        getContentPane().add(txtcuil, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 50, 113, -1));

        txtmail.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtmailKeyTyped(evt);
            }
        });
        getContentPane().add(txtmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 150, 113, -1));

        txtnombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtnombreKeyTyped(evt);
            }
        });
        getContentPane().add(txtnombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 80, 113, -1));

        txttelefono.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txttelefonoKeyTyped(evt);
            }
        });
        getContentPane().add(txttelefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 120, 113, -1));

        jLabel6.setText("Numero");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 240, -1, -1));

        txtnumero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtnumeroActionPerformed(evt);
            }
        });
        txtnumero.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtnumeroKeyTyped(evt);
            }
        });
        getContentPane().add(txtnumero, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 240, 100, -1));

        jLabel7.setText("Departamento");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 280, -1, -1));

        jLabel8.setText("Calle");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(26, 244, -1, -1));
        getContentPane().add(txtcalle, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 240, 182, -1));

        jLabel9.setText("Provincia");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 320, -1, -1));

        txtpiso.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtpisoKeyTyped(evt);
            }
        });
        getContentPane().add(txtpiso, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 280, 100, -1));

        jLabel10.setText("Piso");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 280, -1, -1));

        combolocalidad.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        getContentPane().add(combolocalidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 360, 90, -1));

        jLabel11.setText("Localidad");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 360, -1, -1));

        txtdepartamento.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtdepartamentoKeyTyped(evt);
            }
        });
        getContentPane().add(txtdepartamento, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 280, 140, -1));

        comboprovincia.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        comboprovincia.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                comboprovinciaItemStateChanged(evt);
            }
        });
        comboprovincia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboprovinciaActionPerformed(evt);
            }
        });
        getContentPane().add(comboprovincia, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 320, 90, -1));
        getContentPane().add(combofecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 200, -1, -1));
        getContentPane().add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 230, 740, -1));

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));
        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        botonagregar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/mas.png"))); // NOI18N
        botonagregar.setText("Agregar");
        botonagregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonagregarActionPerformed(evt);
            }
        });

        botonmodificar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/modificar.png"))); // NOI18N
        botonmodificar.setText("Modificar");
        botonmodificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonmodificarActionPerformed(evt);
            }
        });

        botonborrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Eraser.png"))); // NOI18N
        botonborrar.setText("Borrar");
        botonborrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonborrarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(botonagregar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(botonmodificar, javax.swing.GroupLayout.DEFAULT_SIZE, 122, Short.MAX_VALUE)
                    .addComponent(botonborrar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(29, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(16, Short.MAX_VALUE)
                .addComponent(botonagregar)
                .addGap(18, 18, 18)
                .addComponent(botonmodificar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(botonborrar)
                .addGap(18, 18, 18))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 30, 190, 190));

        txtdni.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtdniActionPerformed(evt);
            }
        });
        txtdni.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtdniKeyTyped(evt);
            }
        });
        getContentPane().add(txtdni, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 20, 113, -1));

        jLabel12.setText("Dni");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, 88, 23));

        jPanel2.setBackground(new java.awt.Color(204, 204, 255));

        tabla.setModel(new javax.swing.table.DefaultTableModel(
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
        tabla.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                tablaMouseReleased(evt);
            }
        });
        jScrollPane1.setViewportView(tabla);

        botoncancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Cancel.png"))); // NOI18N
        botoncancelar.setText("Cancelar");
        botoncancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botoncancelarActionPerformed(evt);
            }
        });

        botonsalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Right.png"))); // NOI18N
        botonsalir.setText("Salir");
        botonsalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonsalirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(74, 74, 74)
                .addComponent(botoncancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 256, Short.MAX_VALUE)
                .addComponent(botonsalir, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(199, 199, 199))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(398, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botoncancelar)
                    .addComponent(botonsalir))
                .addGap(41, 41, 41))
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 770, 600));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void botonborrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonborrarActionPerformed
        int r=JOptionPane.showConfirmDialog(this, "Desea borrar este cliente", "confirme", JOptionPane.YES_NO_OPTION);
        if(r==JOptionPane.YES_OPTION){
        gestor.borrar(cliente);
        cancelar();
        mostrarcliente();
        }
    }//GEN-LAST:event_botonborrarActionPerformed

    private void botonagregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonagregarActionPerformed
       String cuil = txtcuil.getText();
       String dni = txtdni.getText();
       String nombre = txtnombre.getText();
       String telefono = txttelefono.getText();
       String mail = txtmail.getText();
       Date  alta =combofecha.getDate();
       String calle = txtcalle.getText();
       String numero = txtnumero.getText();
       String piso = txtpiso.getText();
       String departamento = txtdepartamento.getText();
       int localidad_Id = gestorLocalidad.buscarIdLocalidad(combolocalidad.getSelectedItem().toString());
       
      
       
       Cliente cli= new Cliente();
       cli.setDni(dni);
       cli.setCuil(cuil);
       cli.setNombre(nombre);
       cli.setTelefono(telefono);
       cli.setMail(mail);
        cli.setAlta(alta);
        cli.getDomicilio().setCalle(calle);
        cli.getDomicilio().setNumero(numero);
        cli.getDomicilio().setPiso(piso);
        cli.getDomicilio().setDepartamento(departamento);
        cli.getDomicilio().getLocalidad().setId(localidad_Id);
      
       gestor.agregar(cli);
                
    }//GEN-LAST:event_botonagregarActionPerformed

    private void txtnumeroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtnumeroActionPerformed
        
    }//GEN-LAST:event_txtnumeroActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        cargarLocalidad();
    }//GEN-LAST:event_formWindowOpened

    private void comboprovinciaItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_comboprovinciaItemStateChanged
        if(comboprovincia.getSelectedIndex()>-1){// si esta seleccionado algo
        cargarLocalidad();
        }
    }//GEN-LAST:event_comboprovinciaItemStateChanged

    private void comboprovinciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboprovinciaActionPerformed
        
    }//GEN-LAST:event_comboprovinciaActionPerformed

    private void botonmodificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonmodificarActionPerformed
       String dni = txtdni.getText();
        String cuil = txtcuil.getText();
       String nombre = txtnombre.getText();
       String telefono = txttelefono.getText();
       String mail = txtmail.getText();
       Date  alta =combofecha.getDate();
       String calle = txtcalle.getText();
       String numero = txtnumero.getText();
       String piso = txtpiso.getText();
       String departamento = txtdepartamento.getText();
       int localidad_Id = gestorLocalidad.buscarIdLocalidad(combolocalidad.getSelectedItem().toString());
       
       cliente.setDni(dni);
       cliente.setCuil(cuil);
       cliente.setNombre(nombre);
       cliente.setTelefono(telefono);
       cliente.setMail(mail);
        cliente.setAlta(alta);
        cliente.getDomicilio().setCalle(calle);
        cliente.getDomicilio().setNumero(numero);
        cliente.getDomicilio().setPiso(piso);
        cliente.getDomicilio().setDepartamento(departamento);
        cliente.getDomicilio().getLocalidad().setId(localidad_Id);
      
       gestor.modificar(cliente);
       cancelar();
       mostrarcliente();
                
                                                
        
    }//GEN-LAST:event_botonmodificarActionPerformed

    private void tablaMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaMouseReleased
        int Id = Integer.parseInt(tabla.getValueAt(tabla.getSelectedRow(), 0).toString());
        cliente.setId(Id);
        gestor.recuperar(cliente);
        txtdni.setText(cliente.getDni());
        txtcuil.setText(cliente.getCuil());
        txtnombre.setText(cliente.getNombre());
        txttelefono.setText(cliente.getTelefono());
        txtmail.setText(cliente.getMail());
        combofecha.setDate(cliente.getAlta());
        txtcalle.setText(cliente.getDomicilio().getCalle());
        txtnumero.setText(cliente.getDomicilio().getNumero());
        txtpiso.setText(cliente.getDomicilio().getPiso());
        txtdepartamento.setText(cliente.getDomicilio().getDepartamento());
        comboprovincia.setSelectedItem(cliente.getDomicilio().getLocalidad().getProvincia().getProvincia());
        combolocalidad.setSelectedItem(cliente.getDomicilio().getLocalidad().getLocalidad());
        editar(true);
    }//GEN-LAST:event_tablaMouseReleased

    private void botoncancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botoncancelarActionPerformed
cancelar();        // TODO add your handling code here:
    }//GEN-LAST:event_botoncancelarActionPerformed

    private void txtcuilKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtcuilKeyTyped
      
        if(txtcuil.getText().length()>13){
            evt.consume();
        }else
        if(!Character.isDigit(evt.getKeyChar())){
      evt.consume();
      
      
      }
    }//GEN-LAST:event_txtcuilKeyTyped

    private void txtnombreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtnombreKeyTyped
if(txtnombre.getText().length()>44){
            evt.consume();
        }else
        if(!(Character.isAlphabetic(evt.getKeyChar())||Character.isWhitespace(evt.getKeyChar()))){
      evt.consume();
      
      
      }
    }//GEN-LAST:event_txtnombreKeyTyped

    private void txttelefonoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txttelefonoKeyTyped
int tecla= evt.getKeyChar();
        if(txttelefono.getText().length()>44){
            evt.consume();
        }else
        if(!(tecla>='0'&& tecla<='9'||tecla=='('||tecla==')'||tecla=='-')){
           
      evt.consume();
        }
    }//GEN-LAST:event_txttelefonoKeyTyped

    private void botonsalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonsalirActionPerformed
        dispose();
    }//GEN-LAST:event_botonsalirActionPerformed

    private void txtcuilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtcuilActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtcuilActionPerformed

    private void txtmailKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtmailKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txtmailKeyTyped

    private void txtnumeroKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtnumeroKeyTyped
int tecla= evt.getKeyChar();
        if(txtnumero.getText().length()>44){
            evt.consume();
        }else
        if(!(tecla>='0'&& tecla<='9')){
           
      evt.consume();
        }        // TODO add your handling code here:
    }//GEN-LAST:event_txtnumeroKeyTyped

    private void txtdepartamentoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtdepartamentoKeyTyped
int tecla= evt.getKeyChar();
        if(txtdepartamento.getText().length()>44){
            evt.consume();
        }else
        if(!(tecla>='0'&& tecla<='9')){
           
      evt.consume();
        }           // TODO add your handling code here:
    }//GEN-LAST:event_txtdepartamentoKeyTyped

    private void txtpisoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtpisoKeyTyped
int tecla= evt.getKeyChar();
        if(txtpiso.getText().length()>44){
            evt.consume();
        }else
        if(!(tecla>='0'&& tecla<='9')){
           
      evt.consume();
        }           // TODO add your handling code here:
    }//GEN-LAST:event_txtpisoKeyTyped

    private void txtdniActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtdniActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtdniActionPerformed

    private void txtdniKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtdniKeyTyped
 if(txtdni.getText().length()>7){
            evt.consume();
        }else
        if(!Character.isDigit(evt.getKeyChar())){
      evt.consume();
      
      
      }        // TODO add your handling code here:
    }//GEN-LAST:event_txtdniKeyTyped

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
            java.util.logging.Logger.getLogger(VentanaCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                VentanaCliente dialog = new VentanaCliente(new javax.swing.JFrame(), true);
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
    private javax.swing.JButton botonagregar;
    private javax.swing.JButton botonborrar;
    private javax.swing.JButton botoncancelar;
    private javax.swing.JButton botonmodificar;
    private javax.swing.JButton botonsalir;
    private org.jdesktop.swingx.JXDatePicker combofecha;
    private javax.swing.JComboBox<String> combolocalidad;
    private javax.swing.JComboBox<String> comboprovincia;
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
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTable tabla;
    private javax.swing.JTextField txtcalle;
    private javax.swing.JTextField txtcuil;
    private javax.swing.JTextField txtdepartamento;
    private javax.swing.JTextField txtdni;
    private javax.swing.JTextField txtmail;
    private javax.swing.JTextField txtnombre;
    private javax.swing.JTextField txtnumero;
    private javax.swing.JTextField txtpiso;
    private javax.swing.JTextField txttelefono;
    // End of variables declaration//GEN-END:variables
private gestores.GestorCliente gestor = new GestorCliente();
private gestores.GestorProvincia gestorProvincia = new GestorProvincia();
private gestores.GestorLocalidad gestorLocalidad = new GestorLocalidad();
 private Cliente cliente = new Cliente();
public void mostrarcliente() {

DefaultTableModel matriz = new DefaultTableModel();
        matriz.addColumn("Id");
        matriz.addColumn("Dni");
        matriz.addColumn("Cuil");
        matriz.addColumn("Nombre");
        matriz.addColumn("Telefono");
        matriz.addColumn("Email");
        matriz.addColumn("Alta");
        matriz.addColumn("Calle");
        matriz.addColumn("Numero");
        matriz.addColumn("Piso ");
        matriz.addColumn("Depto");
        matriz.addColumn("Localidad");
        matriz.addColumn("CP");
        matriz.addColumn("Provincia");
       
        ArrayList<Cliente> lista = gestor.ObtenerLista();
        for (Cliente a : lista) {
            matriz.addRow(new Object[]{ 
                a.getId(),
                a.getDni(),
                a.getCuil(),
                a.getNombre(),
                a.getTelefono(),
                a.getMail(),
                a.getAlta(),
                a.getDomicilio().getCalle(),
                a.getDomicilio().getNumero(),
                a.getDomicilio().getPiso(),
                a.getDomicilio().getDepartamento(),
                a.getDomicilio().getLocalidad().getLocalidad(),
                a.getDomicilio().getLocalidad().getCodigoPostal(),
                a.getDomicilio().getLocalidad().getProvincia().getProvincia(),
                
                
            });
        }
        tabla.setModel(matriz);    
        
}

    private void cargarProvincia() {
        comboprovincia.removeAllItems();
        ArrayList<Provincia>lista= gestorProvincia.ObtenerLista();
        for (Provincia p : lista) {
            comboprovincia.addItem(p.getProvincia());
        }
    }

    private void cargarLocalidad() {
        combolocalidad.removeAllItems();
        ArrayList<Localidad>lista = gestorLocalidad.ObtenerLista(comboprovincia.getSelectedItem().toString());
   for (Localidad l : lista) {
            combolocalidad.addItem(l.getLocalidad());
   }
    
    }
    private void editar(boolean edicion){
        botonagregar.setEnabled(!edicion);
        botonmodificar.setEnabled(edicion);
        botonborrar.setEnabled(edicion);
    }

    private void cancelar() {
        limpiar();
        editar(false);
        
        
        
    }
     private void limpiar() {
       txtcalle.setText("");
       txtdepartamento.setText("");
       txtcuil.setText("");
       txtdni.setText("");
       txtmail.setText("");
       txtnombre.setText("");
       txtnumero.setText("");
       txtpiso.setText("");
       txttelefono.setText("");
              
          }
}
