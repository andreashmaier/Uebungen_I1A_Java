package de.gbsschulen.dome;

public class DVD {
    private String titel;
    private String regisseur;
    private int spielzeit;
    private boolean habIch;
    private String kommentar;

    public DVD(String titel, String regisseur, int spielzeit) {
        this.titel = titel;
        this.regisseur = regisseur;
        this.spielzeit = spielzeit;
        this.habIch = false;
        this.kommentar = "<kein Kommentar>";
    }

    public boolean gibVorhaben() {
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
        System.out.println("DVD: " + this.titel + " (" + this.spielzeit + " Min)");
        System.out.println("     " + this.regisseur);
        System.out.println("     " + this.kommentar);
    }
}
