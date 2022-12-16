package uebung05;

import uebung3.Zahlentest;

public class Bruch {
    int zaehler;
    int nenner;
    static int anzahlBrueche = 0;

    Bruch() {
        anzahlBrueche++;
    }

    Bruch(int z, int n) {
        zaehler = z;
        nenner = n;
        anzahlBrueche++;
    }

    static int getAnzahlBrueche() {
        return anzahlBrueche;
    }

    void ausgeben() {
        System.out.println(zaehler + "/" + nenner);
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

    void gekuertausgeben() {
        kuerzen();
        ausgeben();
    }

    void erweitern(int a) {
        zaehler *= a;
        nenner *= a;
    }

    double dezimalwert() {
        return (double) zaehler / nenner;
    }
}
