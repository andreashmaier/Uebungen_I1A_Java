package de.gbsschulen.sa3;

public class Auto {
    private String kennzeichen;
    private int anzahlPS;
    private String farbe;
    private boolean inOrdnung;

    public Auto(String kennzeichen, String farbe) {
        this.kennzeichen = kennzeichen;
        this.farbe = farbe;
        this.anzahlPS = 0;
        this.inOrdnung = true;
    }

    public String getKennzeichen() {
        return kennzeichen;
    }

    public void setKennzeichen(String kennzeichen) {
        this.kennzeichen = kennzeichen;
    }

    public int getAnzahlPS() {
        return anzahlPS;
    }

    public void setAnzahlPS(int anzahlPS) {
        if (anzahlPS < 0) {
            System.out.println("PS darf nicht negativ sein");
            return;
        }
        this.anzahlPS = anzahlPS;
    }

    public String getFarbe() {
        return farbe;
    }

    public void setFarbe(String farbe) {
        this.farbe = farbe;
    }

    public boolean isInOrdnung() {
        return inOrdnung;
    }

    public void setInOrdnung(boolean inOrdnung) {
        this.inOrdnung = inOrdnung;
    }

    public String datenwerteGeben() {
        StringBuilder sb = new StringBuilder("Kennzeichen: " + this.kennzeichen + ", Anzahl PS: " + anzahlPS
                + ", Farbe: " + this.farbe);
        String inOrdnung = "Auto ist in Ordnung";
        if (!this.inOrdnung) {
            inOrdnung = "Auto ist nicht in Ordnung";
        }
        sb.append(", " + inOrdnung);
        return sb.toString();
    }

}
