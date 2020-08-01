/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modularidad;

/**
 *
 * @author pc
 */
public class actividad01 {
    
    public static int[] numeros =new int[1000];
    public static int cantidad;
    public static int a=0,b=1,c;
     public static void  fibonacci(){
        if(cantidad<=10){
            for(int i=0;i<cantidad;i++){
                System.out.println("fibonacci:["+i+"]"+a);
                c=a+b;
                a=b;
                b=c;
                
            }
        }
        
    }
    
    
    
    public static void main(String[] args) {
        fibonacci();
    }
}
