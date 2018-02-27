package de.gbsschulen;

import java.util.ArrayList;

public class Spielplan {

    private ArrayList<Mannschaft> gemeldeteMannschaften;

    public Spielplan() {
        this.gemeldeteMannschaften = new ArrayList<>();
    }

    public void anmelden(Mannschaft mannschaft) {
        this.gemeldeteMannschaften.add(mannschaft);
    }

    public void druckeGemeldeteMannschaften() {
        for (Mannschaft mannschaft : gemeldeteMannschaften) {
            System.out.println(mannschaft);
        }
    }
}
