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
public class Locales_Comida extends Locales {
    private int N_Empleados;
    private ArrayList <Producto> productos = new ArrayList();
    private Producto Producto_Dia;

    public Locales_Comida() {
        super();
    }

    public Locales_Comida(int N_Empleados, Producto Producto_Dia, String nombre, int n_Piso) {
        super(nombre, n_Piso);
        this.N_Empleados = N_Empleados;
        this.Producto_Dia = Producto_Dia;
    }

    public int getN_Empleados() {
        return N_Empleados;
    }

    public void setN_Empleados(int N_Empleados) {
        if(N_Empleados <= 4){
            this.N_Empleados = N_Empleados;
        }
    }

    public ArrayList<Producto> getProductos() {
        return productos;
    }

    public void setProductos(ArrayList<Producto> productos) {
        this.productos = productos;
    }

    public Producto getProducto_Dia() {
        return Producto_Dia;
    }

    public void setProducto_Dia(Producto Producto_Dia) {
        this.Producto_Dia = Producto_Dia;
    }

    @Override
    public String toString() {
        return "Locales_Comida{" + "N_Empleados=" + N_Empleados + ", productos=" + productos + ", Producto_Dia=" + Producto_Dia + '}';
    }
    
    
}
