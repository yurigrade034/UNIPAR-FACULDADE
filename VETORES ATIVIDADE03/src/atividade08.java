import java.util.Scanner;

public class atividade08 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        int[] numerosA = new int[8];
        for (int i = 0; i < 8; i++) {
            System.out.println("Digite o número " + (i + 1) + " do vetor A:");
            numerosA[i] = ler.nextInt();
        }

        int[] numerosB = new int[8];
        for (int i = 0; i < 8; i++) {
            numerosB[i] = numerosA[i] * 3;
        }

        System.out.println("Os números do vetor B (valores de A multiplicados por 3) são:");
        for (int i = 0; i < 8; i++) {
            System.out.println("valor informado na coluna B[" + i + "] = " + numerosB[i]);
        }

    }
}
