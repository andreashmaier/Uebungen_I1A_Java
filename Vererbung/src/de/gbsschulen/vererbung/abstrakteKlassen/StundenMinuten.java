package de.gbsschulen.vererbung.abstrakteKlassen;

public class StundenMinuten extends Zeit {

    private long stunden;
    private long minuten;

    public StundenMinuten(long stunden, long minuten) {
        this.stunden = stunden;
        this.minuten = minuten;
    }

    @Override
    public long getMinuten() {
        return this.stunden * 60 + this.minuten;
    }
}
