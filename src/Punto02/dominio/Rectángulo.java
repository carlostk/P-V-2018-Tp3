/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Punto02.dominio;
import java.util.Scanner;
/**
 *
 * @author Ale
 */
public class Rectángulo {
    Scanner scanner = new Scanner(System.in);
    
    private double altura;
    private double base;
    
        public Rectángulo(double altura, double base)
        {
            this.altura = altura;
            this.base = base;
        }
        
       public Rectángulo()
       {
       
       };
        
    public double getBase()
    {
    return base;
    }


       public void setBase (double base)
       {
       this.base = base;
       }

       public double getAltura()
       {
          return  altura; 
        
       }
       
       public void setAltura(double altura)
       {
           this.altura = altura;
       }
       public double calcularSuperficie()
       {    double superficie;
           return  superficie= base * altura;
       }
       
       public double calcularPerimetro()
       {    double perim;
         
           return perim = 2*base + 2* altura ;
       }
       
       public void mostrarResultado()
       {
           System.out.println("el perimetro del rectangulo es : "+ calcularPerimetro());
           System.out.println("la superficie del rectangulo es : "+ calcularSuperficie());
       }
       
       public void ingresarDatos ()
       {
       System.out.println("imgrese la altura  ");
        altura = scanner.nextDouble();
        System.out.println("imgrese la base  ");
        base = scanner.nextDouble();
       }
}
