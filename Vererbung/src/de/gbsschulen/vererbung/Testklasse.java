package de.gbsschulen.vererbung;

import java.util.ArrayList;

public class Testklasse {
    public static void main(String[] args) {
        Tier tier = new Tier("Hans", 55);
//        tier.fressen();
        Hund hund = new Hund("Bello", 42, false);
        hund.fressen();


        ArrayList<Tier> tiere = new ArrayList<>();
        tiere.add(tier);
        tiere.add(hund);

        for (Tier t : tiere) {
            t.fressen();
        }
    }
}
