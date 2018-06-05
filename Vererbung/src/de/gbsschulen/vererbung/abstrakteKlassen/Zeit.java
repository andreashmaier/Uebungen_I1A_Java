package de.gbsschulen.vererbung.abstrakteKlassen;

public abstract class Zeit {

    public abstract long getMinuten();

    public long getSekunden() {
        return getMinuten() * 60;
    }
}
