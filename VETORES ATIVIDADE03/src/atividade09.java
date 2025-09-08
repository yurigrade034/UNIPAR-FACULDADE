import java.util.Scanner;

public class atividade09 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int qtd = 5;
        String[] carros = new String[qtd];
        double[] cons = new double[qtd];


        for (int i = 0; i < qtd; i++) {
            System.out.println("Modelo do carro " + (i + 1) + ":");
            carros[i] = input.nextLine();

            System.out.println("Consumo do " + carros[i] + " (km/l):");
            cons[i] = input.nextDouble();
            input.nextLine();
        }


        double maisEcono = cons[0];
        int indMaisEcono = 0;

        for (int i = 1; i < qtd; i++) {
            if (cons[i] > maisEcono) {
                maisEcono = cons[i];
                indMaisEcono = i;
            }
        }

        System.out.println("RESULTADO a");
        System.out.println("Mais economico: " + carros[indMaisEcono] + " com " + maisEcono + " km/l");


        double km = 1000.0;
        System.out.println("RESULTADO b");

        for (int i = 0; i < qtd; i++) {
            double litros = km / cons[i];
            double l2 = (litros * 100.0) / 100.0;
            System.out.println(carros[i] + " consome " + l2 + " litros");
        }


    }
}
