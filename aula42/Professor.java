package aula42;

public class Professor {

    private double salario;
    private String nomeCurso;

    public double calcularSalarioLiquido() {
        return 0;
    }

    public String obterEtiquetaEndereco() {
        String s = "Endereço do Professor";
//        s += super.getEndereco();

        return s;
    }

//    @Override
    public void imprimirEtiquetaEndereco() {
        System.out.println("Imprimindo endereço do prof");
        System.out.println(this.obterEtiquetaEndereco());
    }
}