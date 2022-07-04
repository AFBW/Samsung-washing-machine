
/*
Clase para las funciones logicas de una lavadora
 */
package Libreria;

public class LlFunciones {

    private float kilos = 0;
    private int llenadoCompleto = 0; // LlenadoCompleto = 1 significa llenado
    private int tipoDeRopa = 0; // tipodeRopa blanca=1, tipodeRopa color=2
    private int lavadoCompleto = 0;  // lavadoCompleto = 1 significa terminado
    private int secadoCompleto = 0;     // SecadoCompleto = 1;

    // Constructores
    public LlFunciones(float kilos, int tipoDeRopa) {
        this.kilos = kilos;
        this.tipoDeRopa = tipoDeRopa;
    }
    
    // Metodos
    private void Llenado(){         // Este metodo sirve para llenar la lavadora
        if(kilos <= 12){
            llenadoCompleto = 1;
            System.out.println("Llenando...");
            System.out.println("Llenado Completo.");
        }else{
            System.out.println("La carga de ropa es muy pesada, reduce la carga");
        }
    }
    
    private void Lavado(){
        Llenado();
        if(llenadoCompleto == 1){       // Este metodo sirve para Lavar la ropa
            if(tipoDeRopa == 1){
                System.out.println("Ropa Blanca / Lavado Suave");
                System.out.println("Lavando...");
                lavadoCompleto = 1; // Cuando ya esta lavada la ropa el valor cambia a 1
            }else if(tipoDeRopa == 2){
                System.out.println("Ropa de color / Lavado Intenso");
                System.out.println("Lavando...");
                lavadoCompleto = 1;
            }else{
                System.out.println("Introduce el valor Correcto, el tipo de ropa no esta disponible.\n ¡¡Se lavara como ropa de color!!");
                System.out.println("Se lavara como ropa de Color / Lavado Intenso");
                lavadoCompleto = 1;
            }
        }
    }
    
    private void Secado(){      // Este metodo sirve para secar la ropa
        Lavado();
        if(lavadoCompleto == 1){
            System.out.println("Secando..");
            secadoCompleto = 1;
        }
    }
    
    public void CicloFinalizado(){      // Este metodo sirve para enviar esta funcion a los programadores de Samsumg
        Secado();
        if(secadoCompleto == 1){
            System.out.println("¡Tu ropa ya esta lista!.");
        }
    }

}
