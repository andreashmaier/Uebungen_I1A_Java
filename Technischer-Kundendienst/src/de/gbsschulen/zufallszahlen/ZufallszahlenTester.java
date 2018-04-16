package de.gbsschulen.zufallszahlen;

import java.util.ArrayList;
import java.util.Random;

public class ZufallszahlenTester {

    private Random generator;
    private ArrayList<String> antworten;

    public ZufallszahlenTester() {
        this.generator = new Random();
        this.antworten = new ArrayList<>();
        this.antworten.add("Ja");
        this.antworten.add("Nein");
        this.antworten.add("Vieleicht");
    }

    public void eineZufallszahlAusgeben() {
        System.out.println(generator.nextInt());
    }

    public void zufallszahlenAusgeben(int anzahl) {
        for (int i = 0; i < anzahl; i++) {
            eineZufallszahlAusgeben();
        }
    }

    /**
     * @return liefert eine Zufallszahl zwischen 1 und einschließlich 6 zurück
     */
    public int wuerfeln() {
        return generator.nextInt(6) + 1;
    }

    public String gibAntwort() {
        return antworten.get(generator.nextInt(antworten.size()));
    }

    public int liefereEineZufallszahl(int max) {
        return liefereEineZufallszahl(1, max);
    }

    public int liefereEineZufallszahl(int min, int max) {
        return generator.nextInt(max - min + 1) + min;
    }

    public static void main(String[] args) {
        ZufallszahlenTester zufallszahlenTester = new ZufallszahlenTester();
        for (int i = 0; i < 100; i++) {
            System.out.println(zufallszahlenTester.liefereEineZufallszahl(-10, 30));
        }
//        zufallszahlenTester.zufallszahlenAusgeben(10 / 2);
//        int[] wuerfe = new int[6];
//        for (int i = 0; i < 100; i++) {
//            int wurf = zufallszahlenTester.wuerfeln();
//            System.out.println(wurf);
//            wuerfe[wurf - 1]++;
//        }
//        druckeArray(wuerfe);
//        for (int i = 0; i < 5; i++) {
//            System.out.println(zufallszahlenTester.gibAntwort());
//        }
//        System.out.println("Neue Antwort eingefügt:");
//        zufallszahlenTester.antworten.add("Hmm ich weiß nicht");
//        for (int i = 0; i < 5; i++) {
//            System.out.println(zufallszahlenTester.gibAntwort());
//        }

    }

    public static void druckeArray(int[] a) {
        int anzahlDerWuerfe = 0;
        for (int i = 0; i < a.length; i++) {
            anzahlDerWuerfe += a[i];
        }
        for (int i = 0; i < a.length; i++) {
            System.out.println((i + 1) + "\tAnzahl: " + a[i] + "\tHäufigkeit in Prozent: " + (double) a[i] / anzahlDerWuerfe * 100.0 + " %");
        }
    }
}
