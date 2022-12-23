package uebung07;

import javax.swing.JOptionPane;

public class Wrappertest {
    public static void main(String[] args) {
        var eingabe = JOptionPane.showInputDialog("Geben sie eine ganze Zahl ein: ");
        Integer i = Integer.valueOf(eingabe);
        System.out.println("Eingegebene Zahl: " + i);
        System.out.println("als Dualzahl: " + Integer.toBinaryString(i));
        System.out.println("als Oktalzahl: " + Integer.toOctalString(i));
        System.out.println("als Hexzahl: " + Integer.toHexString(i));
        System.out.println("Obergrenze von int: " + Integer.MAX_VALUE);
        System.out.println("Untergrenze von int: " + Integer.MIN_VALUE);

        eingabe = JOptionPane.showInputDialog("Geben sie eine Kommazahl ein: ");
        double d = Double.parseDouble(eingabe);
        System.out.println(i + "/" + d + "=" + (i / d));
        System.out.println(i.intValue() + "/" + d + "=" + (i.intValue() / d)); // unnötig kompliziert
        Double wd = new Double(0.0); // wird nicht mehr verwendet
        System.out.println(d + "/" + wd + "=" + d / wd);
        Double wd2 = 2.5;
        System.out.println(-wd2 + "/" + 0 + "=" + -wd2 / 0);
        System.out.println(0.0 + "/" + 0.0 + "=" + 0.0 / 0.0);
    }
}
