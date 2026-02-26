package classes;

public class Aquila extends AbstractAnimal {

    private String featherColor;

    public Aquila(String name, int numberOfLegs, String featherColor) {
        super(name, numberOfLegs);
        this.featherColor = featherColor;
    }

    public String getFeatherColor() {
        return this.featherColor;
    }

    public void seteaterColor(String featherColor) {
        this.featherColor = featherColor;
    }

    @Override
    public void verso() {
        System.out.println("verso dell'aquila... non lo conosco");
    }

    @Override
    public void mangia() {
        this.isHangry = false;
        System.out.println("l'aquila " + this.name + " ha mangiato un topo");
    }

}
