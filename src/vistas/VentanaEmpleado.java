/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vistas;


import gestores.GestorCategoria;
import gestores.GestorEmpleado;
import gestores.GestorLocalidad;
import gestores.GestorProveedor;
import gestores.GestorProvincia;
import java.util.Date;


import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import modelo.Categoria;
import modelo.Cliente;
import modelo.Empleado;
import modelo.Localidad;
import modelo.Provincia;
import proyectociber.Grilla;

/**
 *
 * @author abel
 */
public class VentanaEmpleado extends javax.swing.JDialog {

    /**
     * Creates new form VentanaEmpleado
     */
    public VentanaEmpleado(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        cargarProvincia();
        cargarLocalidad();
        cargarCategoria();
        mostrarempleado();
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

        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel5 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        botonmodificar = new javax.swing.JButton();
        botonagregar = new javax.swing.JButton();
        botonborrar = new javax.swing.JButton();
        txttelefono = new javax.swing.JTextField();
        txtnombre = new javax.swing.JTextField();
        txtdni = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtmail = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        date = new org.jdesktop.swingx.JXDatePicker();
        jLabel6 = new javax.swing.JLabel();
        txtcalle = new javax.swing.JTextField();
        radiomasculino = new javax.swing.JRadioButton();
        radiofemenino = new javax.swing.JRadioButton();
        jLabel7 = new javax.swing.JLabel();
        txtpiso = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        txtnumero = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        txtdepartamento = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        comboprovincia = new javax.swing.JComboBox<>();
        jLabel11 = new javax.swing.JLabel();
        combolocalidad = new javax.swing.JComboBox<>();
        jLabel13 = new javax.swing.JLabel();
        combocategoria = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabla = new javax.swing.JTable();
        botoncancelar = new javax.swing.JButton();
        botonsalir = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Empleado");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setText("Sexo");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(31, 231, -1, -1));
        getContentPane().add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 257, 670, 10));

        jPanel1.setBackground(new java.awt.Color(204, 204, 255));

        jPanel2.setBackground(new java.awt.Color(204, 204, 204));
        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        botonmodificar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/modificar.png"))); // NOI18N
        botonmodificar.setText("Modificar");
        botonmodificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonmodificarActionPerformed(evt);
            }
        });

        botonagregar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/mas.png"))); // NOI18N
        botonagregar.setText("Agregar");
        botonagregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonagregarActionPerformed(evt);
            }
        });

        botonborrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Eraser.png"))); // NOI18N
        botonborrar.setText("Borrar");
        botonborrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonborrarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(botonborrar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(botonmodificar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(botonagregar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(34, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(botonagregar, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(botonmodificar, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(botonborrar, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(46, Short.MAX_VALUE))
        );

        txttelefono.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txttelefonoKeyTyped(evt);
            }
        });

        txtnombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtnombreActionPerformed(evt);
            }
        });
        txtnombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtnombreKeyTyped(evt);
            }
        });

        txtdni.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtdniKeyTyped(evt);
            }
        });

        jLabel2.setText("Telefono:");

        jLabel3.setText("Email:");

        jLabel12.setText("Nombre:");

        jLabel1.setText("DNI:");

        jLabel4.setText("Ingreso");

        jLabel6.setText("Calle:");

        txtcalle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtcalleActionPerformed(evt);
            }
        });

        buttonGroup1.add(radiomasculino);
        radiomasculino.setText("Masculino");

        buttonGroup1.add(radiofemenino);
        radiofemenino.setText("Femenino");

        jLabel7.setText("Piso:");

        txtpiso.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtpisoKeyTyped(evt);
            }
        });

        jLabel10.setText("Numero:");

        txtnumero.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtnumeroKeyTyped(evt);
            }
        });

        jLabel9.setText("Departamento:");

        txtdepartamento.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtdepartamentoKeyTyped(evt);
            }
        });

        jLabel8.setText("Provincia:");

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

        jLabel11.setText("Localidad:");

        jLabel13.setText("Categoria");

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
        tabla.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_OFF);
        tabla.setColumnSelectionAllowed(true);
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

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jLabel11)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7)
                            .addComponent(jLabel8)))
                    .addComponent(jLabel13))
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(combocategoria, javax.swing.GroupLayout.Alignment.LEADING, 0, 135, Short.MAX_VALUE)
                            .addComponent(combolocalidad, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(comboprovincia, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtcalle, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtpiso, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(85, 85, 85)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel9)
                            .addComponent(jLabel10))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtnumero, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtdepartamento, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(radiomasculino)
                                .addGap(30, 30, 30)
                                .addComponent(radiofemenino))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(txtdni)
                                .addComponent(txttelefono)
                                .addComponent(txtmail)
                                .addComponent(date, javax.swing.GroupLayout.DEFAULT_SIZE, 145, Short.MAX_VALUE))
                            .addComponent(txtnombre, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addComponent(botoncancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(botonsalir, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(134, 134, 134))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 635, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(35, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtdni, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtnombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel12))
                        .addGap(22, 22, 22)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txttelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addGap(20, 20, 20)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel4)
                            .addComponent(date, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(38, 38, 38)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(radiomasculino)
                            .addComponent(radiofemenino)))
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtcalle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10)
                    .addComponent(txtnumero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(txtpiso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9)
                    .addComponent(txtdepartamento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(comboprovincia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(combolocalidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(combocategoria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botoncancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botonsalir, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 680, 690));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void botonmodificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonmodificarActionPerformed
       
       String dni = txtdni.getText();
       String telefono = txttelefono.getText();
       String mail = txtmail.getText();
       Date  ingreso = date.getDate();
       String sexo = (radiofemenino.isSelected())?"F":"M";
       String calle = txtcalle.getText();
       String numero = txtnumero.getText();
       String piso = txtpiso.getText();
       String departamento = txtdepartamento.getText();
       int localidad_Id = gestorLocalidad.buscarIdLocalidad(combolocalidad.getSelectedItem().toString());
       
       int categoria_Id = gestorempleado.buscarIdCategoria(combocategoria.getSelectedItem().toString());
       String nombre = txtnombre.getText();
       
       
       empleado.setDni(dni);
       empleado.setTelefono(telefono);
       empleado.setMail(mail);
       empleado.setIngreso(ingreso);
       empleado.setSexo(sexo);
       empleado.getDomicilio().setCalle(calle);
       empleado.getDomicilio().setNumero(numero);
       empleado.getDomicilio().setPiso(piso);
       empleado.getDomicilio().setDepartamento(departamento);
       empleado.getDomicilio().getLocalidad().setId(localidad_Id);
       empleado.getCategoria().setId(categoria_Id);
       empleado.setNombre(nombre);
       gestor.modificar(empleado);
       cancelar();
       mostrarempleado();
    }//GEN-LAST:event_botonmodificarActionPerformed

    private void botonagregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonagregarActionPerformed
       String dni = txtdni.getText();
       String telefono = txttelefono.getText();
       String mail = txtmail.getText();
       Date  ingreso = date.getDate();
       String sexo = (radiofemenino.isSelected())?"F":"M"; //if abrebiado
       String calle = txtcalle.getText();
       String numero = txtnumero.getText();
       String piso = txtpiso.getText();
       String departamento = txtdepartamento.getText();
       int localidad_Id = gestorLocalidad.buscarIdLocalidad(combolocalidad.getSelectedItem().toString());
       
       int categoria_Id = gestorempleado.buscarIdCategoria(combocategoria.getSelectedItem().toString());
       String nombre = txtnombre.getText();
       
       Empleado emp = new Empleado();
       emp.setDni(dni);
       emp.setTelefono(telefono);
       emp.setMail(mail);
       emp.setIngreso(ingreso);
       emp.setSexo(sexo);
       emp.getDomicilio().setCalle(calle);
       emp.getDomicilio().setNumero(numero);
       emp.getDomicilio().setPiso(piso);
       emp.getDomicilio().setDepartamento(departamento);
       emp.getDomicilio().getLocalidad().setId(localidad_Id);
       emp.getCategoria().setId(categoria_Id);
       emp.setNombre(nombre);
       gestor.agregar(emp);
       mostrarempleado();
    }//GEN-LAST:event_botonagregarActionPerformed

    private void botonsalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonsalirActionPerformed
        dispose();
    }//GEN-LAST:event_botonsalirActionPerformed

    private void botoncancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botoncancelarActionPerformed
     cancelar();
             // TODO add your handling cod here:
    }//GEN-LAST:event_botoncancelarActionPerformed

    private void txtcalleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtcalleActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtcalleActionPerformed

    private void comboprovinciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboprovinciaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comboprovinciaActionPerformed

    private void comboprovinciaItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_comboprovinciaItemStateChanged
if(comboprovincia.getSelectedIndex()>-1){
        cargarLocalidad();}
    }//GEN-LAST:event_comboprovinciaItemStateChanged

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
 cargarLocalidad();
 cargarCategoria();
    }//GEN-LAST:event_formWindowOpened

    private void txtnombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtnombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtnombreActionPerformed

    private void tablaMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaMouseReleased
int Id = Integer.parseInt(tabla.getValueAt(tabla.getSelectedRow(), 0).toString());
        empleado.setId(Id);
        gestor.recuperar(empleado);
        
        txtdni.setText(empleado.getDni());
        txtnombre.setText(empleado.getNombre());
        txttelefono.setText(empleado.getTelefono());
        txtmail.setText(empleado.getMail());
        date.setDate(empleado.getIngreso());
        if(empleado.getSexo().equalsIgnoreCase("M"))radiomasculino.setSelected(true);
        else
            radiofemenino.setSelected(true);
        //domicilio
        txtcalle.setText(empleado.getDomicilio().getCalle());
        txtnumero.setText(empleado.getDomicilio().getNumero());
        txtpiso.setText(empleado.getDomicilio().getPiso());
        txtdepartamento.setText(empleado.getDomicilio().getDepartamento());
        comboprovincia.setSelectedItem(empleado.getDomicilio().getLocalidad().getProvincia().getProvincia());
        combolocalidad.setSelectedItem(empleado.getDomicilio().getLocalidad().getLocalidad());
        
          //categoria
        
        combocategoria.setSelectedItem(empleado.getCategoria().getCategoria());
        
        
        editar(true);        // TODO add your handling code here:
    }//GEN-LAST:event_tablaMouseReleased

    private void botonborrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonborrarActionPerformed
       int r=JOptionPane.showConfirmDialog(this, "Desea borrar este empleado", "confirme", JOptionPane.YES_NO_OPTION);
        if(r==JOptionPane.YES_OPTION){
        gestor.borrar(empleado);
        cancelar();
        mostrarempleado();
        }
    }//GEN-LAST:event_botonborrarActionPerformed

    private void txtdniKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtdniKeyTyped
         if(txtdni.getText().length()>7){
            evt.consume();
        }else
        if(!Character.isDigit(evt.getKeyChar())){
      evt.consume();
        }
    }//GEN-LAST:event_txtdniKeyTyped

    private void txtnombreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtnombreKeyTyped
if(txtnombre.getText().length()>44){
            evt.consume();
        }else
        if(!(Character.isAlphabetic(evt.getKeyChar())||Character.isWhitespace(evt.getKeyChar()))){
      evt.consume();}
    }//GEN-LAST:event_txtnombreKeyTyped

    private void txttelefonoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txttelefonoKeyTyped
int tecla= evt.getKeyChar();
        if(txttelefono.getText().length()>44){
            evt.consume();
        }else
        if(!(tecla>='0'&& tecla<='9'||tecla=='('||tecla==')'||tecla=='-')){
           
      evt.consume();
        }        // TODO add your handling code here:
    }//GEN-LAST:event_txttelefonoKeyTyped

    private void txtnumeroKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtnumeroKeyTyped
int tecla= evt.getKeyChar();
        if(txtnumero.getText().length()>44){
            evt.consume();
        }else
        if(!(tecla>='0'&& tecla<='9')){
           
      evt.consume();
        }           // TODO add your handling code here:
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
            java.util.logging.Logger.getLogger(VentanaEmpleado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaEmpleado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaEmpleado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaEmpleado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                VentanaEmpleado dialog = new VentanaEmpleado(new javax.swing.JFrame(), true);
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
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JComboBox<String> combocategoria;
    private javax.swing.JComboBox<String> combolocalidad;
    private javax.swing.JComboBox<String> comboprovincia;
    private org.jdesktop.swingx.JXDatePicker date;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
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
    private javax.swing.JRadioButton radiofemenino;
    private javax.swing.JRadioButton radiomasculino;
    private javax.swing.JTable tabla;
    private javax.swing.JTextField txtcalle;
    private javax.swing.JTextField txtdepartamento;
    private javax.swing.JTextField txtdni;
    private javax.swing.JTextField txtmail;
    private javax.swing.JTextField txtnombre;
    private javax.swing.JTextField txtnumero;
    private javax.swing.JTextField txtpiso;
    private javax.swing.JTextField txttelefono;
    // End of variables declaration//GEN-END:variables
private gestores.GestorEmpleado gestor = new GestorEmpleado();
private gestores.GestorProvincia gestorProvincia = new GestorProvincia();
private gestores.GestorLocalidad gestorLocalidad = new GestorLocalidad();
private gestores.GestorCategoria gestorcategoria = new GestorCategoria();
private gestores.GestorEmpleado gestorempleado = new GestorEmpleado();

private Empleado empleado = new Empleado();
 

public void mostrarempleado() {
        
DefaultTableModel matriz = new DefaultTableModel();
        matriz.addColumn("Id");
        matriz.addColumn("Dni");
        matriz.addColumn("Nombre");
        matriz.addColumn("Telefono");
        matriz.addColumn("Email");
        matriz.addColumn("Ingreso");
        matriz.addColumn("Sexo");
        matriz.addColumn("Categoria");
        matriz.addColumn("Calle");
        matriz.addColumn("Numero");
        matriz.addColumn("Piso ");
        matriz.addColumn("Depto");
        matriz.addColumn("Localidad");
        matriz.addColumn("CP");
        matriz.addColumn("Provincia");
       
        ArrayList<Empleado> lista = gestor.ObtenerLista();
        for (Empleado a : lista) {
            matriz.addRow(new Object[]{ 
                a.getId(),
                a.getDni(),
                a.getNombre(),
                a.getTelefono(),
                a.getMail(),
                a.getIngreso(),
                a.getSexo(),
                a.getCategoria().getCategoria(),
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
    
    
    private void cargarCategoria() {
        combocategoria.removeAllItems();
        ArrayList<Categoria>lista= gestorcategoria.ObtenerLista();
        for (Categoria c : lista) {
            combocategoria.addItem(c.getCategoria());
        }
    }

    private void cancelar() {
      limpiar();
        editar(false);
    }
    private void editar(boolean edicion){
        botonagregar.setEnabled(!edicion);
        botonmodificar.setEnabled(edicion);
        botonborrar.setEnabled(edicion);
    }
     private void limpiar() {
      
        
       txtcalle.setText("");
       txtdepartamento.setText("");
       txtdni.setText("");
       txtmail.setText("");
       txtnombre.setText("");
       txtnumero.setText("");
       txtpiso.setText("");
       txttelefono.setText("");
       
              
          }
    
    
    

}
