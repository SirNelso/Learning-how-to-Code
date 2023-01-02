package grundkursProgrammierenHanser.kapitel3;

import java.util.Scanner;

public class Quersumme {
    public static void main(String[] args) {
        int quersumme, x;
        quersumme = 0;
        Scanner in = new Scanner(System.in);
        System.out.println("Geben sie eine ganze Zahl ein: ");
        x = in.nextInt();
        int y = x;
        while (x != 0) {
            quersumme += x % 10;
            x = x / 10;
        }
        System.out.println("Positive ganze Zahl eingegeben: " + y);
        System.out.println("Die Quersumme ist: " + quersumme);
    }
}
