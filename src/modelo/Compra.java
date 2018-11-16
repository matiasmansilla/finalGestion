/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author abel
 */
public class Compra {
    private int Id;
    private  Date Fecha;
    private double Total;
    private Empleado empleado = new Empleado();
    private Proveedor proveedor = new Proveedor();
    private ArrayList<CompraLinea>Lista=new ArrayList<>();

    public int getId() {
        return Id;
    }

    public void setId(int Id) {
        this.Id = Id;
    }

    public Date getFecha() {
        return Fecha;
    }

    public void setFecha(Date Fecha) {
        this.Fecha = Fecha;
    }

    public Empleado getEmpleado() {
        return empleado;
    }

    public void setEmpleado(Empleado empleado) {
        this.empleado = empleado;
    }

    public Proveedor getProveedor() {
        return proveedor;
    }

    public void setProveedor(Proveedor proveedor) {
        this.proveedor = proveedor;
    }

    public double getTotal() {
        return Total;
    }

    public void setTotal(double Total) {
        this.Total = Total;
    }
   
    //-------------------
    public void agregar(CompraLinea Linea){
    Lista.add(Linea);
    } 
    public void borrar(int posicion){
    
    Lista.remove(posicion);
    
    }
    public void calculartotal(){
    Total = 0;
        for (CompraLinea linea : Lista) {
            Total=Total+linea.getCantidad()*linea.getPrecio();// acumula los precios por cantidad de cada linea
            
        }
       // Iva = 0;
        //if(Tipo.equalsIgnoreCase("B")||Tipo.equalsIgnoreCase("A"))
          //  Iva = 0.21*Total;
            //GranTotal=Total+Iva;
            
    }

    public ArrayList<CompraLinea> getLista() {
        return Lista;
    }

    public void setLista(ArrayList<CompraLinea> Lista) {
        this.Lista = Lista;
    }
    
    
    
    
    
    
}
