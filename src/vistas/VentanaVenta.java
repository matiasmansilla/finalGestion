/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vistas;

import gestores.GestorArticulo;
import gestores.GestorCliente;
import gestores.GestorEmpleado;
import gestores.GestorUsuario;
import gestores.GestorVenta;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import modelo.Articulo;
import modelo.Cliente;
import modelo.Venta;
import modelo.VentaLinea;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.util.JRLoader;
import net.sf.jasperreports.view.JRViewer;
import net.sf.jasperreports.view.JasperViewer;
import proyectociber.ProyectoCiber;
import reportes.JDialogImpresion;

/**
 *
 * @author abel
 */
public class VentanaVenta extends javax.swing.JDialog {

    /**
     * Creates new form VentanaVentas
     */
    public VentanaVenta(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        limpiar();
        cliente.setId(3);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel5 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        combotipo = new javax.swing.JComboBox<>();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        lblnombre1 = new javax.swing.JLabel();
        lblnombre2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        lblnombrearticulo1 = new javax.swing.JLabel();
        lblnombrearticulo2 = new javax.swing.JLabel();
        lblnombrearticulo3 = new javax.swing.JLabel();
        lblnombrearticulo4 = new javax.swing.JLabel();
        txtcantidad = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabla = new javax.swing.JTable();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jButton4 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setBackground(new java.awt.Color(204, 204, 255));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel5.setBackground(new java.awt.Color(204, 204, 204));
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel8.setText("Elija el Tipo de Comprobante:");
        jPanel5.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(19, 11, -1, 20));

        combotipo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Consumidor Final", "A", "B", "C" }));
        combotipo.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                combotipoItemStateChanged(evt);
            }
        });
        jPanel5.add(combotipo, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 10, 150, -1));

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Datos del cliente", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 14))); // NOI18N
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("DNI:");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 30, -1, -1));

        jLabel2.setText("Nombre:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 63, -1, -1));

        lblnombre1.setText("Telefono:");
        jPanel1.add(lblnombre1, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 63, -1, -1));

        lblnombre2.setText("E-mail:");
        jPanel1.add(lblnombre2, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 95, -1, -1));

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/buscar.png"))); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 20, 73, 49));

        jLabel13.setText("Cuil:");
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 30, -1, -1));

        jPanel5.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(21, 61, 605, 120));

        jPanel2.setBackground(new java.awt.Color(204, 204, 204));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Datos del Articulo", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 14))); // NOI18N
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setText("Codigo de Barra:");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 30, -1, -1));

        jLabel4.setText("Nombre:");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(241, 30, -1, -1));

        lblnombrearticulo1.setText("Descripcion:");
        jPanel2.add(lblnombrearticulo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 75, -1, -1));

        lblnombrearticulo2.setText("Precio de Venta:");
        jPanel2.add(lblnombrearticulo2, new org.netbeans.lib.awtextra.AbsoluteConstraints(241, 75, -1, -1));

        lblnombrearticulo3.setText("Stock:");
        jPanel2.add(lblnombrearticulo3, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 110, -1, -1));

        lblnombrearticulo4.setText("Cantidad:");
        jPanel2.add(lblnombrearticulo4, new org.netbeans.lib.awtextra.AbsoluteConstraints(241, 110, -1, -1));
        jPanel2.add(txtcantidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(317, 107, 50, -1));

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/buscar.png"))); // NOI18N
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 20, 71, 45));

        jButton7.setBackground(new java.awt.Color(204, 204, 204));
        jButton7.setText(" Agregar");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton7, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 90, 130, 40));

        jPanel5.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 190, 605, 145));

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
        jScrollPane1.setViewportView(tabla);

        jPanel5.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 340, 583, 119));

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setText("Total:");
        jPanel5.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 480, -1, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setText("IVA:");
        jPanel5.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 480, -1, -1));

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel7.setText("Precio Final:");
        jPanel5.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 470, -1, -1));

        jPanel3.setBackground(new java.awt.Color(204, 204, 204));
        jPanel3.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton4.setText("Guardar Venta");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 162, 170, 50));

        jButton6.setText("Borrar Linea ");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 89, 170, 46));

        jButton5.setText("Cancelar Venta");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 13, 170, 48));

        jPanel5.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(644, 70, 191, 226));

        getContentPane().add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 862, 520));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
 
            VentanaBuscarCliente v = new VentanaBuscarCliente(this, true);
            v.setVisible(true);
            if(v.getAceptado()==1){
                cliente.setId(v.getId());
                gestorCliente.recuperar(cliente);
                lblcuil.setText(cliente.getCuil());
                lblmail.setText(cliente.getMail());
                lblnombre.setText(cliente.getNombre());
                lbltelefono.setText(cliente.getTelefono());
                lbldni.setText(cliente.getDni());
 
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
   VentanaBuscarArticulo v = new VentanaBuscarArticulo(this, true);
   v.setVisible(true);
   if(v.getAceptado()==1){
   articulo.setId(v.getId());
   gestorArticluo.recuperar(articulo);
   lblcodigo.setText(articulo.getCodBarra());
   lblnombrearticulo.setText(articulo.getNombre());
   lbldesccripcion.setText(articulo.getDescripcion());
   lblprecioventa.setText(String.valueOf(articulo.getPrecioVenta()));
   lblStock.setText(String.valueOf(articulo.getStock()));
   txtcantidad.setText("1");
   txtcantidad.requestFocus();
   }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        
        if(lbldesccripcion.getText().isEmpty())JOptionPane.showMessageDialog(this, "debe seleccionar un articulo");
        else{if( txtcantidad.getText().isEmpty())JOptionPane.showMessageDialog(this, "debe ingresar la cantidad");
        
        else{
            int cantidad = Integer.parseInt(txtcantidad.getText());
            
       
        if(cantidad>articulo.getStock()){
           JOptionPane.showMessageDialog(this, "Stock insuficiente");
       
       }
        else{if(cantidad <1){JOptionPane.showMessageDialog(this, "La cantidad debe ser mayor que cero");}
       else{
           gestorVenta.agregarLinea(venta, articulo, cantidad);
           limpiararticulo();
           mostrarlineas();
       }
        }
        }}
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        
        venta.setTipo(combotipo.getSelectedItem().toString());
  
        
        venta.setCliente(cliente);
        venta.setEmpleado(GestorUsuario.logeado.getEmpleado());
        venta.setFecha(new java.util.Date());
        gestorVenta.agregar(venta);
        venta.getLista().clear();
        mostrarlineas();
        limpiar();
        int r = JOptionPane.showConfirmDialog(this, "Desea imprimir el comprobante", "Confirme", JOptionPane.YES_NO_OPTION);
        if(r== JOptionPane.YES_OPTION)
        {
            imprimir();
        }
    }//GEN-LAST:event_jButton4ActionPerformed

    private void combotipoItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_combotipoItemStateChanged
        
        if(combotipo.getSelectedIndex()>-1){
        venta.setTipo(combotipo.getSelectedItem().toString());
        mostrarlineas();
        }
        

    }//GEN-LAST:event_combotipoItemStateChanged

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
    int r = JOptionPane.showConfirmDialog(this, "Desea cancelar la venta","Confirme",JOptionPane.YES_NO_OPTION);
    if(r==JOptionPane.YES_OPTION)
    {
        gestorVenta.cancelar(venta);
        mostrarlineas();
    }
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
    int fila = tabla.getSelectedRow();
    if(fila==-1)JOptionPane.showMessageDialog(this, "Debe seleccionar una linea");
    else
    {
        gestorVenta.borrarLinea(venta, fila);
        mostrarlineas();
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
            java.util.logging.Logger.getLogger(VentanaVenta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaVenta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaVenta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaVenta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                VentanaVenta dialog = new VentanaVenta(new javax.swing.JFrame(), true);
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
    private javax.swing.JComboBox<String> combotipo;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblnombre1;
    private javax.swing.JLabel lblnombre2;
    private javax.swing.JLabel lblnombrearticulo1;
    private javax.swing.JLabel lblnombrearticulo2;
    private javax.swing.JLabel lblnombrearticulo3;
    private javax.swing.JLabel lblnombrearticulo4;
    private javax.swing.JTable tabla;
    private javax.swing.JTextField txtcantidad;
    // End of variables declaration//GEN-END:variables
private GestorCliente  gestorCliente = new GestorCliente();
private Cliente cliente = new Cliente();
private GestorArticulo gestorArticluo = new GestorArticulo();
private Articulo articulo = new Articulo();
private GestorVenta gestorVenta = new GestorVenta();        
private Venta venta = new Venta();

        



private void limpiarcliente(){

lbldni.setText("-");
lblnombre.setText("consumidor final");
lbltelefono.setText("-");
lblmail.setText("-");
lblcuil.setText("-");
lbltotal.setText("0");
lbliva.setText("0");
lblgrantotal.setText("$0.00");
}

private void limpiar(){
limpiarcliente();
limpiararticulo();

}

    private void limpiararticulo() {
        lblcodigo.setText("");
        lblnombrearticulo.setText("");
        lbldesccripcion.setText("");
        lblprecioventa.setText("");
        lblStock.setText("");
        
    }

    private void mostrarlineas() {
      DefaultTableModel matriz = new DefaultTableModel();
        matriz.addColumn("Id");
        matriz.addColumn("Codigo");
        matriz.addColumn("Nombre");
        matriz.addColumn("Descripcion");
        matriz.addColumn("Precio Venta");
        matriz.addColumn("Cantidad");
        matriz.addColumn("Subtotal");
       
       
        ArrayList<VentaLinea> lista = venta.getLista();
                for (VentaLinea a : lista) {
            matriz.addRow(new Object[]{ 
                a.getId(),
                a.getArticulo().getCodBarra(),
                a.getArticulo().getNombre(),
                a.getArticulo().getDescripcion(),
                a.getArticulo().getPrecioVenta(),
                a.getCantidad(),
                a.getArticulo().getPrecioVenta()*a.getCantidad()
               
            });
        }
        tabla.setModel(matriz);
        venta.calculartotal();
        lbltotal.setText("$"+venta.getTotal());
        lbliva.setText("$"+venta.getIva());
        lblgrantotal.setText("$"+venta.getGranTotal());
    }

    private void imprimir() {
        
          ProyectoCiber cn = new ProyectoCiber();
         Map parameters = new HashMap();
           parameters.put("id",venta.getId());
           System.out.print("Id="+venta.getId());
            String REPORTE ="C:\\Users\\abel\\Documents\\NetBeansProjects\\ProyectoCiber\\src\\reportes\\Venta.jrxml";
            
      try{
                JasperReport jasperReport =JasperCompileManager.compileReport(REPORTE);
                
                JasperPrint jasperPrint   =JasperFillManager.fillReport(jasperReport, parameters, cn.getConexion());
                JRViewer jrv=new JRViewer(jasperPrint);
            JDialogImpresion j;
            j = new JDialogImpresion(this,jrv);
           
            j.setVisible(true);
            
            }catch(JRException d){
                d.printStackTrace();
            }
           
        
        
    }
}
