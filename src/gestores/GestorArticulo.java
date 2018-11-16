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
import javax.swing.JOptionPane;
import modelo.Articulo;
import modelo.Concepto;

/**
 *
 * @author abel
 */
public class GestorArticulo {
    public void agregar(Articulo a){
    String sql = "insert into articulo(CodBarra,Nombre,Descripcion,PrecioCompra,PrecioVenta,Stock,StockMin)values (?,?,?,?,?,?,?)";
        try {
            
            PreparedStatement p = proyectociber.ProyectoCiber.conexion.prepareStatement(sql);
            p.setString(1, a.getCodBarra());
            p.setString(2, a.getNombre());
            p.setString(3, a.getDescripcion());
            p.setDouble(4, a.getPrecioCompra());
            p.setDouble(5, a.getPrecioVenta());
            p.setInt(6, a.getStock());
            p.setInt(7, a.getStockMin());
            
            
            
            p.execute();
            sql = "select max(Id)as ultimo from articulo";
            ResultSet rs = proyectociber.ProyectoCiber.conexion.createStatement().executeQuery(sql);
            if(rs.next()){
            
            a.setId(rs.getInt("ultimo"));
            
            }
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
        }
      
     public void modificar(Articulo a){
    String sql = "update  articulo set "
            + "CodBarra=?,"//consultas parametrizadas
            + "Nombre=?,"
            + "Descripcion=?,"
            + "PrecioCompra=?,"
            + "PrecioVenta=?,"
            + "Stock=?,"
            + "StockMin=? "
            + "where Id=?";
        try {
            PreparedStatement p = proyectociber.ProyectoCiber.conexion.prepareStatement(sql);
            
            p.setString(1, a.getCodBarra());
            p.setString(2, a.getNombre());
            p.setString(3, a.getDescripcion());
            p.setDouble(4, a.getPrecioCompra());
            p.setDouble(5, a.getPrecioVenta());
            p.setInt(6, a.getStock());
            p.setInt(7, a.getStockMin());
            
            p.setInt(8,a.getId());
            p.execute();
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
        }
     public void borrar(Articulo a){   //  baja logica
       
         try{
String     sql = "update articulo set "
             
             + "Estado='N' "
             + "where Id=?";
            PreparedStatement
             p = proyectociber.ProyectoCiber.conexion.prepareStatement(sql);
          
            p.setInt(1,a.getId());
            p.execute();
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
        }
     public ArrayList <Articulo> ObtenerLista(){
    ArrayList <Articulo> lista = new ArrayList<>();
    String sql = "select * from  articulo ";
        try {
            ResultSet rs = proyectociber.ProyectoCiber.conexion.createStatement().executeQuery(sql);
            while(rs.next()){
                Articulo art = new Articulo();
                art.setId(rs.getInt("Id"));
                art.setCodBarra(rs.getString("CodBarra"));
                art.setNombre(rs.getString("Nombre"));
                art.setDescripcion(rs.getString("Descripcion"));
                art.setPrecioCompra(rs.getDouble("PrecioCompra"));
                art.setPrecioVenta(rs.getDouble("PrecioVenta"));
                art.setStock(rs.getInt("Stock"));
                art.setStockMin(rs.getInt("StockMin"));
                lista.add(art);
                
            }
        } catch (SQLException ex) {
             JOptionPane.showMessageDialog(null, ex.getMessage());
        }
    
    return lista;
    }
    
 public void recuperar(Articulo articulo) {
    String sql = "select * from  articulo "
            + "where Id = ?";
        try {
            PreparedStatement p = proyectociber.ProyectoCiber.conexion.prepareStatement(sql);
            p.setInt(1,articulo.getId());
            ResultSet rs = p.executeQuery();
            if(rs.next()){
                articulo.setId(rs.getInt("Id"));
                articulo.setCodBarra(rs.getString("CodBarra"));
                articulo.setNombre(rs.getString("Nombre"));
                articulo.setDescripcion(rs.getString("Descripcion"));
                articulo.setPrecioCompra(rs.getDouble("PrecioCompra"));
                articulo.setPrecioVenta(rs.getDouble("PrecioVenta"));
                articulo.setStock(rs.getInt("Stock"));
                articulo.setStockMin(rs.getInt("StockMin"));
                                        
                
            }
        } catch (SQLException ex) {
             JOptionPane.showMessageDialog(null, ex.getMessage());
        }
    
    
    
    }   
    
    
    
    
    
    
    
    
    
    
    
}
