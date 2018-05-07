package de.gbsschulen.dome2;

public class Testklasse {

    public static void main(String[] args) {

        Datenbank db = new Datenbank();

        db.erfasseMedium(new CD ("Help!", "Beatles", 80, 14));
        db.erfasseMedium(new CD ("Dire Straits", "Dire Straits", 42, 9));
        db.erfasseMedium(new DVD ("Das Leben des Brian", "Terry Jones", 90));
        db.erfasseMedium(new DVD ("Rocky", "John G.", 114));

    }
}
