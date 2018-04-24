package de.gbsschulen.technischerKundendienst;

import java.util.*;

public class Testklasse {

    public static void main(String[] args) {
//        Kundendienstsystem kundendienstsystem = new Kundendienstsystem();
//        kundendienstsystem.starten();
        ArrayList<String> namensliste = new ArrayList<>();
        namensliste.add("Maier");
        namensliste.add("Mueller");
        namensliste.add("Schulze");
        namensliste.add("Aschenbrenner");
        namensliste.add("Maier");
        // Ausgeben
        for (String name : namensliste) {
            System.out.println(name);
        }

        Collections.sort(namensliste);
        // Ausgabe, nun sortiert
        System.out.println("Nun sortiert:");
        for (int i = 0; i < namensliste.size(); i++) {
            System.out.println(namensliste.get(i));
        }

        // Ausgabe mit Iterator
        Iterator<String> iterator = namensliste.iterator();
        while (iterator.hasNext()) {
            String name = iterator.next();
            System.out.println(name);
        }

        HashSet<String> namensSet = new HashSet<>();
        for (String name : namensliste) {
            namensSet.add(name);
        }

        System.out.println("Namen im HashSet");
        Iterator<String> it = namensSet.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
        System.out.println(addRekursiv(3, 0));
    }

    public static int addRekursiv(int a, int b) {
        // Terminierungsfall:
        if (b == 0) {
            return a;
        }
        // Rekursionsschritt:
        return addRekursiv(++a, --b);

//        if (b != 0) {
//            a = addRekursiv(++a, --b);
//        }
//        return a;

    }
}
