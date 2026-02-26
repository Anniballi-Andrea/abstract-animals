package classes;

public abstract class AbstractAnimal {
    protected String name;
    protected int numberOfLegs;
    protected boolean isHangry;

    public AbstractAnimal(String name, int numberOfLegs) {
        this.name = name;
        this.numberOfLegs = numberOfLegs;
        this.isHangry = true;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumberOfLegs() {
        return this.numberOfLegs;
    }

    public void setNumberOfLegs(int numberOfLegs) {
        this.numberOfLegs = numberOfLegs;
    }

    public void dormi() {
        System.out.println("Zzz");
    }

    public void mangia() {
        this.isHangry = false;
    }

    public abstract void verso();

}
