/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Punto11.util;

import Punto11.dominio.Zapatilla;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Pc-Yo
 */
public class ListaDeZapatilla {
    ArrayList<Zapatilla> listaDeZapatilla = new ArrayList<>();
    
    public ListaDeZapatilla() {
    }
    
    public void mostrarListaDeZapatilla(){
        System.out.println("Marca       Original");
        for (Zapatilla zapatilla : listaDeZapatilla) {
            System.out.println( zapatilla.getfMarca()+"      "+ zapatilla.getOriginal());
        }
    }
    
    public void cargarListaDeZapatilla(){
        Scanner scString = new Scanner(System.in);       
        System.out.println("Ingrese los Datos de la Zapatilla");
        String marca,origianl; char salir;
        do {           
            System.out.println("Marca:    (Deje em Blanco Para Salir)"); marca = scString.nextLine();
            if (!marca.isEmpty()) {
                System.out.println("Original: (Si/No)"); origianl = scString.nextLine();
                listaDeZapatilla.add(new Zapatilla(marca, origianl));
            }
        } while (!marca.isEmpty());
    }
    
    public ArrayList<Zapatilla> getListaDeZapatilla() {
        return listaDeZapatilla;
    }

    public void setListaDeZapatilla(ArrayList<Zapatilla> listaDeZapatilla) {
        this.listaDeZapatilla = listaDeZapatilla;
    }

        
    
}
