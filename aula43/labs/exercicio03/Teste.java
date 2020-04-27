package aula43.labs.exercicio03;

public class Teste {

    public static void main(String[] args) {

        Animal camelo = new Animal();
        camelo.setNome("Camelo");
        camelo.setComprimento(150);
        //camelo.setPatas(4);
        camelo.setCor("Amarelo");
        camelo.setAmbiente("Terra");
        camelo.setVelocidade(2);

        Peixe tubarao = new Peixe();
        tubarao.setNome("Tubarao");
        tubarao.setComprimento(300);
        tubarao.setVelocidade(3);

        Mamifero urso = new Mamifero();
        urso.setNome("Urso-do-Canada");
        urso.setComprimento(180);
        urso.setCor("Vermelho");
        urso.setAmbiente("Terra");
        urso.setVelocidade(4);

        Animal[] animais = new Animal[3];
        animais[0] = camelo;
        animais[1] = tubarao;
        animais[2] = urso;

        System.out.println("-----------------------");
        for(Animal animal : animais) {
            System.out.println(animal);
            System.out.println("------------------");
        }
    }
}
