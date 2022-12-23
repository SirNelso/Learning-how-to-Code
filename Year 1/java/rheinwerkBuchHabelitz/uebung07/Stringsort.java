package uebung07;

import javax.swing.JOptionPane;

//Stringketten lexikalisch sortieren
public class Stringsort {
    public static void main(String[] args) {
        var eingabe = JOptionPane.showInputDialog("Geben sie einen Text ein: ");
        String eingabe1 = eingabe;
        eingabe = JOptionPane.showInputDialog("Geben sie einen zweiten Text ein: ");
        String eingabe2 = eingabe;
        eingabe = JOptionPane.showInputDialog("Geben sie einen dritten Text ein: ");
        String eingabe3 = eingabe;

        if (eingabe1.compareTo(eingabe2) <= 0 && eingabe2.compareTo(eingabe3) <= 0) {
            System.out.println(eingabe1);
            System.out.println(eingabe2);
            System.out.println(eingabe3);
        } else if (eingabe1.compareTo(eingabe3) <= 0 && eingabe3.compareTo(eingabe2) <= 0) {
            System.out.println(eingabe1);
            System.out.println(eingabe3);
            System.out.println(eingabe2);
        } else if (eingabe2.compareTo(eingabe1) <= 0 && eingabe1.compareTo(eingabe3) <= 0) {
            System.out.println(eingabe2);
            System.out.println(eingabe1);
            System.out.println(eingabe3);
        } else if (eingabe2.compareTo(eingabe3) <= 0 && eingabe3.compareTo(eingabe1) <= 0) {
            System.out.println(eingabe2);
            System.out.println(eingabe3);
            System.out.println(eingabe1);
        } else if (eingabe3.compareTo(eingabe1) <= 0 && eingabe1.compareTo(eingabe2) <= 0) {
            System.out.println(eingabe3);
            System.out.println(eingabe1);
            System.out.println(eingabe2);
        } else if (eingabe3.compareTo(eingabe2) <= 0 && eingabe2.compareTo(eingabe1) <= 0) {
            System.out.println(eingabe3);
            System.out.println(eingabe2);
            System.out.println(eingabe1);
        }
    }
}
