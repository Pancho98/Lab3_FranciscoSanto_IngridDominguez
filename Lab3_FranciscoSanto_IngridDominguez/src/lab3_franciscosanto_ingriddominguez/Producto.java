/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab3_franciscosanto_ingriddominguez;

/**
 *
 * @author Francisco Santos
 */
public class Producto {
    private int precio;
    private String descripcion;
    private String marca;
    private double descuento;

    public Producto() {
    }

    public Producto(int precio, String descripcion, String marca, double descuento) {
        this.precio = precio;
        this.descripcion = descripcion;
        this.marca = marca;
        this.descuento = descuento;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public double getDescuento() {
        return descuento;
    }

    public void setDescuento(double descuento) {
        this.descuento = descuento;
    }

    @Override
    public String toString() {
        return "Producto: " + " marca=" + marca + "\nPrecio +"+precio;
    }
    
    
}
