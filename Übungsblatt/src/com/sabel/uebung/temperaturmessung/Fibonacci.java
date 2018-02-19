package com.sabel.uebung.temperaturmessung;

public class Fibonacci {
    public static void main(String[] args) {
        System.out.println(anzahlPaare(10));
        int[] fibonacci = lieferFibonacci(44);
        for (int anzahlPaare : fibonacci) {
            System.out.println(anzahlPaare);
        }
    }

    public static int anzahlPaare(int monat){
        if (monat == 0 || monat == 1) {
            return 1;
        }
        int anzahl = 0;
        int anzahlVorvormonat = 1;
        int anzahlVormonat = 1;
        for (int i = 2; i <= monat; i++) {
            anzahl = anzahlVorvormonat + anzahlVormonat;
            anzahlVorvormonat = anzahlVormonat;
            anzahlVormonat = anzahl;
        }
        return anzahl;
    }

    public static int[] lieferFibonacci(int monat) {
        int[] fib = new int[monat + 1];
        fib[0] = 1;
        fib[1] = 1;
        for (int i = 2; i <= monat; i++) {
            fib[i] = fib[i - 1] + fib[i - 2];
        }
        return fib;
    }
}
