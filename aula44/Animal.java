package aula44;

public abstract class Animal {

    private String nome;

    public abstract void emitirSom(); //cada animal emite um som diferente

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
