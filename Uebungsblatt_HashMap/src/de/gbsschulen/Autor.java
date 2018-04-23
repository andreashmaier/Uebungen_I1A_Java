package de.gbsschulen;

public class Autor {
    private String vorname;
    private String nachname;
    private String bemerkung;
    private double gehalt;

    public Autor(String nachname) {
        this.nachname = nachname;
    }

    public Autor(String vorname, String nachname, String bemerkung, double gehalt) {
        this.vorname = vorname;
        this.nachname = nachname;
        this.bemerkung = bemerkung;
        this.setGehalt(gehalt);
    }

    public String getVorname() {
        return vorname;
    }

    public void setVorname(String vorname) {
        this.vorname = vorname;
    }

    public String getNachname() {
        return nachname;
    }

    public void setNachname(String nachname) {
        this.nachname = nachname;
    }

    public String getBemerkung() {
        return bemerkung;
    }

    public void setBemerkung(String bemerkung) {
        this.bemerkung = bemerkung;
    }

    public double getGehalt() {
        return gehalt;
    }

    public void setGehalt(double gehalt) {
        if (gehalt < 0.0) {
            System.out.println("Gehalt darf nicht negativ sein!");
            return;
        }
        this.gehalt = gehalt;
    }
}
