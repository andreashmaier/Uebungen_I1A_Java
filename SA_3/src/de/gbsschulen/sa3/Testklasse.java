package de.gbsschulen.sa3;

public class Testklasse {
    public static void main(String[] args) {
        Auto auto = new Auto("WM AM 226", "silber");
        auto.setAnzahlPS(-100);
        auto.setInOrdnung(false);
        auto.datenwerteGeben();

        Auto auto1 = new Auto("WM IM 185", "blau");
        Auto auto2 = new Auto("WM BG 3", "blau");

        Autowarteschlange autowarteschlange = new Autowarteschlange(3);
        Auto abgefahrenesAuto = autowarteschlange.vorneAbfahren();
        if (abgefahrenesAuto == null) {
            System.out.println("Passt");
        }

        autowarteschlange.hintenAnstellen(auto);
        autowarteschlange.hintenAnstellen(auto1);
        autowarteschlange.hintenAnstellen(auto2);

        System.out.println(autowarteschlange);

        autowarteschlange.hintenAnstellen(new Auto("FFB YP 5", "schwarz"));

    }
}
