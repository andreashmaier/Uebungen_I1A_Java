package com.sabel.arrays;

public class Mathe {

    public static double summe(double[] a){
        double summe = 0.0;
        for (int i = 0; i < a.length; i++) {
            summe += a[i]; // a an der Stelle i (Wert an der Stelle i)
        }
        return summe;
    }

    public static void main(String[] args) {
        double[] messwerte = new double[12];
        messwerte[0] = -10.7;

        double[] temperaturen = {-10.7, -11.2, -10.9, -10.4, -10.5};
        double summeAllerTemperaturen = summe(temperaturen);
        System.out.println("Summer aller Temperaturen: " + summeAllerTemperaturen);
        System.out.println("Durchschnittstemperatur: " + summeAllerTemperaturen / temperaturen.length);

        int[] quadrat = new int[20];
        for (int i = 0; i < quadrat.length; i++) {
            quadrat[i] = i * i;
        }
        druckeArray(quadrat);
        int n = 123;
        System.out.println("Quersumme von " + n + " = " + quersumme(n));

        int[] quersumme = new int[50];
        for (int i = 0; i < quersumme.length; i++){
            quersumme[i] = quersumme(i);
        }

        druckeArray(quersumme);
        int pos = maxwert(quadrat);
        System.out.println("Maximalwert Quadrat Position: " + pos + " Wert: " + quadrat[pos]);
        pos = maxwert(quersumme);
        System.out.println("Maximalwert Quersumme Position: " + pos + " Wert: " + quersumme[pos]);

        System.out.println("Mittelwert Quadrat: " + mittelwert(quadrat));
        System.out.println("Mittelwert Quersumme: " + mittelwert(quersumme));


    }

    public static void druckeArray(int[] a) {
        for (int i = 0; i < a.length; i++){
            System.out.printf("%3d ", a[i]);
        }
        System.out.println();
        for (int i = 0; i < a.length ; i++) {
            System.out.printf("%3d ", i);
        }
        System.out.println();
    }

    public static int quersumme(int n) {
        int quersumme = 0;
        while(n > 0) {
            quersumme += n % 10;
            n = n / 10;
        }
        return quersumme;
    }

    public static int summe(int[] array){
        int summe = 0;
        for (int i = 0; i < array.length; i++) {
            summe += array[i];
        }
        return summe;
    }

    public static double mittelwert(int[] array){
        int summe = summe(array);
        return (double)summe / array.length;
    }

    public static int maxwert (int[] array){
        int max = array[0];
        int position = 0;
        for (int i = 1; i < array.length; i++) {
            if(array[i] > max){
                max = array[i];
                position = i;
            }
        }
        return position;
    }
}
