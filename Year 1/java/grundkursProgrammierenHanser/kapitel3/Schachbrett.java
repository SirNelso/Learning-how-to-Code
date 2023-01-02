package grundkursProgrammierenHanser.kapitel3;

public class Schachbrett {
    public static void main(String[] args) {
        for(int i = 1; i <= 8; i++){
            System.out.print(i + " ");
            for(int y = i + 1; y <= i + 7; y++){
                if(y < 10 && y != i){
                    System.out.print(" " + y + " ");
                }else{
                    System.out.print(y + " ");
                }
            }
            System.out.println();
        }
    }
}
