package de.gbsschulen;

public class Mannschaft {
    private String name;
    private Spieler[] aufstellung;

    public Mannschaft(String name) {
        this.name = name;
        this.aufstellung = new Spieler[11];
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Spieler aufstellen(Spieler spieler, int position) {
        if (position < 0 || position >= this.aufstellung.length) {
            System.out.println("Position " + position + " ist falsch.");
            return null;
        }
        Spieler ausgewechselterSpieler = this.aufstellung[position];
        this.aufstellung[position] = spieler;
        return ausgewechselterSpieler;
    }

    public void druckeAufstellung() {
        System.out.println(name);
        int i = 1;
        for (Spieler spieler : aufstellung) {
            if (spieler != null) {
                System.out.println(i + " " + spieler.getName());
            }
            i++;
        }
    }

    public void printAufstellung() {
        System.out.println(name);
        for (int i = 0; i < this.aufstellung.length; i++) {
            Spieler spieler = this.aufstellung[i];
            if (spieler != null) {
                System.out.println((i + 1) + " " + spieler.getName());
            }
        }
    }

    public int anzahlTore() {
        int anzahl = 0;
        for (Spieler spieler : aufstellung) {
            if (spieler != null) {
                anzahl += spieler.getAnzahlTore();
            }
        }
        return anzahl;
    }

    public Spieler gibTorschuetzenkoenig() {
        Spieler koenig = aufstellung[0];
        for (Spieler spieler : aufstellung) {
            if (spieler != null && spieler.getAnzahlTore() > koenig.getAnzahlTore()) {
                koenig = spieler;
            }
        }
        if (koenig.getAnzahlTore() == 0) {
            return null;
        }
        return koenig;
    }

    public Spieler gibTorschuetzenkoenigEder() {
        int max = 0;
        for (int i = 0; i < aufstellung.length; i++) {
            if (max < aufstellung[i].getAnzahlTore()) {
                max = aufstellung[i].getAnzahlTore();
            }
        }
        for (int i = 0; i < aufstellung.length; i++) {
            if (max == aufstellung[i].getAnzahlTore()) {
                return aufstellung[i];
            }
            if (max == 0) {
                return null;
            }
        }
        return null;
    }

    public Spieler gibTorschuetzenkoenigReithmayer() {
        Spieler koenig = null;
        int maxTore = 0;
        for (Spieler spieler : aufstellung) {
            if (spieler != null && spieler.getAnzahlTore() > maxTore) {
                maxTore = spieler.getAnzahlTore();
                koenig = spieler;
            }
        }
        return koenig;
    }

    @Override
    public String toString() {
        return name;
    }
}
