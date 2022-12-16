package uebung06;

public class BruchMitSeriennummer extends Bruch {
   static int anzahlBrueche = 0;
   private final int seriennummer;

    BruchMitSeriennummer(){
        anzahlBrueche++;
        seriennummer = anzahlBrueche;
    }
    BruchMitSeriennummer(int x){
        super(x);
        anzahlBrueche++;
        seriennummer = anzahlBrueche;
    }
    BruchMitSeriennummer(int x, int y){
        super(x, y);
        anzahlBrueche++;
        seriennummer = anzahlBrueche;
    }

    int getSeriennummer(){
        return seriennummer;
    }
    
}
