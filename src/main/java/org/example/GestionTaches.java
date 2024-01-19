package org.example;

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
        for (Tache tache : this.projet.getTaches()) {
            if (tache.getTitre().equals(titre)) {
                tache.estCompletee = true;
                return true;
            }
        }
        return false;
    }

    public boolean verifierTache(String titre) {
        for (Tache tache : this.projet.getTaches()) {
            if (tache.getTitre().equals(titre)) {
                return true;
            }
        }
        return false;
    }
}
