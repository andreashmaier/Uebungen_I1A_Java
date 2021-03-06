package de.gbsschulen.technischerKundendienst;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;

/**
 * Die Klasse de.gbsschulen.technischerKundendienst.Beantworter beschreibt Exemplare, die
 * automatische Antworten generieren.
 *
 * @author Michael Kolling and David J. Barnes
 * @version 0.2 (2018-04-16)
 */
public class Beantworter {

    private Random random;
    private ArrayList<String> standardAntworten;
    private HashMap<String, String> antworten;

    /**
     * Erzeuge einen de.gbsschulen.technischerKundendienst.Beantworter -
     * Datenfelder werden initialisiert, Standardantworten werden erzeugt
     */
    public Beantworter() {
        this.random = new Random();
        this.standardAntworten = new ArrayList<>();
        this.standardAntwortenBefuellen();
        this.antworten = new HashMap<>();
        this.antwortMapBefuellen();
    }

    private void antwortMapBefuellen() {
        this.antworten.put("linux", "Linux ist ein quelloffenes Betriebssystem. Bei Problemen wenden Sie sich bitte an Linux Tolvards");
        this.antworten.put("windows", "Windows ist ein Betriebssystem der Firma Microsoft. Dafür können wir leider keinen Support liefern");
        this.antworten.put("mac os", "Fragen Sie Steve Jobs!");
    }

    private void standardAntwortenBefuellen() {
        this.standardAntworten.add("Das klingt seltsam. Können Sie das Problem genauer beschreiben?");
        this.standardAntworten.add("Bisher hat sich noch kein Kunde darüber beschwert.\nWelche Systemkonfiguration haben Sie?");
        this.standardAntworten.add("Können Sie es bitte anders erklären?");
        this.standardAntworten.add("Das klingt interessant, erzählen Sie mehr!");
    }

    public void standardAntwortHinzufuegen(String standardantwort) {
        this.standardAntworten.add(standardantwort);
    }

    /**
     * Erzeuge eine Antwort.
     *
     * @return Einen String, der die Antwort enthält.
     */
    public String generiereAntwort(String eingabe) {
        String antwort = this.antworten.get(eingabe);
        if (antwort != null) {
            return antwort;
        }
        return this.standardAntworten.get(random.nextInt(standardAntworten.size()));
    }
}
