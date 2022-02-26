import java.util.Scanner;

public class potenciardosnumeros {
    public static void main(String[] args) throws Exception {

        // REALIZAR LA POTENCIACION DE DOS NUMEROS//

        // VARIABLES num1, num2, potencia//

        short num1, num2;
        int p;

        // ENTRADA //

        Scanner teclado = new Scanner(System.in);
        System.out.print("INGRESE EL PRIMER NUMERO");
        num1 = teclado.nextShort();

        Scanner teclado = new Scanner(System.in);
        System.out.print("INGRESE EL SEGUNDO NUMERO");
        num2 = teclado.nextShort();

        // PROCESO //

        potencia = (int) Math.pow((double) num1, (double) num2);

        // SALIDA//

        System.out.print("");
        System.out.print("LA POTENCIA ES: + potencia");

    }
}
