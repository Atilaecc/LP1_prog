/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Estructuras;

import java.util.Scanner;
public class Prog006 {
    public static void main ( String [] args  ){
     Scanner teclado = new Scanner (System.in);
     int S=0,N;
     System.out.print("N: ");
    N=Integer.valueOf(teclado.nextLine() );
    for (int a =1;a<=N ;a++){
        S=S+a;
        
       
    }
   System.out.print("S = " + S);
        teclado.close();
        System.out.println( "\n");
    }
}
