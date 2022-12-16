package uebung06;

public class Bruch {
    private int zaehler;
    private int nenner;

    Bruch() {
        zaehler = 0;
        nenner = 1;
    }

    Bruch(int x) {
        zaehler = x;
        nenner = 1;
    }

    Bruch(int x, int y) {
        zaehler = x;
        nenner = y;
    }

    int getZahler() {
        return zaehler;
    }

    int getNenner() {
        return nenner;
    }

    void setZaehler(int z) {
        zaehler = z;
    }

    void setNenner(int n) {
        nenner = n;
    }

    void ausgeben() {
        System.out.println(zaehler + "/" + nenner);
    }

    String bruchToString() {
        return zaehler + "/" + nenner;
    }

    void kuerzen() {
        var m = Math.abs(zaehler);
        var n = Math.abs(nenner);
        var r = m % n;
        while (r > 0) {
            m = n;
            n = r;
            r = m % n;
        }
        zaehler /= n;
        nenner /= n;
    }

    void gekurtausgeben() {
        kuerzen();
        ausgeben();
    }

    boolean equals(Bruch x) {
        var a = new Bruch(this.zaehler, this.nenner);
        var b = new Bruch(x.zaehler, x.nenner);
        a.kuerzen();
        b.kuerzen();
        if ((a.zaehler == b.zaehler) && (a.nenner == b.nenner)) {
            return true;
        } else {
            return false;
        }
    }

    Bruch addiere(Bruch b) {
        var z = zaehler * b.nenner + b.zaehler * nenner;
        var n = nenner * b.nenner;
        var summe = new Bruch(z, n);
        return summe;
    }

    Bruch subtrahiere(Bruch b) {
        var z = zaehler * b.nenner - b.zaehler * nenner;
        var n = nenner * b.nenner;
        var differenz = new Bruch(z, n);
        return differenz;
    }

    double dezimalwert() {
        return (double) zaehler / nenner;
    }
}
