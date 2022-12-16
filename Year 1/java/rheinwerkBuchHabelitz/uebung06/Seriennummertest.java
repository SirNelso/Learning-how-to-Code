package uebung06;

public class Seriennummertest {
    public static void main(String[] args) {
        var bruch = new BruchMitSeriennummer();
        bruch.ausgeben();
        System.out.println(bruch.getSeriennummer());
        var bruch2 = new BruchMitSeriennummer(2);
        bruch2.ausgeben();
        System.out.println(bruch2.getSeriennummer());
        var bruch3 = new BruchMitSeriennummer(4, 7);
        bruch3.ausgeben();
        System.out.println(bruch3.getSeriennummer());
    }
}
