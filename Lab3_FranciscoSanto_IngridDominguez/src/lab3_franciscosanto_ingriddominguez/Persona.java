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
public class Persona {
    private String username;
    private String Contraseña;
    private String correo;
    private String nombre;
    private int id;
    private Date fecha;

    public Persona() {
    }

    public Persona(String username, String Contraseña, String correo, String nombre, int id, Date fecha) {
        this.username = username;
        this.Contraseña = Contraseña;
        this.correo = correo;
        this.nombre = nombre;
        this.id = id;
        this.fecha = fecha;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getContraseña() {
        return Contraseña;
    }

    public void setContraseña(String Contraseña) {
        this.Contraseña = Contraseña;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    @Override
    public String toString() {
        return "Persona{" + "nombre=" + nombre + '}';
    }
    
    
}
