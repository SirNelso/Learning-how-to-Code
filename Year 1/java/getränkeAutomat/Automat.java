package getränkeAutomat;

import javax.print.attribute.standard.JobHoldUntil;
import javax.swing.JOptionPane;

public class Automat {

    String[] getränk = { "Wasser", "Cola", "Fanta", "Sprite", "Bier" };
    double[] preis = { 1, 1.50, 1.50, 1.50, 2 };

    Automat(int option) {

        switch (option) {
            case 1:
                System.out.printf("Sie haben %s ausgewählt%n", getränk[option - 1]);
                Bezahlen(option);
                break;
            case 2:
                System.out.printf("Sie haben %s ausgewählt", getränk[option - 1]);
                Bezahlen(option);
                break;
            case 3:
                System.out.printf("Sie haben %s ausgewählt", getränk[option - 1]);
                Bezahlen(option);
                break;
            case 4:
                System.out.printf("Sie haben %s ausgewählt", getränk[option - 1]);
                Bezahlen(option);
                break;
            case 5:
                System.out.printf("Sie haben %s ausgewählt", getränk[option - 1]);
                Bezahlen(option);
                break;
            default:
                break;
        }
    }

    public void Bezahlen(int option) {
        double zuBezahlen = preis[option - 1];
        var eingabe = JOptionPane
                .showInputDialog("Aktuell kein Wechselgeld!\nAktzeptierte Münzen:\n10, 20 & 50 Cent\n1 & 2 Euro\nNoch zu bezahlen: " + zuBezahlen);
        double eingeworfen = Double.parseDouble(eingabe);
        double nochZuBezhalen = zuBezahlen - eingeworfen;

        while (nochZuBezhalen > 0) {
            eingabe = JOptionPane
                    .showInputDialog("Noch zu bezahlen: " + nochZuBezhalen + "\nWerfen sie weiter Münzen ein");
            eingeworfen = Double.parseDouble(eingabe);
            nochZuBezhalen -= eingeworfen;
        }
        JOptionPane.showMessageDialog(null, "Entnehmen sie bitte ihr Getränk");
    }
}