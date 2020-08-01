import utils.Leer;
public class Actividad1 {
    public static int[] numeros =new int[1000];
    public static int cantidad;
    public static int a=0,b=1,c;
    
    
    
    public static void  cantidad(){
        
    }
    public static void  fibonacci(){
        System.out.print("limite: ");
        cantidad = Leer.entero();
        
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
