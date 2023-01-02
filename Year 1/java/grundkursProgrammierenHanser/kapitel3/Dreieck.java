package grundkursProgrammierenHanser.kapitel3;

import java.util.Scanner;

public class Dreieck {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Geben sie die Höhe des Dreiecks ein: ");
        int hoehe = in.nextInt();
        for(int i = 1; i <= hoehe; i++){
            System.out.println("*".repeat(i));
        }
    }
}
