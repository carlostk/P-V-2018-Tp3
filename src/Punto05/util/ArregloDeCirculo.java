/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Punto05.util;

import Punto05.dominio.Circulo;
import java.util.Scanner;

/**
 *
 * @author Pc-Yo
 */
public class ArregloDeCirculo {
    Circulo[] arregloDeCirculo;
    

    public ArregloDeCirculo() {
    }

    public ArregloDeCirculo(Circulo[] arregloDeCirculo) {
        this.arregloDeCirculo = arregloDeCirculo;
    }

    
    public void CrearArregloDeCirculo(int tamanioDeArreglo){
        arregloDeCirculo = new Circulo[tamanioDeArreglo];
    }
    
    public void mostrarArregloDeCirculo(){
        for (int i = 0; i < arregloDeCirculo.length; i++) {
            if (arregloDeCirculo[i] != null) {
                System.out.println("El Valor del "+(i+1)+"° Circulo son:  Radio: "+arregloDeCirculo[i].getRadio()+"   Area: "+arregloDeCirculo[i].getArea()+"   Perimetro: "+ arregloDeCirculo[i].getPerimetro());
            }else{System.out.println("No se ha enctrado el Circulo");}
        }
    }
    
    public void cargarArregloDeNumero(){
        Scanner scDouble = new Scanner(System.in);
        double radio;
        System.out.println("Cantidad Maxima de Circulos a Cargar: "+ arregloDeCirculo.length);
        for (int i = 0; i < arregloDeCirculo.length; i++) {
            System.out.println("Ingrese el Valor del Radio del "+(i+1)+"° Circulo:       (Ingrese 0 para SALIR)");
            radio = scDouble.nextDouble();
            if (radio != 0) {
                arregloDeCirculo[i] = new Circulo(radio);
            }else{break;}
        }
    }
    
    public Circulo[] getArregloDeCirculo() {
        return arregloDeCirculo;
    }

    public void setArregloDeCirculo(Circulo[] arregloDeCirculo) {
        this.arregloDeCirculo = arregloDeCirculo;
    }
    
    
            
            
    
}
