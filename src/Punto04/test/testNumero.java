/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Punto04.test;

import Punto04.util.ArregloDeNumero;

/**
 *
 * @author Pc-Yo
 */
public class testNumero {
    
    public static void main(String[] args) {
        int tamañoDeArreglo = 10;
        ArregloDeNumero arregloDeNumero = new ArregloDeNumero();
        
        arregloDeNumero.CrearArregloDeNumero(tamañoDeArreglo);
        arregloDeNumero.cargarArreglo();
        System.out.println("El Contenido del Arreglo es: ");
        arregloDeNumero.mostrarArregloDeNumero(); System.out.println("");
        System.out.println("El numero Mayor del Arreglo es: "+ arregloDeNumero.buscarMayor());
        System.out.println("El numero Menor del Arreglo es: "+ arregloDeNumero.buscarMenor());
        System.out.println("El Promedio del Arreglo es: "+ arregloDeNumero.buscarPromedio());        
    }   
}
