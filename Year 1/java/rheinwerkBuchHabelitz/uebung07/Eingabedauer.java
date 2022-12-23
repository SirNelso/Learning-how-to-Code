package uebung07;

import java.time.Duration;
import java.time.Instant;

import javax.swing.JOptionPane;

public class Eingabedauer {
    public static void main(String[] args) {
        Instant startEingabeAufforderung = Instant.now();
        JOptionPane.showInputDialog("Geben sie ihren Namen ein: ");
        Instant endeDerEingabe = Instant.now();
        Duration dauer = Duration.between(startEingabeAufforderung, endeDerEingabe);
        System.out.println("Dauer nach ISO-8601: " + dauer);
        System.out.println("Dauer in Minuten: " + dauer.toMinutes());
        System.out.println("Dauer in Sekunden: " + dauer.toSeconds());
        System.out.println("Dauer in Millisekunden: " + dauer.toMillis());

    }
}
