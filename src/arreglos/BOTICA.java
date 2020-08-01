
package arreglos;
import utils.Leer;

public class BOTICA {
      public static String[] nombre=new String[1000];
       public static String[] cliente=new String[1000];
    public static String[] codigo=new String[1000];
    public static String[] fentrega=new String[1000];
    public static int posicion = -1;
    
    public static void AgregarMed(){
        String continuar;
        do{
        posicion++;
        System.out.println("Agregar medicamento");
        System.out.println("Nombre del medicamento:");
        nombre[posicion]=Leer.cadena();
        System.out.println("Codigo :");
        codigo[posicion]=Leer.cadena();
        System.out.println("Fecha de entrega:");
        fentrega[posicion]=Leer.cadena();
            System.out.println("Desea Agregar otro?[S/N]");
            continuar=Leer.cadena();
        } while(continuar.equalsIgnoreCase("S"));
        
    }
    public static void EliminarMed(){
        Boleta();
        System.out.print("Ingrese el número del Medicamento a elimnar: ");
        int numero = Leer.entero();
        numero--;
        for (int i = numero; i < posicion; i++) {
            nombre[i]=nombre[i+1];
            codigo[i]=codigo[i+1];
            fentrega[i]=fentrega[i+1];
                  
        }
        nombre[posicion]="  ";
        codigo[posicion]="  ";
        fentrega[posicion]="  ";
        posicion--;
    }
    
    public static void EditarMed(){
        Boleta();
        String continuar;
        do{
        System.out.print("Ingrese el numero del Medicamento a editar:");
        int numero = Leer.entero();
        numero--;
        System.out.println("Resultado: "+nombre[numero]+ " ( "+codigo[numero]+ ") - "+fentrega[numero]);
        System.out.print("Nuevo Nombre del Medicamento: ");
        nombre[numero]=Leer.cadena();
        System.out.print("Nuevo Codigo: ");
        codigo[numero]=Leer.cadena();
        System.out.print("Nueva fecha de Entrega: ");
        fentrega[numero]=Leer.cadena();
        System.out.println("Desea editar otro?[S/N]");
            continuar=Leer.cadena();
        }while(continuar.equalsIgnoreCase("S"));
    }
    public static void Nomb_cliente(){
        System.out.println("Nombre del cliente:");
        cliente[posicion]=Leer.cadena();
    }
    public static void Boleta(){
        System.out.println("Listado");
        System.out.println("N°\t Codigo \t\t Fec. Entr. \t\t Nombre del medicamento \t\t Nombre del cliente");
        for (int i = 0; i <=posicion; i++) {
            System.out.println((i+1)+ "\t" + codigo[i] + "\t"+fentrega[i] + "\t"+nombre[i]+ "\t"+ cliente[i]);
              
        }
    }
    
    public static void salir(){
        System.out.println("Gracias por usar el sistema.");
    }
    public static void error(){
        System.out.println("ERROR! Seleccione una opcion correcta");
    }
    public static void menu(){
        System.out.println("MENU PRINCIPAL");
        System.out.println("1. Agregar Medicamento");
        System.out.println("2. Eliminar Medicamento");
        System.out.println("3. Editar Medicamento");
        System.out.println("4. Nombre del cliente");
        System.out.println("5. Boleta");
        System.out.println("6. Salir");
        System.out.println("Seleccione una opcion: ");
    }
    public static void inicio(){
        int opcion;
        do{
            menu();
            opcion = Leer.entero();
            switch(opcion){
                case 1: 
                    AgregarMed();
                    break;
                case 2:
                    EliminarMed();
                    break;
                case 3:
                    EditarMed();
                    break;
               
                case 4:
                    Nomb_cliente();
                    break;
                 case 5:
                    Boleta();
                    break;
                case 6:
                    salir();
                    break;
                    
                default:
                    error();
            }
        }while(opcion!=5);
    }
    public static void main(String[] args) {
        inicio();
    }
}
