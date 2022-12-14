package uebung01;

/*Kreisberechnung: Für einen Kreis werden der Umfang und der Flächeninhalt berechnet.
 * Der Radius wird beim Programmstart als erster Paramter und die Einheit wird als zweiter Paramter übergeben.
 */
public class Kreisberechnung3 {
    public static void main(String[] args) {
        var einheit = args[1];
        var radius = Double.parseDouble(args[0]);
        var umfang = 2.0 * 3.1415926 * radius;
        var flaeche = 3.1415926 * radius * radius;
        System.out.print("Umfang: ");
        System.out.print(umfang);
        System.out.println(" " + einheit);
        System.out.print("Fläche: ");
        System.out.print(flaeche);
        System.out.println(" " + einheit + '\u00b2');
    }
}
