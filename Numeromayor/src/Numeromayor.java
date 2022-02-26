import java.util.Scanner;

public class Numeromayor {
    public static void main(String[] args) throws Exception {

        // determinar el numero mayor//

        // Variables int num1, num2, m=0//

        int num1, num2, m = 0;

        // ENTRADA//

        Scanner teclado = new Scanner(System.in);
        System.out.print("Ingrese el primer numero");
        num1 = teclado.nextInt();

        System.out.print("Ingrese el segundo numero");
        num2 = teclado.nextInt();

        // PROCESO//

        if (num1 > num2)
            ;
        m = num1;

        if (num2 > num1)
            ;
        m = num2;

        // SALIDA //
        System.out.print("el numero mayor es:" + m);

    }
}
