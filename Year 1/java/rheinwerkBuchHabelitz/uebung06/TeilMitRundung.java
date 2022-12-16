package uebung06;

public class TeilMitRundung {
    double radius;

    TeilMitRundung() {
        radius = 1;
    }

    TeilMitRundung(double r) {
        radius = r;
    }

    double getRadius() {
        return radius;
    }

    void setRadius(double r) {
        radius = r;
    }

    void radiusVergroessernUm(double vr) {
        radius += vr;
    }
}
