package com.example.testenvoigithub.domain;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotNull;
import java.util.UUID;

/** Table « consultation » du bloc « Base clinique » (généré par LONKOO). */
@Entity
@Table(name = "consultation")
public class Consultation {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    @NotNull(message = "est obligatoire")
    @Column(name = "rendez_vous_id", nullable = false)
    private UUID rendezVousId;

    @Column(name = "compte_rendu")
    private String compteRendu;

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public UUID getRendezVousId() {
        return rendezVousId;
    }

    public void setRendezVousId(UUID rendezVousId) {
        this.rendezVousId = rendezVousId;
    }

    public String getCompteRendu() {
        return compteRendu;
    }

    public void setCompteRendu(String compteRendu) {
        this.compteRendu = compteRendu;
    }
}
