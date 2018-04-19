/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Punto10.util;

import Punto10.dominio.Producto;
import Punto10.dominio.ProductoEnCuota;
import Punto10.util.ListaDeProducto;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Pc-Yo
 */
public class ListaDeProductoEnCuota {
    ArrayList<ProductoEnCuota> listaDeProductoEnCuota = new ArrayList<>();
    

      public void mostrarListaDeProductoEnCuota(){
        System.out.println("Codigo    Nombre        Precio      Cant. De Cuota      Precio En Cuota");
          for (ProductoEnCuota pEnCuota : listaDeProductoEnCuota) {
              System.out.println(pEnCuota.getProducto().getCodigo()+"         "+pEnCuota.getProducto().getNombre()
                      +"        "+pEnCuota.getProducto().getPrecio()+"             "+pEnCuota.getCantDeCuotas()+"             "+Math.round(pEnCuota.getPrecioEmCuota() * 100d) / 100d);
          }
    }
      
       public void cargarListaDeProductoEnCuota(Producto producto, int cuota){
        ProductoEnCuota productoEnCuota = new ProductoEnCuota(producto, cuota);
        listaDeProductoEnCuota.add(productoEnCuota);
    }
              
    public int pedirCuotaAPagar(Producto producto){
        Scanner scDouble = new Scanner(System.in);
        System.out.println("El Producto es: ");
        System.out.println("Codigo: "+producto.getCodigo()+" Nombre: "+producto.getNombre()+" Precio: "+producto.getPrecio());
        System.out.println("En Cuantas Cuotas Desea Pagar: ");
        return scDouble.nextInt();
    }      
    
    public double calcularTotalAPagar(){
        double acum = 0;
        for (ProductoEnCuota pEnCuota : listaDeProductoEnCuota) {
            acum = acum + pEnCuota.getPrecioEmCuota();
        }
        return Math.round(acum * 100d) / 100d;
    }
    
    public ListaDeProductoEnCuota() {
    }

    public ArrayList getListaDeProductoEnCuota() {
        return listaDeProductoEnCuota;
    }

    public void setListaDeProductoEnCuota(ArrayList listaDeProductoEnCuota) {
        this.listaDeProductoEnCuota = listaDeProductoEnCuota;
    }
    
    
    
}
