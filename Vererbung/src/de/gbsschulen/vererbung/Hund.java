package de.gbsschulen.vererbung;

public class Hund extends Tier {

    private boolean istBissig;

    public Hund(String name, int alter, boolean istBissig) {
        super(name, alter);
        this.istBissig = istBissig;
    }

    public boolean istBissig() {
        return istBissig;
    }

    public void setIstBissig(boolean istBissig) {
        this.istBissig = istBissig;
    }

    @Override
    public void fressen() {
//        super.fressen();
        System.out.println("Der Hund frisst!");
    }
}
