-- Schéma initial généré par LONKOO à partir des blocs « base de données » du canvas.

-- Table « patient » du bloc « Base clinique »
create table patient (
    id uuid primary key default gen_random_uuid(),
    numero_dossier varchar(255) not null unique,
    nom varchar(255) not null,
    telephone varchar(255) not null,
    naissance date,
    adresse varchar(255)
);

-- Table « medecin » du bloc « Base clinique »
create table medecin (
    id uuid primary key default gen_random_uuid(),
    nom varchar(255) not null,
    specialite varchar(255) not null
);

-- Table « rendez_vous » du bloc « Base clinique »
create table rendez_vous (
    id uuid primary key default gen_random_uuid(),
    patient_id uuid not null,
    medecin_id uuid not null,
    debut timestamptz not null,
    fin timestamptz not null,
    motif varchar(255),
    statut varchar(255) not null
);

-- Table « consultation » du bloc « Base clinique »
create table consultation (
    id uuid primary key default gen_random_uuid(),
    rendez_vous_id uuid not null,
    compte_rendu text
);

-- Table « facture » du bloc « Base clinique »
create table facture (
    id uuid primary key default gen_random_uuid(),
    consultation_id uuid not null,
    montant bigint not null,
    reference_paiement varchar(255) unique,
    paye_le timestamptz
);
