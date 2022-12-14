package uebung05;

import java.text.BreakIterator;

import org.w3c.dom.ls.LSException;

public class Rechteck {
    double laenge;
    double breite;

    Rechteck() {
        laenge = 0;
        breite = 0;
    }

    Rechteck(double l, double b) {
        laenge = l;
        breite = b;
    }

    void setLaenge(double l) {
        laenge = l;
    }

    void setBreite(double b) {
        breite = b;
    }

    void setSeiten(double l, double b) {
        laenge = l;
        breite = b;
    }

    double getLaenge() {
        return laenge;
    }

    double getBreite() {
        return breite;
    }

    double getLangeSeite() {
        if (laenge > breite) {
            return laenge;
        } else {
            return breite;
        }
    }

    double getKurzeSeite() {
        if (laenge < breite) {
            return laenge;
        } else {
            return breite;
        }
    }

    double getDiagonale() {
        return (Math.sqrt(laenge * laenge + breite * breite));
    }

    double getFlaeche() {
        return laenge * breite;
    }

    double getUmfang() {
        return (2 * breite) + (2 * laenge);
    }

    void laengeAusgeben() {
        double laenge = 5.4;
        System.out.println("Länge: " + laenge);
    }

    void laengeVergroessern(double l) {
        laenge += l;

    }

    void breiteVergroessern(double b) {
        breite += b;
    }

    void laengeVerkleinern(double l) {
        laenge -= l;
    }

    void breiteVerkleinern(double b) {
        breite -= b;
    }
}
