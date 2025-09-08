public class atividade03 {
    public static void main(String[] args) {

        int[] vetores = new int[2];
        vetores[0] = 5;
        vetores[1] = 10;

        System.out.println("posiçao 1: " + vetores[0]);
        System.out.println("posiçao 2: " + vetores[1]);


        System.out.println("-------------------------");

        vetores[0] = 10;
        vetores[1] = 5;
        System.out.println("posiçao 1 após a troca: " + vetores[0]);
        System.out.println("posiçao 2 após a troca: " + vetores[1]);

    }
}
