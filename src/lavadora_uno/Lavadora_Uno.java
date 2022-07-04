
package lavadora_uno;
import Libreria.LlFunciones;
import java.util.Scanner;

public class Lavadora_Uno {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
        
        System.out.println("¿La ropa es Blanca o de Color?");
        System.out.println("Presiona 1-ropa blanca / 2-ropa de color");
        int tipoDeRopa = sc.nextInt();
        
        System.out.println("¿Cuantos Kilos de ropa?");
        int kilos = sc.nextInt();
        
        LlFunciones mensajero = new LlFunciones(kilos, tipoDeRopa);
        mensajero.CicloFinalizado();
    }
 
}
