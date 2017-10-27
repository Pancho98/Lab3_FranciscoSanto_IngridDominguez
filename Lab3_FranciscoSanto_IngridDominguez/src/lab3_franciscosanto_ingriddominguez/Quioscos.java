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
    private String nombreQ;
    private ArrayList <Producto> productos = new ArrayList();

    public Quioscos() {
    }

    public Quioscos(String nombreQ, String nombre, int n_Piso) {
        super(nombre, n_Piso);
        this.nombreQ = nombreQ;
    }

    public String getNombreQ() {
        return nombreQ;
    }

    public void setNombreQ(String nombreQ) {
        this.nombreQ = nombreQ;
    }

    

    public ArrayList<Producto> getProductos() {
        return productos;
    }

    public void setProductos(ArrayList<Producto> productos) {
        this.productos = productos;
    }

    @Override
    public String toString() {
        return "Quioscos{" + "nombre=" + nombreQ + ", productos=" + productos + '}';
    }
    
    
}
