
package vista;

import utils.Leer;
public class Actividad2 {
   
    
     public static int[] numeros = new int[100];
    public static int cantidad=0;
    
    public static void escribirarreglo(){
         do {            
            numeros[cantidad] = Leer.entero();
            cantidad++;
        } while (numeros[cantidad-1]!=0);
    }
    public static void imprimirarreglo(){
        for (int i = 0; i < cantidad; i++) {
            System.out.println("Numeros[ " + i + " ]= " + numeros[i]);
        }
    }
    public static void inicio(){
        escribirarreglo();
        imprimirarreglo();
    }
    public static void main(String[] args) {
        inicio();
    }
}
