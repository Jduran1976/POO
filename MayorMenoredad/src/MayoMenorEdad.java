import java.util.Scanner;

public class MayoMenorEdad {
    public static void main(String[] args) throws Exception {

        // determinar si es mayor o menor de edad//

        // VARIABLES NUM; ESTADO,//

        int n;
        String ESTADO = "";

        // ENTRADA//

        Scanner teclado = new Scanner(System.in);
        System.out.print("Ingrese la edad");
        n = teclado.nextInt();

        // PROCESO//

        if (n >= 18) {

            ESTADO = "MAYOR DE EDAD";
            if (n < 18)

                ESTADO = "MENOR DE EDAD";
        }

        // SALIDA//
        System.out.print("");
        System.out.print("TU ESTADO ES:" + ESTADO);

    }
}
