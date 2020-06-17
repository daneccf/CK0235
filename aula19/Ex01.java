package aula19;
import java.util.Scanner;

public class Ex01 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[] vetorA = new int[5];
        int[] vetorB = new int[vetorA.length];


        for(int i = 0; i < vetorA.length; i++) {
            System.out.println("Posicao " + (i+1) + ": ");
            vetorA[i] = scan.nextInt();
            vetorB[i] = scan.nextInt();
        }

        for(int temp : vetorA) {
            System.out.println(temp);
        }

        for(int temp : vetorB) {
            System.out.println(temp);
        }


    }

}
