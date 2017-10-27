/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab3_franciscosanto_ingriddominguez;

import java.util.ArrayList;
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
    static ArrayList lista = new ArrayList();

    public static void main(String[] args) {

        String resp = "s";
        while (resp.equals("s") || resp.equals("S")) {
            String opc = JOptionPane.showInputDialog("a. Log in\n"
                    + "b. Registrarse\n");
            switch (opc) {
                case "a":
                    String Username = JOptionPane.showInputDialog("Ingrese Su username: ");
                    String Contraseña = JOptionPane.showInputDialog("Ingrese Su contraseña: ");
                    if (User_Socio.equals(Username) && User_contra.equals(Contraseña)) {
                        String ocpS = JOptionPane.showInputDialog("a. Crear Locales\n"
                                + "b. Asignar Empleados\n"
                                + "c. Asignar Productos\n"
                                + "d. crear Producto\n"
                                + "e. Ver Facturacion\n");

                        switch (ocpS) {
                            case "a":
                                CrearLocales();
                                break;
                            case "b":
                                break;
                            case "c":
                                break;
                        }
                    }
                    for (Empleado t : empleados) {
                        if (Username.equals(t.getUsername()) && Contraseña.equals(t.getContraseña())) {
                            int n_cliente = empleados.indexOf(t);
                            Cliente_Tiendas(n_cliente);
                        }
                    }
                    for (Clientes t : clientes) {
                        if (Username.equals(t.getUsername()) && Contraseña.equals(t.getContraseña())) {
                            String opcE = JOptionPane.showInputDialog("a. Log in\n"
                                    + "b. \n"
                                    + "c. \n"
                                    + "d. \n"
                                    + "e. \n"
                                    + "");
                        }
                    }
                    break;
                case "b":
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
                int tamaño = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero de piso"));
                locales.add(new Tiendas(tamaño, nombreT, n_piso));
                break;
            case "b":
                lista.add(new Quioscos(nombreT, nombreT, n_piso));
                break;
            case "c":
                int max = Integer.parseInt(JOptionPane.showInputDialog("Ingrese cuantos empleados hay"));
                lista.add(new Locales_Comida(max, null, nombreT, n_piso));
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
}
