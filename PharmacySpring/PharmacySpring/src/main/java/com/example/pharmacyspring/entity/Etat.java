package com.example.pharmacyspring.entity;

public enum Etat {
    ATTENTE(0),VALIDE(1), REFUSE(2);
    private int etat;
    private Etat(int etat) {
        this.etat = etat;
    }
    public int getEtat() {
        return etat;
    }
}