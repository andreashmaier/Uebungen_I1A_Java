package de.gbsschulen;

public class Testklasse {
    public static void main(String[] args) {
        Mannschaft mannschaft = new Mannschaft("FC Bayern München");
        Spieler spieler = new Spieler("Ulreich", "Torwart");
        mannschaft.aufstellen(spieler, 0);
        mannschaft.druckeAufstellung();
        Spieler spieler1 = new Spieler("Müller", "Stürmer");
        mannschaft.aufstellen(spieler1, 10);
        for (int i = 0; i < 5; i++) {
            spieler1.torGeschossen();
        }

        Spieler spieler2 = new Spieler("Lewandowski", "Stürmer");
        mannschaft.aufstellen(spieler2, 9);
        for (int i = 0; i < 3; i++) {
            spieler2.torGeschossen();
        }

        System.out.println(mannschaft.anzahlTore());

        Spieler spieler3 = new Spieler("Robben", "Mittelfeld");
        Spieler ausgewechselterSpieler = mannschaft.aufstellen(spieler3, 10);
        if (ausgewechselterSpieler != null) {
            System.out.println("ausgewechselt wurde: " + ausgewechselterSpieler.getName());
        }

        Spielplan spielplan = new Spielplan();
        spielplan.anmelden(mannschaft);
        spielplan.druckeGemeldeteMannschaften();
    }
}
