/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Punto11.dominio;

/**
 *
 * @author Pc-Yo
 */
public class Zapatilla {
    private String fMarca;
    private String Original;

    public Zapatilla() {
    }

    public Zapatilla(String fMarca, String Original) {
        this.fMarca = fMarca;
        this.Original = Original;
    }

    public String getfMarca() {
        return fMarca;
    }

    public void setfMarca(String fMarca) {
        this.fMarca = fMarca;
    }

    public String getOriginal() {
        return Original;
    }

    public void setOriginal(String Original) {
        this.Original = Original;
    }
    
    
    
}
