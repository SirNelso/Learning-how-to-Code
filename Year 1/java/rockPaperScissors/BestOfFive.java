package rockPaperScissors;

import java.util.Random;
import java.util.Scanner;

public class BestOfFive {

    public void bof5() {
        Scanner input = new Scanner(System.in);
        Random rn = new Random();

        int spieler, pc, spielerWahl, pcWahl, schere, stein, papier;
        schere = 1;
        stein = 2;
        papier = 3;
        spieler = 0;
        pc = 0;
        String[] ssp = { "", "Schere", "Stein", "Papier" };
        do {
            System.out.println("------------------------------------------------");
            System.out.println();
            System.out.println("Wählen sie aus\n1) Schere\n2) Stein\n3) Papier");
            spielerWahl = input.nextInt();
            pcWahl = rn.nextInt(3) + 1;

            if (spielerWahl == 1) {
                if (spielerWahl == pcWahl) {
                    System.out.println("Unentschieden");
                } else if (pcWahl == stein) {
                    System.out.println("Sie haben verloren");
                    System.out.println(ssp[pcWahl] + " schlägt " + ssp[spielerWahl]);
                    pc++;
                } else {
                    System.out.println("Sie haben gewonnen");
                    System.out.println(ssp[spielerWahl] + " schlägt " + ssp[pcWahl]);
                    spieler++;
                }
            }

            if (spielerWahl == 2) {
                if (spielerWahl == pcWahl) {
                    System.out.println("Unentschieden");
                } else if (pcWahl == papier) {
                    System.out.println("Sie haben verloren");
                    System.out.println(ssp[pcWahl] + " schlägt " + ssp[spielerWahl]);
                    pc++;
                } else {
                    System.out.println("Sie haben gewonnen");
                    System.out.println(ssp[spielerWahl] + " schlägt " + ssp[pcWahl]);
                    spieler++;
                }

            }
            if (spielerWahl == 3) {
                if (spielerWahl == pcWahl) {
                    System.out.println("Unentschieden");
                } else if (pcWahl == schere) {
                    System.out.println("Sie haben verloren");
                    System.out.println(ssp[pcWahl] + " schlägt " + ssp[spielerWahl]);
                    pc++;
                } else {
                    System.out.println("Sie haben gewonnen");
                    System.out.println(ssp[spielerWahl] + " schlägt " + ssp[pcWahl]);
                    spieler++;
                }
            }

            System.out.println();
        } while (spieler < 3 && pc < 3);
        if (spieler > pc) {
            System.out.println("Der Spieler hat gewonnen");
            System.out.println("Deine Punkte: " + spieler + "\nPunkte PC: " + pc);
            System.out.println("------------------------------------------------");
        } else if (pc > spieler) {
            System.out.println("Der PC hat gewonnen");
            System.out.println("Deine Punkte: " + spieler + "\nPunkte PC: " + pc);
            System.out.println("------------------------------------------------");
            System.out.println(ssp[pcWahl] + " schlägt " + ssp[spielerWahl]);

        }
        input.close();
    }

}
