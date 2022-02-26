
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        // area triangulo//

        // variables base, altura, area//

        int base, altura, area;

        Scanner teclado = new Scanner(System.in);
        System.out.print("Ingrese la base");
        base = teclado.nextInt();

        Scanner teclado = new Scanner(System.in);
        System.out.print("Ingrese la altura");
        altura = teclado.nextInt();

        // PROCESO//

        area = base * altura / 2;

        // SALIDA//

        System.out.print("AL AREA DEL TRIANGULO ES:" + area);
    }
}
