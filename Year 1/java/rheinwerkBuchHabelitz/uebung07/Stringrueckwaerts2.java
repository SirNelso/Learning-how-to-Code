package uebung07;

import java.time.Duration;
import java.time.Instant;

import javax.swing.JOptionPane;

public class Stringrueckwaerts2 {
    public static void main(String[] args) {
        Instant start = Instant.now();
        var eingabe = JOptionPane.showInputDialog("Geben sie ein Wort ein: ");
        String ausgabe = "";
        for (int i = eingabe.length() - 1; i >= 0; i--) {
            ausgabe = ausgabe + eingabe.charAt(i);
        }
        Instant ende = Instant.now();
        Duration dauer = Duration.between(start, ende);
        JOptionPane.showMessageDialog(null, ausgabe + "\nDauer in Sekunden: " + dauer.toSeconds());
    }
}
