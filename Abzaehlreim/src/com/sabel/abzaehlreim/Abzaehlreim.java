package com.sabel.abzaehlreim;

import java.util.Arrays;
import java.util.Scanner;

public class Abzaehlreim {
    public static void main(String[] args) {
        System.out.println("Hallo");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bitte Anzahl der Kinder eingeben: ");
        int n = scanner.nextInt();
        System.out.println("Bitte Anzahl der Silben eingeben: ");
        int k = scanner.nextInt();
        scanner.close();
        System.out.println("Anzahl Kinder: " + n);
        System.out.println("Anzahl der Silben: " + k);

        int[] next = new int[n]; // int-Array mit Anzahl der Kinder
        // Ausgangposition:
        for (int i = 0; i < next.length; i++) {
            next[i] = (i + 1) % n; // Modulo Anzahl der Kinder, damit letztes Kind den Nachfolger 0 bekommt
        }
        int finger = n - 1; // Finger steht vor dem 0. Kind (also auf dem letzten Kind)

        while (next[finger] != finger) { // solange der Nachfolger nicht das selbe Kind
            // k-1 mal den Finger weitersetzen
            for (int i = 0; i < k - 1; i++) {
                finger = next[finger];
            }
            System.out.println("Ausgeschieden ist Kind: " + next[finger]);
            // Nachfolger wird der Nachfolger des Nachfolgers:
            next[finger] = next[next[finger]];
        }
        System.out.println("Gewonnen hat Kind: " + finger);
        Arrays.binarySearch(next, 42);

    }


}
