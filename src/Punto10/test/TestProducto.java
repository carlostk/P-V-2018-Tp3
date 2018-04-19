/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Punto10.test;

import Punto10.dominio.Producto;
import Punto10.util.ListaDeProducto;
import Punto10.util.ListaDeProductoEnCuota;

/**
 *
 * @author Pc-Yo
 */
public class TestProducto {
    public static void main(String[] args) {
        ListaDeProducto listaDeProducto = new ListaDeProducto();
        ListaDeProductoEnCuota listaDeProductoEnCuota = new ListaDeProductoEnCuota();
        Producto[] producto  = new Producto[6];
        
        producto[0] = new Producto(001, "TV Led", 10000.00);
        producto[1] = new Producto(002, "Monitor", 1700.00);
        producto[2] = new Producto(003, "Impresra", 800.00);
        producto[3] = new Producto(004, "Notebook", 12000.00);
        producto[4] = new Producto(005, "Silla", 750.00);
        producto[5] = new Producto(006, "Cama", 2500.00);
        
        for (int i = 0; i < producto.length; i++) {
            listaDeProducto.cargarListaDeProducto(producto[i]);
        }
        listaDeProducto.mostrarListaDeProducto();
        
        for (int i = 0; i < listaDeProducto.getListaDeProducto().size(); i++) {
            listaDeProductoEnCuota.cargarListaDeProductoEnCuota(listaDeProducto.getListaDeProducto().get(i), listaDeProductoEnCuota.pedirCuotaAPagar(listaDeProducto.getListaDeProducto().get(i)));
        }
        
        listaDeProductoEnCuota.mostrarListaDeProductoEnCuota();
        System.out.println("El total de la lista a Pagar es: "+listaDeProductoEnCuota.calcularTotalAPagar());
    }
}
