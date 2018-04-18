/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Punto01.test;
import java.util.Scanner;
import Punto01.domino.Punto;
/**
 *
 * @author Ale
 */
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
            Scanner scanner = new Scanner(System.in);
            Punto punto = new Punto();
            
            punto.ingresarPuntos();
            double resultado = punto.calcularDistanciaEntrePuntos();
            System.out.println("el resultado es "+resultado);
            
    }
    
}
