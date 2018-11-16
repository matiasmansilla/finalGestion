/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.util.Date;

/**
 *
 * @author abel
 */
public class Cliente {
    
    private int Id;
    private  String Dni,Cuil,Nombre,Telefono,Mail,Clientecol;
    private Date Alta;
   private Domicilio domicilio = new Domicilio();

    public String getCuil() {
        return Cuil;
    }

    public void setCuil(String Cuil) {
        this.Cuil = Cuil;
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

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
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

    public String getClientecol() {
        return Clientecol;
    }

    public void setClientecol(String Clientecol) {
        this.Clientecol = Clientecol;
    }

    public Date getAlta() {
        return Alta;
    }

    public void setAlta(Date Alta) {
        this.Alta = Alta;
    }

    public Domicilio getDomicilio() {
        return domicilio;
    }

    public void setDomicilio(Domicilio domicilio) {
        this.domicilio = domicilio;
    }


}
