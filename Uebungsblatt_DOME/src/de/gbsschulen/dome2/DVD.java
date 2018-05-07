package de.gbsschulen.dome2;

public class DVD extends Medium {

    private String regisseur;

    public DVD(String titel,String regisseur, int spielzeit) {
        super(titel, spielzeit);
        this.regisseur = regisseur;
    }

    public String gibRegisseur(){
        return regisseur;
    }
}
