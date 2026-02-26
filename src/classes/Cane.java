package classes;

public class Cane extends AbstractAnimal {
    private String furColor;

    public Cane(String name, int numberOfLegs, String furColor) {
        super(name, numberOfLegs);
        this.furColor = furColor;
    }

    public String getFurColor() {
        return this.furColor;
    }

    public void setFurColor(String furColor) {
        this.furColor = furColor;
    }

    @Override
    public void verso() {
        System.out.println("bau, bau, bau");
    }

    @Override
    public void mangia() {
        this.isHangry = false;
        System.out.println("il cane " + this.name + " ha mangiato il mio pranzo");
    }
}
