package org.example;

import java.util.List;

public class GestionTaches {
    final Projet projet;

    public GestionTaches(Projet projet) {
        this.projet = projet;
    }

    public void ajouterTache(String titre, String description) {
        Tache nouvelleTache = new Tache(titre, description);
        this.projet.getTaches().add(nouvelleTache);
    }

    /** Complète une tâche
     * @param titre titre de la tâche à compléter
     * @return true si la tâche a été complétée, false sinon (elle n'existe pas)
     */
    public boolean completerTache(String titre) {
        for (Tache tache : this.projet.getTaches()) {
            if (tache.getTitre().equals(titre)) {
                tache.estCompletee = true;
                return true;
            }
        }
        return false;
    }

    /** Vérifie si une tâche existe
     * @param titre titre de la tâche à vérifier
     * @return true si la tâche existe, false sinon
     */
    public boolean verifierTache(String titre) {
        for (Tache tache : this.projet.getTaches()) {
            if (tache.getTitre().equals(titre)) {
                return true;
            }
        }
        return false;
    }

    public List<Tache> getTaches() {
        return this.projet.getTaches();
    }
}
