package uebung03;

import javax.swing.JOptionPane;

public class Zahlentest {
    public static void main(String[] args) {
        var eingabe = JOptionPane.showInputDialog("Geben sie eine beliebige Zahl ein: ");
        var zahl = Double.parseDouble(eingabe);
        if (zahl < 0){
            JOptionPane.showMessageDialog(null,"Die Zahl ist negativ (" + zahl + ")");
        }
        else{
            JOptionPane.showMessageDialog(null,"Die Zahl ist positiv (" + zahl + ")");
        }
    }
    
}
