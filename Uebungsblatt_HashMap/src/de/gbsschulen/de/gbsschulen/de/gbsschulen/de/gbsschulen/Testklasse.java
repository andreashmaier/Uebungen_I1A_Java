package de.gbsschulen.de.gbsschulen.de.gbsschulen.de.gbsschulen;

import de.gbsschulen.Autor;
import de.gbsschulen.de.gbsschulen.Buch;
import de.gbsschulen.de.gbsschulen.de.gbsschulen.Bibliothek;

public class Testklasse {
    public static void main(String[] args) {
        Bibliothek bibliothek = new Bibliothek();
        bibliothek.hinzufuegen(new Buch(new Autor("Sierra"),
                                "Java von Kopf bis Fuss", "978-3-89721-448-4", 2006));
        bibliothek.hinzufuegen(new Buch(new Autor("Bloch"),
                                "Effective Java", "978-0-321-35668-0", 2008));
        bibliothek.hinzufuegen(new Buch(new Autor("Thorll"),
                                "MySQL", "978-3-89842-188-1", 2002));

        Buch gesuchtesBuch = bibliothek.suchen("978-3-89721-448-4");
        if (gesuchtesBuch != null) {
            System.out.println(gesuchtesBuch);
        }
        System.out.println();
        System.out.println(bibliothek);
    }
}
