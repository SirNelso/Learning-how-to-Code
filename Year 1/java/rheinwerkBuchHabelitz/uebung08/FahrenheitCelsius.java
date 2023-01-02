package uebung08;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

public class FahrenheitCelsius {
    private JPanel contentPane;
    private JTextField tfFahrenheit;
    private JTextField tfCelsius;

    /**
     * Launch the application.
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    FahrenheitCelsius frame = new FahrenheitCelsius();
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    protected void setVisible(boolean b) {
    }

    /**
     * Create the frame.
     */
    public FahrenheitCelsius() {
        setTitle("Umrechnung Fahrenheit in Celsius");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 450, 250);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

        setContentPane(contentPane);
        contentPane.setLayout(null);

        JLabel lblFahrenheit = new JLabel("Grad Fahrenheit");
        lblFahrenheit.setBounds(10, 11, 157, 14);
        contentPane.add(lblFahrenheit);

        tfFahrenheit = new JTextField();
        tfFahrenheit.setBounds(10, 36, 200, 20);
        contentPane.add(tfFahrenheit);
        tfFahrenheit.setColumns(10);

        JLabel lblCelsius = new JLabel("Grad Celsius");
        lblCelsius.setBounds(10, 67, 157, 14);
        contentPane.add(lblCelsius);

        tfCelsius = new JTextField();
        tfCelsius.setEditable(false);
        tfCelsius.setBounds(10, 92, 200, 20);
        contentPane.add(tfCelsius);
        tfCelsius.setColumns(10);

        DecimalFormat f = new DecimalFormat("#0.00");

        JButton btnUmrechnen = new JButton("Umrechnen");
        btnUmrechnen.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                double fahrenheit = Double.parseDouble(tfFahrenheit.getText());
                double celsius = (fahrenheit - 32) * 5 / 9;
                tfCelsius.setText(f.format(celsius));
            }
        });
        btnUmrechnen.setBounds(250, 35, 109, 23);
        contentPane.add(btnUmrechnen);

        JButton btnEnde = new JButton("Ende");
        btnEnde.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
        btnEnde.setBounds(250, 91, 109, 23);
        contentPane.add(btnEnde);
    }

    private void setContentPane(JPanel contentPane2) {
    }

    private void setBounds(int i, int j, int k, int l) {
    }

    private void setDefaultCloseOperation(int exitOnClose) {
    }

    private void setTitle(String string) {
    }
}
