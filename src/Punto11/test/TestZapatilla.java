/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Punto11.test;

import Punto11.util.ListaDeZapatilla;

/**
 *
 * @author Pc-Yo
 */
public class TestZapatilla {
    public static void main(String[] args) {
        ListaDeZapatilla listaDeZapatilla = new ListaDeZapatilla();
        listaDeZapatilla.cargarListaDeZapatilla();
        listaDeZapatilla.mostrarListaDeZapatilla();
    }
}
