/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author abel
 */
public class LiquidacionLinea {
    private  int Id,Cantidad;
    private double Valor,Suma,Resta;
    private  Concepto concepto = new Concepto();
    private Liquidacion liquidacion = new Liquidacion();

    public int getId() {
        return Id;
    }

    public void setId(int Id) {
        this.Id = Id;
    }

    public int getCantidad() {
        return Cantidad;
    }

    public void setCantidad(int Cantidad) {
        this.Cantidad = Cantidad;
    }

    public double getValor() {
        return Valor;
    }

    public void setValor(double Valor) {
        this.Valor = Valor;
    }

    public double getSuma() {
        return Suma;
    }

    public void setSuma(double Suma) {
        this.Suma = Suma;
    }

    public double getResta() {
        return Resta;
    }

    public void setResta(double Resta) {
        this.Resta = Resta;
    }

    public Concepto getConcepto() {
        return concepto;
    }

    public void setConcepto(Concepto concepto) {
        this.concepto = concepto;
    }

    public Liquidacion getLiquidacion() {
        return liquidacion;
    }

    public void setLiquidacion(Liquidacion liquidacion) {
        this.liquidacion = liquidacion;
    }
    
}
