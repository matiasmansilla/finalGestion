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
import modelo.Provincia;
import modelo.Concepto;

/**
 *
 * @author abel
 */
public class GestorProvincia {
    public void agregar(Provincia a){
    String sql = "insert into provincia(Provincia)values (?)";
        try {
            
            PreparedStatement p = proyectociber.ProyectoCiber.conexion.prepareStatement(sql);
            p.setString(1, a.getProvincia());
            
            
            p.execute();
            sql = "select max(Id)as ultimo from provincia";
            ResultSet rs = proyectociber.ProyectoCiber.conexion.createStatement().executeQuery(sql);
            if(rs.next()){
            
            a.setId(rs.getInt("ultimo"));
            
            }
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
        }
      
     public void modificar(Provincia a){
    String sql = "update  provincia set "
            + "Provincia=? "//consultas parametrizada
            + "where Id=?";
        try {
            PreparedStatement p = proyectociber.ProyectoCiber.conexion.prepareStatement(sql);
            
           p.setString(1, a.getProvincia());
            
            p.setInt(2,a.getId());
            p.execute();
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
        }
     public void borrar(Provincia a){// BAja fisica
       
         
    String sql = "delete from provincia where Id=?";
        try {
            
            PreparedStatement p = proyectociber.ProyectoCiber.conexion.prepareStatement(sql);
           
            p.setInt(1,a.getId());
            p.execute();
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
        }
     public ArrayList <Provincia> ObtenerLista(){
    ArrayList <Provincia> lista = new ArrayList<>();
    String sql = "select * from  provincia ";
        try {
            ResultSet rs = proyectociber.ProyectoCiber.conexion.createStatement().executeQuery(sql);
            while(rs.next()){
                Provincia art = new Provincia();
                art.setId(rs.getInt("Id"));
                art.setProvincia(rs.getString("Provincia"));
              
                lista.add(art);
                
            }
        } catch (SQLException ex) {
             JOptionPane.showMessageDialog(null, ex.getMessage());
        }
    
    return lista;
    }
    
 public void recuperar(Provincia pro) {
    String sql = "select * from  provincia "
            + "where Id = ?";
        try {
            PreparedStatement p = proyectociber.ProyectoCiber.conexion.prepareStatement(sql);
            p.setInt(1,pro.getId());
            ResultSet rs = p.executeQuery();
            if(rs.next()){
                pro.setId(rs.getInt("Id"));
                pro.setProvincia(rs.getString("Provincia"));
                
                                        
                
            }
        } catch (SQLException ex) {
             JOptionPane.showMessageDialog(null, ex.getMessage());
        }
    
    
    
    }   
    
    public void recuperarId(Provincia pro) {
    String sql = "select * from  provincia "
            + "where Provincia = ?";
        try {
            PreparedStatement p = proyectociber.ProyectoCiber.conexion.prepareStatement(sql);
            p.setString(1,pro.getProvincia());
            ResultSet rs = p.executeQuery();
            if(rs.next()){
                pro.setId(rs.getInt("Id"));
                pro.setProvincia(rs.getString("Provincia"));
                
                                        
                
            }
        } catch (SQLException ex) {
             JOptionPane.showMessageDialog(null, ex.getMessage());
        }
    
    
    
    }   
    
    
    
    
    
    
    
    
    
}
