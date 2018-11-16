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

import modelo.Proveedor;

/**
 *
 * @author abel
 */
public class GestorProveedor {
     public void agregar(Proveedor pro){
        
         String sql = "insert into domicilio(Calle,Numero,Piso,Departamento,Localidad_Id)values (?,?,?,?,?)";
        try {
            
            PreparedStatement p = proyectociber.ProyectoCiber.conexion.prepareStatement(sql);
            p.setString(1, pro.getDomicilio().getCalle());
            p.setString(2, pro.getDomicilio().getNumero());
            p.setString(3, pro.getDomicilio().getPiso());
            p.setString(4, pro.getDomicilio().getDepartamento());
            p.setInt(5, pro.getDomicilio().getLocalidad().getId());
          
            p.execute();
            sql = "select max(Id)as ultimo from domicilio";
            ResultSet rs = proyectociber.ProyectoCiber.conexion.createStatement().executeQuery(sql);
            if(rs.next()){
            
            pro.getDomicilio().setId(rs.getInt("ultimo"));
            
            }
        
     sql = "insert into proveedor(RazonSocial,Cuit,Telefono,Mail,Domicilio_Id)values (?,?,?,?,?)";
            
             p = proyectociber.ProyectoCiber.conexion.prepareStatement(sql);
            p.setString(1, pro.getRazonSocial());
            p.setString(2, pro.getCuit());
            p.setString(3 , pro.getTelefono());
            p.setString(4,pro.getMail());
            p.setInt(5,pro.getDomicilio().getId());
            p.execute();
            sql = "select max(Id)as ultimo from proveedor";
            rs = proyectociber.ProyectoCiber.conexion.createStatement().executeQuery(sql);
            if(rs.next()){
            
            pro.setId(rs.getInt("ultimo"));
            
            }
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
        
    
    
    }
    
   public ArrayList <Proveedor> ObtenerLista(){
    ArrayList <Proveedor> lista = new ArrayList<>();
    String sql = "SELECT e.*,d.`Calle`,d.`Numero`,d.`Piso`,d.`Departamento`,d.`Localidad_Id`,\n" +
"l.`Localidad`,l.`CodigoPostal`,l.`Provincia_Id`,p.`Provincia`\n" +
           
" FROM proveedor e,domicilio d,localidad l,provincia p\n" +
"where e.`Domicilio_Id` =d.`Id`\n" +
"and d.`Localidad_Id`=l.`Id`\n" +
"and l.`Provincia_Id`=p.`Id` \n" +       
" and e.Estado='S'";
        try {
            ResultSet rs = proyectociber.ProyectoCiber.conexion.createStatement().executeQuery(sql);
            while(rs.next()){
                Proveedor art = new Proveedor();
                art.setId(rs.getInt("Id"));
                art.setRazonSocial(rs.getString("RazonSocial"));
                art.setCuit(rs.getString("Cuit"));
                art.setTelefono(rs.getString("Telefono"));
                art.setMail(rs.getString("Mail"));
              
                //domicilio
                art.getDomicilio().setCalle(rs.getString("Calle"));
                art.getDomicilio().setDepartamento(rs.getString("Departamento"));
                art.getDomicilio().setId(rs.getInt("Domicilio_Id"));
                art.getDomicilio().setNumero(rs.getString("Numero"));
                art.getDomicilio().setPiso(rs.getString("Piso"));
                //localidad dentro del Domicilio
                //art.getDomicilio().getLocalidad().setCodigoPostal(rs.getString("CodigoPostal"));
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
public void modificar(Proveedor proveedor) {
         String sql = "update domicilio set "
                 + "Calle=?,"
                 + "Numero=?,"
                 + "Piso=?"
                 + ",Departamento=?,"
                 + "Localidad_Id=? "
                 
                 + "where Id=?";
        try {
            
            PreparedStatement p = proyectociber.ProyectoCiber.conexion.prepareStatement(sql);
            p.setString(1, proveedor.getDomicilio().getCalle());
            p.setString(2, proveedor.getDomicilio().getNumero());
            p.setString(3, proveedor.getDomicilio().getPiso());
            p.setString(4, proveedor.getDomicilio().getDepartamento());
            p.setInt(5, proveedor.getDomicilio().getLocalidad().getId());
            p.setInt(6, proveedor.getDomicilio().getId());
            
          
            p.execute();
            
        
     sql = "update proveedor set "
             + "RazonSocial=?,"
             + "Cuit=?,"
             + "Telefono=?,"
             + "Mail=?,"
             + "Domicilio_Id=? "
             + "where Id=?";
            
             p = proyectociber.ProyectoCiber.conexion.prepareStatement(sql);
            p.setString(1, proveedor.getRazonSocial());
            p.setString(2, proveedor.getCuit());
            p.setString(3 ,proveedor.getTelefono());
            p.setString(4,proveedor.getMail());
            p.setInt(5,proveedor.getDomicilio().getId());
            p.setInt(6,proveedor.getId());
            p.execute();
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
     
     
}

public void recuperar(Proveedor proveedor) {
    String sql ="SELECT e.*,d.`Calle`,d.`Numero`,d.`Piso`,d.`Departamento`,d.`Localidad_Id`,\n" +
"l.`Localidad`,l.`CodigoPostal`,l.`Provincia_Id`,p.`Provincia`\n" +

" FROM proveedor e,domicilio d,localidad l,provincia p\n" +
"where e.`Domicilio_Id` =d.`Id`\n" +
"and d.`Localidad_Id`=l.`Id`\n" +
"and l.`Provincia_Id`=p.`Id` \n" +
             
" and e.Id=?";
        try {
            PreparedStatement p = proyectociber.ProyectoCiber.conexion.prepareStatement(sql);
            p.setInt(1,proveedor.getId());
            ResultSet rs = p.executeQuery();
            if(rs.next()){
              
                proveedor.setId(rs.getInt("Id"));
                proveedor.setRazonSocial(rs.getString("Razonsocial"));
                proveedor.setCuit(rs.getString("Cuit"));
                proveedor.setTelefono(rs.getString("Telefono"));
                proveedor.setMail(rs.getString("Mail"));
                
                //domicilio
                proveedor.getDomicilio().setCalle(rs.getString("Calle"));
                proveedor.getDomicilio().setDepartamento(rs.getString("Departamento"));
                proveedor.getDomicilio().setId(rs.getInt("Domicilio_Id"));
                proveedor.getDomicilio().setNumero(rs.getString("Numero"));
                proveedor.getDomicilio().setPiso(rs.getString("Piso"));
                //localidad dentro del Domicilio
                proveedor.getDomicilio().getLocalidad().setCodigoPostal(rs.getString("CodigoPostal"));
                proveedor.getDomicilio().getLocalidad().setId(rs.getInt("Localidad_Id"));
                proveedor.getDomicilio().getLocalidad().setLocalidad(rs.getString("Localidad"));
                //provincia dentro de localidad
                proveedor.getDomicilio().getLocalidad().getProvincia().setId(rs.getInt("Provincia_Id"));
                proveedor.getDomicilio().getLocalidad().getProvincia().setProvincia(rs.getString("Provincia"));
                
                
            }
        } catch (SQLException ex) {
             JOptionPane.showMessageDialog(null, ex.getMessage());
        }
    
    
    
    }   

public void borrar(Proveedor proveedor) {
      

            
            try{
String     sql = "update proveedor set "
             
             + "Estado='N' "
             + "where Id=?";
            PreparedStatement
             p = proyectociber.ProyectoCiber.conexion.prepareStatement(sql);
          
            p.setInt(1,proveedor.getId());
            p.execute();
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
        
    }  
}
