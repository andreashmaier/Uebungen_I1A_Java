package com.sabel.uebung;

import java.util.ArrayList;

public class Testklasse {
    public static void main(String[] args) {
        Person person = new Person("Tom", 32);
//        System.out.println(person.getName());
//        System.out.println(person.getAlter());
//        person.druckeInfo();
//        System.out.println(person);
        Personenverwaltung personenverwaltung = new Personenverwaltung(3);
        System.out.println(personenverwaltung.anzahlPersonen()); // leere Liste => 0
        personenverwaltung.hinzufuegen(person); // Person "Tom" der Liste hinten hinzufügen
        personenverwaltung.hinzufuegen(new Person("Max", 37)); // anonymes Objekt, weil keine lokale Referenz exisitiert
        System.out.println(personenverwaltung.anzahlPersonen()); // 2 Personen hinzugefügt => 2
        Person geloeschtePerson = personenverwaltung.loeschePerson(1); // Referenz aus ArrayList löschen und in lokaler Variable sichern
        System.out.println(personenverwaltung.anzahlPersonen()); // 1
        System.out.println(geloeschtePerson);
        personenverwaltung.hinzufuegen(new Person("Tanja", 27));
        Person person1 = personenverwaltung.gibPerson(1);
        person1.setAlter(person1.getAlter() + 1); // Tanja hat Geburtstag
        personenverwaltung.gibPerson(1).setAlter(29); // Tanja hat erneut Geburtstag!
        System.out.println(personenverwaltung.gibPerson(1)); // Ausgabe der toString von Tanja
        System.out.println("Alle Personen in der Personenverwaltung:");
        personenverwaltung.allePersonenAnzeigen();
        System.out.println(personenverwaltung.anzahlPersonen());
        System.out.println(personenverwaltung);
        System.out.println(personenverwaltung.berechneDurchschnittsalter());
        // Aus Personenveraltung alle Personen die älter sind als 30
        System.out.println("Personen, die älter als 30 sind:");
        ArrayList<Person> personenAelterAls30 = personenverwaltung.gibPersonenAelterAls(30);
        for (Person person2 : personenAelterAls30) {
            System.out.println(person2);
        }

        vergleichenVonObjekten();

        Person gesuchtePerson = personenverwaltung.findePerson("Tanja");
        System.out.println("Gesuchte Person: " + gesuchtePerson);

    }

    public static void vergleichenVonObjekten() {
        // == vergleicht den Inhalt der beiden Variablen
        // Primitive Datentypen
        int zahl1 = 42;
        int zahl2 = 42;
        // primitive Datentypen => Wert liegt direkt in Speicherzelle => Wertevergleich
        if (zahl1 == zahl2) {
            System.out.println("Wert ist gleich");
        } else {
            System.out.println("Wert ist ungleich");
        }

       // Referentiellen Datentypen
        Person person1 = new Person("Andreas", 41);
        Person person2 = new Person("Andreas", 41);

        // Referenzvergleich
        if (person1 == person2) {
            System.out.println("Referenzvergleich: gleich");
        } else {
            System.out.println("Referenzvergleich: ungleich");
        }

        // Objektvergleich
        // Methode equals
        if (person1.equals(person2)) {
            System.out.println("Objektvergleich gleich");
        } else {
            System.out.println("Objektvergleich false");
        }

        String str1 = "Hallo";
        String str2 = new String("Hallo");

        if (str1 == str2) {
            System.out.println("Referenzvergleich: gleich");
        } else {
            System.out.println("Referenzvergleich: ungleich");
        }

        if (str1.equals(str2)) {
            System.out.println("Objektvergleich: gleich");
        } else {
            System.out.println("Objektvergleich: ungleich");
        }

    }
}
