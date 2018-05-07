package de.gbsschulen.dome;

public class CD {
    private String titel;
    private String kuenstler;
    private int titelanzahl;
    private int spielzeit;
    private boolean habIch;
    private String kommentar;

    public CD(String titel, String kuenstler, int titelanzahl, int spielzeit) {
        this.habIch = false;
        this.kommentar = "<kein Kommentar>";
        this.titel = titel;
        this.kuenstler = kuenstler;
        this.titelanzahl = titelanzahl;
        this.spielzeit = spielzeit;
    }

    public boolean gibVorhanden() {
        return habIch;
    }

    public String gibKommentar() {
        return kommentar;
    }

    public void setzeVorhanden(boolean habIch) {
        this.habIch = habIch;
    }

    public void setzeKommentar(String kommentar) {
        this.kommentar = kommentar;
    }

    public void ausgeben() {
        System.out.println("CD:  " + this.titel + " (" + this.spielzeit + " Min)");
        System.out.println("     " + this.kuenstler);
        System.out.println("     Titelanzahl: " + this.titelanzahl);
        System.out.println("     " + this.kommentar);
    }
}
