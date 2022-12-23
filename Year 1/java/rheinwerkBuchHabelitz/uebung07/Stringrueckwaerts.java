package uebung07;

import javax.swing.JOptionPane;

public class Stringrueckwaerts {
    public static void main(String[] args) {
        var eingabe = JOptionPane.showInputDialog("Geben sie ein Wort ein: ");
        for(int i = eingabe.length() - 1; i >= 0; i--){
            System.out.print(eingabe.charAt(i));
        }
    }
    
}
