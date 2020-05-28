package aula52;

import java.util.Arrays;

public class Agenda {

    private Contato[] contatos;

    public Agenda() {
        contatos = new Contato[5];
    }

    public void adicionarContato(Contato c) throws AgendaCheiaException {

        boolean cheia = true;
        for(int i = 0; i < contatos.length; i++) {
            if(contatos[i] != null) {
                contatos[i] = c;
                cheia = false;
            }
        }

        if(cheia) {
            throw new AgendaCheiaException();
        }
    }

    @Override
    public String toString() {
        return "Agenda {" +
                "contatos = " + Arrays.toString(contatos) +
                '}';
    }
}
