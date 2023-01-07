package com.example.pharmacyspring.repository;

import com.example.pharmacyspring.entity.Pharmacie;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PharmacieRepository extends JpaRepository<Pharmacie, Integer> {
}
