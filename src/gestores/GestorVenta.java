/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestores;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import modelo.Articulo;
import modelo.Venta;
import modelo.VentaLinea;
import sun.awt.image.VSyncedBSManager;

public class GestorVenta {
    
    public void agregar(Venta v){
    String sql = "insert into venta(Fecha,Cliente_Id,Tipo,Total,Iva,GranTotal,Empleado_Id)values (?,?,?,?,?,?,?)";
               if(v.getTipo().equalsIgnoreCase("Consumidor Final"))
                   v.setTipo("CF");
   try {
            
            PreparedStatement p = proyectociber.ProyectoCiber.conexion.prepareStatement(sql);
            
            p.setDate(1, new java.sql.Date(new java.util.Date().getTime()));
            p.setInt(2, v.getCliente().getId());
            p.setString(3, v.getTipo());
            p.setDouble(4, v.getTotal());
            p.setDouble(5, v.getIva());
            p.setDouble(6, v.getGranTotal());
            p.setInt(7,v.getEmpleado().getId());  
            
            
            
            p.execute();
            sql = "select max(Id)as ultimo from venta";
            ResultSet rs = proyectociber.ProyectoCiber.conexion.createStatement().executeQuery(sql);
            if(rs.next()){
            
            v.setId(rs.getInt("ultimo"));
            sql = "update   ventalinea set "
                    + "Venta_Id =? "
                    + "where venta_Id = 0 ";
            p = proyectociber.ProyectoCiber.conexion.prepareStatement(sql);
            
            
            p.setInt(1, v.getId());
            p.execute();
            
            
            
            }
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
        
        }
    public void agregarLinea(Venta v ,Articulo x, int cantidad){
    Articulo aux=new Articulo();
    aux.setCodBarra(x.getCodBarra());
    aux.setDescripcion(x.getDescripcion());
    aux.setId(x.getId());
    aux.setNombre(x.getNombre());
    aux.setPrecioCompra(x.getPrecioCompra());
    aux.setPrecioVenta(x.getPrecioVenta());
    aux.setStock(x.getStock());
    aux.setStockMin(x.getStockMin());
    
    VentaLinea linea = new VentaLinea();
    linea.setArticulo(aux);
    linea.setCantidad(cantidad);
    linea.setPrecio(aux.getPrecioVenta());
    v.agregar(linea);
    // descontamos el stock
    String sql ="update articulo set "
            + "Stock=Stock-? "
            + "where Id=?";
    
        try {
            PreparedStatement p = proyectociber.ProyectoCiber.conexion.prepareStatement(sql);
            p.setInt(1, cantidad);
            p.setInt(2,aux.getId());
            p.execute();
            
            //guarda lineas de la venta
            sql = "insert into ventalinea(Cantidad,Precio,Articulo_Id,Venta_Id) values(?,?,?,?)";
            p = proyectociber.ProyectoCiber.conexion.prepareStatement(sql);
            p.setInt(1, cantidad);
            p.setDouble(2, aux.getPrecioVenta());
            p.setInt(3,aux.getId());
            p.setInt(4,0);// 0 por qu e la venta no esta guardada
            p.execute();
            //traemos el ultimo id de la ventalinea de la BD
            sql = "select max(Id)as ultimo from ventalinea";
            p = proyectociber.ProyectoCiber.conexion.prepareStatement(sql);
            ResultSet r =p.executeQuery();
            if(r.next()){
            linea.setId(r.getInt("ultimo"));
            
            }
        
        } catch (SQLException ex) {
            Logger.getLogger(GestorVenta.class.getName()).log(Level.SEVERE, null, ex);
        }
    
    
    
    }
    public void borrarLinea(Venta v,int posi){
    
     String sql ="update articulo set "
            + "Stock=Stock+? "
            + "where Id=?";
    
        try {
            PreparedStatement p = proyectociber.ProyectoCiber.conexion.prepareStatement(sql);
            p.setInt(1, v.getLista().get(posi).getCantidad());
            p.setInt(2,v.getLista().get(posi).getArticulo().getId());
            p.execute();
        // borro de la base de datos una linea por si  cancelo la venta
        v.getLista().remove(posi);
        
        } catch (SQLException ex) {
            Logger.getLogger(GestorVenta.class.getName()).log(Level.SEVERE, null, ex);
        }
    
    
    }

    public void cancelar(Venta venta) {
        while (!venta.getLista().isEmpty())//mientras no este vacia
        { borrarLinea(venta, 0);
        }
        
    }
    
    
    public ArrayList <Venta> ObtenerLista(Date desde,Date hasta){
    ArrayList <Venta> lista = new ArrayList<>();
    String sql = "SELECT v.`Id`,v.`Fecha`,e.`Nombre`,e.`Dni`,v.`Tipo`,v.`Total`,v.`Iva`,v.`GranTotal` \n" +
"FROM venta v INNER JOIN empleado e ON v.`Empleado_Id`=e.`Id`\n" +
" WHERE v.Fecha>= ? and v.Fecha<=?";
        try {
             PreparedStatement p = proyectociber.ProyectoCiber.conexion.prepareStatement(sql);
             p.setDate(1, new java.sql.Date(desde.getTime()));
             p.setDate(2, new java.sql.Date(hasta.getTime()));
             ResultSet rs = p.executeQuery();
            while(rs.next()){
                Venta v = new Venta();
                v.setFecha(rs.getDate("Fecha"));
                v.setGranTotal(rs.getDouble("GranTotal"));
                v.setId(rs.getInt("Id"));
                v.setIva(rs.getDouble("Iva"));
                v.setTotal(rs.getDouble("Total"));
                v.setTipo(rs.getString("Tipo"));
                v.getEmpleado().setNombre(rs.getString("Nombre"));
              //  v.getEmpleado().setDni(rs.getString("Dni"));
                lista.add(v);
                
            }
        } catch (SQLException ex) {
             JOptionPane.showMessageDialog(null, ex.getMessage());
        }
    
    return lista;
    }  
}
