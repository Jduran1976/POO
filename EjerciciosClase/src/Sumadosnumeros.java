import java.util.Scanner;


public class Sumadosnumeros {
    
    public static void name (String [] args) {

        // SUMA DE DOS NUMEROS//
        // VARIABLES num1, num,2, resultado//

    // PROCESO DE ENTRADA//

    int num1,num2,resultado;

    try (Scanner teclado = new Scanner (System.in)) {
        System.out.print ("INGRESE EL PRIMER NUMERO");
        num1 = teclado.nextInt();

        System.out.print ("INGRESE EL SEGUNDO NUMERO");
        num2 = teclado.nextInt();
    }
    
        
    // PROCESO //

    resultado = num1+num2;

    // SALIDA //

    System.out.print ("EL RESULTADO DE LAS SUMAS ES"+ resultado);
    

    }

}
