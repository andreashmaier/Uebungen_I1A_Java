package com.sabel.uebungKasten;

public class Testklasse {
    public static void main(String[] args) {
        Flasche flasche = new Flasche(500, 500, "Bier");
        System.out.println(flasche);

        Kasten kasten = new Kasten(11);
        kasten.hinzufuegen(flasche);
        System.out.println(kasten);
    }
}
