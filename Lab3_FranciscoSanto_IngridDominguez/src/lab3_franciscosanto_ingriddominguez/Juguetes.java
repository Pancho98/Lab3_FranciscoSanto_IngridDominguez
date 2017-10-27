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
public class Juguetes extends Producto {
    private String juguetes;

    public Juguetes() {
        super();
    }

    public Juguetes(String juguetes) {
        this.juguetes = juguetes;
    }

    public String getJuguetes() {
        return juguetes;
    }

    public void setJuguetes(String juguetes) {
        this.juguetes = juguetes;
    }

    @Override
    public String toString() {
        return "Juguetes{" + "juguetes=" + juguetes + '}';
    }
    
    
}
