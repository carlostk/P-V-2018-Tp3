/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Punto06.Dominio;



/**
 *
 * @author Carlos
 */
public final class Rectangulo {
    private int base;
    private int altura;
    private int superficie;
    private int perimetro;
    private Punto puntoUno;
    private Punto puntoDos;
    private Punto puntoTres;
    private Punto puntoCuatro;
    

    public Rectangulo() {
    }

    public Rectangulo(int base, int altura, Punto punto) {
        this.base = base;
        this.altura = altura;
        this.superficie = calcularSuperficie();
        this.perimetro = calcularPerimetro();
        this.puntoUno = punto;
        this.puntoDos = calcularSegundoPunto();
        this.puntoTres = calcularTercerPunto();
        this.puntoCuatro = calcularCuartoPunto();
    }
    
    public int calcularSuperficie(){
        return base*altura;
    }
    
    public int calcularPerimetro(){
        return (base*2)+(altura*2);
    }
    
    public Punto calcularSegundoPunto(){
        Punto segundoPunto = new Punto();
        segundoPunto.setPosicionX(base+puntoUno.getPosicionX());
        segundoPunto.setPosicionY(puntoUno.getPosicionY());
        return segundoPunto;
    }
    
    public Punto calcularTercerPunto(){
        Punto tercerPunto = new Punto();
        tercerPunto.setPosicionX(puntoUno.getPosicionX());
        tercerPunto.setPosicionY(altura+puntoUno.getPosicionY());
        return tercerPunto;
    }
    
    public Punto calcularCuartoPunto(){
        Punto cuartoPunto = new Punto();
        cuartoPunto.setPosicionX(base+puntoUno.getPosicionX());
        cuartoPunto.setPosicionY(altura+puntoUno.getPosicionY());
        return cuartoPunto;
    }

    public int getBase() {
        return base;
    }

    public void setBase(int base) {
        this.base = base;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    public Punto getPuntoUno() {
        return puntoUno;
    }

    public void setPuntoUno(Punto puntoUno) {
        this.puntoUno = puntoUno;
    }

    public int getSuperficie() {
        return superficie;
    }

    public void setSuperficie(int superficie) {
        this.superficie = superficie;
    }

    public int getPerimetro() {
        return perimetro;
    }

    public void setPerimetro(int perimetro) {
        this.perimetro = perimetro;
    }

    public Punto getPuntoDos() {
        return puntoDos;
    }

    public void setPuntoDos(Punto puntoDos) {
        this.puntoDos = puntoDos;
    }

    public Punto getPuntoTres() {
        return puntoTres;
    }

    public void setPuntoTres(Punto puntoTres) {
        this.puntoTres = puntoTres;
    }

    public Punto getPuntoCuatro() {
        return puntoCuatro;
    }

    public void setPuntoCuatro(Punto puntoCuatro) {
        this.puntoCuatro = puntoCuatro;
    }
    
    
    
    
}

