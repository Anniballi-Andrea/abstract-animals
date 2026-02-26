package classes;

public class Passerotto extends AbstractAnimal {
    private String featherColor;

    public Passerotto(String name, int numberOfLegs, String featherColor) {
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
        System.out.println("cip cip ciiiiip");
    }

    @Override
    public void mangia() {
        this.isHangry = false;
        System.out.println("il passerotto " + this.name + " ha mangiato un verme");
    }
}