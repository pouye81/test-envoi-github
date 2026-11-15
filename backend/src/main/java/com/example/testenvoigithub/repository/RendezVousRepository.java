package com.example.testenvoigithub.repository;

import com.example.testenvoigithub.domain.RendezVous;
import java.util.UUID;
import org.springframework.data.jpa.repository.JpaRepository;

/** Accès à la table « rendez_vous » (généré par LONKOO). */
public interface RendezVousRepository extends JpaRepository<RendezVous, UUID> {
}
