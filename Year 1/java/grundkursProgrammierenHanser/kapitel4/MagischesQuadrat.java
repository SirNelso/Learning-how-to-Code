package grundkursProgrammierenHanser.kapitel4;

import java.util.Scanner;

import javax.management.openmbean.KeyAlreadyExistsException;

/*
 * Grundkurs Programmieren in Java, S.138 Aufgabe 4.5
 * nxn Quadrat, Summe der Zahlen in der Spalte, Zeile und Diagonale sind identlisch
 */

public class MagischesQuadrat {
    public static void main(String[] args) {
        int n, zeile, spalte, i;
        boolean ende = false;
        Scanner in = new Scanner(System.in);
        while (!ende) {
            System.out.println("Geben sie eine ungerade Zahl zwischen 1-10 ein: ");
            n = in.nextInt();
            if (n > 2 && n < 10 && n % 2 != 0) {
                int[][] quadrat = new int[n][n];
                zeile = (int) n / 2;
                spalte = (int) n / 2 + 1;
                i = 1;
                while (i <= n * n) {
                    quadrat[zeile][spalte] = i;
                    spalte++;
                    zeile--;
                    if(zeile < 0){
                        zeile = n - 1;
                    }
                    if(spalte == n){
                        spalte = 0;
                    }
                    if(quadrat[zeile][spalte] != 0){
                        zeile++;
                        spalte++;
                        if(zeile == n){
                            zeile = 0;
                        }
                        if(spalte == n){
                            spalte = 0;
                        }
                    }
                    i++;
                }
                for(int j = 0; j < quadrat.length; j++){
                    for(int y = 0; y < quadrat[j].length; y++){
                        if(quadrat[j][y] < 10){
                            System.out.print(" " + quadrat[j][y] + " ");
                        }else{
                            System.out.print(quadrat[j][y] + " ");
                        }
                    }
                    System.out.println();
                }
                ende = true;
            } else {
                System.out.println("Ungültige Zahl! Geben sie eine neue Zahl ein");
            }
        }
    }
}
