package de.gbsschulen;

public class BubbleSort {

    public static void main(String[] args) {
        int[] a = {97, 13, 42, -1, 45, -42, 18};
//        SelectionSort.druckeArray(a);
        sort(a);
//        SelectionSort.druckeArray(a);
    }

    public static void sort(int[] a) {
        int count = 0;
        SelectionSort.druckeArray(a);
        boolean getauscht;
        do {
            getauscht = false;
            for (int i = 0; i < a.length - 1; i++) {
                if (a[i] > a[i + 1]) {
                    int temp = a[i];
                    a[i] = a[i + 1];
                    a[i + 1] = temp;
                    getauscht = true;
                    SelectionSort.druckeArray(a);
                }
                count++;
            }
        } while (getauscht);
        System.out.println(count);
    }
}
