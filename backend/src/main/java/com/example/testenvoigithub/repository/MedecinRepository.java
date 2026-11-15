package com.example.testenvoigithub.repository;

import com.example.testenvoigithub.domain.Medecin;
import java.util.UUID;
import org.springframework.data.jpa.repository.JpaRepository;

/** Accès à la table « medecin » (généré par LONKOO). */
public interface MedecinRepository extends JpaRepository<Medecin, UUID> {
}
