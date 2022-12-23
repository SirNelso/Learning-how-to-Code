package uebung07;

import java.time.Duration;
import java.time.Instant;

import javax.swing.JOptionPane;

public class Eingabetest {
    public static void main(String[] args) {
        String kontrolle = "Fischers Fritz fischt frische Fische";

        Instant start = Instant.now();
        var eingabe = JOptionPane
                .showInputDialog("Geben sie den folgenden Satz so schnell wie möglich ein: " + kontrolle);
        Instant ende = Instant.now();
        Duration dauer = Duration.between(start, ende);

        if (eingabe.equals(kontrolle)) {
            System.out.println("Fehlerfrei! Zeit: " + dauer.toMinutes() + " Minuten, " + dauer.toSeconds()
                    + " Sekunden und " + dauer.toMillis() + " Millisekunden");
        } else {
            System.out.println("Ihr Text hatte fehler\n" + eingabe);
        }
    }

}
