/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab3_franciscosanto_ingriddominguez;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.JOptionPane;

/**
 *
 * @author Francisco Santos
 */
public class Lab3_FranciscoSanto_IngridDominguez {

    static ArrayList<Clientes> clientes = new ArrayList();
    static ArrayList<Empleado> empleados = new ArrayList();
    static ArrayList<Tiendas> tiendas = new ArrayList();
    static ArrayList<Locales> locales = new ArrayList();
    static ArrayList<Producto> productos = new ArrayList();
    static ArrayList lista = new ArrayList();
    static int cont = 0;

    public static void main(String[] args) {

        String resp = "s";
        while (resp.equals("s") || resp.equals("S")) {
            String opc = JOptionPane.showInputDialog("a. Log in\n"
                    + "b. Registrarse\n");
            switch (opc) {
                case "a":
                    String Username = JOptionPane.showInputDialog("Ingrese Su nombre: ");
                    String Contraseña = JOptionPane.showInputDialog("Ingrese Su contraseña: ");
                    if (User_Socio.equals(Username) && User_contra.equals(Contraseña)) {
                        String ocpS = JOptionPane.showInputDialog("a. Crear Locales\n"
                                + "b. Asignar Empleados\n"
                                + "c. Crear Producto\n"
                                + "d. Asignar Productos\n"
                                + "e. Ver Facturacion\n"
                                + "f. Lista Empleados\n"
                                + "g. Modificar Empleados\n"
                                + "h. Eliminar Empleados");

                        switch (ocpS) {
                            case "a":
                                CrearLocales();
                                System.out.println(locales.get(locales.size() - 1));
                                break;
                            case "b":
                                AsignarEmpleado();
                                System.out.println(empleados.get(empleados.size() - 1));
                                break;
                            case "c":
                                CrearProducto();
                                System.out.println(productos.get(productos.size() - 1));
                                break;
                            case "d":
                                AsignarProducto();
                                break;
                            case "e":
                                String cadena = "";
                                for (int i = 0; i < lista.size(); i++) {
                                    cadena+= ""+lista.get(i)+"\n";
                                }
                                JOptionPane.showMessageDialog(null, "Facturas\n"+cadena);
                                break;
                            case "f":
                                String cadena1 = "";
                                for (int i = 0; i < empleados.size(); i++) {
                                    cadena1+= ""+empleados.get(i).getNombre()+"\n";
                                }
                                JOptionPane.showMessageDialog(null, "Facturas\n"+cadena1);
                                break;
                            case "g":
                                modificar();
                                break;
                            case "h":
                                eliminar_empleados();
                                break;
                        }
                    }
                    for (Empleado t : empleados) {
                        if (Username.equals(t.getUsername()) && Contraseña.equals(t.getContraseña())) {
                            
                        }
                    }
                    for (Clientes t : clientes) {
                        if (Username.equals(t.getNombre()) && Contraseña.equals(t.getContraseña())) {
                           int n_cliente = clientes.indexOf(t);
                            Cliente_Tiendas(n_cliente);
                        }
                    }
                    break;
                case "b":
                    Registro();
                    break;
            }
        }
    }
    static String User_Socio = "Socio";
    static String User_contra = "1234";

    public static void Cliente_Tiendas(int n_cliente) {
        String tienda = "";
        for (int i = 0; i < tiendas.size(); i++) {
            tienda += "" + (i + 1) + "- " + tiendas.get(i).getNombre() + "\n";
        }

        int dinero = clientes.get(n_cliente).getDinero();

        String resp = JOptionPane.showInputDialog("Ingresa tu opcion: \n" + tienda);
        int posicion = Integer.parseInt(resp);

        String producto = "";
        for (int i = 0; i < tiendas.get(posicion - 1).getProducto().size(); i++) {
            producto += "" + i + "- " + tiendas.get(posicion).getProducto().get(i) + "\n";
        }

        int total_pagar = 0;
        int cont_p = 0;
        while (total_pagar <= dinero || cont_p <= 5) {
            resp = JOptionPane.showInputDialog("Ingresa tu opcion del producto a comprar:\n" + producto);
            int numero = Integer.parseInt(resp);

            clientes.get(n_cliente).getComprados().add(tiendas.get(posicion).getProducto().get(numero));

            total_pagar += tiendas.get(posicion).getProducto().get(numero).getPrecio();
            cont_p++;

        }// fin de la compra
        JOptionPane.showMessageDialog(null, "Tu total a pagar es= "+total_pagar);

        String factura = "";
        for (int i = 0; i < clientes.get(n_cliente).getComprados().size(); i++) {
            factura += "" + clientes.get(n_cliente).getComprados().get(i) + "\n\n";

        }

        lista.add(factura);
    }

    public static void CrearLocales() {
        //
        String nombreT = JOptionPane.showInputDialog("Nombre de la tienda");
        int n_piso = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero de piso"));
        String opc1 = JOptionPane.showInputDialog("Crear local\n"
                + "a. Tiendas\n"
                + "b. Quioscos\n"
                + "c. Locales de comida").toLowerCase();
        switch (opc1) {
            case "a":
                int tamaño = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el tamaño"));
                locales.add(new Tiendas(tamaño, nombreT, n_piso));
                break;
            case "b":
                locales.add(new Quioscos(nombreT, nombreT, n_piso));
                break;
            case "c":
                int max = Integer.parseInt(JOptionPane.showInputDialog("Ingrese cuantos empleados hay"));
                locales.add(new Locales_Comida(max, null, nombreT, n_piso));
                break;
        }
    }

    public static void AsignarEmpleado() {
        String tiendas = "";
        for (int i = 0; i < locales.size(); i++) {
            tiendas += "" + (i + 1) + "- " + locales.get(i).getNombre() + "\n";
        }

        String resp = JOptionPane.showInputDialog("Ingresa a que tienda le desea agregar empleados: \n"
                + tiendas);

        int local = Integer.parseInt(resp) - 1;

        if (locales.get(local) instanceof Locales_Comida && locales.get(local).getEmpleados().size() == 4) {
            JOptionPane.showMessageDialog(null, "Locales de comida ya tiene su cantida maxima de empleados asignados");
        } else {
            String empleado = "";
            for (int i = 0; i < empleados.size(); i++) {
                empleado += "" + (i + 1) + "- " + empleados.get(i).getNombre() + "\n";
            }
            resp = JOptionPane.showInputDialog("Ingresa la posicion del empleado que deseas asignar \n"
                    + tiendas);

            int posicion = Integer.parseInt(resp);

            locales.get(local).getEmpleados().add(empleados.get(posicion));
        }

    }

    public static void CrearProducto() {
        int precio = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el precio del Producto"));
        String descripcion = JOptionPane.showInputDialog("Ingrese la descripcion o nombre del producto");
        String marca = JOptionPane.showInputDialog("Ingrese la marca del producto");

        String opc2 = JOptionPane.showInputDialog("Crear Productos\n"
                + "a. Ropa\n"
                + "b. Juguetes\n"
                + "c. Comida").toLowerCase();
        switch (opc2) {
            case "a":
                String talla = JOptionPane.showInputDialog("Ingrese el precio del Producto");
                String genero = JOptionPane.showInputDialog("Ingrese\n"
                        + " F=Femenino\n"
                        + " M=Masculino");
                productos.add(new Ropa(talla, genero, precio, descripcion, marca, 0));
                break;
            case "b":
                String juguete = JOptionPane.showInputDialog("Ingrese el nombre del juguete");
                productos.add(new Juguetes(juguete, precio, descripcion, marca, precio));
                break;
            case "c":
                productos.add(new Comida(new Date(), precio, descripcion, marca, precio));
                break;
        }
    }

    public static void Registro() {
        String resp = JOptionPane.showInputDialog("Ingresa tu opcion: \n"
                + "a.- Empleado\n"
                + "b.- Cliente");

        switch (resp) {
            case "a":
                String nombre = JOptionPane.showInputDialog("Ingrese tu nombre: ");
                String contraseña = "" + JOptionPane.showInputDialog("Ingrese tu contraseña: ");
                String correo = "" + JOptionPane.showInputDialog("Ingrese tu correo electronico: ");
                Date fecha = new Date();
                int id = cont;
                cont++;
                empleados.add(new Empleado(7, 5, 0, nombre + id, contraseña, correo, nombre, id, fecha));
                System.out.println(empleados.get(empleados.size() - 1));
                break;
            case "b":
                String nombre1 = JOptionPane.showInputDialog("Ingrese tu nombre: ");
                String contraseña1 = "" + JOptionPane.showInputDialog("Ingrese tu contraseña: ");
                String correo1 = "" + JOptionPane.showInputDialog("Ingrese tu correo electronico: ");
                int dinero = Integer.parseInt(JOptionPane.showInputDialog("Ingrese cantidad de dinero disponible "));
                Date fecha1 = new Date();
                int id1 = cont;
                cont++;
                clientes.add(new Clientes(dinero, nombre1 + id1, contraseña1, correo1, nombre1, id1, fecha1));
                System.out.println(clientes.get(clientes.size() - 1));
                break;
        }

    }

    public static void AsignarProducto() {
        String tiendas = "";
        for (int i = 0; i < locales.size(); i++) {
            tiendas += "" + (i + 1) + "- " + locales.get(i).getNombre() + "\n";
        }

        String resp = JOptionPane.showInputDialog("Ingresa a que tienda le desea asignar productos: \n"
                + tiendas);

        int local = Integer.parseInt(resp) - 1;

        String producto = "";
        if (locales.get(local) instanceof Tiendas) {

            for (int i = 0; i < productos.size(); i++) {
                if (productos.get(i) instanceof Comida) {

                } else {
                    producto += "" + (i + 1) + "- " + productos.get(i).getDescripcion() + "\n";
                }
            }
        } else if (locales.get(local) instanceof Quioscos) {
            for (int i = 0; i < productos.size(); i++) {

                producto += "" + (i + 1) + "- " + productos.get(i).getDescripcion() + "\n";

            }
        } else if (locales.get(local) instanceof Locales_Comida) {
            for (int i = 0; i < productos.size(); i++) {
                if (productos.get(i) instanceof Ropa || productos.get(i) instanceof Juguetes) {

                } else {
                    producto += "" + (i + 1) + "- " + productos.get(i).getDescripcion() + "\n";
                }
            }
        }

        resp = JOptionPane.showInputDialog("Ingresa la posicion del producto que deseas asignar: \n"
                + producto);

        int pos = Integer.parseInt(resp);

        locales.get(local).getProductos().add(productos.get(pos-1));
    }

    public static void eliminar_empleados() {
        String empleado = "";
        for (int i = 0; i < empleados.size(); i++) {
            empleado += "" + (i + 1) + ".- " + empleados.get(i).getNombre() + "\n";
        }

        int res = Integer.parseInt(JOptionPane.showInputDialog("Ingresa la posicion del empleado a eliminar: \n"
                + empleado));

        empleados.remove(res - 1);
        JOptionPane.showMessageDialog(null, "Empleado eliminado");

    }

    public static void modificar() {
        String empleado = "";
        for (int i = 0; i < empleados.size(); i++) {
            empleado += "" + (i + 1) + ".- " + empleados.get(i).getNombre() + "\n";
        }

        int res = Integer.parseInt(JOptionPane.showInputDialog("Ingresa la posicion del empleado a modificar: \n"
                + empleado));

        String nombre = JOptionPane.showInputDialog("Ingrese nuevo nombre: ");
        String contraseña = "" + JOptionPane.showInputDialog("Ingrese nueva contraseña: ");
        String correo = "" + JOptionPane.showInputDialog("Ingrese nuevo correo electronico: ");
        Date fecha = new Date();
        
        empleados.get(res).setContraseña(contraseña);
        empleados.get(res).setCorreo(correo);
        empleados.get(res).setNombre(nombre);
        JOptionPane.showMessageDialog(null, "Empleado Modificado");
    }
}
