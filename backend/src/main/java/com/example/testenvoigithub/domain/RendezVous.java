package com.example.testenvoigithub.domain;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import java.time.Instant;
import java.util.UUID;

/** Table « rendez_vous » du bloc « Base clinique » (généré par LONKOO). */
@Entity
@Table(name = "rendez_vous")
public class RendezVous {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    @NotNull(message = "est obligatoire")
    @Column(name = "patient_id", nullable = false)
    private UUID patientId;

    @NotNull(message = "est obligatoire")
    @Column(name = "medecin_id", nullable = false)
    private UUID medecinId;

    @NotNull(message = "est obligatoire")
    @Column(name = "debut", nullable = false)
    private Instant debut;

    @NotNull(message = "est obligatoire")
    @Column(name = "fin", nullable = false)
    private Instant fin;

    @Column(name = "motif")
    private String motif;

    @NotBlank(message = "est obligatoire")
    @Column(name = "statut", nullable = false)
    private String statut;

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public UUID getPatientId() {
        return patientId;
    }

    public void setPatientId(UUID patientId) {
        this.patientId = patientId;
    }

    public UUID getMedecinId() {
        return medecinId;
    }

    public void setMedecinId(UUID medecinId) {
        this.medecinId = medecinId;
    }

    public Instant getDebut() {
        return debut;
    }

    public void setDebut(Instant debut) {
        this.debut = debut;
    }

    public Instant getFin() {
        return fin;
    }

    public void setFin(Instant fin) {
        this.fin = fin;
    }

    public String getMotif() {
        return motif;
    }

    public void setMotif(String motif) {
        this.motif = motif;
    }

    public String getStatut() {
        return statut;
    }

    public void setStatut(String statut) {
        this.statut = statut;
    }
}
