/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Punto07.dominio;

import java.util.Scanner;

/**
 *
 * @carlos
 */
public class Auto {

    private String patente;
    private String marca;
    private String color;
    private int modelo;
    private String tipoDeConbustible;

    public Auto() {
    }

    public Auto(String patente, String marca, String color, int modelo, String TipoDeConbustible) {
        this.patente = patente;
        this.marca = marca;
        this.color = color;
        this.modelo = modelo;
        this.tipoDeConbustible = TipoDeConbustible;
    }

    public void mostrarAuto() {
        System.out.println("La Patente es " + patente);
        System.out.println("La Marca es " + marca);
        System.out.println("El Color es " + color);
        System.out.println("El modelo es " + modelo);
        System.out.println("El Tipo de Conbustible es " + tipoDeConbustible);
    }

    public void modificarAuto() {
        Scanner scInt = new Scanner(System.in);
        Scanner scString = new Scanner(System.in);
        System.out.println("Que Valor Desea Modificar: ");
        System.out.println("0 - No modificar Ninguno");
        System.out.println("1 - La Patente es: " + patente);
        System.out.println("2 - La Marca es: " + marca);
        System.out.println("3 - El Color es: " + color);
        System.out.println("4 - El modelo es: " + modelo);
        System.out.println("5 - El Tipo de Conbustible es: " + tipoDeConbustible);
        System.out.println("Ingrese una Opc (0 al 5)");
        int opc = scInt.nextInt();
        switch (opc) {
            case 0: System.out.println("No se Modifico Ningun Dato.");
                break;
            case 1:
                System.out.println("La Patente es _" + patente + "_ Ingrese el Nuevo Valor");
                patente = scString.nextLine();
                break;
            case 2:
                System.out.println("La Marca es _" + marca + "_ Ingrese el Nuevo Valor");
                marca = scString.nextLine();
                break;
            case 3:
                System.out.println("El Color es _" + color + "_ Ingrese el Nuevo Valor");
                color = scString.nextLine();
                break;
            case 4:
                System.out.println("El Modelo es _" + modelo + "_ Ingrese el Nuevo Valor");
                modelo = scInt.nextInt();
                break;
            case 5:
                System.out.println("El Tipo de Conbustible es _" + tipoDeConbustible + "_ Ingrese el Nuevo Valor");
                tipoDeConbustible = scString.nextLine();
                break;
            default:
                System.out.println("Error No se Modifico Ningun Dato.");
        }
        System.out.println("Se Ha Modiciado");
        mostrarAuto();
    }

    public String getPatente() {
        return patente;
    }

    public void setPatente(String patente) {
        this.patente = patente;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getModelo() {
        return modelo;
    }

    public void setModelo(int modelo) {
        this.modelo = modelo;
    }

    public String getTipoDeConbustible() {
        return tipoDeConbustible;
    }

    public void setTipoDeConbustible(String tipoDeConbustible) {
        this.tipoDeConbustible = tipoDeConbustible;
    }

}
