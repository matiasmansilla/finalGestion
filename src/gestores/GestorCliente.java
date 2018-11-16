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
import modelo.Categoria;
import modelo.Cliente;

/**
 *
 * @author abel
 */

public class GestorCliente {
    public void agregar(Cliente c){
        
         String sql = "insert into domicilio(Calle,Numero,Piso,Departamento,Localidad_Id)values (?,?,?,?,?)";
        try {
            
            PreparedStatement p = proyectociber.ProyectoCiber.conexion.prepareStatement(sql);
            p.setString(1, c.getDomicilio().getCalle());
            p.setString(2, c.getDomicilio().getNumero());
            p.setString(3, c.getDomicilio().getPiso());
            p.setString(4, c.getDomicilio().getDepartamento());
            p.setInt(5, c.getDomicilio().getLocalidad().getId());
          
            p.execute();
            sql = "select max(Id)as ultimo from domicilio";
            ResultSet rs = proyectociber.ProyectoCiber.conexion.createStatement().executeQuery(sql);
            if(rs.next()){
            
            c.getDomicilio().setId(rs.getInt("ultimo"));
            
            }
        
     sql = "insert into cliente(Dni,Cuil,Nombre,Telefono,Mail,Alta,Domicilio_Id)values (?,?,?,?,?,?)";
            
            p = proyectociber.ProyectoCiber.conexion.prepareStatement(sql);
            p.setString(1, c.getDni());
            p.setString(2, c.getCuil());
            p.setString(3, c.getNombre());
            p.setString(4 , c.getTelefono());
            p.setString(5,c.getMail());
            p.setDate(6, new java.sql.Date(c.getAlta().getTime()));//???????????
            p.setInt(7,c.getDomicilio().getId());
            p.execute();
            sql = "select max(Id)as ultimo from cliente";
            rs = proyectociber.ProyectoCiber.conexion.createStatement().executeQuery(sql);
            if(rs.next()){
            
            c.setId(rs.getInt("ultimo"));
            
            }
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
        
    
    
    }
     public ArrayList <Cliente> ObtenerLista(){
    ArrayList <Cliente> lista = new ArrayList<>();
    String sql = "SELECT c.*,d.`Calle`,d.`Numero`,d.`Piso`,d.`Departamento`,d.`Localidad_Id`,\n" +
"l.`Localidad`,l.`CodigoPostal`,l.`Provincia_Id`,p.`Provincia`\n" +
" FROM cliente c,domicilio d,localidad l,provincia p\n" +
"where c.`Domicilio_Id` =d.`Id`\n" +
"and d.`Localidad_Id`=l.`Id`\n" +
"and l.`Provincia_Id`=p.`Id` \n" +
" and c.Estado='S'";
        try {
            ResultSet rs = proyectociber.ProyectoCiber.conexion.createStatement().executeQuery(sql);
            while(rs.next()){
                Cliente art = new Cliente();
                art.setId(rs.getInt("Id"));
                art.setDni(rs.getString("Dni"));
                art.setCuil(rs.getString("Cuil"));
                art.setNombre(rs.getString("Nombre"));
                art.setTelefono(rs.getString("Telefono"));
                art.setMail(rs.getString("Mail"));
                art.setAlta(rs.getDate("Alta"));
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
    public void recuperar(Cliente cliente) {
    String sql ="SELECT c.*,d.`Calle`,d.`Numero`,d.`Piso`,d.`Departamento`,d.`Localidad_Id`,\n" +
"l.`Localidad`,l.`CodigoPostal`,l.`Provincia_Id`,p.`Provincia`\n" +
" FROM cliente c,domicilio d,localidad l,provincia p\n" +
"where c.`Domicilio_Id` =d.`Id`\n" +
"and d.`Localidad_Id`=l.`Id`\n" +
"and l.`Provincia_Id`=p.`Id` \n" +
" and c.Id=?";
        try {
            PreparedStatement p = proyectociber.ProyectoCiber.conexion.prepareStatement(sql);
            p.setInt(1,cliente.getId());
            ResultSet rs = p.executeQuery();
            if(rs.next()){
              
                cliente.setId(rs.getInt("Id"));
                cliente.setDni(rs.getString("Dni"));
                cliente.setCuil(rs.getString("Cuil"));
                cliente.setNombre(rs.getString("Nombre"));
                cliente.setTelefono(rs.getString("Telefono"));
                cliente.setMail(rs.getString("Mail"));
                cliente.setAlta(rs.getDate("Alta"));
                //domicilio
                cliente.getDomicilio().setCalle(rs.getString("Calle"));
                cliente.getDomicilio().setDepartamento(rs.getString("Departamento"));
                cliente.getDomicilio().setId(rs.getInt("Domicilio_Id"));
                cliente.getDomicilio().setNumero(rs.getString("Numero"));
                cliente.getDomicilio().setPiso(rs.getString("Piso"));
                //localidad dentro del Domicilio
                cliente.getDomicilio().getLocalidad().setCodigoPostal(rs.getString("CodigoPostal"));
                cliente.getDomicilio().getLocalidad().setId(rs.getInt("Localidad_Id"));
                cliente.getDomicilio().getLocalidad().setLocalidad(rs.getString("Localidad"));
                //provincia dentro de localidad
                cliente.getDomicilio().getLocalidad().getProvincia().setId(rs.getInt("Provincia_Id"));
                cliente.getDomicilio().getLocalidad().getProvincia().setProvincia(rs.getString("Provincia"));
                
            }
        } catch (SQLException ex) {
             JOptionPane.showMessageDialog(null, ex.getMessage());
        }
    
    
    
    }   

    public void modificar(Cliente cliente) {
         String sql = "update domicilio set "
                 + "Calle=?,"
                 + "Numero=?,"
                 + "Piso=?"
                 + ",Departamento=?,"
                 + "Localidad_Id=? "
                 + "where Id=?";
        try {
            
            PreparedStatement p = proyectociber.ProyectoCiber.conexion.prepareStatement(sql);
            p.setString(1, cliente.getDomicilio().getCalle());
            p.setString(2, cliente.getDomicilio().getNumero());
            p.setString(3, cliente.getDomicilio().getPiso());
            p.setString(4, cliente.getDomicilio().getDepartamento());
            p.setInt(5, cliente.getDomicilio().getLocalidad().getId());
            p.setInt(6, cliente.getDomicilio().getId());
          
            p.execute();
            
        
     sql = "update cliente set "
             + "Dni=?,"
             + "Cuil=?,"
             + "Nombre=?,"
             + "Telefono=?,"
             + "Mail=?,"
             + "Alta=?,"
             + "Domicilio_Id=? "
             + "where Id=?";
            
             p = proyectociber.ProyectoCiber.conexion.prepareStatement(sql);
           p.setString(1, cliente.getDni());
            p.setString(2, cliente.getCuil());
            p.setString(3, cliente.getNombre());
            p.setString(4 , cliente.getTelefono());
            p.setString(5,cliente.getMail());
            p.setDate(6, new java.sql.Date(cliente.getAlta().getTime()));//???????????
            p.setInt(7,cliente.getDomicilio().getId());
            p.setInt(8,cliente.getId());
            p.execute();
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
        
    
    
    }
    public void borrar(Cliente cliente){

            
            try{
String     sql = "update cliente set "
             
             + "Estado='N' "
             + "where Id=?";
            PreparedStatement
             p = proyectociber.ProyectoCiber.conexion.prepareStatement(sql);
          
            p.setInt(1,cliente.getId());
            p.execute();
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
        
    }
}
