import java.util.Random;
import java.util.Scanner;

public class CampoMinado {
    public static void main(String[] args) {

        int linha = 10;
        int coluna = 10;
        Random sortear = new Random();

        char[][] campo = new char[linha][coluna];

        for (int i = 0; i < linha; i++) {
            for (int j = 0; j < coluna; j++) {
                campo[i][j] = '*';
                System.out.print(" * ");


            }
            System.out.println(" ");

        }
        Scanner sc = new Scanner(System.in);
        System.out.println("Quantas bombas vamos adicionar?");

        int quantidades = sc.nextInt();

        int plantada = 0;
        while (plantada < quantidades) {

            int linhaSorteio = sortear.nextInt(linha);
            int colunaSorteio = sortear.nextInt(coluna);

            char valorPosicao = campo[linhaSorteio][colunaSorteio];

            if (valorPosicao == '*') {

                campo[linhaSorteio][colunaSorteio] = 'O';

                plantada++;
            }
        }
        for (int i = 0; i < linha; i++) {
            for (int j = 0; j < coluna; j++) {
                System.out.print(" " + campo[i][j] + " ");
            }
            System.out.println(" ");

        }
        int contador = 100 - quantidades;

        int tentativas = 0;
        boolean continuar = true;
        do {
            System.out.println("Informe uma linha: ");
            int linhaEscolhida = sc.nextInt();

            System.out.println("Informe uma coluna: ");
            int colunaEscolhida = sc.nextInt();

            char valorEscolhida = campo[linhaEscolhida - 1][colunaEscolhida - 1];
            if (valorEscolhida == 'O') {
                System.out.println("bomba!!");
                continuar = false;
            } else {
                System.out.println("vazio !");
                contador--;
            }

            tentativas++;
        } while (continuar && contador > 0);

        System.out.println("preciso " + tentativas + " rodadas");

    }
}