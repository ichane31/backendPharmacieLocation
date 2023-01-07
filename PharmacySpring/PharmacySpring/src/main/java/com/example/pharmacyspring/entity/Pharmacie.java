package com.example.pharmacyspring.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;

@Entity
public class Pharmacie {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String nom;
    private String adresse;
    private double latitude;
    private double longitude;
    private Etat etat;

    public Etat getEtat() {
        return etat;
    }

    public void setEtat(Etat etat) {
        this.etat = etat;
    }
   @JsonIgnore
    @ManyToOne
    private Zone zone ;
    @JsonIgnore
    @ManyToOne
    private UserPharmacie userPharmacie;

    public UserPharmacie getUserPharmacie() {
        return userPharmacie;
    }

    public void setUserPharmacie(UserPharmacie userPharmacie) {
        this.userPharmacie = userPharmacie;
    }

    public Pharmacie() {
        super();
    }
    public Pharmacie(String nom, String adresse, Double latitude, double longitude, Zone zone, UserPharmacie userPharmacie) {
        super();
        this.nom = nom;
        this.adresse = adresse;
        this.latitude = latitude;
        this.longitude = longitude;
        this.zone= zone ;
        this.userPharmacie = userPharmacie;
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
    public String getAdresse() {
        return adresse;
    }
    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }
    public Double getLatitude() {
        return latitude;
    }
    public void setLatitude(Double latitude) {
        this.latitude = latitude;
    }
    public double getLongitude() {
        return longitude;
    }
    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }
    public Zone getZone() {
        return zone;
    }
    public void setZone(Zone zone) {
        this.zone = zone;
    }

    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }
    public Pharmacie(int id, String nom, String adresse, double latitude, double longitude,  Zone zone) {
        super();
        this.id = id;
        this.nom = nom;
        this.adresse = adresse;
        this.latitude = latitude;
        this.longitude = longitude;
        this.zone = zone;
    }



}
