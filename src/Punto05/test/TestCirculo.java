/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Punto05.test;

import Punto05.util.ArregloDeCirculo;

/**
 *
 * @author Pc-Yo
 */
public class TestCirculo {
    public static void main(String[] args) {
        int tamanioDeArregloDeCirculo = 10;
        ArregloDeCirculo arregloDeCirculo = new ArregloDeCirculo();
        
        arregloDeCirculo.CrearArregloDeCirculo(tamanioDeArregloDeCirculo);
        arregloDeCirculo.cargarArregloDeNumero();
        arregloDeCirculo.mostrarArregloDeCirculo();
    }
}
