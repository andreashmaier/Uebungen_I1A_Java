package de.gbsschulen;

/*
1. Aufgabe:
42 13 9 27 83 1
1 13 9 27 83 42

 */


public class SelectionSort {

    public static void main(String[] args) {
        int[] zahlen = {42, 13, 9, 27, 83, 1};
//        druckeArray(zahlen);
        sort(zahlen);
//        druckeArray(zahlen);
    }

    public static void druckeArray(int[] a) {
        for (int i = 0; i < a.length; i++) {
            System.out.printf("%3d ", a[i]);
        }
        System.out.println();
//        for (int i = 0; i < a.length; i++) {
//            System.out.printf("%3d ", i);
//        }
//        System.out.println("\n-------------------------");
    }

    public static void sort(int[] a) {
        druckeArray(a);
        for (int i = 0; i < a.length - 1 ;i++) {
            int min = a[i];
            int pos = i;
            for (int j = i + 1; j < a.length; j++) {
                if (a[j] < min) {
                    min = a[j];
                    pos = j;
                }
            }
            a[pos] = a[i];
            a[i] = min;
            druckeArray(a);
        }
    }
}
