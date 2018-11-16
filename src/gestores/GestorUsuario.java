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
import modelo.Articulo;
import modelo.Usuario;

import proyectociber.*;
/**
 *
 * @author abel
 */
public class GestorUsuario {
    
    public static Usuario logeado = new Usuario();
  
    
    public boolean ingresar(String usu,String cla){
    
    boolean encontrado = false;
    String sql = "select c.Categoria ,c.Basico,"
            + "e.Dni,e.Telefono,e.Mail,e.Ingreso,e.Sexo,e.Categoria_Id,"
            + "u.Usuario,u.Empleado_Id,u.Id "    //falta domicilio
            +"from usuario u , empleado e,categoria c "
            + "where u.Empleado_Id = e.Id "
            + "and e.Categoria_Id= c.Id "
            + "and u.Usuario = ? "
            + "and u.Clave= md5(?) "// metodo de encriptacion de mysql 
            + "and c.Estado = 'S' "
            + "and e.Estado= 'S'";
    
        try {
            PreparedStatement p = ProyectoCiber.conexion.prepareStatement(sql);
            p.setString(1, usu);
            p.setString(2, cla);
            ResultSet rs = p.executeQuery();
            if(rs.next()){
            logeado.setClave(cla);
            logeado.setUsuario(usu);
            logeado.setId(rs.getInt("u.Id"));
            
            logeado.getEmpleado().setDni(rs.getString("Dni"));
            logeado.getEmpleado().setId(rs.getInt("Empleado_Id"));
            logeado.getEmpleado().setIngreso(rs.getDate("Ingreso"));
            logeado.getEmpleado().setMail(rs.getString("Mail"));
            logeado.getEmpleado().setSexo(rs.getString("Sexo"));
            logeado.getEmpleado().setTelefono(rs.getString("Telefono"));
            logeado.getEmpleado().setId(rs.getInt("Empleado_Id"));
            
            logeado.getEmpleado().getCategoria().setId(rs.getInt("Categoria_Id"));
            logeado.getEmpleado().getCategoria().setBasico(rs.getDouble("Basico"));
            logeado.getEmpleado().getCategoria().setCategoria(rs.getString("Categoria"));
            
            encontrado = true;
            
            }
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
        
    
    
    
    return encontrado;
    }
    public ArrayList <Usuario> ObtenerLista(){
    ArrayList <Usuario> lista = new ArrayList<>();
    String sql = "SELECT u.`Id`,e.`Nombre`,u.`Usuario`,u.`Clave`\n" +
"FROM usuario u inner join empleado e on u.`Empleado_Id`=e.`Id`\n" + "where u.`Estado`='S'";
            try {
            ResultSet rs = proyectociber.ProyectoCiber.conexion.createStatement().executeQuery(sql);
            while(rs.next()){
                Usuario u = new Usuario();
                u.setClave(rs.getString("Clave"));
                u.setUsuario(rs.getString("Usuario"));
                u.setId(rs.getInt("Id"));
                u.getEmpleado().setNombre(rs.getString("Nombre"));
                lista.add(u);
                
            }
        } catch (SQLException ex) {
             JOptionPane.showMessageDialog(null, ex.getMessage());
        }
    
    return lista;
    }

    public void agregar(Usuario usuario) {
         
    String sql = "insert into usuario(Usuario,Clave,Empleado_Id)values (?,md5(?),?)";
        try {
            
            PreparedStatement p = proyectociber.ProyectoCiber.conexion.prepareStatement(sql);
            p.setString(1, usuario.getUsuario());
            p.setString(2, usuario.getClave());
            p.setInt(3,usuario.getEmpleado().getId());
            
            p.execute();
            sql = "select max(Id)as ultimo from usuario";
            ResultSet rs = proyectociber.ProyectoCiber.conexion.createStatement().executeQuery(sql);
            if(rs.next()){
            
            usuario.setId(rs.getInt("ultimo"));
            
            }
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
        }

    public void borrar(Usuario usuario) {
       
            
            try{
String     sql = "update usuario set "
             
             + "Estado='N' "
             + "where Id=?";
            PreparedStatement
             p = proyectociber.ProyectoCiber.conexion.prepareStatement(sql);
          
            p.setInt(1,usuario.getId());
            p.execute();
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
        
    }

    public void cambiarclave(String clave2) {
      String sql =  "update usuario set Clave=md5(?) "
              + "where Id=?";
       try{
           
            PreparedStatement p = proyectociber.ProyectoCiber.conexion.prepareStatement(sql);
          
            p.setString(1,clave2);
            p.setInt(2,logeado.getId());
            p.execute();
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
        
      
    }
   

}
    
    

    
    
    

