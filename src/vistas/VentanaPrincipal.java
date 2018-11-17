/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vistas;

import java.util.HashMap;
import java.util.Map;
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
public class VentanaPrincipal extends javax.swing.JFrame {

    VentanaLogin ventanaLogin ;
   
    
    
    public VentanaPrincipal() {
        initComponents();
        ventanaLogin = new VentanaLogin(this, true); // composicion 
   
    }

    public void ingresar(){
   
    ventanaLogin.limpiar();
    ventanaLogin.setVisible(true);
        
    if(gestores.GestorUsuario.logeado.getEmpleado().getCategoria().getCategoria().equalsIgnoreCase("administrador")){
   
    menuAdministrador();
    
    }else
    {
        menuEmpleado();
    
    }
    };
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        menucuentas = new javax.swing.JMenu();
        itemusuario = new javax.swing.JMenuItem();
        itemclave = new javax.swing.JMenuItem();
        menugestion = new javax.swing.JMenu();
        jMenuItem6 = new javax.swing.JMenuItem();
        jMenuItem7 = new javax.swing.JMenuItem();
        jMenuItem8 = new javax.swing.JMenuItem();
        jMenuItem9 = new javax.swing.JMenuItem();
        jMenuItem10 = new javax.swing.JMenuItem();
        jMenuItem18 = new javax.swing.JMenuItem();
        jMenuItem19 = new javax.swing.JMenuItem();
        menumovimiento = new javax.swing.JMenu();
        itemcompra = new javax.swing.JMenuItem();
        jMenuItem11 = new javax.swing.JMenuItem();
        menuliquidacion = new javax.swing.JMenu();
        jMenuItem12 = new javax.swing.JMenuItem();
        jMenuItem13 = new javax.swing.JMenuItem();
        jMenuItem14 = new javax.swing.JMenuItem();
        menureportes = new javax.swing.JMenu();
        jMenuItem15 = new javax.swing.JMenuItem();
        jMenuItem20 = new javax.swing.JMenuItem();
        jMenuItem17 = new javax.swing.JMenuItem();
        jMenuItem21 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Administracion de ciber");
        setBackground(new java.awt.Color(204, 204, 255));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 950, 480));

        jMenuBar1.setBackground(new java.awt.Color(204, 204, 204));

        menucuentas.setBackground(new java.awt.Color(204, 204, 204));
        menucuentas.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED, java.awt.Color.darkGray, java.awt.Color.darkGray, java.awt.Color.darkGray, java.awt.Color.darkGray));
        menucuentas.setText("Administrador de Cuentas");
        menucuentas.setBorderPainted(true);
        menucuentas.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N

        itemusuario.setBackground(new java.awt.Color(204, 204, 255));
        itemusuario.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        itemusuario.setText("Gestion de Usuarios");
        itemusuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemusuarioActionPerformed(evt);
            }
        });
        menucuentas.add(itemusuario);

        itemclave.setText("Cambiar Clave");
        itemclave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemclaveActionPerformed(evt);
            }
        });
        menucuentas.add(itemclave);

        jMenuBar1.add(menucuentas);

        menugestion.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.darkGray, java.awt.Color.darkGray, java.awt.Color.darkGray, java.awt.Color.darkGray));
        menugestion.setText("Gestion");
        menugestion.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N

        jMenuItem6.setBackground(new java.awt.Color(204, 153, 255));
        jMenuItem6.setText("Articulo");
        jMenuItem6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem6ActionPerformed(evt);
            }
        });
        menugestion.add(jMenuItem6);

        jMenuItem7.setText("Proveedore");
        jMenuItem7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem7ActionPerformed(evt);
            }
        });
        menugestion.add(jMenuItem7);

        jMenuItem8.setText("Cliente");
        jMenuItem8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem8ActionPerformed(evt);
            }
        });
        menugestion.add(jMenuItem8);

        jMenuItem9.setText("Empleado");
        jMenuItem9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem9ActionPerformed(evt);
            }
        });
        menugestion.add(jMenuItem9);

        jMenuItem10.setText("Provincia");
        jMenuItem10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem10ActionPerformed(evt);
            }
        });
        menugestion.add(jMenuItem10);

        jMenuItem18.setText("Localidad");
        jMenuItem18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem18ActionPerformed(evt);
            }
        });
        menugestion.add(jMenuItem18);

        jMenuItem19.setText("Familia");
        jMenuItem19.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem19ActionPerformed(evt);
            }
        });
        menugestion.add(jMenuItem19);

        jMenuBar1.add(menugestion);

        menumovimiento.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.darkGray, java.awt.Color.darkGray, java.awt.Color.darkGray, java.awt.Color.darkGray));
        menumovimiento.setText("Movimiento");
        menumovimiento.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N

        itemcompra.setBackground(new java.awt.Color(255, 153, 153));
        itemcompra.setText("Compras");
        itemcompra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemcompraActionPerformed(evt);
            }
        });
        menumovimiento.add(itemcompra);

        jMenuItem11.setText("Ventas");
        jMenuItem11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem11ActionPerformed(evt);
            }
        });
        menumovimiento.add(jMenuItem11);

        jMenuBar1.add(menumovimiento);

        menuliquidacion.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.darkGray, java.awt.Color.darkGray, java.awt.Color.darkGray, java.awt.Color.darkGray));
        menuliquidacion.setText("Liquidacion");
        menuliquidacion.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N

        jMenuItem12.setBackground(new java.awt.Color(204, 255, 204));
        jMenuItem12.setText("Liquidacion de haberes");
        jMenuItem12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem12ActionPerformed(evt);
            }
        });
        menuliquidacion.add(jMenuItem12);

        jMenuItem13.setText("Categorias");
        jMenuItem13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem13ActionPerformed(evt);
            }
        });
        menuliquidacion.add(jMenuItem13);

        jMenuItem14.setText("Conceptos");
        jMenuItem14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem14ActionPerformed(evt);
            }
        });
        menuliquidacion.add(jMenuItem14);

        jMenuBar1.add(menuliquidacion);

        menureportes.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.darkGray, java.awt.Color.darkGray, java.awt.Color.darkGray, java.awt.Color.darkGray));
        menureportes.setText("Reportes");
        menureportes.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N

        jMenuItem15.setBackground(new java.awt.Color(0, 153, 0));
        jMenuItem15.setText("Ventas");
        jMenuItem15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem15ActionPerformed(evt);
            }
        });
        menureportes.add(jMenuItem15);

        jMenuItem20.setText("Compras");
        jMenuItem20.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem20ActionPerformed(evt);
            }
        });
        menureportes.add(jMenuItem20);

        jMenuItem17.setText("Stock Minimo");
        jMenuItem17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem17ActionPerformed(evt);
            }
        });
        menureportes.add(jMenuItem17);

        jMenuItem21.setText("Liquidacion ");
        jMenuItem21.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem21ActionPerformed(evt);
            }
        });
        menureportes.add(jMenuItem21);

        jMenuBar1.add(menureportes);

        jMenu2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.darkGray, java.awt.Color.darkGray, java.awt.Color.darkGray, java.awt.Color.darkGray));
        jMenu2.setText("Sistema");
        jMenu2.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N

        jMenuItem1.setBackground(new java.awt.Color(255, 51, 51));
        jMenuItem1.setText("Salir ");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem1);

        jMenuItem2.setText("Cerrar Seccion ");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem2);

        jMenuItem3.setText("Propietario");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem3);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
System.exit(0);        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void itemusuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemusuarioActionPerformed
        VentanaUsuario v = new VentanaUsuario(this, true);
        v.setVisible(true);
    }//GEN-LAST:event_itemusuarioActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed

        
        ingresar();




        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jMenuItem13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem13ActionPerformed
        VentanaCategoria v = new VentanaCategoria(this, true);
        v.mostrarcategorias();
        v.setVisible(true);
        
        
        
        
    }//GEN-LAST:event_jMenuItem13ActionPerformed

    private void jMenuItem9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem9ActionPerformed
VentanaEmpleado v = new VentanaEmpleado(this, true);
        v.mostrarempleado();
        v.setVisible(true);        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem9ActionPerformed

    private void jMenuItem14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem14ActionPerformed
            VentanaConcepto v = new VentanaConcepto(this,true);
        v.mostrarconceptos();
        v.setVisible(true);
        
    }//GEN-LAST:event_jMenuItem14ActionPerformed

    private void jMenuItem6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem6ActionPerformed
    VentanaArticulo v = new VentanaArticulo(this,true) ;
    v.setVisible(true);
    v.mostrararticulos();
    }//GEN-LAST:event_jMenuItem6ActionPerformed

    private void jMenuItem8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem8ActionPerformed
     VentanaCliente v = new VentanaCliente(this,true) ;
    v.setVisible(true);
    v.mostrarcliente();
    }//GEN-LAST:event_jMenuItem8ActionPerformed

    private void jMenuItem10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem10ActionPerformed
        VentanaProvincia v = new VentanaProvincia(this, true);
        v.mostrarprovincia();
        v.setVisible(true);
    }//GEN-LAST:event_jMenuItem10ActionPerformed

    private void jMenuItem18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem18ActionPerformed
        VentanaLocalidad v = new VentanaLocalidad(this, true);
       // v.mostrarlocalidad();
        v.setVisible(true);
    }//GEN-LAST:event_jMenuItem18ActionPerformed

    private void jMenuItem7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem7ActionPerformed
        VentanaProveedor v = new VentanaProveedor(this, true);
        v.mostrarproveedor();
        v.setVisible(true);
    }//GEN-LAST:event_jMenuItem7ActionPerformed

    private void jMenuItem11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem11ActionPerformed
      VentanaVenta v = new VentanaVenta(this, true);
        
        v.setVisible(true);
    }//GEN-LAST:event_jMenuItem11ActionPerformed

    private void jMenuItem19ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem19ActionPerformed
       VentanaFamiliaEmpleado v = new VentanaFamiliaEmpleado(this, true);
        
        v.setVisible(true);
    }//GEN-LAST:event_jMenuItem19ActionPerformed

    private void itemcompraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemcompraActionPerformed
    VentanaCompra v = new VentanaCompra(this, true);
    v.setVisible(true);// TODO add your handling code here:
    }//GEN-LAST:event_itemcompraActionPerformed

    private void jMenuItem12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem12ActionPerformed
        VentanaLiquidacion v = new VentanaLiquidacion(this, true);
        v.setVisible(true);
        
    }//GEN-LAST:event_jMenuItem12ActionPerformed

    private void jMenuItem15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem15ActionPerformed
        VentanaReporteVenta v = new VentanaReporteVenta(this, true);
        v.setVisible(true);
    }//GEN-LAST:event_jMenuItem15ActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
     VentanaPropietario v = new VentanaPropietario(this, true);
     v.setVisible(true);
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void itemclaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemclaveActionPerformed
    VentanaCambiarClave v = new VentanaCambiarClave(this, true);
    v.setVisible(true);
    }//GEN-LAST:event_itemclaveActionPerformed

    private void jMenuItem20ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem20ActionPerformed
     VentanaReporteCompra v = new VentanaReporteCompra(this, true);
     v.setVisible(true);
    }//GEN-LAST:event_jMenuItem20ActionPerformed

    private void jMenuItem17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem17ActionPerformed
    VentanaStockminimo v = new VentanaStockminimo(this, true);
    v.setVisible(false);
    }//GEN-LAST:event_jMenuItem17ActionPerformed

    private void jMenuItem21ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem21ActionPerformed
VentanaReporteLiquidacion v = new VentanaReporteLiquidacion(this, true);
     v.setVisible(true);        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem21ActionPerformed

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
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem itemclave;
    private javax.swing.JMenuItem itemcompra;
    private javax.swing.JMenuItem itemusuario;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem10;
    private javax.swing.JMenuItem jMenuItem11;
    private javax.swing.JMenuItem jMenuItem12;
    private javax.swing.JMenuItem jMenuItem13;
    private javax.swing.JMenuItem jMenuItem14;
    private javax.swing.JMenuItem jMenuItem15;
    private javax.swing.JMenuItem jMenuItem17;
    private javax.swing.JMenuItem jMenuItem18;
    private javax.swing.JMenuItem jMenuItem19;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem20;
    private javax.swing.JMenuItem jMenuItem21;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JMenuItem jMenuItem7;
    private javax.swing.JMenuItem jMenuItem8;
    private javax.swing.JMenuItem jMenuItem9;
    private javax.swing.JMenu menucuentas;
    private javax.swing.JMenu menugestion;
    private javax.swing.JMenu menuliquidacion;
    private javax.swing.JMenu menumovimiento;
    private javax.swing.JMenu menureportes;
    // End of variables declaration//GEN-END:variables

public void menuAdministrador(){
menucuentas.setEnabled(true);

itemusuario.setEnabled(true);
itemclave.setEnabled(true);

menugestion.setEnabled(true);
menucuentas.setEnabled(true);

menumovimiento.setEnabled(true);
itemcompra.setEnabled(true);
menureportes.setEnabled(true);

}
public void menuEmpleado(){

menucuentas.setEnabled(true);
itemusuario.setEnabled(false);
itemclave.setEnabled(true);

menumovimiento.setEnabled(true);
itemcompra.setEnabled(false);

menuliquidacion.setEnabled(false);

menugestion.setEnabled(false);


menureportes.setEnabled(false);

}




}
