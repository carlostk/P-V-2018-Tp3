/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Punto12.dominio;

/**
 *
 * @author Pc-Yo
 */
public class Libro {
    private Autor autor;
    private String categoria;
    private String isbn;
    private String titulo;
    private int precio;

    public Libro() {
    }

    public Libro(Autor autor, String categoria, String isbn, String titulo, int precio) {
        this.autor = autor;
        this.categoria = categoria;
        this.isbn = isbn;
        this.titulo = titulo;
        this.precio = precio;
    }
    
    public void mostrarLibro(){
        System.out.println("EL Libro es:");
        System.out.println("Autor: "+ autor.getApellido()+", "+autor.getNombre());
        System.out.println("Categoria: " + categoria);
        System.out.println("ISBN " + isbn);
        System.out.println("Titulo: " + titulo);
        System.out.println("Precio: $ "+precio);
    }

    public Autor getAutor() {
        return autor;
    }

    public void setAutor(Autor autor) {
        this.autor = autor;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }
    
    
}
