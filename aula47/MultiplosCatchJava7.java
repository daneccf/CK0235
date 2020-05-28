package aula47;

public class MultiplosCatchJava7 {

    public static void main(String[] args) {

        int[] numeros = {4, 8, 16, 32, 64, 128};
        int[] denomin = {2, 0, 4, 8, 0};

        for (int i = 0; i < numeros.length; i++) {
            try {
                System.out.println(numeros[i] + "/" + denomin[i] + "=" + (numeros[i] / denomin[i]));
            } catch (ArithmeticException | ArrayIndexOutOfBoundsException e) {
                System.out.println("Erro ao dividir por zero.");
            }
        }
    }
}
