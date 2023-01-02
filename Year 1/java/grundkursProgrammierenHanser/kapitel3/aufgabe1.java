package grundkursProgrammierenHanser.kapitel3;

import java.util.Scanner;

public class aufgabe1 {
    public static void main(String[] args) {
        /*
         * Algorithmus:
         * 1.Lies den Wert von n ein
         * Setze i auf 3
         * Solange i < 2n, wiederhole: erhöhe i um 1; gib 1 / 2i + 1 aus
         * in einer while, for und do-while Schleife
         */

        int n;
        Scanner in = new Scanner(System.in);
        System.out.println("Geben sie eine ganze Zahl ein: ");
        n = in.nextInt();

        // while Schleife
        int i = 3;
        while (i < 2 * n) {
            i++;
            System.out.println(1.0 / (2 * i + 1));
        }

        // for Schleife

        for (int y = 3; y < 2 * n; y++) {
            System.out.println(1.0 / (2 * i + 1));
        }

        // do-while Schleife

        do {
            System.out.println(1.0 / (2 * i + 1));
            i++;
        } while (i < 2 * n);

    }
}
