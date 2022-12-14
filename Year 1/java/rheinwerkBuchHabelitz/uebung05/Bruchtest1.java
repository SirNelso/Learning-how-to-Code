package uebung05;

public class Bruchtest1 {
    public static void main(String[] args) {
        Bruch b = new Bruch();
        b.zaehler = 3;
        b.nenner = 12;
        b.erweitern(4);
        b.ausgeben();
        System.out.println("\nUnd nach dem Kürzen: ");
        b.gekuertausgeben();
        double dezimalZahl = b.dezimalwert();
        System.out.println(dezimalZahl);

    }
}