/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Punto04.util;

import java.util.Scanner;

/**
 *
 * @author Pc-Yo
 */
public class ArregloDeNumero {
    int[] arregloDeNumero;

    public ArregloDeNumero() {
    }

    public ArregloDeNumero(int[] arregloDeNumero) {
        this.arregloDeNumero = arregloDeNumero;
    }
    
     public void CrearArregloDeNumero(int tamanioDeArreglo){
        arregloDeNumero = new int[tamanioDeArreglo];
    }
     
     public void mostrarArregloDeNumero(){
         for (int i : arregloDeNumero) {
             System.out.print(" ["+i+"] ");
         }
     }
     
     public void cargarArreglo(){
        Scanner scInt = new Scanner(System.in);
        for (int i = 0; i < arregloDeNumero.length; i++) {
            System.out.println("Ingrese el "+(i+1)+"° numero: ");
            arregloDeNumero[i] = scInt.nextInt();
        }
     }
     
     
     public int buscarMayor(){
         int num = arregloDeNumero[0];
         for (int i : arregloDeNumero) {
             if (i >= num) {
                 num=i;
             }
         }
        return num;
     }
     
     public int buscarMenor(){
         int num = arregloDeNumero[0];
         for (int i : arregloDeNumero) {
             if (num >= i) {
                 num=i;
             }
         }
        return num;
     }
    
     public int buscarPromedio(){
         int num = 0; 
         for (int i : arregloDeNumero) {
             num = num + i;
         }
        return num/arregloDeNumero.length;
     }

    public int[] getArregloDeNumero() {
        return arregloDeNumero;
    }

    public void setArregloDeNumero(int[] arregloDeNumero) {
        this.arregloDeNumero = arregloDeNumero;
    }
    
    
    
}
