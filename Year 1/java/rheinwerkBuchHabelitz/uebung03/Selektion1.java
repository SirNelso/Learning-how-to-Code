package uebung03;

import javax.swing.JOptionPane;

public class Selektion1 {
    public static void main(String[] args) {
        var eingabe = JOptionPane.showInputDialog("Geben sie ihr Alter ein: ");
        var alter = Integer.parseInt(eingabe);
        if (alter < 18) {
            JOptionPane.showMessageDialog(null, "Sorry, noch nicht volljährig");
        } else {
            JOptionPane.showMessageDialog(null, "Glückwunsch, sie sind volljährig");
        }
    }
}
