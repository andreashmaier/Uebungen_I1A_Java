package com.sabel.sa2;

import java.util.ArrayList;

public class Testklasse {
    public static void main(String[] args) {
        Schnitzel schnitzel = new Schnitzel("Schweine", 200);
        schnitzel.druckeInfo();
        Tupperdose tupperdose = new Tupperdose("blau", 3);
        Schnitzel schnitzel1 = new Schnitzel("Pute", 150);
        Schnitzel schnitzel2 = new Schnitzel("Hähnchen", 250);
        Schnitzel schnitzel3 = new Schnitzel("Kalbs", 100);

        tupperdose.hinzufuegen(schnitzel);
        schnitzel.braten();
        schnitzel.druckeInfo();
        schnitzel1.braten();
        schnitzel2.braten();
        schnitzel3.braten();
        tupperdose.hinzufuegen(schnitzel);
        tupperdose.hinzufuegen(schnitzel1);
        tupperdose.hinzufuegen(schnitzel2);
        System.out.println("Anzahl der Schnitzel: " + tupperdose.anzahlSchnitzel());
        tupperdose.hinzufuegen(schnitzel3);
        Schnitzel entnommenesSchnitzel = tupperdose.entnehmen(0);
        System.out.println("Anzahl der Schnitzel: " + tupperdose.anzahlSchnitzel());
        if (entnommenesSchnitzel != null) {
            System.out.println("Entnommenes Schnitzel:");
            entnommenesSchnitzel.druckeInfo();
        }


        ArrayList<Schnitzel> entnommeneSchnitzel = tupperdose.liefereAlleSchnitzelMitMehrAls(140);
        tupperdose.inhaltDrucken();


    }
}
