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
public class ClsOperacion {

    final String PrimerMenu = """
                       Digite una opcion:
                       1. Suma
                       2. Resta
                       3. Multiplicacion
                       4. Division
                       5. Potencia
                       6. Raiz Cuadrada
                       7. Salir
                       """;
    String Menu;

    public ClsOperacion() {
    }

    public void Arrancar() {
        ClsOperadores operadores = new ClsOperadores();
        ClsOperacion NuevoInicio = new ClsOperacion();
        Menu = JOptionPane.showInputDialog(null, PrimerMenu);
        while (!"1".equals(Menu) && !"2".equals(Menu) && !"3".equals(Menu) && !"4".equals(Menu) && !"5".equals(Menu) && !"6".equals(Menu) && !"7".equals(Menu)) {
            Menu = JOptionPane.showInputDialog(null, "Solo puede digitar una de las siguientes opciones " + PrimerMenu);
        }
        switch (Menu) {
            case "1":
                double suma = Math.round((operadores.Numero1() + operadores.Numero2("")) * 100.0) / 100.0;
                JOptionPane.showMessageDialog(null, "el valor de la suma es " + suma);
                NuevoInicio.Arrancar();
                break;
            case "2":
                double resta = Math.round((operadores.Numero1() - operadores.Numero2("")) * 100.0) / 100.0;
                JOptionPane.showMessageDialog(null, "el valor de la resta es " + resta);
                NuevoInicio.Arrancar();
                break;
            case "3":
                double multiplicacion = Math.round((operadores.Numero1() * operadores.Numero2("")) * 100.0) / 100.0;
                JOptionPane.showMessageDialog(null, "el valor de la multiplicacion es " + multiplicacion);
                NuevoInicio.Arrancar();
                break;

            case "4":
                double division = Math.round((operadores.Numero1() / operadores.Numero2("d")) * 100.0) / 100.0;
                JOptionPane.showMessageDialog(null, "el valor de la division es " + division);
                NuevoInicio.Arrancar();
                break;
            case "5":
                double potencia = Math.round((Math.pow(operadores.Numero1(), operadores.Numero2(""))) * 100.0) / 100.0;
                JOptionPane.showMessageDialog(null, "el valor de la potencia es " + potencia);
                NuevoInicio.Arrancar();
                break;

            case "6":
                double raiz = Math.round((Math.sqrt(operadores.Numero1())) * 100.0) / 100.0;
                JOptionPane.showMessageDialog(null, "el valor de la raiz cuadrada es " + raiz);
                NuevoInicio.Arrancar();
                break;
            case "7":
                JOptionPane.showMessageDialog(null, "Gracias");
                break;

        }

    }

}
