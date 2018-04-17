package de.gbsschulen.de.gbsschulen;

import java.util.HashMap;

public class Telefonbuch {
    private HashMap<String, String> telefonbuch;

    public Telefonbuch() {
        this.telefonbuch = new HashMap<>();
    }

    public String nummerEintragen(String name, String nummer) {
        return telefonbuch.put(name, nummer);
    }

    public String nummerSuchen(String name) {
        return telefonbuch.get(name);
    }

    public static void main(String[] args) {
        Telefonbuch telefonbuch = new Telefonbuch();
        telefonbuch.nummerEintragen("Maier", "+4915115792824");
        String alteNummer = telefonbuch.nummerEintragen("Maier", "+4988034885782");
        telefonbuch.nummerEintragen("Janka", "+4917663366165");

        String nummer = telefonbuch.nummerSuchen("Maier");
        if (nummer != null) {
            System.out.println(nummer);
        }
    }
}
