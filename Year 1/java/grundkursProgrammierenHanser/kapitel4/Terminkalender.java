package grundkursProgrammierenHanser.kapitel4;

/*
* Grundkurs Progammieren in Java; S.138 Aufgabe 4.3
* Kalenderprogramm für die Jahre 2020 bis 2029
* Schaltjahre berücksichtigen
*/

import java.util.Scanner;

public class Terminkalender {
    public static void main(String[] args) {
        String[][][][] kalender = new String[10][12][][];
        int jahr, monat, tag, stunde, jahr1, hilf;
        jahr1 = 2022;
        for (jahr = 0; jahr < kalender.length; jahr++) {
            for (monat = 0; monat < kalender[jahr].length; monat++) {
                switch (monat) {
                    case 0:
                        kalender[jahr][monat] = new String[31][24];
                        break;
                    case 1:
                        if ((jahr1 % 4 != 0) || ((jahr1 % 100 == 0) && (jahr % 400 != 0))) {
                            kalender[jahr][monat] = new String[28][24];
                        } else {
                            kalender[jahr][monat] = new String[29][24];
                        }
                        break;
                    case 2:
                        kalender[jahr][monat] = new String[31][24];
                        break;
                    case 3:
                        kalender[jahr][monat] = new String[30][24];
                        break;
                    case 4:
                        kalender[jahr][monat] = new String[31][24];
                        break;
                    case 5:
                        kalender[jahr][monat] = new String[30][24];
                        break;
                    case 6:
                        kalender[jahr][monat] = new String[31][24];
                        break;
                    case 7:
                        kalender[jahr][monat] = new String[31][24];
                        break;
                    case 8:
                        kalender[jahr][monat] = new String[30][24];
                        break;
                    case 9:
                        kalender[jahr][monat] = new String[31][24];
                        break;
                    case 10:
                        kalender[jahr][monat] = new String[30][24];
                        break;
                    case 11:
                        kalender[jahr][monat] = new String[31][24];
                        break;
                }

                System.out.println(jahr1);
            }
            jahr1++;
        }
        for (jahr = 0; jahr < kalender.length; jahr++) {
            for (monat = 0; monat < kalender[jahr].length; monat++) {
                for (tag = 0; tag < kalender[jahr][monat].length; tag++) {
                    for (stunde = 0; stunde < kalender[jahr][monat][tag].length; stunde++) {
                        kalender[jahr][monat][tag][stunde] = "";
                    }
                }
            }
        }

        boolean ende = false;
        while (!ende) {
            Scanner in = new Scanner(System.in);
            System.out.println("1. Neuer Eintrag \n2. Termine ausgeben \n3. Programm beenden");
            int wahl = in.nextInt();
            switch (wahl) {
                case 1:
                    System.out.println("Welches Jahr (2020-2029)? ");
                    jahr = in.nextInt();
                    jahr -= 2020;
                    if (jahr < 0 || jahr > 9) {
                        System.out.println("Unzulässiges Jahr!");
                        break;
                    }
                    System.out.println("Welcher Monat? ");
                    monat = in.nextInt();
                    monat -= 1;
                    if (monat < 0 || monat > 11) {
                        System.out.println("Unzulässiger Monat!");
                        break;
                    }
                    hilf = kalender[jahr][monat].length;
                    System.out.println("Welcher Tag (1-" + hilf + ") ?");
                    tag = in.nextInt();
                    tag -= 1;
                    if (tag < 0 || tag > hilf - 1) {
                        System.out.println("Unzulässiger Tag!");
                        break;
                    }
                    System.out.println("Welche Stunde (0-23) ?");
                    stunde = in.nextInt();
                    if (stunde < 0 || stunde > 23) {
                        System.out.println("Unzulässige Stunde!");
                        break;
                    }
                    System.out.println("Geben sie ihren Termin ein: ");
                    kalender[jahr][monat][tag][stunde] = in.next();
                    System.out.println("=".repeat(20));
                    break;
                case 2:
                    System.out.println("Welches Jahr (2020-2029)? ");
                    jahr = in.nextInt();
                    jahr -= 2020;
                    if (jahr < 0 || jahr > 9) {
                        System.out.println("Unzulässiges Jahr!");
                        break;
                    }
                    System.out.println("Welcher Monat? ");
                    monat = in.nextInt();
                    monat -= 1;
                    if (monat < 0 || monat > 11) {
                        System.out.println("Unzulässiger Monat!");
                        break;
                    }
                    hilf = kalender[jahr][monat].length;
                    System.out.println("Welcher Tag (1-" + hilf + ") ?");
                    tag = in.nextInt();
                    tag -= 1;
                    if (tag < 0 || tag > hilf - 1) {
                        System.out.println("Unzulässiger Tag!");
                        break;
                    }
                    System.out.println("Welche Stunde (0-23) ?");
                    stunde = in.nextInt();
                    if (stunde < 0 || stunde > 23) {
                        System.out.println("Unzulässige Stunde!");
                        break;
                    }
                    System.out.println(stunde + " Uhr: " + kalender[jahr][monat][tag][stunde]);
                    System.out.println("=".repeat(20));
                    break;
                case 3:
                    ende = true;
                    break;
                default:
                    System.out.println("Unzulässiger Menüpunkt!");
                    System.out.println("=".repeat(20));
                    break;
            }
        }
    }
}
