package com.example.testenvoigithub.repository;

import com.example.testenvoigithub.domain.Consultation;
import java.util.UUID;
import org.springframework.data.jpa.repository.JpaRepository;

/** Accès à la table « consultation » (généré par LONKOO). */
public interface ConsultationRepository extends JpaRepository<Consultation, UUID> {
}
