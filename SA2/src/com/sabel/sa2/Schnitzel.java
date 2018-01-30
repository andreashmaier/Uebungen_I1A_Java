package com.sabel.sa2;

public class Schnitzel {
    private String fleischart;
    private double gewichtInGramm;
    private String panade;
    private boolean gebraten;


    public Schnitzel(String fleischart, double gewichtInGramm) {
        this.fleischart = fleischart;
        this.setGewichtInGramm(gewichtInGramm);
        this.panade = null;
        this.gebraten = false;
    }

    public double getGewichtInGramm() {
        return gewichtInGramm;
    }

    public boolean isGebraten() {
        return gebraten;
    }

    public void druckeInfo() {
        String ausgabe = fleischart + "-Schnitzel mit ";
        String panade = this.panade;
        if (panade == null){
            panade = "keiner ";
        }
        ausgabe += panade + "Panade, " + getGewichtInGramm() + " Gramm, ";
        String bratstatus = "ungebraten";
        if (this.gebraten){
            bratstatus = "gebraten";
        }
        ausgabe += bratstatus + ".";
        System.out.println(ausgabe);
    }

    public void setGewichtInGramm(double gewichtInGramm) {
        if (gewichtInGramm < 0){
            System.out.println("Gewicht darf nicht negativ sein!");
            return;
        }
        this.gewichtInGramm = gewichtInGramm;
    }

    public String getPanade() {
        return panade;
    }

    public void setPanade(String panade) {
        this.panade = panade;
    }

    public String getFleischart() {
        return fleischart;
    }

    public void braten() {
        if (!this.gebraten) {
            this.gebraten = true;
            this.gewichtInGramm = this.gewichtInGramm * 0.75;
        } else {
            System.out.println("Das Schnitzel kann nicht gebraten werden, da es schon gebraten ist!");
        }
    }


}
