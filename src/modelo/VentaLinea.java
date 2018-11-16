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
public class VentaLinea {
    private int Id,Cantidad;
    private double Precio;
    private Articulo articulo = new Articulo();
   // private Venta venta = new Venta();  // en el modelo fisico esta Venta_ID ,se lo pondria aqui????????????????
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

    public double getPrecio() {
        return Precio;
    }

    public void setPrecio(double Precio) {
        this.Precio = Precio;
    }

    public Articulo getArticulo() {
        return articulo;
    }

    public void setArticulo(Articulo articulo) {
      
        this.articulo = articulo;
    }
    
    
    
}
