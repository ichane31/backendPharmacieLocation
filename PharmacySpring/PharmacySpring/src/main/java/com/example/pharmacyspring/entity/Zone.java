package com.example.pharmacyspring.entity;


import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonSetter;
import jakarta.persistence.*;

import java.util.Collection;


@Entity
public class Zone {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String nom;
    @ManyToOne(cascade = CascadeType.PERSIST)
    private Ville ville;
    @OneToMany(mappedBy = "zone",cascade = CascadeType.ALL)
    private Collection<Pharmacie> pharmacies ;


    public Zone() {
        super();
    }

    public Zone(String nom, Ville ville, Collection<Pharmacie> pharmacies) {
        super();
        this.nom = nom;
        this.ville = ville;
        this.pharmacies = pharmacies;
    }

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getNom() {
        return nom;
    }
    public void setNom(String nom) {
        this.nom = nom;
    }

    public Ville getVille() {
        return ville;
    }

    public void setVille(Ville ville) {
        this.ville = ville;
    }

    @JsonIgnore
    public Collection<Pharmacie> getPharmacies() {
        return pharmacies;
    }
    @JsonSetter
    public void setPharmacies(Collection<Pharmacie> pharmacies) {
        this.pharmacies = pharmacies;
    }




}
