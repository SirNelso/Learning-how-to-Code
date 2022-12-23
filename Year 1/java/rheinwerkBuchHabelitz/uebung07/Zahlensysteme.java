package uebung07;

import javax.swing.JOptionPane;

public class Zahlensysteme {
    public static void main(String[] args) {
        var eingabe = JOptionPane.showInputDialog("Geben sie eine ganze Zahl ein: ");
        int i = Integer.parseInt(eingabe);
        JOptionPane.showMessageDialog(null, eingabe + " als Dezimalzahl " + Double.parseDouble(eingabe)
                + "\nals Dualzahl " + Integer.toBinaryString(i) + "\nals Hexadezimalzahl " + Integer.toHexString(i).toUpperCase());
    }

}
