/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab3_franciscosanto_ingriddominguez;

/**
 *
 * @author 1234
 */
public class Tiendas extends Locales {
    private int tamanio;
    private Producto producto;

    public Tiendas() {
    }

    public Tiendas(int tamanio, Producto producto, String nombre, int n_Piso) {
        super(nombre, n_Piso);
        setTamanio(tamanio);
        this.producto = producto;
    }

    public int getTamanio() {
        return tamanio;
    }

    public void setTamanio(int tamanio) {
        if(tamanio <= 18){
            this.tamanio = tamanio;
        }
    }

    public Producto getProducto() {
        return producto;
    }

    public void setProducto(Producto producto) {
        this.producto = producto;
    }
    
    
    
}
