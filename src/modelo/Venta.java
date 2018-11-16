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
public class Venta {
    private  int Id;
    private Date Fecha;
    private String Tipo="C";
    private double Total,Iva,GranTotal;
    private Cliente cliente = new Cliente();
    private Empleado empleado = new Empleado();
    private ArrayList<VentaLinea>Lista=new ArrayList<>();
 

    
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

    public String getTipo() {
        return Tipo;
    }

    public void setTipo(String Tipo) {
        this.Tipo = Tipo;
    }

    public double getTotal() {
        return Total;
    }

    public void setTotal(double Total) {
        this.Total = Total;
    }

    public double getIva() {
        return Iva;
    }

    public void setIva(double Iva) {
        this.Iva = Iva;
    }

    public double getGranTotal() {
        return GranTotal;
    }

    public void setGranTotal(double GranTotal) {
        this.GranTotal = GranTotal;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Empleado getEmpleado() {
        return empleado;
    }

    public void setEmpleado(Empleado empleado) {
        this.empleado = empleado;
    }
    
    public void agregar(VentaLinea Linea){
    Lista.add(Linea);
    } 
    public void borrar(int posicion){
    
    Lista.remove(posicion);
    
    }
    public void calculartotal(){
    Total = 0;
        for (VentaLinea linea : Lista) {
            Total=Total+linea.getCantidad()*linea.getPrecio();// acumula los precios por cantidad de cada linea
            
        }
        Iva = 0;
        if(Tipo.equalsIgnoreCase("B")||Tipo.equalsIgnoreCase("A"))
            Iva = 0.21*Total;
            GranTotal=Total+Iva;
            
    }

    public ArrayList<VentaLinea> getLista() {
        return Lista;
    }

    public void setLista(ArrayList<VentaLinea> Lista) {
        this.Lista = Lista;
    }


}



