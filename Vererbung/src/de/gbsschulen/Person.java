package de.gbsschulen;

public class Person {
    private String name;
    private int alter;

    public Person() {
    }

    public Person(String name) {
        this.name = name;
    }

    public Person(String name, int alter) {
        this.name = name;
        this.alter = alter;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAlter() {
        return alter;
    }

    public void setAlter(int alter) {
        this.alter = alter;
    }
}
