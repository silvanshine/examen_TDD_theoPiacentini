package org.example;

import java.util.List;

public class Utils {

    /** Calculer la durée totale d'une liste de tâches
     * @param taches Liste de tâches
     * @return La durée totale des tâches
     */
    public static double calculerDureeTotale(List<Tache> taches) {
        double dureeTotale = 0;

        for (Tache tache : taches) {
            // pas besoin de vérifier si la durée est négative car la classe Tache le fait déjà
            dureeTotale += tache.getDuree();
        }

        return dureeTotale;
    }
}
