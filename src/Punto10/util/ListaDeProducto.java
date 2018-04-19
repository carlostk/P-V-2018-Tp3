/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Punto10.util;

import Punto10.dominio.Producto;
import java.util.ArrayList;

/**
 *
 * @author Pc-Yo
 */
public class ListaDeProducto {
    ArrayList<Producto> listaDeProducto = new ArrayList<>();

    public ListaDeProducto() {
    }
    
    public void cargarListaDeProducto(Producto producto){
        listaDeProducto.add(producto);
    }
    
    public void mostrarListaDeProducto(){
        System.out.println("Codigo       Nombre     Precio");
        for (Producto producto : listaDeProducto) {
            System.out.println(producto.getCodigo()+"       "+ producto.getNombre()+"        "+producto.getPrecio());
        }        
    }
        
    public void setListaDeProducto(ArrayList<Producto> listaDeProducto) {
        this.listaDeProducto = listaDeProducto;
    }

    public ArrayList<Producto> getListaDeProducto() {
        return listaDeProducto;
    }
    
    
    
    
}
