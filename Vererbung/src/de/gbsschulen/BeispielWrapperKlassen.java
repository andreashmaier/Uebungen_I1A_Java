package de.gbsschulen;

import java.util.ArrayList;

public class BeispielWrapperKlassen {

    public static void main(String[] args) {
        ArrayList<Number> numbers = new ArrayList<>();
        numbers.add(new Integer(1)); // explizietes Anlegen eins Integer-Objekts
        numbers.add(Double.valueOf(2.0)); // Klassenmethode zur Erzeugung Integer-Objekt
        //numbers.add(Math.PI); // Klassenkonstante, AutoBoxing
        //numbers.add(Double.valueOf(Math.E));

        for (Number number : numbers) {
            System.out.println(number.toString());
        }

        Integer i = 42;
        i.toString();
        System.out.println(Integer.toHexString(13));
    }
}
