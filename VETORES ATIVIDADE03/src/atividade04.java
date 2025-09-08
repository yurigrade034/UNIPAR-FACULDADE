import java.util.Scanner;

public class atividade04 {
    public static void main(String[] args) {

        Scanner lervetor = new Scanner(System.in);

        double[] vetores = new double[3];
        System.out.println("digite o primeiro valor: ");
        vetores[0] = lervetor.nextInt();
        System.out.println("digite o segundo valor: ");
        vetores[1] = lervetor.nextInt();
        System.out.println("digite o terceiro valor: ");
        vetores[2] = lervetor.nextInt();

        System.out.println("o valor um inserido foi: " + vetores[0]);
        System.out.println("o valor dois inserido foi: " + vetores[1]);
        System.out.println("o valor tres inserido foi: " + vetores[2]);

        System.out.println("a media dos tres numero é de: " + (vetores[0] + vetores[1] + vetores[2])  /3);




    }
}
