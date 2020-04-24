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


        System.out.println("*** Teste ContaPoupanca ***");

        ContaPoupanca contaPoupanca = new ContaPoupanca();
        contaPoupanca.setNomeCliente("Cliente Conta Poupança");
        contaPoupanca.setNumConta("222222");
        contaPoupanca.setDiaRendimento(22);

        contaPoupanca.depositar(100);
        realizarSaque(contaPoupanca, 50);
        realizarSaque(contaPoupanca, 70);
        System.out.println(contaPoupanca);


        System.out.println("*** Teste ContaEspecial ***");

        ContaEspecial contaEspecial = new ContaEspecial();
        contaEspecial.setNomeCliente("Cliente Conta Especial");
        contaEspecial.setNumConta("333333");
        contaEspecial.setLimite(50);

        contaEspecial.depositar(100);
        realizarSaque(contaEspecial, 50);
        realizarSaque(contaEspecial, 70);
        realizarSaque(contaEspecial, 80);
        System.out.println(contaEspecial);

        if (contaPoupanca.calcularNovoSaldo(0.5)) {
            System.out.println("Rendimento aplicado. Novo saldo = " + contaPoupanca.getSaldo());
        } else {
            System.out.println("Hoje não é dia de rendimento. Novo saldo não calculado.");
        }

    }

    private static void realizarSaque(ContaBancaria conta, double valor) {
        if (conta.sacar(valor)) {
            System.out.println("Saque efetuado com sucesso. Novo saldo = " + conta.getSaldo());
        } else {
            System.out.println("Saldo insuficiente para saque de " + valor + ". Saldo = " + conta.getSaldo());
        }
    }
}
