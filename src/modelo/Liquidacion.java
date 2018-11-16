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
public class Liquidacion {
    private int Id;
    private String Mes,Anio;
    private Date Fecha;
    private Double Aporte, Descuento , Neto;
    private Empleado empleado = new Empleado();// aquien estoy liquidando
    private Empleado usuario = new Empleado(); // El que realiza la liquidacion
    private ArrayList<LiquidacionLinea> lineas =  new ArrayList<>();

    public ArrayList<LiquidacionLinea> getLineas() {
        return lineas;
    }

    public void setLineas(ArrayList<LiquidacionLinea> lineas) {
        this.lineas = lineas;
    }
    

    public int getId() {
        return Id;
    }

    public void setId(int Id) {
        this.Id = Id;
    }

    public String getMes() {
        return Mes;
    }

    public void setMes(String Mes) {
        this.Mes = Mes;
    }

    public String getAnio() {
        return Anio;
    }

    public void setAnio(String Anio) {
        this.Anio = Anio;
    }

    public Date getFecha() {
        return Fecha;
    }

    public void setFecha(Date Fecha) {
        this.Fecha = Fecha;
    }

    public Double getAporte() {
        return Aporte;
    }

    public void setAporte(Double Aporte) {
        this.Aporte = Aporte;
    }

    public Double getDescuento() {
        return Descuento;
    }

    public void setDescuento(Double Descuento) {
        this.Descuento = Descuento;
    }

    public Double getNeto() {
        return Neto;
    }

    public void setNeto(Double Neto) {
        this.Neto = Neto;
    }

    public Empleado getEmpleado() {
        return empleado;
    }

    public void setEmpleado(Empleado empleado) {
        this.empleado = empleado;
    }

    public Empleado getUsuario() {
        return usuario;
    }

    public void setUsuario(Empleado usuario) {
        this.usuario = usuario;
    }
    
   public void calcular(){
   Aporte=0.0;
   Descuento=0.0;
       for (LiquidacionLinea linea : lineas) {
           Aporte = Aporte + linea.getSuma();
           Descuento=Descuento+linea.getResta();
       }
    Neto = Aporte-Descuento;
    
   
   } 

    public void agregar(LiquidacionLinea linea) {
       lineas.add(linea);
    }
}
