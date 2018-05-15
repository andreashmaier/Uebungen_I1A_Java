package de.gbsschulen.vererbung;

import java.util.Objects;

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

    @Override
    public String toString() {
        String istBissig = "ja";
        if (!this.istBissig) {
            istBissig = "nein";
        }
        return super.toString() + ", Bissig: " + istBissig;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Hund hund = (Hund) o;
        return istBissig == hund.istBissig;
    }

    @Override
    public int hashCode() {

        return Objects.hash(super.hashCode(), istBissig);
    }
}
