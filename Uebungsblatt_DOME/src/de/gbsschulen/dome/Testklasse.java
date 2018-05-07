package de.gbsschulen.dome;

import java.util.HashMap;
import java.util.Map;

public class Testklasse {
    public static void main(String[] args) {
        String s = "Hallo Welt!";
        System.out.printf("%100s%5d%n", s, 47);
        System.out.println("Hallo");

        CD cd1 = new CD("Help!","The Beatles",14,80);
        CD cd2 = new CD("Dire Straits","Dire Straits",9,42);
        DVD dvd1 = new DVD("Das Leben des Brain", "Terry Jones",90);
        DVD dvd2 = new DVD("Rocky", "John G. Avildsen",114);
        Datenbank db = new Datenbank();
        db.erfasseCD(cd1);
        db.erfasseCD(cd2);
        db.erfasseDVD(dvd1);
        db.erfasseDVD(dvd2);
        db.auflisten();

    }


}
