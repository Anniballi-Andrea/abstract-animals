import classes.Aquila;
import classes.Cane;
import classes.Delfino;
import classes.Passerotto;

public class App {
    public static void main(String[] args) throws Exception {
        Passerotto cip = new Passerotto("Cip", 2, "marrone");
        Cane nuvola = new Cane("Nuvola", 4, "bianco");
        Delfino curioso = new Delfino("curioso", 0);
        Aquila tilde = new Aquila("Tilde", 2, "marrone e bianco");

        System.out.println(nuvola.getName() + " sta dormendo");

        nuvola.dormi();

        nuvola.mangia();

        System.out.println(nuvola.getName() + " sta facendo rumore");

        nuvola.verso();

        System.out.println("----------------------");

        System.out.println(cip.getName() + " sta dormendo");

        cip.dormi();

        cip.mangia();

        System.out.println(cip.getName() + " sta facendo rumore");

        cip.verso();

        System.out.println("----------------------");

        curioso.mangia();

        System.out.println(curioso.getName() + " sta facendo rumore");

        curioso.verso();

        System.out.println("----------------------");

        tilde.mangia();

        System.out.println(tilde.getName() + " sta facendo rumore");

        tilde.verso();

        System.out.println("----------------------");

        tilde.faiVolare(tilde);

        curioso.faiNuotare(curioso);

    }
}
