package de.gbsschulen.de.gbsschulen.de.gbsschulen;

import de.gbsschulen.de.gbsschulen.Buch;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Bibliothek {
    private HashMap<String, Buch> map;

    public Bibliothek() {
        this.map = new HashMap<>();
    }

    public Buch hinzufuegen(Buch b) {
        return this.map.put(b.getIsbn(), b);
    }

    public Buch suchen(String isbn) {
        return this.map.get(isbn);
    }

    public Buch suchen(Buch buch) {
        return suchen(buch.getIsbn());
    }

    @Override
    public String toString() {
        String result = "";
        Set<String> keys = map.keySet();
        for (String isbn : keys) {
            result += "ISBN: " + isbn + ", Titel: " + this.map.get(isbn).getTitel() + "\n";
        }
        return result;
    }
}
