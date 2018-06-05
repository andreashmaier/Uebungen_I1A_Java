package de.gbsschulen;

public class BeispielFinal {

    private static final int MAX_VALUE = 100;
    private final int i;

    public BeispielFinal(int i) {
        this.i = i;
    }

    public void tuWas() {
        final int zahl;
        zahl = 123;
        // zahl = 3;
    }

    public void machWas(final int i) {
        //i++;
    }

    public void machWas(final Person person) {
        person.setAlter(42); // nicht machen, kein clean code
        //p = new Person();
    }

}
