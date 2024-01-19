package org.example;

import java.util.List;

public class Utils {

    public static Number calculerDureeTotale(List<Tache> taches) {
        double dureeTotale = 0;

        for (Tache tache : taches) {
            dureeTotale += tache.getDuree();
        }

        return dureeTotale;
    }
}
