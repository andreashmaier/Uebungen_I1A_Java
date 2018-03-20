package de.gbsschulen;

public class SelectionSorter {

    private int[] a;
    private int n;

    public SelectionSorter() {

    }

    public SelectionSorter(int[] a) {
        sort(a);
    }

    public void sort(int[] a) {
        this.a = a;
        this.n = a.length;
        sort();
    }

    private void sort() {
        for (int i = 0; i < n - 1; i++) {
            int min = a[i];
            int pos = i;
            for (int j = i + 1; j < n; j++) {
                if (a[j] < min) {
                    min = a[j];
                    pos = j;
                }
            }
            a[pos] = a[i];
            a[i] = min;
        }
    }

    @Override
    public String toString() {
        String result = "";
        for (int zahl : a) {
            result += zahl + "  ";
        }
        return result;
    }

    public static void main(String[] args) {
        SelectionSorter selectionSorter = new SelectionSorter();
        selectionSorter.sort(new int[]{42, 13, 9, 27, 83,1});
        System.out.println(selectionSorter);
    }
}
