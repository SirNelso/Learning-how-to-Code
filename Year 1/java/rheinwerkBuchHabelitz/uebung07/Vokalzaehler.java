package uebung07;

import javax.swing.JOptionPane;

public class Vokalzaehler {
    public static void main(String[] args) {
        var eingabe = JOptionPane.showInputDialog("Geben sie ein Wort ein: ");
        int anzahl = 0;
        // char[] chars = {'a', 'e', 'i', 'o', 'u'};
        for (int i = 0; i < eingabe.length(); i++) {
            switch (eingabe.charAt(i)) {
                case 'a':
                case 'e':
                case 'i':
                case 'o':
                case 'u':
                    anzahl++;
                    break;
            }
            // if(eingabe.contains((chars[i] + "").toLowerCase())){ 
            //     anzahl++;
            // }
            // Google lösung

        }
        System.out.println("Das Wort enthält " + anzahl + " Vokale");
    }
}
