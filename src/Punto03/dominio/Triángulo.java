/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Punto03.dominio;
import java.util.Scanner;
/**
 *
 * @author Ale
 */
public class Triángulo {
    Scanner scanner = new Scanner(System.in);
    private double lado1;
    private double lado2;
    private double lado3;
    public Triángulo()
    {
    
    }
     public double getLado1()
     {
         return lado1;
     }
      
     public void setlado1(double lado1)
     {
         this.lado1 = lado1;
     }
    
    public double getLado2()
    {
        return lado2;
    }    
    
    public void setLado2(double lado2)
    {
        this.lado2 = lado2;
    }
    public double getLado3()
    {
        return lado3;
    }
    public void setLado3(double lado3)
    {
        this.lado3 = lado3;
    }
    public void ingresarDatos()

    {
       System.out.println("Ingrese lado1 :");
       lado1 = scanner.nextDouble();   
       System.out.println("Ingrese lado2 :");
       lado2 = scanner.nextDouble();  
       System.out.println("Ingrese lado3 :");
       lado3 = scanner.nextDouble();  
                
    }
    
    public double verificarTriangulo()
    { double  perim = 0;
        double sum;
         double total;
         double res;
         
        
            sum = lado1 + lado2;
            total = lado1 + lado3;
            res = lado2 + lado3;
        
        if ( (sum > lado3) || (total > lado2) || (res > lado1))
        { 
            perim = lado2+ lado3+ lado1;
          return  perim;
        }
        else
        {
        return perim;
        }
    }
     public void mostrarResultado()
     {
         double resultado = verificarTriangulo();
         if(resultado==0)
         {
             System.out.println("no se ha formado la figura.");
             
         }
         else
         {
             System.out.println(" el perimetro es "+ verificarTriangulo());
         
         }
         
     }
    
    
     

}
