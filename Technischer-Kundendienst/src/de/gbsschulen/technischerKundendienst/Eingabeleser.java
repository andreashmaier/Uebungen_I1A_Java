package de.gbsschulen.technischerKundendienst;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/**
 * Ein de.gbsschulen.technischerKundendienst.Eingabeleser liest eingetippten Text von der Konsole.
 *
 * @author Michael Kölling und David J. Barnes
 * @version 0.1 (2008.03.30)
 */
public class Eingabeleser {
    private Scanner scanner;

    /**
     * Erzeuge einen neuen de.gbsschulen.technischerKundendienst.Eingabeleser, der Text von der Konsole
     * einliest.
     */
    public Eingabeleser() {
        scanner = new Scanner(System.in);
    }

    /**
     * Lies eine Zeile von der Konsole und liefere sie als String.
     *
     * @return Eine Zeichenkette, die vom Benutzer eingetippt wurde.
     */
    public Set<String> gibEingabe() {
        System.out.print("> ");   // Eingabebereitschaft anzeigen
        String eingabezeile = scanner.nextLine();
        // Eingabe aufteilen in einzelen Wörter:
        String[] teile = eingabezeile.split("[ ,.!?;]");
        HashSet<String> woerter = new HashSet<>();
        for (String teil : teile) {
            if (teil != null && teil.length() > 0) {
                woerter.add(teil.toLowerCase());
            }
        }

        return woerter;
    }

    public static void main(String[] args) {
        Eingabeleser eingabeleser = new Eingabeleser();
        String eingabe = eingabeleser.gibEingabe();
        System.out.println(eingabe);
    }

}
