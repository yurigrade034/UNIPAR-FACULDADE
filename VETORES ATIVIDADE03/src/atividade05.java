import java.util.Scanner;
public class atividade05 {
    public static void main(String[] args) {

        Scanner nomes = new Scanner(System.in);

        String[] nome = new String[3];
        System.out.println("digite o primeiro nome: ");
        nome[0] = nomes.nextLine();
        System.out.println("digite o segundo nome: ");
        nome[1] = nomes.nextLine();
        System.out.println("digite o terceiro nome: ");
        nome[2] = nomes.nextLine();

        System.out.println("os nomes inseridos foram: " + nome[0] + " | " + nome[1] + " | " + nome[2]);



    }
}
