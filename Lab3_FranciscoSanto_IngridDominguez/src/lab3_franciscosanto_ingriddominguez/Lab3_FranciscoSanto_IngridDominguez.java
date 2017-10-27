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

    public static void main(String[] args) {
        ArrayList<Clientes> clientes = new ArrayList();
        ArrayList<Empleado> empleados = new ArrayList();
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
                            String opcC = JOptionPane.showInputDialog("a. Log in\n"
                                    + "b. \n"
                                    + "c. \n"
                                    + "d. \n"
                                    + "e. \n"
                                    + "");
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
}
