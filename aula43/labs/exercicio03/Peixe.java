package aula43.labs.exercicio03;

public class Peixe extends Animal {

    private String caracteristicas;

    public Peixe() {
        super();
        this.setPatas(0);
        this.setAmbiente("mar");
        this.setCor("cinzenta");
        this.setCaracteristicas("barbatanas e cauda");
    }


    public String getCaracteristicas() {
        return caracteristicas;
    }

    public void setCaracteristicas(String caracteristicas) {
        this.caracteristicas = caracteristicas;
    }

    @Override
    public String toString() {
        return super.toString() + "\ncaracteristicas = " + caracteristicas;
    }
}
