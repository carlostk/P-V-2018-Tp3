/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Punto01.domino;
import java.util.Scanner;

 
/**
 *
 * @author Ale
 */
public class Punto {
    Scanner scanner = new Scanner(System.in);
    
    private double puntox;
    private double puntox1;
    private double puntoy;
    private double puntoy1;
    
    
        public Punto()
        {   
            
        }
/*
    public Punto(double puntox, double puntox1, double puntoy, double puntoy1) {
        this.puntox = puntox;
        this.puntox1 = puntox1;
        this.puntoy = puntoy;
        this.puntoy1 = puntoy1;
    }*/
        
        
        public double getPuntox ()
        {
        return puntox;
        }
        
        public void setPuntox(double puntox)
        {
            this.puntox = puntox;
        }
        
        public double getPuntox1()
        {
        return puntox1;
        }
        
        public void setPuntox1(double puntox1)
        {
            this.puntox1 = puntox1;
        }
        
        public double getPuntoy()
        {
            return puntoy;
        }
        
        public void setPuntoy(double puntoy)
        {
            this.puntoy = puntoy;
        }
        
        public double getPuntoy1()
        {
            return puntoy1;
        }
        
        public void setPuntoy1(double puntoy1)
        {
            this.puntoy1 = puntoy1;
        }
        
        public double calcularDistanciaEntrePuntos()
        {   
                double d = 0;
            return  d = Math.sqrt(Math.pow((puntoy - puntox),2) + Math.pow((puntoy1 - puntox1),2));
         }
       
        public void ingresarPuntos()
        {
          System.out.println("Imgresa valor de x:");
                 puntox = scanner.nextDouble();
           System.out.println("Ingresa valor de x1:");
                puntox1 =scanner.nextDouble();
           System.out.println("Ingresa valor de y:");
                 puntoy = scanner.nextDouble();
           System.out.println("Ingresa valor de y1:");
                 puntoy1 = scanner.nextDouble();

        }
    
  
}
