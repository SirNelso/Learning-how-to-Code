package uebung07;

import javax.swing.JOptionPane;

public class Vokalloescher {
    public static void main(String[] args) {
        var eingabe = JOptionPane.showInputDialog("Geben sie einen Text ein: ");
        String s = eingabe;
        StringBuilder loeschen = new StringBuilder("");
        for (int i = 0; i < s.length(); i++) {
            switch (s.charAt(i)) {
                case 'a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U':
                    break;
                default:
                    loeschen.append(s.charAt(i));
            }
        }
        JOptionPane.showMessageDialog(null, "Text ohne Vokale: " + loeschen);
    }
}
