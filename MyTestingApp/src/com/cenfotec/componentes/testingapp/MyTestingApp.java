package com.cenfotec.componentes.testingapp;

import com.cenfotec.componentes.control.Barras;
import javax.swing.JFrame;
import javax.swing.JPanel;

/*
 * Nombre del programa: MyTestingApp
 * Descripción: 
 * Fecha de creación: Sep 20, 2020
 * Autor: Kamil Sauma Zumbado 
 * Fecha de modificación: Sep 20, 2020
 * Modificado por: Kamil Sauma Zumbado.
 */


public class MyTestingApp {

    
    public static void main(String[] args) {
       MyForm myForm = new MyForm();
        myForm.setVisible(true);
        
        
        JFrame barras = new JFrame();
        barras.setSize(300, 230);
        barras.add(new Barras());
        barras.setVisible(true);
    }
    
}
