package getränkeAutomat;

import javax.swing.JOptionPane;

public class AutomatenEingabe {
    public static void main(String[] args) {

        int getränkeWahl;
        var eingabe = JOptionPane
                .showInputDialog("1) Wasser\n2) Cola\n3) Fanta\n4) Sprite\n5) Bier\nWählen sie ihr Getränk aus");
        getränkeWahl = Integer.parseInt(eingabe);

        Automat auto = new Automat(getränkeWahl);
        
    }
}
