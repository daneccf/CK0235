package aula12;

import java.util.Scanner;

public class DadosDoTeclado {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
/*
        System.out.println("Digite seu nome completo: ");
        String nomeCompleto = scan.nextLine();
        System.out.println("Seu nome é: " + nomeCompleto);

        System.out.println("Digite seu primeiro nome: ");
        String primeiroNome = scan.next();
        System.out.println("Seu nome é: " + primeiroNome);

        System.out.println("Digite a sua idade: ");
        int idade = scan.nextInt();
        System.out.println("Sua idade é " + idade);

        System.out.println("Altura? ");
        double altura = scan.nextDouble();
        System.out.println("Altura: " + altura);
        */

        System.out.println("Nome, idade, quantidade, tem bicho de est?");
        String primeiroNome = scan.next();
        int idade = scan.nextInt();
        byte qtdFilhos = scan.nextByte();
        float altura = scan.nextFloat();
        boolean temPet = scan.nextBoolean();

        System.out.println("Vc digitou: ");
        System.out.println("Primeiro nome: " + primeiroNome);
        System.out.println("Idade: " + idade);
        System.out.println("Qtd de filhos: " + qtdFilhos);
        System.out.println("Altura: " + altura);
        System.out.println("Tem bicho? " + temPet);


    }
}
