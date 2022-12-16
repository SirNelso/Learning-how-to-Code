package uebung06;

public class Konto {
    private String kontonummer;
    private double kontostand;

    Konto() {
        kontonummer = "0";
        kontostand = 0;
    }

    Konto(String nummer, double stand) {
        kontonummer = nummer;
        kontostand = stand;
    }

    public double getKontostand() {
        return kontostand;
    }

    public String getKontonummer() {
        return kontonummer;
    }

    void einzahlen(double betrag) {
        this.kontostand += betrag;
    }

    void auszahlen(double betrag){
        this.kontostand -= betrag;
    }
}
