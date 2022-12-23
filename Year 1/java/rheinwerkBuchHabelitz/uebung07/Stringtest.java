package uebung07;

public class Stringtest {
    public static void main(String[] args) {
        var a = "Das ist ";
        var b = "eine Zeichenkette!";
        var c = a.concat(b);
        System.out.println(c);
        System.out.println(c.length());
        if(a.equals(b)){
            System.out.println("true");
        }else {
            System.out.println("false");
        }
        System.out.println(a.compareTo(b));
        System.out.println(a.charAt(1));
    }

    
}
