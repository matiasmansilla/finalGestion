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
public class Concepto {
    private  int Id;
    private String Codigo,Descripcion,Signo,Fijo,Estado;
    private Double Valor;

    public int getId() {
        return Id;
    }

    public void setId(int Id) {
        this.Id = Id;
    }

    public String getCodigo() {
        return Codigo;
    }

    public void setCodigo(String Codigo) {
        this.Codigo = Codigo;
    }

    public String getDescripcion() {
        return Descripcion;
    }

    public void setDescripcion(String Descripcion) {
        this.Descripcion = Descripcion;
    }

    public String getSigno() {
        return Signo;
    }

    public void setSigno(String Signo) {
        this.Signo = Signo;
    }

    public String getFijo() {
        return Fijo;
    }

    public void setFijo(String Fijo) {
        this.Fijo = Fijo;
    }

    public String getEstado() {
        return Estado;
    }

    public void setEstado(String Estado) {
        this.Estado = Estado;
    }

    public Double getValor() {
        return Valor;
    }

    public void setValor(Double Valor) {
        this.Valor = Valor;
    }
    
    
}
