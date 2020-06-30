
package Estructuras;

import java.util.Scanner;
public class Prog003 {
 public static void main ( String [] args  ){
     Scanner teclado = new Scanner (System.in) ;
     String cadena ;
     System.out.println("***manejo de cadenas***");
     System.out.print("leer cadena con next line");
     cadena =teclado.nextLine();
     System.out.println("valor inicial ingresado es :" + cadena);
     System.out.println("mayuscula con toUpperCase():" + cadena.toUpperCase());
      System.out.println("minuscula con  toLowerCase():" + cadena.toLowerCase());
      System.out.println("Eliminar los espacios con Trim :" + cadena.trim());
     System.out.println("Subcadena con Subbtring(int) :" + cadena.substring(5));
     System.out.println("Subcadena con Subbtring(int,int) :" + cadena.substring(5, 10));
     System.out.println("TAMAÑO DE UNA CADENA : :" + cadena.length());
     System.out.println("EXTRAER LETRA  :" + cadena.charAt(0));
     System.out.println("EXTRAER LETRA  :" + cadena.charAt(1));
     System.out.println("EXTRAER LETRA  :" + cadena.charAt(2));
}}

