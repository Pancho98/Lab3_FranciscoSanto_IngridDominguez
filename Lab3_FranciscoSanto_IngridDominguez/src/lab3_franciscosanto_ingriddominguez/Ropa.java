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
public class Ropa extends Producto{
    private String talla;
    private String genero;

    public Ropa() {
        super();
    }

    public Ropa(String talla, String genero) {
        this.talla = talla;
        this.genero = genero;
    }

    public Ropa(String talla, String genero, int precio, String descripcion, String marca, double descuento) {
        super(precio, descripcion, marca, descuento);
        this.talla = talla;
        this.genero = genero;
    }

    public String getTalla() {
        return talla;
    }

    public void setTalla(String talla) {
        this.talla = talla;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    @Override
    public String toString() {
        return "Ropa{" + "talla=" + talla + ", genero=" + genero + '}';
    }
    
}
