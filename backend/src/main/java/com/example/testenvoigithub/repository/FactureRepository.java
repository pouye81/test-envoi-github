package com.example.testenvoigithub.repository;

import com.example.testenvoigithub.domain.Facture;
import java.util.UUID;
import org.springframework.data.jpa.repository.JpaRepository;

/** Accès à la table « facture » (généré par LONKOO). */
public interface FactureRepository extends JpaRepository<Facture, UUID> {
}
