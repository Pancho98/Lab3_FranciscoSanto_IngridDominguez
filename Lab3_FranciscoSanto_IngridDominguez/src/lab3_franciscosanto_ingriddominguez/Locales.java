
package lab3_franciscosanto_ingriddominguez;

import java.util.ArrayList;


public class Locales {
    private String nombre;
    private int n_Piso ;
    private ArrayList <Empleado> empleados =  new ArrayList();
    private ArrayList <Producto> productos = new ArrayList();

    public Locales() {
    }

    public Locales(String nombre, int n_Piso) {
        this.nombre = nombre;
        this.n_Piso = n_Piso;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getN_Piso() {
        return n_Piso;
    }

    public void setN_Piso(int n_Piso) {
        this.n_Piso = n_Piso;
    }

    public ArrayList<Empleado> getEmpleados() {
        return empleados;
    }

    public void setEmpleados(ArrayList<Empleado> empleados) {
        this.empleados = empleados;
    }

    public ArrayList<Producto> getProductos() {
        return productos;
    }

    public void setProductos(ArrayList<Producto> productos) {
        this.productos = productos;
    }

    @Override
    public String toString() {
        return "Locales{" + "nombre=" + nombre + ", n_Piso=" + n_Piso + ", empleados=" + empleados + ", productos=" + productos + '}';
    }

    
    
}
