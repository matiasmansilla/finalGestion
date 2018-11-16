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
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import modelo.Categoria;

/**
 *
 * @author abel
 */
public class GestorCategoria {
    
    public void agregar(Categoria c){
    String sql = "insert into categoria(Categoria,Basico)values (?,?)";
        try {
            
            PreparedStatement p = proyectociber.ProyectoCiber.conexion.prepareStatement(sql);
            p.setString(1, c.getCategoria());
            p.setDouble(2, c.getBasico());
            p.execute();
            sql = "select max(Id)as ultimo from categoria";
            ResultSet rs = proyectociber.ProyectoCiber.conexion.createStatement().executeQuery(sql);
            if(rs.next()){
            
            c.setId(rs.getInt("ultimo"));
            
            }
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
        }
    
    public void modificar(Categoria c){
    String sql = "update  categoria set "
            + "Categoria=?,"//consultas parametrizadas
            + "Basico=? "
            + "where Id=?";
        try {
            
            PreparedStatement p = proyectociber.ProyectoCiber.conexion.prepareStatement(sql);
            p.setString(1, c.getCategoria());
            p.setDouble(2, c.getBasico());
            p.setInt(3,c.getId());
            p.execute();
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
        }
    public void borrar(Categoria c){// BAja logica
    String sql = "update  categoria  set Estado=? "
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
    public ArrayList <Categoria> ObtenerLista(){
    ArrayList <Categoria> lista = new ArrayList<>();
    String sql = "select * from  categoria  where Estado = 'S'";
        try {
            ResultSet rs = proyectociber.ProyectoCiber.conexion.createStatement().executeQuery(sql);
            while(rs.next()){
                Categoria cate = new Categoria();
                cate.setBasico(rs.getDouble("Basico"));
                cate.setCategoria(rs.getString("Categoria"));
                cate.setEstado(rs.getString("Estado"));
                cate.setId(rs.getInt("Id"));
                lista.add(cate);
                
            }
        } catch (SQLException ex) {
             JOptionPane.showMessageDialog(null, ex.getMessage());
        }
    
    return lista;
    }

    public void recuperar(Categoria categoria) {
    String sql = "select * from  categoria "
            + "where Id = ?";
        try {
            PreparedStatement p = proyectociber.ProyectoCiber.conexion.prepareStatement(sql);
            p.setInt(1,categoria.getId());
            ResultSet rs = p.executeQuery();
            if(rs.next()){
                categoria.setBasico(rs.getDouble("Basico"));
                categoria.setCategoria(rs.getString("Categoria"));
                categoria.setEstado(rs.getString("Estado"));
               
                
                
            }
        } catch (SQLException ex) {
             JOptionPane.showMessageDialog(null, ex.getMessage());
        }
    
    
    
    }
    
    
}
