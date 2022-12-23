package rockPaperScissors;

import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        
        int spielmodus;
        Scanner input = new Scanner(System.in);


        for (int i = 1; i > 0; i++) {
            System.out.println("Willkommen beim Schere-Stein-Papier-Simulator");
            System.out.println(
                    "Wählen Sie den Spielmodus aus:\n1) Best of 3\n2) Best of 5\n3) Freies Spiel\n0) Spiel beenden");
            spielmodus = input.nextInt();
            if (spielmodus == 1) {
                BestOfThree spielmodusBestOfThree = new BestOfThree();
                spielmodusBestOfThree.bof3();
            } else if (spielmodus == 2) {
                BestOfFive spielmodusBestOfFive = new BestOfFive();
                spielmodusBestOfFive.bof5();

            } else if (spielmodus == 3) {
                endless spielmodusEndless = new endless();
                spielmodusEndless.freiesSpiel();
            } else if (spielmodus == 0) {
                // i = -1;
                break;
                // System.exit(0);
            } else {
                System.out.println(
                        "Wählen Sie den Spielmodus aus:\n1) Best of 3\n2) Best of 5\n3) Freies Spiel\n0) Spiel beenden");
            }
            System.out.println();
        }
        
    }
    
}
