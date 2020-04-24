package aula43.labs.exercicio01;

public class ContaEspecial extends ContaBancaria{

    private double limite;

    public double getLimite() {
        return limite;
    }

    public void setLimite(double limite) {
        this.limite = limite;
    }

    @Override
    public String toString() {
        return "ContaEspecial {" +
                "limite = " + limite + ", " + super.toString() +
                '}';
    }


    //sobrescreva o metodo sacar com a nova logica necessaria
    public boolean sacar(double valor) {

        double saldoComLimite = this.getSaldo() + limite;
        //verifica se tem saldo para ser sacado
        if ((saldoComLimite - valor >= 0)) {
            this.setSaldo(this.getSaldo() - valor);
            return true;
        }
        return false;
    }
}
