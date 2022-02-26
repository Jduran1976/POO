package MyPackage;

import java.util.Scanner;

public class radicacion {
    public static void main(String args) {

        // VARIABLES NUM1, NUM2, RAIZ //

        int NUM1;
        short NUM2, RAIZ;

        Scanner teclado = new Scanner(System.in);
        System.out.print("Ingrese un numero" + NUM1);
        NUM1 = teclado.nextInt();
        System.out.print("Ingrese un numero" + NUM2);
        NUM2 = teclado.nextShort();

        // PROCESO//

        RAIZ = (short) Math.pow((double) NUM1, (1 / (double) NUM2));

        // SALIDA//

        System.out.println("");
        System.out.println("la raiz del numer es:" + RAIZ);

    }
}