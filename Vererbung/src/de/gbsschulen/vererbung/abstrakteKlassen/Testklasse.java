package de.gbsschulen.vererbung.abstrakteKlassen;

public class Testklasse {

    public static void main(String[] args) {
        Zeit zeit = new Tage(2);
        System.out.println("Anzahl der Sekunden: " + zeit.getSekunden());

        zeit = new StundenMinuten(3, 0);
        System.out.println("Anzahl der Sekunden: " + zeit.getSekunden());

    }
}
