package exercise7;

import java.util.Scanner;

public class SalesCalculator {
    static Scanner input = new Scanner(System.in);
    static double produkte[] = { 2.98, 4.50, 9.98, 4.50, 6.87 };

    public static void main(String[] args) {
        // Auswahl der Programmfunktion; endlos for Schleife für beliebig häufiges
        // wiederholen
        for (int x = 1; x > 0; x++) {
            System.out.println("Hauptmenü");
            System.out.println("1) Produktliste\n2) Umsatzberechnen\n3) Programm beenden");
            int funktion = input.nextInt();
            switch (funktion) {
                case 1:
                    Produktlist();
                    break;
                case 2:
                    Umsatzberechnen();
                    break;
                case 3:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Ungülitger Befehl");
                    break;
            }
        }
    }

    // Funktion zum Abrufen der einzelnen Produkte aus dem Produkt Array
    public static void Produktlist() {
        int beenden = 1;
        while (beenden != 0) {
            System.out.println("Produktliste");
            System.out.println("Zum Abrufen der Produkte geben sie die Produknummer ein (1-5) ");
            int produktnummer = input.nextInt();

            switch (produktnummer) {
                case 1:
                    System.out.printf("Produkt 1 kostet %f Euro%n", produkte[0]);
                    break;
                case 2:
                    System.out.printf("Produkt 1 kostet %f Euro%n", produkte[1]);
                    break;
                case 3:
                    System.out.printf("Produkt 1 kostet %f Euro%n", produkte[2]);
                    break;
                case 4:
                    System.out.printf("Produkt 1 kostet %f Euro%n", produkte[3]);
                    break;
                case 5:
                    System.out.printf("Produkt 1 kostet %f Euro%n", produkte[4]);
                    break;
                default:
                    System.out.println("Ungültige Produktnummer");
                    break;
            }
            System.out.println();
            System.out.println("Weitere Produkte abrufen: 1\nZum Hauptmenü: 0");
            beenden = input.nextInt();
            System.out.println("-".repeat(20));
        }
    }

    // Funktion zum berechnen des Umsatzes + Verkaufte Menge pro Produkt
    // Kontrolle per if Statment ob Produktnummer gültig ist
    public static void Umsatzberechnen() {
        int beenden = 1;
        double umsatz = 0;
        int produkt1 = 0;
        int produkt2 = 0;
        int produkt3 = 0;
        int produkt4 = 0;
        int produkt5 = 0;
        System.out.println("Umsatzrechner");
        while (beenden != 0) {
            System.out.println("Welches Produkt wollen sie zum Umsatz hinzufügen? ");
            int produkt = input.nextInt();
            if (produkt <= 5 && produkt > 0) {
                umsatz += produkte[produkt - 1];

                switch (produkt) {
                    case 1:
                        produkt1++;
                        break;
                    case 2:
                        produkt2++;
                        break;
                    case 3:
                        produkt3++;
                        break;
                    case 4:
                        produkt4++;
                        break;
                    case 5:
                        produkt5++;
                        break;
                }
            } else {
                System.out.println("Ungültige Produktnummer");
            }
            System.out.println();
            System.out.printf(
                    "Aktueller Umsatz: %f Euro%nVerkaufte Menge:%nProdukt 1: %d%nProdukt 2: %d%nProdukt 3: %d%nProdukt 4: %d%nProdukt 5: %d%n",
                    umsatz, produkt1, produkt2, produkt3, produkt4, produkt5);
            System.out.println();
            System.out.println("Zum Fortfahren: 1\nZum Hauptmenü: 0");
            beenden = input.nextInt();
            System.out.println("-".repeat(20));
        }
    }

}
