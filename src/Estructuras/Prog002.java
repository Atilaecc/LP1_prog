
package Estructuras;

import java.util.Scanner ;
public class Prog002 {
    
     public static void main ( String [] args  ){
     Scanner teclado = new Scanner (System.in) ;
     double importe;
     System.out.print("importe:");
     importe =Double.valueOf(teclado.nextLine());
        System.out.print("categoria : ");
        if(importe>4000){
            System.out.println("D");
            
        }
        else if (importe>2000){
            System.out.println("c");
            
        }
        else if (importe>1000){
            System.out.println("b");
        }
          else if (importe>0){
            System.out.println("a");
        } 
        else if (importe<=0){
            System.out.println("fuera de rango");
        } 
        
    }
    
}
