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
import modelo.Empleado;
import modelo.Familia;

/**
 *
 * @author abel
 */
public class GestorFamilia {
    
    
  public void agregar(Familia f){
    
    
         String sql = "insert into familia(Dni,Nombre,Parentesco,Empleado_Id)values (?,?,?,?)";
        try {
           
            
           PreparedStatement  p = proyectociber.ProyectoCiber.conexion.prepareStatement(sql);
            p.setString(1, f.getDni());
            p.setString(2, f.getNombre());
            p.setString(3 , f.getParentesco());
            p.setInt(4, f.getEmpleado().getId());
            
            p.execute();
            sql = "select max(Id)as ultimo from familia";
           ResultSet rs = proyectociber.ProyectoCiber.conexion.createStatement().executeQuery(sql);
            if(rs.next()){
            
            f.setId(rs.getInt("ultimo"));
            
            }
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
        
    }

    public ArrayList<Familia> ObtenerLista() {
       ArrayList <Familia> lista = new ArrayList<>();
    String sql ="SELECT f.*,e.`Nombre` as empleado\n" + 
" FROM familia f,empleado e\n" +
"where f.`Empleado_Id`=e.`Id`";
         
//" and e.Estado='S'";
        try {
            ResultSet rs = proyectociber.ProyectoCiber.conexion.createStatement().executeQuery(sql);
            while(rs.next()){
                Familia art = new Familia();
                art.setId(rs.getInt("Id"));
                art.setDni(rs.getString("Dni"));
                art.setNombre(rs.getString("Nombre"));
                art.setParentesco(rs.getString("Parentesco"));
                //empleado
               art.getEmpleado().setNombre(rs.getString("empleado"));
               // art.getEmpleado().setId(rs.getInt("Empelado_Id"));
                
                
                lista.add(art);
                
            }
        } catch (SQLException ex) {
             JOptionPane.showMessageDialog(null, ex.getMessage());
        }
    
    return lista;
    }
    
    public void recuperar(Familia art) {
       ArrayList <Familia> lista = new ArrayList<>();
    String sql ="SELECT f.*,e.`Nombre` as empleado\n" + 
" FROM familia f,empleado e\n" +
"where f.`Empleado_Id`=e.`Id` "
            + "and f.Id="+ art.getId();
            
         
//" and e.Estado='S'";
        try {
            ResultSet rs = proyectociber.ProyectoCiber.conexion.createStatement().executeQuery(sql);
            if(rs.next()){
                
                art.setId(rs.getInt("Id"));
                art.setDni(rs.getString("Dni"));
                art.setNombre(rs.getString("Nombre"));
                art.setParentesco(rs.getString("Parentesco"));
                //empleado
               art.getEmpleado().setNombre(rs.getString("empleado"));
                art.getEmpleado().setId(rs.getInt("Empleado_Id"));
                
                
                lista.add(art);
                
            }
        } catch (SQLException ex) {
             JOptionPane.showMessageDialog(null, ex.getMessage());
        }
    
    
    }
public void modificar(Familia f){
    
    
         String sql = "update familia set "
                 + "Dni=?,"
                 + "Nombre=?,"
                 + "Parentesco=?,"
                 + "Empleado_Id=? "
                 + "where Id=?";
        try {
           
            
           PreparedStatement  p = proyectociber.ProyectoCiber.conexion.prepareStatement(sql);
            p.setString(1, f.getDni());
            p.setString(2, f.getNombre());
            p.setString(3 , f.getParentesco());
            p.setInt(4, f.getEmpleado().getId());
            p.setInt(5, f.getId());
            
            p.execute();
            
          
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
        
    }

    public ArrayList<Familia> ObtenerLista(int id) {
    
         ArrayList <Familia> lista = new ArrayList<>();
    String sql ="SELECT f.*,e.`Nombre` as empleado\n" + 
" FROM familia f,empleado e\n" +
"where f.`Empleado_Id`=e.`Id`"+
" and e.Id="+id;
        try {
            ResultSet rs = proyectociber.ProyectoCiber.conexion.createStatement().executeQuery(sql);
            while(rs.next()){
                Familia art = new Familia();
                art.setId(rs.getInt("Id"));
                art.setDni(rs.getString("Dni"));
                art.setNombre(rs.getString("Nombre"));
                art.setParentesco(rs.getString("Parentesco"));
                //empleado
               art.getEmpleado().setNombre(rs.getString("empleado"));
               // art.getEmpleado().setId(rs.getInt("Empelado_Id"));
                
                
                lista.add(art);
                
            }
        } catch (SQLException ex) {
             JOptionPane.showMessageDialog(null, ex.getMessage());
        }
        
        
        
return lista;
    }

//borrar
    public void borrar(Familia f) {
            
        String     sql = "delete from familia where Id=?";    
        
        
        try{
            
            PreparedStatement
             p = proyectociber.ProyectoCiber.conexion.prepareStatement(sql);
          
            p.setInt(1,f.getId());
            p.execute();
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
        
    }  

}





