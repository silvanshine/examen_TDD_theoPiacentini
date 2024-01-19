package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ProjetIntegrationTest {

    /**
     * Test de la méthode verifierTache
     */
    @Test
    void testVerifierTache() {
        Projet projet = new Projet("projet test");

        String expectedTacheTitle = "tache test";
        projet.ajouterTache(expectedTacheTitle, "description test");

        Assertions.assertTrue(projet.verifierTache(expectedTacheTitle));

        Assertions.assertFalse(projet.verifierTache("tache inexistante"));

        Assertions.assertEquals(projet.getTaches(), projet.getGestionTaches().getTaches());

    }

    /**
     * Test de la méthode completerTache
     */
    @Test
    void testCompleterTache() {
        Projet projet = new Projet("projet test");

        projet.ajouterTache("tache test", "description test");

        Assertions.assertFalse(projet.getTaches().get(0).estCompletee);

        projet.completerTache("tache test");

        Assertions.assertTrue(projet.getTaches().get(0).estCompletee);

        Assertions.assertFalse(projet.completerTache("tache inexistante"));

        Assertions.assertEquals(projet.getTaches(), projet.getGestionTaches().getTaches());
    }

    /**
     * Test de la méthode ajouterTache
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
