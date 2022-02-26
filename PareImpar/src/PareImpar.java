import java.util.Scanner;

public class PareImpar {
    public static void main(String[] args) throws Exception {

        // determinar si el numero es par o impar//

        // variables//
        int n;
        String r;

        // ENTRADA//

        Scanner teclado = new Scanner(System.in);
        System.out.print("Ingrese el numero");
        n = teclado.nextInt();

        // PROCESO//

        if (n % 2 == 0) {
            r = "el numero es par";
        } else {
            r = "el numero es impar";
        }

        // SALIDA//

        System.out.println("");
        System.out.println("" + r);
    }
}
