package classes;

import interfaces.Nuotante;

public class Delfino extends AbstractAnimal implements Nuotante {

    public Delfino(String name, int numberOfLegs) {
        super(name, numberOfLegs);
    }

    private void nuota() {
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

    @Override
    public void faiNuotare(Nuotante Delfino) {
        nuota();
    }
}
