package aula43.labs.exercicio01;

import java.util.Calendar;

public class ContaPoupanca extends ContaBancaria {
    private int diaRendimento;

    public int getDiaRendimento() {
        return diaRendimento;
    }

    public void setDiaRendimento(int diaRendimento) {
        this.diaRendimento = diaRendimento;
    }

    @Override
    public String toString() {
        return "ContaPoupanca {" +
                "diaRendimento = " + diaRendimento + ", " + super.toString() +
                '}';
    }

    //recebe taxa de rendimento da popanca e atualiza o saldo:
    public boolean calcularNovoSaldo(double taxaRendimento) {
        Calendar hoje = Calendar.getInstance();

        if (diaRendimento == hoje.get(Calendar.DAY_OF_MONTH)) {
            //saldo += saldo * taxaRendimento;
            this.setSaldo(this.getSaldo() + (this.getSaldo() * taxaRendimento));
            return true;
        }
        return false;
    }
}
