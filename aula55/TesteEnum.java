package aula55;
import aula54.DiaSemana;


public class TesteEnum {

    public static void main(String[] args) {
        DiaSemana[] dias = DiaSemana.values();

        for(DiaSemana dia : DiaSemana.values()) {
            System.out.println(dia);
        }
    }


}
