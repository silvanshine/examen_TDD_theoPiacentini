package org.example;

import java.util.List;

public class ControllerTaches {
    public static void afficheListeTaches(List<Tache> listTaches) {
        if (listTaches.isEmpty()) {
            System.out.println("Aucune tâche n'a été créée");
        }

        for (int i = 0; i < listTaches.size(); i++) {
            prettyPrintTache(listTaches.get(i), i + 1);
        }
    }

    public static void afficheTache(List<Tache> listTaches, String nom) {
        for (int i = 0; i < listTaches.size(); i++) {
            if (listTaches.get(i).getTitre().equals(nom)) {
                prettyPrintTache(listTaches.get(i), i + 1);
                return;
            }
        }
        System.out.println("Aucune tâche n'a été trouvée avec le nom " + nom);


    }

    private static void prettyPrintTache(Tache tache, int numero) {
        System.out.println("Tache n°" + numero);
        System.out.println("Nom : " + tache.getNom());
        System.out.println("Description : " + tache.getDescription());
        System.out.println("Durée : " + tache.getDuree() + "h \n");
    }
}
