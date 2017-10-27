/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab3_franciscosanto_ingriddominguez;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author Francisco Santos
 */
public class Clientes extends Persona{
    private ArrayList<Producto> comprados=new ArrayList();
    private int dinero;

    public Clientes() {
        super();
    }

    public Clientes(int dinero) {
        this.dinero = dinero;
    }

    public Clientes(int dinero, String username, String Contraseña, String correo, String nombre, int id, Date fecha) {
        super(username, Contraseña, correo, nombre, id, fecha);
        this.dinero = dinero;
    }

    public ArrayList<Producto> getComprados() {
        return comprados;
    }

    public void setComprados(ArrayList<Producto> comprados) {
        this.comprados = comprados;
    }

    public int getDinero() {
        return dinero;
    }

    public void setDinero(int dinero) {
        this.dinero = dinero;
    }

    @Override
    public String toString() {
        return "Clientes{" + "dinero=" + dinero + '}';
    }
    
    
}
