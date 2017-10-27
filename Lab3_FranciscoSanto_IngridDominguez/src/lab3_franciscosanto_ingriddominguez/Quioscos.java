/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab3_franciscosanto_ingriddominguez;

import java.util.ArrayList;

/**
 *
 * @author 1234
 */
public class Quioscos extends Locales {
    private String nombre;
    private ArrayList <Producto> productos = new ArrayList();

    public Quioscos() {
    }

    public Quioscos(String nombre, String nombre, int n_Piso) {
        super(nombre, n_Piso);
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Producto> getProductos() {
        return productos;
    }

    public void setProductos(ArrayList<Producto> productos) {
        this.productos = productos;
    }

    @Override
    public String toString() {
        return "Quioscos{" + "nombre=" + nombre + ", productos=" + productos + '}';
    }
    
    
}
