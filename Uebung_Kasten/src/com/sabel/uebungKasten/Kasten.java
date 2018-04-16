package com.sabel.uebungKasten;

import java.util.ArrayList;
import java.util.Iterator;

public class Kasten {
    private ArrayList<Flasche> flaschen;
    private int maxAnzahlFlaschen;

    public Kasten(int maxAnzahlFlaschen) {
        this.flaschen = new ArrayList<>();
        this.maxAnzahlFlaschen = maxAnzahlFlaschen;
    }

    public int getMaxAnzahlFlaschen() {
        return maxAnzahlFlaschen;
    }

    public int anzahlFlaschen() {
        return flaschen.size();
    }

    public boolean hinzufuegen(Flasche flasche) {
        // Ist noch Platz für eine weitere Flasche?
        if (anzahlFlaschen() < maxAnzahlFlaschen) {
            return flaschen.add(flasche);
        }
        return false;
    }

    public Flasche entnehmen(int index) {
        // ist der Index korrekt?
        if (index >= 0 && index < anzahlFlaschen()) {
            return flaschen.remove(index);
        }
        return null;
    }

    public String toString() {
        String str = "Kasten: \n";
        str += "aktuelle Flaschenanzahl: " + anzahlFlaschen() + "\n";
        str += "maximale Flaschenanzahl: " + maxAnzahlFlaschen + "\n";
        for (Flasche flasche : flaschen) {
            str += flasche.toString() + "\n";
        }
        return str;
    }

    public ArrayList<Flasche> liefereAlleFlaschenMitMaxFuellmengeGroesserAls(double fuellmenge) {
        ArrayList<Flasche> neueListe = new ArrayList<>();
        for (Flasche flasche : flaschen) {
            if (fuellmenge <= flasche.getMaximaleFuellmenge()) {
                neueListe.add(flasche);
                flaschen.remove(flasche);
            }
        }
        return neueListe;
    }

    public ArrayList<Flasche> entnehmeAlleFlaschenMit(String getraenk) {
        ArrayList<Flasche> entnommeneFlaschen = new ArrayList<>();
        Iterator<Flasche> iterator = flaschen.iterator();
        while (iterator.hasNext()) {
            Flasche flasche = iterator.next();
            if (flasche.getGetraenk().equals(getraenk)) {
                entnommeneFlaschen.add(flasche);
                iterator.remove();
            }
        }
        return entnommeneFlaschen;
    }
}
