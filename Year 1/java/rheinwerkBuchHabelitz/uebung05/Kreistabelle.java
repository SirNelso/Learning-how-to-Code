package uebung05;

import javax.swing.JOptionPane;

public class Kreistabelle {
    public static void main(String[] args) {
        var eingabe = JOptionPane.showInputDialog("Geben sie einen Radius ein: ");
        double r = Double.parseDouble(eingabe);
        eingabe = JOptionPane.showInputDialog("Um welchen Wert soll der Radius erhöht werden?");
        double e = Double.parseDouble(eingabe);
        Kreis kreis = new Kreis();
        System.out.println("Radius\t\tUmfang\t\t\tFläche");
        for (int x = 0; x < 30; x++) {
            kreis.setRadius(r);
            System.out.println(kreis.getRadius() + "\t\t" + kreis.getUmfang() + "\t\t" + kreis.getFlaeche());
            r += e;
        }
    }
}
