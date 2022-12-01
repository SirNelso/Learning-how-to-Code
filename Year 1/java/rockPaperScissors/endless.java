package rockPaperScissors;

import java.util.Random;
import java.util.Scanner;

public class endless {

    public void freiesSpiel() {
        Scanner scan = new Scanner(System.in);
        Random rn = new Random();
        int schere = 1;
        int papier = 2;
        int stein = 3;
        int spieler = 0;
        int pc = 0;
        int start;
        String[] ssp = { "", "Schere", "Stein", "Papier" };
        System.out.println();
        System.out.println("1) Spiel starten\n2) Spiel beenden");
        start = scan.nextInt();

        for (int u = 1; u > 0; u++) {
            if (start == 1) {
                System.out.println();
                System.out.println("Wähle aus \n 1)Schere \n 2)Papier \n 3)Stein");
                int spielerwahl = scan.nextInt();
                int pcwahl = rn.nextInt(3) + 1;

                if (spielerwahl == schere) {
                    if (spielerwahl == pcwahl) {
                        System.out.println("Unentschieden");
                    } else if (pcwahl == stein) {
                        System.out.println("Sie haben verloren");
                        System.out.println(ssp[pcwahl] + " schlägt " + ssp[spielerwahl]);
                        pc++;
                    } else {
                        System.out.println("Sie haben gewonnen");
                        System.out.println(ssp[spielerwahl] + " schlägt " + ssp[pcwahl]);
                        spieler++;
                    }
                }
                if (spielerwahl == papier) {
                    if (spielerwahl == pcwahl) {
                        System.out.println("Unentschieden");
                    } else if (pcwahl == schere) {
                        System.out.println("Sie haben verloren");
                        System.out.println(ssp[pcwahl] + " schlägt " + ssp[spielerwahl]);
                        pc++;
                    } else {
                        System.out.println("Sie haben gewonnen");
                        System.out.println(ssp[spielerwahl] + " schlägt " + ssp[pcwahl]);
                        spieler++;
                    }
                }
                if (spielerwahl == stein) {
                    if (spielerwahl == pcwahl) {
                        System.out.println("Unentschieden");
                    } else if (pcwahl == papier) {
                        System.out.println("Sie haben verloren");
                        System.out.println(ssp[pcwahl] + " schlägt " + ssp[spielerwahl]);
                        pc++;
                    } else {
                        System.out.println("Sie haben gewonnen");
                        System.out.println(ssp[spielerwahl] + " schlägt " + ssp[pcwahl]);
                        spieler++;
                    }
                }

                System.out.println("Spielstand: " + spieler + " zu " + pc);
                System.out.println();
            }

            else if (start == 2) {
                return;
            } else {
                System.out.println("1) Spiel starten\n2) Spiel beenden");
            }
            System.out.println("------------------------------------------------");
            System.out.println("1) Neues Spiel\n2) Spiel beenden");
            start = scan.nextInt();
        }
    }
}
