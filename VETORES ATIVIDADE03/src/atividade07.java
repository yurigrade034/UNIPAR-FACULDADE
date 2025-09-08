import java.util.Scanner;

public class atividade07 {
    public static void main(String[] args) {

        Scanner lernomes = new Scanner(System.in);

        String[] nomes = new String[15];
        for (int i = 0; i <= 14; i++) {
            System.out.println("digite o nome " + (i + 1) + ":");
            nomes[i] = lernomes.nextLine();
        }

        for (int i = 14; i >= 0; i-- ) {
            System.out.println("nome " + (i + 1) + ": " + nomes[i]);


        }

    }
}
