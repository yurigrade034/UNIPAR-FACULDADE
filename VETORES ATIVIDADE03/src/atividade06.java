import java.util.Scanner;

public class atividade06 {
    public static void main(String[] args) {

        int[] numeros = new int[10];
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite 10 números inteiros:");

        for (int i = 0; i < 10; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            numeros[i] = entrada.nextInt();
        }

        System.out.println("Números pares:");

        boolean temPar = false;

        for (int i = 0; i < 10; i++) {
            if (numeros[i] % 2 == 0) {
                System.out.println(numeros[i]);
                temPar = true;
            }
        }

        if (!temPar) {
            System.out.println("Nenhum número par foi digitado.");
        }


    }
}
