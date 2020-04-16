package aula40;

public class Professor extends Pessoa {

    private double salario;
    private String nomeCurso;

    public double calcularSalarioLiquido() {
        return 0;
    }

    public String obterEtiquetaEndereco() {
        String s = "Endereço do Professor";
        s += super.getEndereco();

        return s;
    }
}