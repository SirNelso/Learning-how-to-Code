package uebung06;

public class Anteil extends Bruch {
    static Bruch verteilt = new Bruch(0);

    Anteil() {
        super();
    }

    Anteil(int z, int n) {
        super(z, n);
        verteilt = verteilt.addiere(this);
        if (this.getVerteilt() > 1)
            System.out.println("Fehler!! Es wurde zu viel verteilt");
    }

    double getVerteilt() {
        return (double) verteilt.getZahler() / verteilt.getNenner();
    }

    Bruch getRest() {
        Bruch gesamt = new Bruch(1);
        return gesamt.subtrahiere(verteilt);
    }

}
