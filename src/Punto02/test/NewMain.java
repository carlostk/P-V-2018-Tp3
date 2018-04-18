/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Punto02.test;

import Punto02.dominio.Rectángulo;

/**
 *              
 * @author Ale
 */
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Rectángulo rectángulo = new Rectángulo();
        double resultadoSup = 0;
        double resultadoPer = 0;
                resultadoSup = rectángulo.calcularSuperficie();
                resultadoSup = rectángulo.calcularPerimetro();
               rectángulo.ingresarDatos();
               rectángulo.mostrarResultado();
    }
    
}
