package uebung06;

public class Kontotest {
    public static void main(String[] args) {
        Konto konto = new Konto("0000000001", 1000);
        System.out.println("Ihre Kontonummer: " + konto.getKontonummer());
        System.out.println("Ihr Kontostand: " + konto.getKontostand());
        konto.einzahlen(500);
        System.out.println("Neuer Kontostand: " + konto.getKontostand());
        konto.auszahlen(750);
        System.out.println("Neuer Kontostand: " + konto.getKontostand());
    }
}
