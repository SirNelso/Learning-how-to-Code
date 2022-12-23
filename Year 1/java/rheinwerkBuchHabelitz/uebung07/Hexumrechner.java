package uebung07;

import javax.swing.JOptionPane;

public class Hexumrechner {
    public static void main(String[] args) {
        var eingabe = JOptionPane.showInputDialog("Geben sie eine Hexzahl ein: ");
        JOptionPane.showMessageDialog(null, "Hexzahl: " + eingabe + "\nDezimalzahl: " + Integer.valueOf(eingabe, 16)
                + "\nDualzahl: " + Integer.toBinaryString(Integer.valueOf(eingabe, 16)));
    }

}
