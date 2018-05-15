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

        System.out.println(tier);
        System.out.println(hund.toString());

        Tier tier1 = new Tier("Hans", 55);

        // Referenzvergleich:
        if (tier == tier1) {
            System.out.println("Refernzvergleich: true");
        } else {
            System.out.println("Referenzvergleich: false");
        }

        // Objektvergleich
        if (tier.equals(tier1)) {
            System.out.println("Objektvergleich true");
        } else {
            System.out.println("Objektvergleich false");
        }
    }
}
