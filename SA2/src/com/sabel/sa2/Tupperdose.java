package com.sabel.sa2;

import java.util.ArrayList;

public class Tupperdose {

    private String farbe;
    private int maxAnzahlSchnitzel;
    private ArrayList<Schnitzel> schnitzels;

    public Tupperdose(String farbe, int maxAnzahlSchnitzel) {
        this.farbe = farbe;
        this.maxAnzahlSchnitzel = maxAnzahlSchnitzel;
        this.schnitzels = new ArrayList<>();
    }

    public int anzahlSchnitzel() {
        return schnitzels.size();
    }

    public boolean hinzufuegen(Schnitzel schnitzel) {
        if (!schnitzel.isGebraten()){
            System.out.println("Schnitzel ist nicht gebraten! Nur gebratene Schnitzel dürfen hinzugefügt werden!");
            return false;
        }
        if (anzahlSchnitzel() >= this.maxAnzahlSchnitzel){
            System.out.println("Kein Platz mehr vorhanden, Schnitzel wird nicht hinzugefügt!");
            return false;
        }

        return this.schnitzels.add(schnitzel);
    }

    public double berechneFuellmengeInProzent() {
        return (double) anzahlSchnitzel() / this.maxAnzahlSchnitzel * 100;
    }

    public Schnitzel entnehmen(int index) {
        if (index < 0 || index >= anzahlSchnitzel() ){
            System.out.println("Falscher Index!");
            return null;
        }

//        Schnitzel schnitzel = schnitzels.get(index);
        return schnitzels.remove(index);
//        return schnitzel;
    }

    public void inhaltDrucken() {
        System.out.println("Inhalt der Tupperdose mit Farbe " + this.farbe);
        for (Schnitzel schnitzel : schnitzels) {
            schnitzel.druckeInfo();
        }
        System.out.println("Dose zu " + berechneFuellmengeInProzent() + " % befüllt!");
    }

    public ArrayList<Schnitzel> liefereAlleSchnitzelMitMehrAls(double gewichtInGramm) {
        ArrayList<Schnitzel> liste = new ArrayList<>();
        for (Schnitzel schnitzel : schnitzels) {
            if (schnitzel.getGewichtInGramm() > gewichtInGramm) {
                liste.add(schnitzel);
                schnitzels.remove(schnitzel);
            }
        }
        return liste;
    }
}
