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
import modelo.Cliente;
import modelo.Empleado;

/**
 *
 * @author abel
 */
public class GestorEmpleado {
    
     public void agregar(Empleado e){
    
    
         String sql = "insert into domicilio(Calle,Numero,Piso,Departamento,Localidad_Id)values (?,?,?,?,?)";
        try {
           
            PreparedStatement p = proyectociber.ProyectoCiber.conexion.prepareStatement(sql);
            p.setString(1, e.getDomicilio().getCalle());
            p.setString(2, e.getDomicilio().getNumero());
            p.setString(3, e.getDomicilio().getPiso());
            p.setString(4, e.getDomicilio().getDepartamento());
            p.setInt(5, e.getDomicilio().getLocalidad().getId());
          
            p.execute();
            sql = "select max(Id)as ultimo from domicilio";
            ResultSet rs = proyectociber.ProyectoCiber.conexion.createStatement().executeQuery(sql);
            if(rs.next()){
            
            e.getDomicilio().setId(rs.getInt("ultimo"));
            
            }
            
            
        
     sql = "insert into empleado(Dni,Telefono,Mail,Ingreso,Sexo,Domicilio_Id,Categoria_Id,Nombre)values (?,?,?,?,?,?,?,?)";
            
             p = proyectociber.ProyectoCiber.conexion.prepareStatement(sql);
            p.setString(1, e.getDni());
            p.setString(2, e.getTelefono());
            p.setString(3 , e.getMail());
            p.setDate(4, new java.sql.Date(e.getIngreso().getTime()));
            p.setString(5, e.getSexo());
             p.setInt(6, e.getDomicilio().getId());
            p.setInt(7, e.getCategoria().getId());
            p.setString(8,e.getNombre());
            p.execute();
            sql = "select max(Id)as ultimo from empleado";
            rs = proyectociber.ProyectoCiber.conexion.createStatement().executeQuery(sql);
            if(rs.next()){
            
            e.setId(rs.getInt("ultimo"));
            
            }
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
        
    
    
    }
    
     public int buscarIdCategoria(String cat){
    int idcat=0;
    String  sql = "select Id from  categoria "
            + "where categoria = ?";
        try {
            PreparedStatement p = proyectociber.ProyectoCiber.conexion.prepareStatement(sql);
            p.setString(1,cat);
            ResultSet rs = p.executeQuery();
            if(rs.next()){
                idcat=rs.getInt("Id");
                
                
                                        
                
            }
        } catch (SQLException ex) {
             JOptionPane.showMessageDialog(null, ex.getMessage());
        }
    
    return idcat;
    }
  
     public ArrayList <Empleado> ObtenerLista(){
    ArrayList <Empleado> lista = new ArrayList<>();
    String sql = "SELECT e.*,d.`Calle`,d.`Numero`,d.`Piso`,d.`Departamento`,d.`Localidad_Id`,\n" +
"l.`Localidad`,l.`CodigoPostal`,l.`Provincia_Id`,p.`Provincia`,\n" +
"c.`Categoria`\n" +            
" FROM empleado e,domicilio d,localidad l,provincia p,categoria c\n" +
"where e.`Domicilio_Id` =d.`Id`\n" +
"and d.`Localidad_Id`=l.`Id`\n" +
"and l.`Provincia_Id`=p.`Id` \n" +
  "and e.`Categoria_Id`=c.`Id` \n" +        
" and e.Estado='S'";
        try {
            ResultSet rs = proyectociber.ProyectoCiber.conexion.createStatement().executeQuery(sql);
            while(rs.next()){
                Empleado art = new Empleado();
                art.setId(rs.getInt("Id"));
                art.setDni(rs.getString("Dni"));
                art.setNombre(rs.getString("Nombre"));
                art.setTelefono(rs.getString("Telefono"));
                art.setMail(rs.getString("Mail"));
                art.setIngreso(rs.getDate("Ingreso"));
                art.setSexo(rs.getString("Sexo"));
                //categoria
                art.getCategoria().setCategoria(rs.getString("Categoria"));
                //domicilio
                art.getDomicilio().setCalle(rs.getString("Calle"));
                art.getDomicilio().setDepartamento(rs.getString("Departamento"));
                art.getDomicilio().setId(rs.getInt("Domicilio_Id"));
                art.getDomicilio().setNumero(rs.getString("Numero"));
                art.getDomicilio().setPiso(rs.getString("Piso"));
                //localidad dentro del Domicilio
                art.getDomicilio().getLocalidad().setCodigoPostal(rs.getString("CodigoPostal"));
                art.getDomicilio().getLocalidad().setId(rs.getInt("Domicilio_Id"));
                art.getDomicilio().getLocalidad().setLocalidad(rs.getString("Localidad"));
                //provincia dentro de localidad
                art.getDomicilio().getLocalidad().getProvincia().setId(rs.getInt("Provincia_Id"));
                art.getDomicilio().getLocalidad().getProvincia().setProvincia(rs.getString("Provincia"));
                lista.add(art);
                
            }
        } catch (SQLException ex) {
             JOptionPane.showMessageDialog(null, ex.getMessage());
        }
    
    return lista;
    }
     

    public void modificar(Empleado empleado) {
         String sql = "update domicilio set "
                 + "Calle=?,"
                 + "Numero=?,"
                 + "Piso=?"
                 + ",Departamento=?,"
                 + "Localidad_Id=? "
                 
                 + "where Id=?";
        try {
            
            PreparedStatement p = proyectociber.ProyectoCiber.conexion.prepareStatement(sql);
            p.setString(1, empleado.getDomicilio().getCalle());
            p.setString(2, empleado.getDomicilio().getNumero());
            p.setString(3, empleado.getDomicilio().getPiso());
            p.setString(4, empleado.getDomicilio().getDepartamento());
            p.setInt(5, empleado.getDomicilio().getLocalidad().getId());
            p.setInt(6, empleado.getDomicilio().getId());
            
          
            p.execute();
            
        
     sql = "update empleado set "
             + "Dni=?,"
             + "Nombre=?,"
             + "Telefono=?,"
             + "Mail=?,"
             + "Ingreso=?,"
             + "Sexo=?,"
             + "Domicilio_Id=?, "
             + "Categoria_Id=? "
             + "where Id=?";
            
             p = proyectociber.ProyectoCiber.conexion.prepareStatement(sql);
            p.setString(1, empleado.getDni());
            p.setString(2, empleado.getNombre());
            p.setString(3 ,empleado.getTelefono());
            p.setString(4,empleado.getMail());
            p.setDate(5, new java.sql.Date(empleado.getIngreso().getTime()));//???????????
            p.setString(6,empleado.getSexo());
            p.setInt(7,empleado.getDomicilio().getId());
            p.setInt(8,empleado.getCategoria().getId());
            p.setInt(9,empleado.getId());
            p.execute();
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
     
     
}

public void recuperar(Empleado empleado) {
    String sql ="SELECT e.*,d.`Calle`,d.`Numero`,d.`Piso`,d.`Departamento`,d.`Localidad_Id`,\n" +
"l.`Localidad`,l.`CodigoPostal`,l.`Provincia_Id`,p.`Provincia`,\n" +
"c.`Categoria`,c.`Basico`\n" + 
" FROM empleado e,domicilio d,localidad l,provincia p,categoria c\n" +
"where e.`Domicilio_Id` =d.`Id`\n" +
"and d.`Localidad_Id`=l.`Id`\n" +
"and l.`Provincia_Id`=p.`Id` \n" +
 "and e.`Categoria_Id`=c.`Id` \n" +            
" and e.Id=?";
        try {
            PreparedStatement p = proyectociber.ProyectoCiber.conexion.prepareStatement(sql);
            p.setInt(1,empleado.getId());
            ResultSet rs = p.executeQuery();
            if(rs.next()){
              
                empleado.setId(rs.getInt("Id"));
                empleado.setDni(rs.getString("Dni"));
                empleado.setNombre(rs.getString("Nombre"));
                empleado.setTelefono(rs.getString("Telefono"));
                empleado.setMail(rs.getString("Mail"));
                empleado.setIngreso(rs.getDate("Ingreso"));
                empleado.setSexo(rs.getString("Sexo"));
                
                //domicilio
                empleado.getDomicilio().setCalle(rs.getString("Calle"));
                empleado.getDomicilio().setDepartamento(rs.getString("Departamento"));
                empleado.getDomicilio().setId(rs.getInt("Domicilio_Id"));
                empleado.getDomicilio().setNumero(rs.getString("Numero"));
                empleado.getDomicilio().setPiso(rs.getString("Piso"));
                //localidad dentro del Domicilio
                empleado.getDomicilio().getLocalidad().setCodigoPostal(rs.getString("CodigoPostal"));
                empleado.getDomicilio().getLocalidad().setId(rs.getInt("Localidad_Id"));
                empleado.getDomicilio().getLocalidad().setLocalidad(rs.getString("Localidad"));
                //provincia dentro de localidad
                empleado.getDomicilio().getLocalidad().getProvincia().setId(rs.getInt("Provincia_Id"));
                empleado.getDomicilio().getLocalidad().getProvincia().setProvincia(rs.getString("Provincia"));
                //categoria
                empleado.getCategoria().setCategoria(rs.getString("Categoria"));
                empleado.getCategoria().setId(rs.getInt("Categoria_Id"));
                empleado.getCategoria().setBasico(rs.getDouble("Basico"));
                
            }
        } catch (SQLException ex) {
             JOptionPane.showMessageDialog(null, ex.getMessage());
        }
    
    
    
    }   

    public void borrar(Empleado empleado) {
      

            
            try{
String     sql = "update empleado set "
             
             + "Estado='N' "
             + "where Id=?";
            PreparedStatement
             p = proyectociber.ProyectoCiber.conexion.prepareStatement(sql);
          
            p.setInt(1,empleado.getId());
            p.execute();
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
        
    }  

    public int buscarIdEmpleado(String nom) {
       int idnom=0;
    String  sql = "select Id from  Empleado "
            + "where nombre = ?";
        try {
            PreparedStatement p = proyectociber.ProyectoCiber.conexion.prepareStatement(sql);
            p.setString(1,nom);
            ResultSet rs = p.executeQuery();
            if(rs.next()){
                idnom=rs.getInt("Id");
                
                
                                        
                
            }
        } catch (SQLException ex) {
             JOptionPane.showMessageDialog(null, ex.getMessage());
        }
    
    return idnom;
    }

     







}
    











