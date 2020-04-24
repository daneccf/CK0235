package aula43.labs.exercicio01;

import aula34.Contador;

public class Teste {

    public static void main(String[] args) {

        System.out.println("** Teste ContaBancaria ***");

        ContaBancaria contaSimples = new ContaBancaria();
        contaSimples.setNomeCliente("Cliente Conta Simples");
        contaSimples.setNumConta("111111");

        contaSimples.depositar(100);
        realizarSaque(contaSimples, 50);
        realizarSaque(contaSimples, 70);
        System.out.println(contaSimples);


    }

    private static void realizarSaque(ContaBancaria conta, double valor) {
        if (conta.sacar(valor)) {
            System.out.println("Saque efetuado com sucesso. Novo saldo = " + conta.getSaldo());
        } else {
            System.out.println("Saldo insuficiente para saque de " + valor + ". Saldo = " + conta.getSaldo());
        }
    }
}
