package classes;

public class Delfino extends AbstractAnimal {

    public Delfino(String name, int numberOfLegs) {
        super(name, numberOfLegs);
    }

    public void nuota() {
        System.out.println("sto nuotando, splash splash");
    }

    @Override
    public void verso() {
        System.out.println("il piccolo delfino che piangeva");
    }

    @Override
    public void mangia() {
        this.isHangry = false;
        System.out.println("il delfino " + this.name + " ha mangiato le mie big fruit");
    }
}
