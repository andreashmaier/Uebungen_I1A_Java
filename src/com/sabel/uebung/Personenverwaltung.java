package com.sabel.uebung;

import java.util.ArrayList;

public class Personenverwaltung {
    private ArrayList<Person> personen;
    private int maxAnzahlPersonen;

    private Personenverwaltung() {
        this.personen = new ArrayList<>();
    }

    public Personenverwaltung(int maxAnzahlPersonen) {
        this();
        this.maxAnzahlPersonen = maxAnzahlPersonen;
    }

    public int anzahlPersonen() {
        return personen.size();
    }

    public boolean hinzufuegen(Person person) {
        if (anzahlPersonen() < maxAnzahlPersonen) {
            return personen.add(person);
        }
        return false;
    }

    public Person loeschePerson(int index) {
        // Prüfung auf Ungültigkeit
        if (index < 0 || index >= anzahlPersonen()) {
            System.out.println("Falscher Index");
            return null;
        }
//        Person zuloeschendePerson = personen.get(index);
        return personen.remove(index);
//        return zuloeschendePerson;
    }

    public Person gibPerson(int index) {
        // Prüfung auf Gültigkeit:
        if (index >= 0 && index < anzahlPersonen()) {
            return personen.get(index);
        }
        return null;
    }

    public void allePersonenAnzeigen() {
        // for-each
        for (Person person : personen) {
            System.out.println(person);
        }
    }

    @Override
    public String toString() {
        String result = "Personenverwaltung: Maximale Anzahl Personen: " + maxAnzahlPersonen;
        result += "\nAktuelle Personenanzahl: " + anzahlPersonen();
        result += "\nFolgende Personen sind enthalten:";
        for (Person person : personen) {
            result += "\n" + person.toString();
        }
        return result;
    }

    public double berechneDurchschnittsalter() {
        int summe = 0;
        for (Person person : personen) {
            summe += person.getAlter();
        }
        return (double) summe / anzahlPersonen();
    }

    public ArrayList<Person> gibPersonenAelterAls(int alter) {
        ArrayList<Person> personenAelterAls = new ArrayList<>();
        for (Person person : personen) {
            if (person.getAlter() > alter) {
                personenAelterAls.add(person);
            }
        }
        return personenAelterAls;
    }

    public Person findePerson(String name) {
        for (Person person : personen) {
            if (person.getName().equals(name)) {
                return person;
            }
        }
        return null;
    }
}
