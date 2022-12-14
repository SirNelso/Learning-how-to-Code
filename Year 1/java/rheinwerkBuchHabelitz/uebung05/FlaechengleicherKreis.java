package uebung05;

import javax.swing.JOptionPane;

public class FlaechengleicherKreis {
    public static void main(String[] args) {
        var eingabe = JOptionPane.showInputDialog("Geben sie die Länge des Rechtecks ein: ");
        double laenge = Double.parseDouble(eingabe);
        ;
        eingabe = JOptionPane.showInputDialog("Geben sie die Breite des Rechtecks ein: ");
        double breite = Double.parseDouble(eingabe);
        Rechteck r = new Rechteck(laenge, breite);
        Kreis k = new Kreis();
        System.out.println("Rechtecklänge: " + r.getLaenge());
        System.out.println("Rechtecksbreite: " + r.getBreite());
        System.out.println("Rechteckfläche: " + r.getFlaeche());
        k.setFlaeche(r.getFlaeche());
        System.out.println("Kreisradius: " + k.getRadius());
        System.out.println("Kreisfläche: " + k.getFlaeche());

    }
}