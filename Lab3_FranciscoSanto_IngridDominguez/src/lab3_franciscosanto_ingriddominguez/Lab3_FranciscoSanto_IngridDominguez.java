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
    static    ArrayList<Clientes> clientes = new ArrayList();
     static   ArrayList<Empleado> empleados = new ArrayList();
     static   ArrayList<Tiendas> tiendas = new ArrayList();
     static ArrayList lista = new ArrayList();

    public static void main(String[] args) {
        
        
        String resp = "s";
        while (resp.equals("s") || resp.equals("S")) {
            String opc = JOptionPane.showInputDialog("a. Log in\n"
                    + "b. \n"
                    + "c. \n"
                    + "d. \n"
                    + "e. \n"
                    + "");
            switch (opc) {
                case "a":
                    String Username = JOptionPane.showInputDialog("Ingrese Su username: ");
                    String Contraseña = JOptionPane.showInputDialog("Ingrese Su contraseña: ");
                    if (User_Socio.equals(Username) && User_contra.equals(Contraseña)) {
                        String opcS = JOptionPane.showInputDialog("a. Crear Local\n"
                                + "b. \n"
                                + "c. \n"
                                + "d. \n"
                                + "e. \n"
                                + "");
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
    
    public static void Cliente_Tiendas(int n_cliente){
       String tienda = "";
        for (int i = 0; i < tiendas.size() ; i++) {
            tienda += ""+(i+1)+"- "+tiendas.get(i).getNombre()+"\n";
        }
        
        int dinero = clientes.get(n_cliente).getDinero();
        
        String resp = JOptionPane.showInputDialog("Ingresa tu opcion: \n"+ tienda);
        int posicion = Integer.parseInt(resp);
        
        
        
        String producto = "";
        for (int i = 0; i < tiendas.get(posicion -1).getProducto().size() ; i++) {
            producto += ""+i+"- "+tiendas.get(posicion).getProducto().get(i)+"\n";
        }
        
        int total_pagar = 0;
        int cont_p = 0;
        while(total_pagar <= dinero || cont_p <=5){
            resp = JOptionPane.showInputDialog("Ingresa tu opcion del producto a comprar:\n"+ producto);
            int numero = Integer.parseInt(resp);
            
            clientes.get(n_cliente).getComprados().add(tiendas.get(posicion).getProducto().get(numero));
            
            total_pagar += tiendas.get(posicion).getProducto().get(numero).getPrecio();
            cont_p++;
            
        }// fin de la compra
        
        String factura = "";
        for (int i = 0; i < clientes.get(n_cliente).getComprados().size(); i++) {
          factura += ""  +clientes.get(n_cliente).getComprados().get(i)+ "\n\n" ;
            
        }
        
        lista.add(factura);
    }
}
