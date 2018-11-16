/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.util.Date;
import proyectociber.Fecha;

/**
 *
 * @author abel
 */
public class Empleado {
    private int Id;
     private String Dni,Nombre, Telefono ,Mail,Sexo,Estado;
      private Date Ingreso;
      private Categoria categoria = new Categoria();
      private Domicilio domicilio = new Domicilio();
      private int Antiguedad; // campo calculado no se guarda en el modelo de la base de dato

    public int getAntiguedad() {
        return Antiguedad;
    }

    public void setAntiguedad(int antiguedad) {
        this.Antiguedad = antiguedad;
    }
      
    public int getId() {
        return Id;
    }

    public void setId(int Id) {
        this.Id = Id;
    }

    public String getDni() {
        return Dni;
    }

    public void setDni(String Dni) {
        this.Dni = Dni;
    }

    public String getTelefono() {
        return Telefono;
    }

    public void setTelefono(String Telefono) {
        this.Telefono = Telefono;
    }

    public String getMail() {
        return Mail;
    }

    public void setMail(String Mail) {
        this.Mail = Mail;
    }

    public String getSexo() {
        return Sexo;
    }

    public void setSexo(String Sexo) {
        this.Sexo = Sexo;
    }

    public String getEstado() {
        return Estado;
    }

    public void setEstado(String Estado) {
        this.Estado = Estado;
    }

    public Date getIngreso() {
        return Ingreso;
    }

    public void setIngreso(Date Ingreso) {
        this.Ingreso = Ingreso;
        calcularAntiguedad();
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }

    public Domicilio getDomicilio() {
        return domicilio;
    }

    public void setDomicilio(Domicilio domicilio) {
        this.domicilio = domicilio;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

   

    private void calcularAntiguedad() {
        Antiguedad = Fecha.calcularAntiguedad(Ingreso, new java.util.Date());
       
    }

      
            
            
            
            
}
