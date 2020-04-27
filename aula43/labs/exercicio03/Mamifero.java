package aula43.labs.exercicio03;

public class Mamifero extends Animal {

    private String alimento;

    public Mamifero() {
        super();
        this.setCor("castanho");
        this.setAlimento("mel");
    }

    public String getAlimento() {
        return alimento;
    }

    public void setAlimento(String alimento) {
        this.alimento = alimento;
    }

    @Override
    public String toString() {
        return super.toString() + "\nalimento = " + alimento;
    }
}
