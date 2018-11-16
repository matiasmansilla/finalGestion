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
import modelo.Compra;
import modelo.CompraLinea;
import modelo.Venta;


/**
 *
 * @author abel
 */
public class GestorCompra {
    public void agregar(Compra c){
    String sql = "insert into compra(Fecha,Proveedor_Id,Empleado_Id,Total)values (?,?,?,?)";
        try {
            
            PreparedStatement p = proyectociber.ProyectoCiber.conexion.prepareStatement(sql);
            
            p.setDate(1, new java.sql.Date(new java.util.Date().getTime()));
            p.setInt(2, c.getProveedor().getId());
            p.setInt(3, c.getEmpleado().getId());
            p.setDouble(4, c.getTotal());
            p.execute();
           
            sql = "select max(Id)as ultimo from compra";
            ResultSet rs = proyectociber.ProyectoCiber.conexion.createStatement().executeQuery(sql);
            if(rs.next()){
            
            c.setId(rs.getInt("ultimo"));
            
            
            sql = "insert into compralinea (Cantidad,Precio,Articulo_Id,Compra_Id)values(?,?,?,?) ";
                    
            p = proyectociber.ProyectoCiber.conexion.prepareStatement(sql);
         for(CompraLinea linea:c.getLista()){
           
             p.setInt(1, linea.getCantidad());
            p.setDouble(2, linea.getPrecio());
            p.setInt(3, linea.getArticulo().getId());
            p.setInt(4, c.getId());
            p.execute();
         }
            sql = "update articulo set Stock = Stock+? "
                    + "where Id=?";
            p = proyectociber.ProyectoCiber.conexion.prepareStatement(sql);
            
            for(CompraLinea linea:c.getLista())
            {
             p.setInt(1,linea.getCantidad());
             p.setInt(2,linea.getArticulo().getId());
             p.execute();
            
            }
            c.getLista().clear();
            }
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
        
        }
    
    public void agregarLinea(Compra v ,Articulo x, int cantidad){
    Articulo aux=new Articulo();
    aux.setCodBarra(x.getCodBarra());
    aux.setDescripcion(x.getDescripcion());
    aux.setId(x.getId());
    aux.setNombre(x.getNombre());
    aux.setPrecioCompra(x.getPrecioCompra());
    aux.setPrecioVenta(x.getPrecioVenta());
    aux.setStock(x.getStock());
    aux.setStockMin(x.getStockMin());
    
    CompraLinea linea = new CompraLinea();
    linea.setArticulo(aux);
    linea.setCantidad(cantidad);
    linea.setPrecio(aux.getPrecioCompra());
    v.agregar(linea);
    
    
    }
    public void borrarLinea(Compra c,int posi){
    
    c.getLista().remove(posi);// ene sta posicion que me remueva el objeto de esta lista
    
    }

    public ArrayList<Compra> ObtenerLista(Date desde, Date hasta) {
       
    ArrayList <Compra> lista = new ArrayList<>();
    String sql = "SELECT c.`Id`,c.`Fecha`,e.`Nombre`,p.`RazonSocial`,c.`Total` \n" +
"FROM compra c ,empleado e,proveedor p\n" +
"WHERE c.`Empleado_Id`=e.`Id`\n" +
"AND c.`Proveedor_Id`=p.`Id`\n" +
"AND c.Fecha>= ? and c.Fecha<=?";
        try {
             PreparedStatement p = proyectociber.ProyectoCiber.conexion.prepareStatement(sql);
             p.setDate(1, new java.sql.Date(desde.getTime()));
             p.setDate(2, new java.sql.Date(hasta.getTime()));
             ResultSet rs = p.executeQuery();
            while(rs.next()){
                Compra c = new Compra();
                c.setId(rs.getInt("Id"));
                c.setFecha(rs.getDate("Fecha"));
                c.getEmpleado().setNombre(rs.getString("Nombre"));
                c.getProveedor().setRazonSocial(rs.getString("RazonSocial"));
                c.setTotal(rs.getDouble("Total"));
                
                lista.add(c);
                
            }
        } catch (SQLException ex) {
             JOptionPane.showMessageDialog(null, ex.getMessage());
        }
    
    return lista;
    }  
    }
    

