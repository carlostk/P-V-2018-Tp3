/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Punto10.dominio;

/**
 *
 * @author Pc-Yo
 */
public class ProductoEnCuota {

    private Producto producto;
    private int cantDeCuotas;
    private double precioEmCuota;

    public ProductoEnCuota() {
    }

    public ProductoEnCuota(Producto producto, int cantDeCuotas) {
        this.producto = producto;
        this.cantDeCuotas = cantDeCuotas;
        this.precioEmCuota = calcularPrecioEnCuotas(producto.getPrecio(), cantDeCuotas);
    }

    public double calcularPrecioEnCuotas(double precio, int cantDeCuotas) {
        if (cantDeCuotas != 0) {
            precio = precio * 1.15;
            cantDeCuotas--;
            precio = calcularPrecioEnCuotas(precio, cantDeCuotas);
        }
        return precio;
    }

    public Producto getProducto() {
        return producto;
    }

    public void setProducto(Producto producto) {
        this.producto = producto;
    }

    public int getCantDeCuotas() {
        return cantDeCuotas;
    }

    public void setCantDeCuotas(int cantDeCuotas) {
        this.cantDeCuotas = cantDeCuotas;
    }

    public double getPrecioEmCuota() {
        return precioEmCuota;
    }

    public void setPrecioEmCuota(double precioEmCuota) {
        this.precioEmCuota = precioEmCuota;
    }

}
