package com.example.testenvoigithub.web;

import com.example.testenvoigithub.domain.Consultation;
import com.example.testenvoigithub.domain.Facture;
import com.example.testenvoigithub.domain.Medecin;
import com.example.testenvoigithub.domain.Patient;
import com.example.testenvoigithub.domain.RendezVous;
import com.example.testenvoigithub.repository.ConsultationRepository;
import com.example.testenvoigithub.repository.FactureRepository;
import com.example.testenvoigithub.repository.MedecinRepository;
import com.example.testenvoigithub.repository.PatientRepository;
import com.example.testenvoigithub.repository.RendezVousRepository;
import jakarta.validation.Valid;
import java.util.List;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

/** Endpoints du bloc « API clinique » (généré par LONKOO). */
@RestController
public class ApiCliniqueController {

    private final PatientRepository patientRepository;
    private final MedecinRepository medecinRepository;
    private final RendezVousRepository rendezVousRepository;
    private final ConsultationRepository consultationRepository;
    private final FactureRepository factureRepository;

    public ApiCliniqueController(PatientRepository patientRepository, MedecinRepository medecinRepository, RendezVousRepository rendezVousRepository, ConsultationRepository consultationRepository, FactureRepository factureRepository) {
        this.patientRepository = patientRepository;
        this.medecinRepository = medecinRepository;
        this.rendezVousRepository = rendezVousRepository;
        this.consultationRepository = consultationRepository;
        this.factureRepository = factureRepository;
    }

    /** Lister les patients */
    @GetMapping("/patients")
    public List<Patient> getPatients() {
        return patientRepository.findAll();
    }

    /** Enregistrer un patient */
    @PostMapping("/patients")
    @ResponseStatus(HttpStatus.CREATED)
    public Patient postPatients(@Valid @RequestBody Patient body) {
        body.setId(null);
        return patientRepository.save(body);
    }

    /** Lister les médecins */
    @GetMapping("/medecins")
    public List<Medecin> getMedecins() {
        return medecinRepository.findAll();
    }

    /** Ajouter un médecin */
    @PostMapping("/medecins")
    @ResponseStatus(HttpStatus.CREATED)
    public Medecin postMedecins(@Valid @RequestBody Medecin body) {
        body.setId(null);
        return medecinRepository.save(body);
    }

    /** Lister les rendez-vous */
    @GetMapping("/rendez-vous")
    public List<RendezVous> getRendezVous() {
        return rendezVousRepository.findAll();
    }

    /** Prendre un rendez-vous */
    @PostMapping("/rendez-vous")
    @ResponseStatus(HttpStatus.CREATED)
    public RendezVous postRendezVous(@Valid @RequestBody RendezVous body) {
        body.setId(null);
        return rendezVousRepository.save(body);
    }

    /** Lister les consultations */
    @GetMapping("/consultations")
    public List<Consultation> getConsultations() {
        return consultationRepository.findAll();
    }

    /** Enregistrer une consultation */
    @PostMapping("/consultations")
    @ResponseStatus(HttpStatus.CREATED)
    public Consultation postConsultations(@Valid @RequestBody Consultation body) {
        body.setId(null);
        return consultationRepository.save(body);
    }

    /** Lister les factures */
    @GetMapping("/factures")
    public List<Facture> getFactures() {
        return factureRepository.findAll();
    }

    /** Établir la facture d'une consultation */
    @PostMapping("/factures")
    @ResponseStatus(HttpStatus.CREATED)
    public Facture postFactures(@Valid @RequestBody Facture body) {
        body.setId(null);
        return factureRepository.save(body);
    }
}
