/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Punto12.test;

import Punto12.util.ListaDeAutor;
import Punto12.util.ListaDeCategoria;
import Punto12.util.ListaDeLibro;

/**
 *
 * @author Pc-Yo Mobile
 */
public class TestLibro {
        
    public static void main(String[] args) {
        ListaDeLibro listaDeLibro = new ListaDeLibro();
        ListaDeCategoria listaDeCategoria = new ListaDeCategoria();
        ListaDeAutor listaDeAutor = new ListaDeAutor();
        
        listaDeLibro.cargarListaDeLibroPredeterminado();
        listaDeAutor.cargarListaDeAutorPredeterminada();
        listaDeCategoria.cargarListaDeCategoriaPredeterminada();
        if (listaDeLibro.elegirMetodoDeBusqueda() == 1) {
            listaDeAutor.mostrarListaDeAutor();
            listaDeLibro.buscarLibroPorAutor(listaDeAutor.elegirAutor());
        } else {
            listaDeCategoria.mostrarListaDeCategoria();
            listaDeAutor.mostrarListaDeAutor();
            listaDeLibro.buscarLibroPorAutorYCategoria(listaDeAutor.elegirAutor(), listaDeCategoria.elegirCategoria());
        }
    }
}
