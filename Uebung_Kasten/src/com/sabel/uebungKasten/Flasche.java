package com.sabel.uebungKasten;

public class Flasche {
    private double aktuelleFuellmenge;
    private double maximaleFuellmenge;
    private String getraenk;

    public Flasche() {
        this.setAktuelleFuellmenge(0.0);
        this.setMaximaleFuellmenge(500);
        this.getraenk = "Bier";
    }

    public Flasche(double aktuelleFuellmenge, double maximaleFuellmenge, String getraenk) {
        this.setMaximaleFuellmenge(maximaleFuellmenge);
        this.setAktuelleFuellmenge(aktuelleFuellmenge);
        this.getraenk = getraenk;
    }

    public double getAktuelleFuellmenge() {
        return aktuelleFuellmenge;
    }

    public void setAktuelleFuellmenge(double aktuelleFuellmenge) {
        if (aktuelleFuellmenge >= 0 && aktuelleFuellmenge <= this.maximaleFuellmenge) {
            this.aktuelleFuellmenge = aktuelleFuellmenge;
        } else {
            System.out.println("Falscher Parameter");
        }
    }

    public double getMaximaleFuellmenge() {
        return maximaleFuellmenge;
    }

    public void setMaximaleFuellmenge(double maximaleFuellmenge) {
        if (maximaleFuellmenge < 0 || maximaleFuellmenge > 5000) {
            System.out.println("Falsche maximal Füllmenge");
            return;
        }
        this.maximaleFuellmenge = maximaleFuellmenge;
    }

    public String getGetraenk() {
        return getraenk;
    }

    public void setGetraenk(String getraenk) {
        this.getraenk = getraenk;
    }

    @Override
    public String toString() {
        String str = "Flasche: " + getraenk + "\n";
        str += "aktuelle Füllmenge: " + aktuelleFuellmenge + "\n";
        str += "maximale Füllmenge: " + maximaleFuellmenge + "\n";
        return str;
    }

    public void druckeInf() {
        System.out.println(this.toString());
    }
}
