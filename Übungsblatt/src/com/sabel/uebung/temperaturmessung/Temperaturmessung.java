package com.sabel.uebung.temperaturmessung;

public class Temperaturmessung {
    public static void main(String[] args) {
        double[] messwerte = new double[365];
        // für Winter:
        for (int i = 0; i < 90; i++) {
            messwerte[i] = generiereZufallstemperatur(-30, 0);
        }
        // für Frühling
        for (int i = 90; i < 180; i++) {
            messwerte[i] = generiereZufallstemperatur(0, 10);
        }
        // Sommer
        for (int i = 180; i < 270; i++) {
            messwerte[i] = generiereZufallstemperatur(10, 30);
        }
        // Herbst
        for (int i = 270; i < 365; i++) {
            messwerte[i] = generiereZufallstemperatur(0, 10);
        }
        druckeMesswerte(messwerte);
        System.out.println("Die kälteste Temperatur war: " + kaeltesteTemperatur(messwerte) + " °C");
        int waermsterTag = waermsterTag(messwerte);
        System.out.println("Der wärmster Tag war: " + waermsterTag + " mit " + messwerte[waermsterTag] + " °C");
        System.out.println("Durchschnittstemperatur: " + durchschnittsTemperatur(messwerte));
    }

    public static void druckeMesswerte(double[] messwerte) {
        for (double messwert : messwerte) {
            System.out.println(messwert);
        }
    }

    public static double generiereZufallstemperatur() {
        double zufallstemperatur = Math.random() * 60; // 0.0 bis 59.9999999999
        zufallstemperatur -= 30;
        return zufallstemperatur;
    }

    public static double generiereZufallstemperatur(int min, int max) { // 10 - 30
        double zufallszahl = Math.random() * (max - min); // (0.0 bis 0.9999999999999) * 20 => 0.0 bis 19.999999
        return zufallszahl + min;
    }

    public static double kaeltesteTemperatur(double[] messwerte) {
        double min = messwerte[0];
        for (int i = 1; i < messwerte.length; i++) {
            if (messwerte[i] < min) {
                min = messwerte[i];
            }
        }
        return min;
    }

    public static int waermsterTag(double[] messwerte) {
        double max = messwerte[0];
        int tag = 0;
        for (int i = 1; i < messwerte.length; i++) {
            if (messwerte[i] > max) {
                max = messwerte[i];
                tag = i;
            }
        }
        return tag;
    }

    public static double durchschnittsTemperatur(double[] messwerte) {
        double summe = 0.0;
        for (int i = 0; i < messwerte.length; i++){
            summe += messwerte[i];
        }
        return summe / messwerte.length;
    }

}
