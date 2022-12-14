package uebung05;

import javax.swing.JOptionPane;

public class Rechtecktest {
    public static void main(String[] args) {
        var eingabe = JOptionPane.showInputDialog("Geben sie die Seite a an");
        double a = Double.parseDouble(eingabe);
        eingabe = JOptionPane.showInputDialog("Geben sie die Seite b an");
        double b = Double.parseDouble(eingabe);
        Rechteck recht = new Rechteck(a, b);
        recht.breiteVerkleinern(2);
        recht.laengeVerkleinern(2);
        System.out.println("Lange Seite: " + recht.getLangeSeite());
        System.out.println("Kurze Seite: " + recht.getKurzeSeite());
        System.out.println("Diagonale: " + recht.getDiagonale());
        System.out.println("Fläche: " + recht.getFlaeche());
        System.out.println("Umfang: " + recht.getUmfang());
        recht.laengeAusgeben();
    }
}
