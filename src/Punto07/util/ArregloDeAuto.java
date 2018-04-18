/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Punto07.util;

import Punto07.dominio.Auto;
import java.util.Scanner;

/**
 *
 * @author Carlos
 */
public class ArregloDeAuto {
    Auto[] arregloDeAuto;

    public ArregloDeAuto() {
    }

    public ArregloDeAuto(Auto[] arregloDeAuto) {
        this.arregloDeAuto = arregloDeAuto;
    }
    
    public void crearArregloDeAuto(int tamanio){
        arregloDeAuto = new Auto[tamanio];
    }

    public void cargarArregloDeAutoPredeterminado(){
        arregloDeAuto[0] = new Auto("ASD 123", "Ford", "Negro", 1998, "Nafta");
        arregloDeAuto[1] = new Auto("QEE 456", "Fiad", "Blanco", 1998, "Diesel");
        arregloDeAuto[2] = new Auto("ÑLK 789", "Toyota", "Rojo", 1998, "GNC");
        arregloDeAuto[3] = new Auto("MNB 321", "Audi", "Azul", 1998, "Electrico");
        arregloDeAuto[4] = new Auto("YUI 654", "Peugeot", "Gris", 1998, "Nafta");
        arregloDeAuto[5] = new Auto("POI 987", "Nissan", "Verde", 1998, "Diesel");
    }
    
    public void mostarArregloDeAuto(){
        
        Auto auto;
        System.out.println("N°    Patente      Marca    Color   Modelo   Tipo de Conbustible");
        for (int i = 0; i < arregloDeAuto.length; i++) {
            if (arregloDeAuto[i] != null) {
                auto = arregloDeAuto[i];
            System.out.println(" "+(i+1)+"    "+auto.getPatente()+"     "+auto.getMarca()+"     "+auto.getColor()+"       "+auto.getModelo()+"      "+auto.getTipoDeConbustible());
            }else{break;}
        }
     }
    
    public void modificarOpciones()
    {
      Scanner scanner = new Scanner(System.in);
      System.out.println("Si desea Modiciar un Auto Ingrese su Numero ( 0=Ninguno )");
        int opc = scanner.nextInt();
        if (opc >= 1 && opc <= arregloDeAuto.length) {
            if (arregloDeAuto[opc-1]== null) {
                System.out.println("No exite Auto");
            }else{arregloDeAuto[opc-1].modificarAuto();}
        }else{System.out.println("No se Seleciono Ningun Auto");}
   }
    
    public Auto[] getArregloDeAuto() {
        return arregloDeAuto;
    }

    public void setArregloDeAuto(Auto[] arregloDeAuto) {
        this.arregloDeAuto = arregloDeAuto;
    }
    
    
}
