package uebung05;

import javax.swing.JOptionPane;

public class Kreistest {
    public static void main(String[] args) {
        var eingabe = JOptionPane.showInputDialog("Geben sie den Radius des Kreises an");
        double r = Double.parseDouble(eingabe);
        Kreis k = new Kreis(r);
        System.out.println("Radius: " + k.getRadius());
        System.out.println("Umfang: " + k.getUmfang());
        System.out.println("Fläche: " + k.getFlaeche());
    }
}
