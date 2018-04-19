/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Punto12.util;

import Punto12.dominio.Autor;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Pc-Yo Mobile
 */
public class ListaDeAutor {
     ArrayList<Autor> listaDeAutor = new ArrayList<>();

    public ListaDeAutor() {
    }
    
    public void cargarListaDeAutorPredeterminada(){
        listaDeAutor.add(new Autor("Galeano", "Eduardo"));
        listaDeAutor.add(new Autor("Repetth", "Litz"));
        listaDeAutor.add(new Autor("Aguilar", "Luis"));
        listaDeAutor.add(new Autor("Molloja", "Milton"));
        listaDeAutor.add(new Autor("Carlos", "Franco"));
    }
    
    public Autor elegirAutor(){
        Scanner scInt = new Scanner(System.in);
        mostrarListaDeAutor();
        int opc;
        do {            
        System.out.println("Elija El Autor a Bucar:   )");
        opc = scInt.nextInt();
        } while (!(opc<= listaDeAutor.size() && opc>=1));
        return listaDeAutor.get((opc-1));
    }
    
    public void mostrarListaDeAutor(){
        System.out.println("Los Autores Registrados son: ");
        System.out.println("Apellido, Nombre...");
        for (int i = 0; i < listaDeAutor.size(); i++) {
            System.out.println((i+1)+" - "+listaDeAutor.get(i).getApellido()+", "+listaDeAutor.get(i).getNombre());
        }
    }

    
    

    public ListaDeAutor(ArrayList<Autor> listaDeAutor) {
        this.listaDeAutor = listaDeAutor;
    }

    public ArrayList<Autor> getListaDeAutor() {
        return listaDeAutor;
    }

    public void setListaDeAutor(ArrayList<Autor> listaDeAutor) {
        this.listaDeAutor = listaDeAutor;
    }
     
     
    
    
    
}
