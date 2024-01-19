package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ProjetIntegrationTest {

    /**
     * Test de la méthode verifierTache utilisant la classe GestionsTaches
     */
    @Test
    void testVerifierTache() {
        Projet projet = new Projet("projet test");

        // ajout d'une tâche test
        String expectedTacheTitle = "tache test";
        projet.ajouterTache(expectedTacheTitle, "description test");

        // vérification que la tâche a bien été ajoutée
        Assertions.assertTrue(projet.verifierTache(expectedTacheTitle));

        // check que la vérification d'une tâche inexistante retourne false
        Assertions.assertFalse(projet.verifierTache("tache inexistante"));

        // Vérifie que la liste de tâches du projet est bien la même que celle de la gestion de tâches
        Assertions.assertEquals(projet.getTaches(), projet.getGestionTaches().getTaches());

    }

    /**
     * Test de la méthode completerTache utilisant la classe GestionsTaches
     */
    @Test
    void testCompleterTache() {
        Projet projet = new Projet("projet test");

        // ajout d'une tâche test
        projet.ajouterTache("tache test", "description test");

        // vérification que la tâche n'est pas complétée
        Assertions.assertFalse(projet.getTaches().get(0).estCompletee);

        // complétion de la tâche et check que la complétion retourne true si la tâche existe
        Assertions.assertTrue(projet.completerTache("tache test"));

        // vérification que la tâche est complétée
        Assertions.assertTrue(projet.getTaches().get(0).estCompletee);

        // vérification que la complétion d'une tâche inexistante retourne false
        Assertions.assertFalse(projet.completerTache("tache inexistante"));

        Assertions.assertEquals(projet.getTaches(), projet.getGestionTaches().getTaches());
    }

    /**
     * Test de la méthode ajouterTache utilisant la classe GestionsTaches
     */
    @Test
    void testAjouterTache() {

        // Création d'un projet et d'une gestion de tâches
        Projet projet = new Projet("projet test");
        GestionTaches gestionTaches = new GestionTaches(projet);

        // Ajout d'une tâche test
        gestionTaches.ajouterTache("tache test", "description test");

        // Vérification que la tâche a bien été ajoutée
        Assertions.assertEquals("tache test", gestionTaches.projet.getTaches().get(0).getTitre());

        // Vérifie que la liste de tâches du projet est bien la même que celle de la gestion de tâches
        Assertions.assertEquals(projet.getTaches(), projet.getGestionTaches().getTaches());
    }
}
