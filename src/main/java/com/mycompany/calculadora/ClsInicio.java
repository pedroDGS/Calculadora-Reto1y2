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
public class ClsInicio {

    final String MenuInicio = """
                       Digite una opcion:
                       1. Realizar una operacion
                       2. Salir
                       """;
    String PrimerMenu;

    public ClsInicio() {
    }

    public void Arrancar() {
        PrimerMenu = JOptionPane.showInputDialog(null, MenuInicio);
        while(!"1".equals(PrimerMenu) && !"2".equals(PrimerMenu)){
            PrimerMenu= JOptionPane.showInputDialog(null, "Solo puede digitar 1 para hacer una operacion o 2 para salir");
        }
        switch (PrimerMenu) {
            case "1":
                ClsOperacion mensaje = new ClsOperacion();
                mensaje.Arrancar();
                break;
            case "2":
                JOptionPane.showMessageDialog(null, "Gracias");
                break;
                        } 
        }
    }

