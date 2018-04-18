/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Punto08y09.test;

import Punto08y09.dominio.Libro;
import Punto08y09.util.ListaDeLibro;
import java.util.Scanner;

/**
 *
 * @author Carlos
 */
public class TestLibro {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        ListaDeLibro unaListaDelibro = new ListaDeLibro();
        int opcion;
        String isbn,titulo,autor;
        float precio;
        String tituloParaBuscar;
        
        do
        {
            System.out.println("1-Registrar libro");
            System.out.println("2-Buscar libro por titulo");
            System.out.println("3-salir");
            opcion=entrada.nextInt();
            switch(opcion)
              {
                case 1:System.out.println("Ingrese isbn");
                       isbn=entrada.next();
                       System.out.println("Ingrese titulo");
                       titulo=entrada.next();
                       System.out.println("Ingrese autor");
                       autor=entrada.next();
                       System.out.println("Ingrese precio");
                       precio=entrada.nextInt();
                       Libro objlibro = new Libro(isbn,titulo,autor,precio);
                       unaListaDelibro.cargarListaDeLibro(objlibro);
                       break;
                case 2:System.out.println("ingrese titulo");
                       tituloParaBuscar=entrada.next();
                       unaListaDelibro.buscarLibroPorTitulo(tituloParaBuscar);
                       break;
                case 3:System.out.println("salir");
                       break;
                default:System.out.println("opcion incorrecta");
               }
        }while(opcion!=3);
                
        
    }
}
