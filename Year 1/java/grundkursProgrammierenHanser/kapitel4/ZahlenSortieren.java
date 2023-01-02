package grundkursProgrammierenHanser.kapitel4;

/*
 * Grundkurs Programmieren in Java; S.138 Aufgabe 4.4
 * Algorithmus zum sortieren von int Array 
 * beliebige Größe des Arrays
 */

import java.util.Arrays;
import java.util.Scanner;

public class ZahlenSortieren {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Wie viele Zahlen möchten sie sortieren: ");
        int n = in.nextInt();
        int[] sortieren = new int[n];
        for(int i = 0; i < sortieren.length; i++){
            System.out.println("Geben sie eine ganze Zahl ein: ");
            sortieren[i] = in.nextInt();
        }
       Arrays.sort(sortieren);
        System.out.println("Ihre Zahlen sortiert: ");
        for(int i = 0; i < sortieren.length; i++){
            System.out.print(sortieren[i] + " ");
        }
    }
}
