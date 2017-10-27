/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab3_franciscosanto_ingriddominguez;

import java.util.Date;

/**
 *
 * @author 1234
 */
public class Comida extends Producto{
    private Date fecha;

    public Comida() {
        super();
    }

    public Comida(Date fecha, int precio, String descripcion, String marca, double descuento) {
        super(precio, descripcion, marca, descuento);
        this.fecha = fecha;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    @Override
    public String toString() {
        return "Comida{" + "fecha=" + fecha + '}';
    }
    
    
}
