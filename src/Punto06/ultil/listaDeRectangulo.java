/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Punto06.ultil;

import Punto06.Dominio.Punto;
import Punto06.Dominio.Rectangulo;
import java.util.ArrayList;

/**
 *
 * @author Carlos
 */
public class listaDeRectangulo {
    ArrayList<Rectangulo> ListaDeRectangulo = new ArrayList<>();
    
    
    public void cargarListaDeRectanguloPredeterminada(){
        Rectangulo rectanguloUno = new Rectangulo(2, 4, new Punto(2, 2));
        Rectangulo rectanguloDos = new Rectangulo(3, 6, new Punto(3, 3));
        Rectangulo rectanguloTres = new Rectangulo(4, 8, new Punto(4, 5));
        Rectangulo rectanguloCuatro = new Rectangulo(2, 3, new Punto(5, 4));
        Rectangulo rectanguloCinco = new Rectangulo(3, 5, new Punto(2, 6));
        Rectangulo rectanguloSeis = new Rectangulo(4, 7, new Punto(1, 2));
        
        ListaDeRectangulo.add(rectanguloUno);ListaDeRectangulo.add(rectanguloDos);
        ListaDeRectangulo.add(rectanguloTres);ListaDeRectangulo.add(rectanguloCuatro);
        ListaDeRectangulo.add(rectanguloCinco);ListaDeRectangulo.add(rectanguloSeis);
    }
    
    public void mostrarListaDeRectangulo(){
        System.out.println("LISTA DE RECTANGULO");
            System.out.println("N° de Rect.       Base       Altura      Superficie      Perimetro     Punto Uno(Y,X)");
        for (int i = 0; i < ListaDeRectangulo.size(); i++) {
            Rectangulo rectangulo = ListaDeRectangulo.get(i);
            System.out.println((i+1)+"                  "+rectangulo.getBase()+"            "+rectangulo.getAltura()+"             "+rectangulo.getSuperficie()
                    +"             "+ rectangulo.getPerimetro()+"         ("+rectangulo.getPuntoUno().getPosicionY()+","+rectangulo.getPuntoUno().getPosicionY()+")");
        }
    }
    
    public void eliminarRectanguloConUbicacion(int ubic){
        ListaDeRectangulo.remove(ubic);
    }
    
    public listaDeRectangulo() {
    }
    
    public listaDeRectangulo(ArrayList<Rectangulo> unaListaDeRectangulo) {
        this.ListaDeRectangulo = unaListaDeRectangulo;
    }
    
    public ArrayList<Rectangulo> getListaDeRectangulo() {
        return ListaDeRectangulo;
    }

    public void setListaDeRectangulo(ArrayList<Rectangulo> ListaDeRectangulo) {
        this.ListaDeRectangulo = ListaDeRectangulo;
    }
}
