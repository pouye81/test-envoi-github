package com.example.testenvoigithub.repository;

import com.example.testenvoigithub.domain.Patient;
import java.util.UUID;
import org.springframework.data.jpa.repository.JpaRepository;

/** Accès à la table « patient » (généré par LONKOO). */
public interface PatientRepository extends JpaRepository<Patient, UUID> {
}
