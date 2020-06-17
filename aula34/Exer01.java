package aula34;

public class Exer01 {

    static void imprimirValor() {
        System.out.println(Contador.obterValor());
    }

    public static void main(String[] args) {
        imprimirValor();
        Contador.incrementar();
        imprimirValor();
        Contador.zerar();
        imprimirValor();
    }
}
