/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Punto05.dominio;

/**
 *
 * @author Pc-Yo
 */
public class Circulo {
    private double radio;
    private double area;
    private double perimetro;

    public Circulo() {
    }

    public Circulo(double radio) {
        this.radio = radio;         
        this.area = Math.round((Math.PI * Math.pow(radio, 2)) * 100d) / 100d;
        this.perimetro = Math.round((2 * Math.PI * radio) * 100d) / 100d;
        
    }

    public Circulo(double radio, double area, double perimetro) {
        this.radio = radio;
        this.area = area;
        this.perimetro = perimetro;
    }    
    
    public double obtenerArea(){
        return  Math.round((Math.PI * Math.pow(radio, 2)) * 100d) / 100d;
    }
    
    public double obtenerPerimetro(){
        return Math.round((2 * Math.PI * radio) * 100d) / 100d;
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public double getPerimetro() {
        return perimetro;
    }

    public void setPerimetro(double perimetro) {
        this.perimetro = perimetro;
    }
}
