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

import modelo.Concepto;

/**
 *
 * @author abel
 */
public class GestorConcepto {
    
      public void agregar(Concepto c){
    String sql = "insert into concepto(Codigo,Descripcion,Valor,Signo,Fijo)values (?,?,?,?,?)";
        try {
            
            PreparedStatement p = proyectociber.ProyectoCiber.conexion.prepareStatement(sql);
            p.setString(1, c.getCodigo());
            p.setString(2, c.getDescripcion());
            p.setDouble(3, c.getValor());
            p.setString(4, c.getSigno());
            p.setString(5, c.getFijo());
            
            p.execute();
            sql = "select max(Id)as ultimo from concepto";
            ResultSet rs = proyectociber.ProyectoCiber.conexion.createStatement().executeQuery(sql);
            if(rs.next()){
            
            c.setId(rs.getInt("ultimo"));
            
            }
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
        }
      
     public void modificar(Concepto c){
    String sql = "update  concepto set "
            + "Codigo=?,"//consultas parametrizadas
            + "Descripcion=?,"
            + "Valor=?,"
            + "Signo=?,"
            + "Fijo=?"
            + "where Id=?";
        try {
            PreparedStatement p = proyectociber.ProyectoCiber.conexion.prepareStatement(sql);
            
            p.setString(1, c.getCodigo());
            p.setString(2, c.getDescripcion());
            p.setDouble(3, c.getValor());
            p.setString(4, c.getSigno());
            p.setString(5, c.getFijo());
            p.setInt(6,c.getId());
            p.execute();
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
        }
     public void borrar(Concepto c){// BAja logica
    String sql = "update  concepto  set Estado=? "
            + "where Id=?";
        try {
            
            PreparedStatement p = proyectociber.ProyectoCiber.conexion.prepareStatement(sql);
            p.setString(1,"N");
            p.setInt(2,c.getId());
            p.execute();
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
        }
     public ArrayList <Concepto> ObtenerLista(){
    ArrayList <Concepto> lista = new ArrayList<>();
    String sql = "select * from  concepto  where Estado = 'S'";
        try {
            ResultSet rs = proyectociber.ProyectoCiber.conexion.createStatement().executeQuery(sql);
            while(rs.next()){
                Concepto con = new Concepto();
                con.setCodigo(rs.getString("Codigo"));
                con.setDescripcion(rs.getString("Descripcion"));
                con.setValor(rs.getDouble("Valor"));
                con.setSigno(rs.getString("Signo"));
                con.setFijo(rs.getString("fijo"));
                con.setId(rs.getInt("Id"));
                lista.add(con);
                
            }
        } catch (SQLException ex) {
             JOptionPane.showMessageDialog(null, ex.getMessage());
        }
    
    return lista;
    }
    
 public void recuperar(Concepto concepto) {
    String sql = "select * from  concepto "
            + "where Id = ?";
        try {
            PreparedStatement p = proyectociber.ProyectoCiber.conexion.prepareStatement(sql);
            p.setInt(1,concepto.getId());
            ResultSet rs = p.executeQuery();
            if(rs.next()){
                concepto.setCodigo(rs.getString("Codigo"));
                concepto.setDescripcion(rs.getString("Descripcion"));
                concepto.setValor(rs.getDouble("Valor"));
                concepto.setSigno(rs.getString("Signo"));
                concepto.setFijo(rs.getString("Fijo"));
                
                
               
                
                
            }
        } catch (SQLException ex) {
             JOptionPane.showMessageDialog(null, ex.getMessage());
        }
    
    
    
    }   

    public Concepto buscar(String nombre) {
       String sql = "select * from  concepto "
            + "where Descripcion = ?";
       Concepto concepto = new Concepto();
        try {
            PreparedStatement p = proyectociber.ProyectoCiber.conexion.prepareStatement(sql);
            p.setString(1,nombre);
            ResultSet rs = p.executeQuery();
            if(rs.next()){
                concepto.setCodigo(rs.getString("Codigo"));
                concepto.setDescripcion(rs.getString("Descripcion"));
                concepto.setValor(rs.getDouble("Valor"));
                concepto.setSigno(rs.getString("Signo"));
                concepto.setFijo(rs.getString("Fijo"));
                concepto.setId(rs.getInt("Id"));
          
            }
            
        } catch (SQLException ex) {
             JOptionPane.showMessageDialog(null, ex.getMessage());
        }
    return concepto;
            }
}
