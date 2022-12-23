package uebung07;

import javax.swing.JOptionPane;

public class Vokalzaehler2 {
    public static void main(String[] args) {
        var eingabe = JOptionPane.showInputDialog("Geben sie ein Wort ein: ");
        String wort = eingabe.toLowerCase();
        int anzahl = 0;

        for (int i = 0; i < wort.length(); i++) {
            switch (wort.charAt(i)) {
                case 'a':
                case 'e':
                case 'i':
                case 'o':
                case 'u':
                    anzahl++;
                    break;
            }
        }
        System.out.printf("Das Wort %s enthält %d Vokale",eingabe, anzahl);
    }
}