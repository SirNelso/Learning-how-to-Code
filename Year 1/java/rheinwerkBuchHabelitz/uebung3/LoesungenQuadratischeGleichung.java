package uebung3;

import javax.swing.JOptionPane;

public class LoesungenQuadratischeGleichung {
    public static void main(String[] args) {

        var a = Integer.parseInt(JOptionPane.showInputDialog("ax" + '\u00b2' + "+ bx + c = 0; Geben sie einen für a Wert ein: "));
        var b = Integer.parseInt(JOptionPane.showInputDialog("ax" + '\u00b2' + "+ bx + c = 0; Geben sie einen für den b Wert ein: "));
        var c = Integer.parseInt(JOptionPane.showInputDialog("ax" + '\u00b2' + "+ bx + c = 0; Geben sie einen für c Wert ein: "));
        var d = b * b - 4 * a * c;
        if (d == 0) {
            JOptionPane.showMessageDialog(null, "Die Gleichung hat eine Lösung");
        } else if (d > 0) {
            JOptionPane.showMessageDialog(null, "Die Gleichung hat zwei Lösungen");
        } else {
            JOptionPane.showMessageDialog(null, "Die Gleichung hat keine Lösungen");
        }
    }
}
