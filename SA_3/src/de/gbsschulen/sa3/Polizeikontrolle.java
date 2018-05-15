package de.gbsschulen.sa3;

import java.util.ArrayList;

public class Polizeikontrolle {
    private Autowarteschlange autowarteschlange;
    private ArrayList<Auto> kontrollierteAutos;

    public Polizeikontrolle() {
        this.autowarteschlange = new Autowarteschlange(3);
        this.kontrollierteAutos = new ArrayList<>();
    }

    public void autoHeranwinken(Auto auto) {
        if (!autowarteschlange.istVoll()) {
            autowarteschlange.hintenAnstellen(auto);
        } else {
            System.out.println("Kein Platz mehr!");
        }
    }

    public void autoKontrollieren() {
        if (!autowarteschlange.istLeer()) {
            Auto auto = autowarteschlange.vorneAbfahren();
            auto.setInOrdnung(pruefergebnis());
            kontrollierteAutos.add(auto);
        }
    }

    private boolean pruefergebnis() {
        return Math.random() * 100 > 90;
    }

    public void kontrolllisteAusgeben() {
        StringBuilder sb = new StringBuilder();
        sb.append("Kontrollierte Autos: \n");
        for (Auto kontrolliertesAuto : kontrollierteAutos) {
            sb.append(kontrolliertesAuto.datenwerteGeben() + "\n");
        }
        sb.append(kontrollierteAutos.size() + " kontrollierte Autos.");
        System.out.println(sb.toString());
    }
}
