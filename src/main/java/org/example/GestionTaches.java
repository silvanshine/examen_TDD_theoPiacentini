package org.example;

import javax.management.openmbean.TabularType;

public class GestionTaches {
    Projet projet;

    public GestionTaches(Projet projet) {
        this.projet = projet;
    }

    public void ajouterTache(String titre, String description) {
        Tache nouvelleTache = new Tache(titre, description);
        this.projet.getTaches().add(nouvelleTache);
    }

    public boolean completerTache(String titre) {

        return false;
    }

    public boolean verifierTache(String titre) {

        return false;
    }
}
