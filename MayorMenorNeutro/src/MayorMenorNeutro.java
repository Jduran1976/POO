import java.util.Scanner;

public class MayorMenorNeutro {
    public static void main(String[] args) throws Exception {

        // DETERMINAR SI EL NUMERO ES MAYOR MENOR O NEUTRO //

        // VARIABLES//

        int n;
        String r = "";

        // ENTRADAS //

        Scanner teclado = new Scanner(System.in);
        System.out.print("Ingrese el primer numero");
        n = teclado.nextInt();

        // PROCESO//

        if (n > 0) {
            ;
            r = "POSITIVO";
        }
        if (n < 0) {
            ;
            r = "NEGATIVO";
        }
        if (n == 0) {
            ;
            r = "NEUTRO";
        }
        // SALIDA//
        System.out.print("");
        System.out.print("EL NUMERO ES:" + r);

    }
}
