package uebung05;

public class Bruchtest1 {
    public static void main(String[] args) {
        System.out.println(Bruch.getAnzahlBrueche());
        Bruch b = new Bruch();
        b.zaehler = 3;
        b.nenner = 12;
        b.ausgeben();
        System.out.println("\nUnd nach dem Kürzen: ");
        b.gekuertausgeben();
        System.out.println(Bruch.getAnzahlBrueche());
        Bruch a = new Bruch(2, 6);
        a.ausgeben();
        System.out.println("\nUnd nach dem Kürzen: ");
        b.gekuertausgeben();
        System.out.println(Bruch.getAnzahlBrueche());

    }
}