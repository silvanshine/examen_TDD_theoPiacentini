package org.example;

import java.util.List;

/**
 * Classe permettant d'afficher les tâches
 */
public class ControllerTaches {
    /** Affiche la liste des tâches
     * @param listTaches Liste des tâches
     */
    public static void afficheListeTaches(List<Tache> listTaches) {
        if (listTaches.isEmpty()) {
            System.out.println("Aucune tâche n'a été créée");
        }

        for (int i = 0; i < listTaches.size(); i++) {
            prettyPrintTache(listTaches.get(i), i + 1);
        }
    }

    /** Affiche une tâche
     * @param listTaches Liste des tâches
     * @param nom       Nom de la tâche à afficher
     */
    public static void afficheTache(List<Tache> listTaches, String nom) {
        for (int i = 0; i < listTaches.size(); i++) {
            if (listTaches.get(i).getTitre().equals(nom)) {
                prettyPrintTache(listTaches.get(i), i + 1);
                return;
            }
        }
        System.out.println("Aucune tâche n'a été trouvée avec le nom " + nom);


    }

    /** Affiche une tâche
     * @param tache  Tache à afficher
     * @param numero Numéro de la tâche à afficher
     */
    private static void prettyPrintTache(Tache tache, int numero) {
        System.out.println("Tache n°" + numero);
        System.out.println("Nom : " + tache.getNom());
        System.out.println("Description : " + tache.getDescription());
        System.out.println("Durée : " + tache.getDuree() + "h \n");
    }
}
