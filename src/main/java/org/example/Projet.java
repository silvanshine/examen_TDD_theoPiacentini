package org.example;

import java.util.ArrayList;
import java.util.List;

/**
 * Classe représentant un projet
 */
public class Projet {

    private String nom;
    private List<Tache> taches = new ArrayList<>();

    private final GestionTaches gestionTaches = new GestionTaches(this);


    public Projet(String nom) {
        this.nom = nom;
    }


    public void setNom(String nom) {
        this.nom = nom;
    }

    public List<Tache> getTaches() {
        return taches;
    }

    public void setTaches(List<Tache> taches) {
        this.taches = taches;
    }

    public void ajouterTache(String titre, String description) {
        this.gestionTaches.ajouterTache(titre, description);
    }

    public boolean completerTache(String titre) {
        return this.gestionTaches.completerTache(titre);
    }

    public boolean verifierTache(String titre) {
        return this.gestionTaches.verifierTache(titre);
    }

    public GestionTaches getGestionTaches() {
        return this.gestionTaches;
    }
}
