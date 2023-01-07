package com.example.pharmacyspring.repository;

import com.example.pharmacyspring.entity.Ville;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.lang.NonNull;

public interface VilleRepository extends JpaRepository<Ville, Integer> {
    Ville findByNomLikeIgnoreCase(@NonNull String nom);


}
