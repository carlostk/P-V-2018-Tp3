/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Punto06.test;

import Punto06.ultil.listaDeRectangulo;

/**
 *
 * @author Carlos
 */
public class TestListaDeRetangulo {

    public static void main(String[] args) {
        int eliminar = 3;
        listaDeRectangulo unaListaDeRectangulo = new listaDeRectangulo();
        unaListaDeRectangulo.cargarListaDeRectanguloPredeterminada();
        unaListaDeRectangulo.mostrarListaDeRectangulo();
        unaListaDeRectangulo.eliminarRectanguloConUbicacion(eliminar);
        unaListaDeRectangulo.mostrarListaDeRectangulo();
        
    }
    
}
