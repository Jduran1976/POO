import java.util.Scanner;

public class PormedioNotas {
    public static void main(String[] args) throws Exception {
    
        // Promedio notas//

        // VARIABLES NOTA1, NOTA2, NOTA3, PROMEDIO//

        double NOTA1, NOTA2, NOTA3, PROMEDIO;

        String notas = "";

        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese la primera nota");
        NOTA1 = teclado.nextInt(); 

        System.out.println("Ingrese la segunda nota");
        NOTA2 = teclado.nextInt(); 

        System.out.println("Ingrese la tercera nota");
        NOTA3 = teclado.nextInt();

        //PROCESO//

        PROMEDIO=(NOTA1+NOTA2+NOTA3)/3;


        System.out.print("");
        System.out.print("TU PRMEDIO ES:" + PROMEDIO);

}
