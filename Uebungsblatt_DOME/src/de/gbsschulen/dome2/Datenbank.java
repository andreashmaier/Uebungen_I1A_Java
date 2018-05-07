package de.gbsschulen.dome2;

import java.util.ArrayList;

public class Datenbank {

    private ArrayList<Medium> medien;

    public Datenbank(){
        this.medien = new ArrayList<>();
    }

    public void auflisten(){
        for (Medium medium : medien) {
            medium.ausgeben();
        }
    }

    public void erfasseMedium(Medium medium){
        this.medien.add(medium);
    }
}
