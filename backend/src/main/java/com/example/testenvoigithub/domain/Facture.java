package com.example.testenvoigithub.domain;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotNull;
import java.time.Instant;
import java.util.UUID;

/** Table « facture » du bloc « Base clinique » (généré par LONKOO). */
@Entity
@Table(name = "facture")
public class Facture {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    @NotNull(message = "est obligatoire")
    @Column(name = "consultation_id", nullable = false)
    private UUID consultationId;

    @NotNull(message = "est obligatoire")
    @Column(name = "montant", nullable = false)
    private Long montant;

    @Column(name = "reference_paiement", unique = true)
    private String referencePaiement;

    @Column(name = "paye_le")
    private Instant payeLe;

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public UUID getConsultationId() {
        return consultationId;
    }

    public void setConsultationId(UUID consultationId) {
        this.consultationId = consultationId;
    }

    public Long getMontant() {
        return montant;
    }

    public void setMontant(Long montant) {
        this.montant = montant;
    }

    public String getReferencePaiement() {
        return referencePaiement;
    }

    public void setReferencePaiement(String referencePaiement) {
        this.referencePaiement = referencePaiement;
    }

    public Instant getPayeLe() {
        return payeLe;
    }

    public void setPayeLe(Instant payeLe) {
        this.payeLe = payeLe;
    }
}
