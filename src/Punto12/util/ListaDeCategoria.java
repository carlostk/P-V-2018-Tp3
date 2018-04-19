/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Punto12.util;

import java.util.ArrayList;

import java.util.Scanner;

/**
 *
 * @author Pc-Yo Mobile
 */
public class ListaDeCategoria {
    ArrayList<String> listaDeCategoria = new ArrayList<>();

    public ListaDeCategoria() {
    }

    public ListaDeCategoria(ArrayList<String> Categoria) {
        this.listaDeCategoria = Categoria;
    }
    
    public void cargarListaDeCategoriaPredeterminada(){
        listaDeCategoria.add("Historia");
        listaDeCategoria.add("Programacion");
        listaDeCategoria.add("Matematica");listaDeCategoria.add("Idiomas");
        listaDeCategoria.add("Politica");listaDeCategoria.add("Geografia");
    }
    
    public void mostrarListaDeCategoria(){
        System.out.println("Las Categorias Son: ");
        for (int i = 0; i < listaDeCategoria.size(); i++) {
            System.out.println((i+1)+" - "+listaDeCategoria.get(i));
        }
    }
    
    public String elegirCategoria(){
        Scanner scInt = new Scanner(System.in);
        mostrarListaDeCategoria();
        int opc;
        do {            
        System.out.println("Elija la Categoria a Bucar:   )");
        opc = scInt.nextInt();
        } while (!(opc<= listaDeCategoria.size() && opc>=1));
        return listaDeCategoria.get((opc-1));
    }
    
    public ArrayList<String> getCategoria() {
        return listaDeCategoria;
    }

    public void setCategoria(ArrayList<String> Categoria) {
        this.listaDeCategoria = Categoria;
    }
}
