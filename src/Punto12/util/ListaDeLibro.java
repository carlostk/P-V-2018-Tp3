/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Punto12.util;

import Punto12.dominio.Autor;
import Punto12.dominio.Libro;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Pc-Yo Mobile
 */
public class ListaDeLibro {

    ArrayList<Libro> listaDeLibro = new ArrayList<>();

    public ListaDeLibro() {
    }

    public ListaDeLibro(ArrayList<Libro> listaDeLibro) {
        this.listaDeLibro = listaDeLibro;
    }

    public void cargarListaDeLibroPredeterminado() {
        listaDeLibro.add(new Libro(new Autor("Galeano", "Eduardo"), "Matematica", "951159", "Donde Esta el 0", 45));
        listaDeLibro.add(new Libro(new Autor("Molloja", "Milton"), "Geografia", "987789", "Como Usa Garmin", 52));
        listaDeLibro.add(new Libro(new Autor("Repetth", "Litz"), "Idiomas", "357537", "What is your Name", 92));
        listaDeLibro.add(new Libro(new Autor("Molloja", "Milton"), "Programacion", "456654", "Un Tp en 5Min", 60));
        listaDeLibro.add(new Libro(new Autor("Carlos", "Franco"), "Politica", "123456", "Como Ganar Un Voto", 70));
        listaDeLibro.add(new Libro(new Autor("Aguilar", "Luis"), "Historia", "359157", "Antes del Año 0", 80));
    }

    public int elegirMetodoDeBusqueda() {
        int opc;
        do {
            Scanner scInt = new Scanner(System.in);
            System.out.println("Los Metodos de Busqueda son.");
            System.out.println("1 - Solo Autor.");
            System.out.println("2 - Por Autor y Categoria.");
            System.out.println("Elija el Metodo que desea usar: ");
            opc = scInt.nextInt();
        } while (!(opc == 1 || opc == 2));
        return opc;
    }

    public void buscarLibroPorAutor(Autor autor) {
        for (Libro libro : listaDeLibro) {
            if ((libro.getAutor().getApellido().equals(autor.getApellido()))
                     &&((libro.getAutor().getNombre().equals(autor.getNombre())))) {
                System.out.println("______________________________________________");
                System.out.println("EL Libro es:");
                System.out.println("Autor: " + libro.getAutor().getApellido() + ", " + libro.getAutor().getNombre());
                System.out.println("Categoria: " + libro.getCategoria());
                System.out.println("ISBN " + libro.getIsbn());
                System.out.println("Titulo: " + libro.getTitulo());
                System.out.println("Precio: $ " + libro.getPrecio());
            }
        }
    }

    public Libro buscarLibroPorAutorYCategoria(Autor autor, String Categoria) {
        for (Libro libro : listaDeLibro) {
            if ((libro.getAutor().getApellido().equals(autor.getApellido()))
                     &&((libro.getAutor().getNombre().equals(autor.getNombre())))) {
                if (libro.getCategoria().equals(Categoria)) {
                    System.out.println("_______________________________________");
                     System.out.println("EL Libro es:");
                    System.out.println("Autor: " + libro.getAutor().getApellido() + ", " + libro.getAutor().getNombre());
                    System.out.println("Categoria: " + libro.getCategoria());
                    System.out.println("ISBN " + libro.getIsbn());
                    System.out.println("Titulo: " + libro.getTitulo());
                    System.out.println("Precio: $ " + libro.getPrecio());
                }
            }
        }
        return null;
    }

    public ArrayList<Libro> getListaDeLibro() {
        return listaDeLibro;
    }

    public void setListaDeLibro(ArrayList<Libro> listaDeLibro) {
        this.listaDeLibro = listaDeLibro;
    }

}
