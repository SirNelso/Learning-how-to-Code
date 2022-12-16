package uebung03;

import javax.swing.JOptionPane;

public class Schaltjahr {
    public static void main(String[] args) {
        var jahreszahl = Integer.parseInt(
                JOptionPane.showInputDialog("Geben sie ein Jahr ein, um zu überprüfen ob es ein Schaltjahr ist: "));
                if ((jahreszahl % 400) == 0) {
                    JOptionPane.showMessageDialog(null, "Das Jahr " + jahreszahl
                        + " ist ein Schaltjahr!");
                } else {
                    if ((jahreszahl % 100) == 0) {
                    JOptionPane.showMessageDialog(null, "Das Jahr " + jahreszahl
                        + " ist kein Schaltjahr!");
                    } else {
                    if ((jahreszahl % 4) == 0) {
                        JOptionPane.showMessageDialog(null, "Das Jahr " + jahreszahl
                            + " ist ein Schaltjahr!");
                    } else {
                        JOptionPane.showMessageDialog(null, "Das Jahr " + jahreszahl
                            + " ist kein Schaltjahr!");
                    }
                    }
                }
    }
}