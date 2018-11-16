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
import modelo.Localidad;


/**
 *
 * @author abel
 */
public class GestorLocalidad {
    public void agregar(Localidad a){
    String sql = "insert into localidad(Localidad,CodigoPostal,Provincia_Id)values (?,?,?)";
        try {
            
            PreparedStatement p = proyectociber.ProyectoCiber.conexion.prepareStatement(sql);
            p.setString(1, a.getLocalidad());
            p.setString(2,a.getCodigoPostal());
            p.setInt(3,a.getProvincia().getId());
            
            p.execute();
            sql = "select max(Id)as ultimo from localidad";
            ResultSet rs = proyectociber.ProyectoCiber.conexion.createStatement().executeQuery(sql);
            if(rs.next()){
            
            a.setId(rs.getInt("ultimo"));
            
            }
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
        }
      
     public void modificar(Localidad a){
    String sql = "update  provincia set "
            + "Localidad=? "//consultas parametrizada
            + "where Id=?";
        try {
            PreparedStatement p = proyectociber.ProyectoCiber.conexion.prepareStatement(sql);
            
           p.setString(1, a.getLocalidad());
            
            p.setInt(2,a.getId());
            p.execute();
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
        }
     public void borrar(Localidad a){// BAja fisica
       
         
    String sql = "delete from provincia where Id=?";
        try {
            
            PreparedStatement p = proyectociber.ProyectoCiber.conexion.prepareStatement(sql);
           
            p.setInt(1,a.getId());
            p.execute();
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
        }
     public ArrayList <Localidad> ObtenerLista(String provincia){
    ArrayList <Localidad> lista = new ArrayList<>();
    String sql = "select l.* "
            + "from  localidad l,provincia p "
            + "where l.Provincia_Id = p.Id "
            + "and p.Provincia = ?";
        try {
            PreparedStatement p = proyectociber.ProyectoCiber.conexion.prepareStatement(sql);
            p.setString(1,provincia);
            ResultSet rs = p.executeQuery();
            
            
            
            while(rs.next()){
                Localidad loc = new Localidad();
                loc.setId(rs.getInt("Id"));
                loc.setLocalidad(rs.getString("Localidad"));
                loc.setCodigoPostal(rs.getString("CodigoPostal"));
                loc.getProvincia().setId(rs.getInt("Provincia_Id"));
                loc.getProvincia().setProvincia(provincia);
                lista.add(loc);
                
            }
        } catch (SQLException ex) {
             JOptionPane.showMessageDialog(null, ex.getMessage());
        }
    
    return lista;
    }
      public ArrayList <Localidad> ObtenerLista(){
    ArrayList <Localidad> lista = new ArrayList<>();
    String sql = "select l.*,p.Provincia "
            + "from  localidad l,provincia p "
            + "where l.Provincia_Id = p.Id ";
            
        try {
            PreparedStatement p = proyectociber.ProyectoCiber.conexion.prepareStatement(sql);
          
            ResultSet rs = p.executeQuery();
            
            
            
            while(rs.next()){
                Localidad loc = new Localidad();
                loc.setId(rs.getInt("Id"));
                loc.setLocalidad(rs.getString("Localidad"));
                loc.setCodigoPostal(rs.getString("CodigoPostal"));
                loc.getProvincia().setId(rs.getInt("Provincia_Id"));
                loc.getProvincia().setProvincia(rs.getString("Provincia"));
                lista.add(loc);
                
            }
        } catch (SQLException ex) {
             JOptionPane.showMessageDialog(null, ex.getMessage());
        }
    
    return lista;
    }
    
    
 public void recuperar(Localidad pro) {
    String sql = "select l.*,p.Provincia from  provincia p,localidad l  "
            + "where l.Id=? "
            + "and l.Provincia_Id = p.Id";
        try {
            PreparedStatement p = proyectociber.ProyectoCiber.conexion.prepareStatement(sql);
            p.setInt(1,pro.getId());
            ResultSet rs = p.executeQuery();
            if(rs.next()){
                pro.setId(rs.getInt("Id"));
                pro.setLocalidad(rs.getString("Localidad"));
                pro.setCodigoPostal(rs.getString("CodigoPostal"));
                pro.getProvincia().setId(rs.getInt("Provincia_Id"));
                pro.getProvincia().setProvincia(rs.getString("Provincia"));
                
                                        
                
            }
        } catch (SQLException ex) {
             JOptionPane.showMessageDialog(null, ex.getMessage());
        }
    
    
    
    }   
    
    public int buscarIdLocalidad(String loc){
    int idloc=0;
    String  sql = "select Id from  localidad "
            + "where Localidad = ?";
        try {
            PreparedStatement p = proyectociber.ProyectoCiber.conexion.prepareStatement(sql);
            p.setString(1,loc);
            ResultSet rs = p.executeQuery();
            if(rs.next()){
                idloc=rs.getInt("Id");
                
                
                                        
                
            }
        } catch (SQLException ex) {
             JOptionPane.showMessageDialog(null, ex.getMessage());
        }
    
    return idloc;
    }

}
