package de.gbsschulen.vererbung;

import java.util.Objects;

public class Tier {
    private String name;
    private int alter;

    public Tier(String name, int alter) {
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

    public void fressen() {
        System.out.println("Das Tier frisst!");
    }

    @Override
    public String toString() {
        return "Name: " + name + ", Alter: " + alter;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Tier tier = (Tier) o;
        return Objects.equals(name, tier.name);
    }

    @Override
    public int hashCode() {

        return Objects.hash(name);
    }
}
