package de.gbsschulen.dome2;

public class Medium {
    private String titel;
    private int spielzeit;
    private boolean habIch;
    private String kommentar;

    public Medium(String titel, int spielzeit) {
        this.titel = titel;
        this.spielzeit = spielzeit;
    }

    public boolean gibVorhanden() {
        return habIch;
    }

    public void setzeVorhanden(boolean habIch) {
        this.habIch = habIch;
    }

    public String gibKommentar() {
        return kommentar;
    }

    public void setzeKommentar(String kommentar) {
        this.kommentar = kommentar;
    }

    public void ausgeben(){
        System.out.println("Titel: " + this.titel + "(" + this.spielzeit + " Min)");
    }
}
