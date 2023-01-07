package com.example.pharmacyspring.repository;

import com.example.pharmacyspring.entity.Ville;
import com.example.pharmacyspring.entity.Zone;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.lang.NonNull;

public interface ZoneRepository extends JpaRepository<Zone, Integer> {
    Zone findByNomLikeIgnoreCase(@NonNull String nom);
}
