package aula40;

public class Teste {

    public static void main(String[] args) {

    Pessoa pessoa = new Pessoa();
    Pessoa aluno = new Aluno();
    Pessoa professor = new Professor();

    pessoa.setEndereco("Rua 1, n1");
    aluno.setEndereco("Rua 2, n2");
    professor.setEndereco("Rua3, n3");

    System.out.println(pessoa.obterEtiquetaEndereco());
    System.out.println(aluno.obterEtiquetaEndereco());
    System.out.println(professor.obterEtiquetaEndereco());

    }
}
