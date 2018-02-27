package de.gbsschulen;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class MannschaftTest {

    private Mannschaft mannschaft;

    @Before
    public void beforeTest() {
        mannschaft = new Mannschaft("Testmannschaft");
        for (int i = 0; i < 9; i++) {
            mannschaft.aufstellen(new Spieler("Testspieler" + (i + 1), "Testspieler"), i);
        }

    }

    @Test
    public void gibTorschuetzenkoenigReithmayerTest() {
        Spieler spieler = new Spieler("Müller", "Stürmer");
        Spieler spieler1 = new Spieler("Lewandowski", "Stürmer");
        mannschaft.aufstellen(spieler, 9);
        mannschaft.aufstellen(spieler1, 10);
        mannschaft.druckeAufstellung();
        spieler.torGeschossen();
        spieler1.torGeschossen();
        spieler1.torGeschossen();
        assertNotNull(mannschaft.gibTorschuetzenkoenigReithmayer());
        assertEquals(spieler1, mannschaft.gibTorschuetzenkoenigReithmayer());
    }

    @Test
    public void gibTorschuetzenkoenigEderTest() {
        Spieler spieler = new Spieler("Müller", "Stürmer");
        Spieler spieler1 = new Spieler("Lewandowski", "Stürmer");
        mannschaft.aufstellen(spieler, 9);
        mannschaft.aufstellen(spieler1, 10);
        mannschaft.druckeAufstellung();
        spieler.torGeschossen();
        spieler1.torGeschossen();
        spieler1.torGeschossen();
        assertNotNull(mannschaft.gibTorschuetzenkoenigEder());
        assertEquals(spieler1, mannschaft.gibTorschuetzenkoenigEder());
    }

}