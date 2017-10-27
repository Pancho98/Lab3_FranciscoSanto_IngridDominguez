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
public class Tiendas extends Locales {
    private int tamanio;
    private ArrayList <Producto> producto = new ArrayList();

    public Tiendas() {
        super();
    }

    public Tiendas(int tamanio, String nombre, int n_Piso) {
        super(nombre, n_Piso);
        this.tamanio = tamanio;
    }

    public int getTamanio() {
        return tamanio;
    }

    public void setTamanio(int tamanio) {
        this.tamanio = tamanio;
    }

    public ArrayList<Producto> getProducto() {
        return producto;
    }

    public void setProducto(ArrayList<Producto> producto) {
        this.producto = producto;
    }

    @Override
    public String toString() {
        return "Tiendas{" + "tamanio=" + tamanio + ", producto=" + producto + '}';
    }

    
    
    
}
