package de.gbsschulen;

import java.util.Objects;

public class Spieler {

    private String name;
    private int anzahlTore;
    private String spielposition;

    public Spieler(String name, String spielposition) {
        this.name = name;
        this.spielposition = spielposition;
        this.anzahlTore = 0;
    }

    public String getName() {
        return name;
    }

    public int getAnzahlTore() {
        return anzahlTore;
    }

    public String getSpielposition() {
        return spielposition;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSpielposition(String spielposition) {
        this.spielposition = spielposition;
    }

    public void torGeschossen() {
        this.anzahlTore++;
    }

    public void druckeInfo() {
        System.out.println("Name: " + name + ", Spielposition: " + spielposition + ", Anzahl Tore: " + anzahlTore);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Spieler spieler = (Spieler) o;
        return anzahlTore == spieler.anzahlTore &&
                Objects.equals(name, spieler.name) &&
                Objects.equals(spielposition, spieler.spielposition);
    }

    @Override
    public int hashCode() {

        return Objects.hash(name, anzahlTore, spielposition);
    }
}
