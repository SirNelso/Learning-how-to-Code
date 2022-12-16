package uebung06;

public abstract class Vogel implements VogelgesangInterface {
    boolean kannFliegen;

    Vogel() {
        kannFliegen = true;
    }

    Vogel(boolean kf) {
        super();
        this.kannFliegen = kf;
    }

    public void singe(){
        System.out.println(melodie());
    }
}
