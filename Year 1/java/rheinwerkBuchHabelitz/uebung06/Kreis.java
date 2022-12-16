package uebung06;

public class Kreis extends TeilMitRundung {

    Kreis(double r) {
        radius = r;
    }

    double getUmfang() {
        return 2 * Math.PI * radius;
    }

    double getFlaeche() {
        return Math.PI * radius * radius;
    }
}
