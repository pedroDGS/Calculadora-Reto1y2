/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.calculadora;

import javax.swing.JOptionPane;

/**
 *
 * @author Asus
 */
public class ClsOperadores {

    String Numero1 = """
                       Introduzca el operador 1
                       """;
    String Numero2 = """
                       Introduzca el operador 2
                       """;

    public ClsOperadores() {
    }

    public double Numero1() {
        String operador1 = JOptionPane.showInputDialog(null, Numero1);
        while (!isNumber(operador1)) {
            operador1 = JOptionPane.showInputDialog(null,
                    "El operador 1 solo puede ser un numero");
        }
        return Double.parseDouble(operador1);
    }

    public Double Numero2(String validacion) {
        String operador2 = JOptionPane.showInputDialog(null, Numero2);
        System.out.println(validacion);
        switch (validacion) {

            case "d":

                while (!isNumber(operador2) || Double.parseDouble(operador2) == 0) {
                    operador2 = JOptionPane.showInputDialog(null,
                            "El operador del dividendo de la division solo puede ser un numero diferente de 0");
               
                }
            case "":
                while (!isNumber(operador2)) {
                    operador2 = JOptionPane.showInputDialog(null,
                            "El operador 2 solo puede ser un numero");
              
                }

        }
        return Double.parseDouble(operador2);
    }

    private static boolean isNumber(String n) {
        try {
            Double.parseDouble(n);
            return true;
        } catch (NumberFormatException nfe) {
            return false;
        }

    }
}
