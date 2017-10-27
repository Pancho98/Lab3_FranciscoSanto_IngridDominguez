/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab3_franciscosanto_ingriddominguez;

import java.util.Date;

/**
 *
 * @author Francisco Santos
 */
public class Empleado extends Persona{
    private int entrada;
    private int salida;
    private int vendidos;

    public Empleado() {
        super();
    }

    public Empleado(int entrada, int salida, int vendidos) {
        this.entrada = entrada;
        this.salida = salida;
        this.vendidos = vendidos;
    }

    public Empleado(int entrada, int salida, int vendidos, String username, String Contraseña, String correo, String nombre, int id, Date fecha) {
        super(username, Contraseña, correo, nombre, id, fecha);
        this.entrada = entrada;
        this.salida = salida;
        this.vendidos = vendidos;
    }

    public int getEntrada() {
        return entrada;
    }

    public void setEntrada(int entrada) {
        this.entrada = entrada;
    }

    public int getSalida() {
        return salida;
    }

    public void setSalida(int salida) {
        this.salida = salida;
    }

    public int getVendidos() {
        return vendidos;
    }

    public void setVendidos(int vendidos) {
        this.vendidos = vendidos;
    }

    @Override
    public String toString() {
        return "Empleado{" + "vendidos=" + vendidos + '}';
    }
    
    
}
