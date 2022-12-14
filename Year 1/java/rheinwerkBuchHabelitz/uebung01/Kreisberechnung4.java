package uebung01;

import javax.swing.JOptionPane;

/*Kreisberechnung: Der Radius für einen Kreis und die Einheit werden über die Tastatur eingegeben.
 * Anschließend werden der Umfang und der Flächeninhalt berechnet
 */
public class Kreisberechnung4 {
    public static void main(String[] args) {
        var eingabe = JOptionPane.showInputDialog("Geben sie den Kreisradius ein: ");
        var radius = Double.parseDouble(eingabe);
        eingabe = JOptionPane.showInputDialog("Geben sie die Einheit ein: ");
        var einheit = eingabe;
        var umfang = 2.0 * 3.1415926 * radius;
        var flaeche = 3.1415926 * radius * radius;
        System.out.print("Umfang: ");
        System.out.print(umfang);
        System.out.println(" " + einheit);
        System.out.print("Fläche: ");
        System.out.print(flaeche);
        System.out.println(" " + einheit + '\u00b2');
    }

}
