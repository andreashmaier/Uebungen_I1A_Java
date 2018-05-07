package de.gbsschulen.dome;

import java.util.ArrayList;

public class Datenbank {
    private ArrayList<CD> cds;
    private ArrayList<DVD> dvds;

    public Datenbank() {
        this.cds = new ArrayList<CD>();
        this.dvds = new ArrayList<DVD>();
    }

    public void erfasseCD(CD cd){
        this.cds.add(cd);
    }

    public void erfasseDVD(DVD dvd){
        this.dvds.add(dvd);
    }

    public void auflisten(){
        for (CD cd : cds) {
            cd.ausgeben();
        }

        for (DVD dvd : dvds) {
            dvd.ausgeben();
        }
    }
}
