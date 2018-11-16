/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectociber;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import vistas.VentanaPrincipal;

/**
 *
 * @author abel
 */
public class ProyectoCiber {
     public static Connection conexion ;

    public static Connection getConexion() {
        return conexion;
    }

    public static void setConexion(Connection conexion) {
        ProyectoCiber.conexion = conexion;
    }

    

    public ProyectoCiber() {
    
    }

    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
        try {
           Class.forName("com.mysql.jdbc.Driver");
           ProyectoCiber.conexion = DriverManager.getConnection("jdbc:mysql://localhost/ciber", "root","" );
            VentanaPrincipal vp = new VentanaPrincipal();
            vp.setVisible(true);
            vp.ingresar();
            
            
        } catch (SQLException ex) {
              JOptionPane.showMessageDialog(null, ex.getMessage());
            }
         catch (ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(null, "libreria no agregada");
            
        }
    }

   
    
}
