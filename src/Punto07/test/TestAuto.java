/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Punto07.test;

import Punto07.util.ArregloDeAuto;
import java.util.Scanner;

/**
 *
 * @author Carlos
 */
public class TestAuto {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int tamanioDelArregloDeAuto = 10;
        int opcion;
        ArregloDeAuto unArregloDeAuto = new ArregloDeAuto();
        unArregloDeAuto.crearArregloDeAuto(tamanioDelArregloDeAuto);
        unArregloDeAuto.cargarArregloDeAutoPredeterminado();
        unArregloDeAuto.mostarArregloDeAuto();
        do
        {
         unArregloDeAuto.modificarOpciones();
         System.out.println("1 para seguir modificando o 0 para salir");
         opcion=entrada.nextInt();
        }while(opcion!=0);

    }
    
}
