package uebung01;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

/*Beispiel mit Programmfenster */

public class GrussMitProgrammfenster extends JFrame {
    public GrussMitProgrammfenster() {
        super("Hallo");

        var icon = new ImageIcon("JavaMaskotchen.png");
        var label1 = new JLabel("Viel Erfolg beim", JLabel.CENTER);
        var label2 = new JLabel("Programmieren mit Java!", JLabel.CENTER);
        var label3 = new JLabel(icon);
        var schrift = new Font("SansSerif", Font.BOLD, 24);
        label1.setFont(schrift);
        label1.setForeground(Color.red);
        label2.setFont(schrift);
        label2.setForeground(Color.red);
        var c = getContentPane();
        c.setLayout(new FlowLayout());
        c.setBackground(Color.white);
        c.add(label1);
        c.add(label2);
        c.add(label3);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(300, 250);
        setVisible(true);
    }

    public static void main(String[] args) {
        new GrussMitProgrammfenster();
    }

}
