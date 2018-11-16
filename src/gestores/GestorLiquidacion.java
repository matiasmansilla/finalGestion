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
import modelo.Concepto;
import modelo.Empleado;
import modelo.Liquidacion;
import modelo.LiquidacionLinea;


/**
 *
 * @author abel
 */
public class GestorLiquidacion {
    public void agregar(Liquidacion l){
    String sql = "insert into liquidacion (Mes,Anio,Fecha,Aporte,Descuento,Neto,Empleado_Id,Empleado_Id1)values (?,?,?,?,?,?,?,?)";
    //   Empleado_Id1 es el empleado que ahce la liquidacion eje: contador
    try {
            
            PreparedStatement p = proyectociber.ProyectoCiber.conexion.prepareStatement(sql);
            p.setString(1,l.getMes());
            p.setString(2,l.getAnio());
            p.setDate(3, new java.sql.Date(new java.util.Date().getTime()));
            p.setDouble(4, l.getAporte());
            p.setDouble(5, l.getDescuento());
            p.setDouble(6, l.getNeto());
            p.setInt(7, l.getEmpleado().getId());
            p.setInt(8, l.getUsuario().getId());
         
            p.execute();
           
            sql = "select max(Id)as ultimo from  liquidacion";
            ResultSet rs = proyectociber.ProyectoCiber.conexion.createStatement().executeQuery(sql);
            if(rs.next()){
            
            l.setId(rs.getInt("ultimo"));
            
           //----------------
            sql = " insert into liquidacionlinea (Cantidad,Valor,Suma,Resta,Concepto_Id,Liquidacion_Id)values(?,?,?,?,?,?) ";
            p = proyectociber.ProyectoCiber.conexion.prepareStatement(sql);
            
            for(LiquidacionLinea linea:l.getLineas())
            {
             p.setInt(1,linea.getCantidad());
             p.setDouble(2,linea.getValor());
             p.setDouble(3,linea.getSuma());
             p.setDouble(4,linea.getResta());
             p.setInt(5,linea.getConcepto().getId());
             p.setInt(6,l.getId());
             p.execute();
            
            }
            l.getLineas().clear();
            }
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
        
        }
    public void agregarLinea(Liquidacion l ,Concepto x, int cantidad,double resta,double suma,Empleado empleado){
    Concepto aux=new Concepto();
    aux.setCodigo(x.getCodigo());
    aux.setDescripcion(x.getDescripcion());
    aux.setFijo(x.getFijo());
    aux.setId(x.getId());
    aux.setSigno(x.getSigno());
    aux.setValor(x.getValor());
    
    LiquidacionLinea linea = new LiquidacionLinea();
    linea.setCantidad(cantidad);
    linea.setConcepto(aux);
    linea.setResta(resta);
    linea.setSuma(suma);
    linea.setValor(x.getValor());
    l.agregar(linea);
    switch(aux.getId()){
        case 3://sueldo basico
            linea.setValor(empleado.getCategoria().getBasico());
            linea.setSuma(empleado.getCategoria().getBasico());
            break;
        case 4: //obra social
            
        case 5: // jubilacion
            linea.setResta(empleado.getCategoria().getBasico()*x.getValor()/100);// porcentaje jubilacion  es igual que obra social
            break;
        case 6: // antiguedad
            linea.setCantidad(empleado.getAntiguedad());
            linea.setSuma(empleado.getAntiguedad()*aux.getValor());//cantidad de años por el valor
            
            break;
        default: if(aux.getSigno().equalsIgnoreCase("SI"))
        {
            if(aux.getFijo().equalsIgnoreCase("SI"))
            {
                linea.setCantidad(cantidad);
                linea.setSuma(linea.getCantidad()*aux.getValor());
            }
            else
            {
                linea.setCantidad(1);
                linea.setSuma(empleado.getCategoria().getBasico()*aux.getValor()/100);
            }
        }
        else 
        {
         if(aux.getFijo().equalsIgnoreCase("SI")) // resta y es fijo
         {
             linea.setCantidad(cantidad);
             linea.setResta(cantidad*aux.getValor());
         }
         else// resta y es porcentual
         {  linea.setCantidad(1);
             linea.setResta(empleado.getCategoria().getBasico()*aux.getValor()/100);
             
         
         }
        }
    }
   
    }

    public void cargarliquidacion(Liquidacion liquidacion, ArrayList<Concepto> listaconceptos,Empleado empleado) {
    
        for (Concepto c : listaconceptos) {
            if(c.getId()<7)
            agregarLinea(liquidacion, c, 1, 0, 0,empleado);
        }
        
        
    }

    public void borrarLinea(int fila ,Liquidacion l) {
       l.getLineas().remove(fila);
    }
    
    
    public ArrayList<Liquidacion> ObtenerLista(Date desde, Date hasta) {
       
    ArrayList <Liquidacion> lista = new ArrayList<>();
    String sql = "SELECT l.`Id`,l.`Fecha`,e.`Nombre`,c.`Categoria` \n" +
"FROM liquidacion l ,empleado e,categoria c\n" +
"WHERE l.`Empleado_Id`=e.`Id`\n" +
"AND l.Fecha>= ? and l.Fecha<=? "
            + "and e.categoria_Id=c.Id";
        try {
             PreparedStatement p = proyectociber.ProyectoCiber.conexion.prepareStatement(sql);
             p.setDate(1, new java.sql.Date(desde.getTime()));
             p.setDate(2, new java.sql.Date(hasta.getTime()));
             ResultSet rs = p.executeQuery();
            while(rs.next()){
                Liquidacion l = new Liquidacion();
                l.setId(rs.getInt("Id"));
                l.setFecha(rs.getDate("Fecha"));
                l.getEmpleado().setNombre(rs.getString("Nombre"));
                l.getEmpleado().getCategoria().setCategoria(rs.getString("Categoria"));
                
                
                lista.add(l);
                
            }
        } catch (SQLException ex) {
             JOptionPane.showMessageDialog(null, ex.getMessage());
        }
    
    return lista;
    }  
    
    
    
    
    
}
