package de.gbsschulen.de.gbsschulen;

import de.gbsschulen.Autor;

public class Buch {
    private Autor autor;
    private String titel;
    private String isbn;
    private int erscheinungsjahr;

    public Buch(String titel, String isbn) {
        this.titel = titel;
        this.isbn = isbn;
    }

    public Buch(Autor autor, String titel, String isbn, int erscheinungsjahr) {
        this.autor = autor;
        this.titel = titel;
        this.isbn = isbn;
        this.setErscheinungsjahr(erscheinungsjahr);
    }

    public Autor getAutor() {
        return autor;
    }

    public void setAutor(Autor autor) {
        this.autor = autor;
    }

    public String getTitel() {
        return titel;
    }

    public void setTitel(String titel) {
        this.titel = titel;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public int getErscheinungsjahr() {
        return erscheinungsjahr;
    }

    public void setErscheinungsjahr(int erscheinungsjahr) {
        if (erscheinungsjahr < 1900 || erscheinungsjahr > 2018) {
            System.out.println("Falsches Erscheinungsjahr");
            return;
        }
        this.erscheinungsjahr = erscheinungsjahr;
    }

    @Override
    public String toString() {
        return "ISBN: " + this.isbn + ", Titel: " + this.titel + ", Erscheinungsjahr: " + this.erscheinungsjahr + ", Autor: " + autor.getNachname();
    }

}
