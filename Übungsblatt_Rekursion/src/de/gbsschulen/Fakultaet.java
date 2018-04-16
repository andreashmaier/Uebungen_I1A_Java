package de.gbsschulen;

public class Fakultaet {

    public static int fakultaet(int n) {
        if (n == 0) return 1;

        return n * fakultaet(n - 1);
    }

    public static int fakultaetIterativ(int n) {
        int erg = 1;
        for (int i = 1; i <= n; i++) {
            erg *= i;
        }
        return erg;
    }

    public static void main(String[] args) {
        int n = 8;
        System.out.println("Fakultät rekursiv: " +fakultaet(n));
        System.out.println("Fakultäte iterativ: " + fakultaetIterativ(n));
    }
}
