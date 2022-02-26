import java.util.Scanner;

public class Dosnumerosiguientes {
    public static void main(String[] args) throws Exception {

        // DETERMINAR LA SUMA DE LOS DOS NUMEROS SIGUIENTES DE UN NUMERO N//

        // VARIABLES NUM1, NUM2 //

        int NUM1, NUM2;

        // ENTRADA //

        Scanner teclado = new Scanner(System.in);
        System.out.print("Ingrese el numero:");
        NUM1 = teclado.nextInt();

        // PROCESO//

        NUM2 = (NUM1 * (NUM1 + 1)) / 2;

        // SALIDA//

        System.out.print("");
        System.out.print("SUMA:" + NUM2);

    }
}
