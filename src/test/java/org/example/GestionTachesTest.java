package org.example;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class GestionTachesTest {

    /**
     * Test de la méthode verifierTache
     */
    @Test
    void testVerifierTache() {
        // Création d'un projet et d'une gestion de tâches test.
        Projet projet = new Projet("projet test");
        GestionTaches gestionTaches = new GestionTaches(projet);

        // Ajout d'une tâche test.
        String expectedTacheTitle = "tache test";
        gestionTaches.ajouterTache(expectedTacheTitle, "description test");

        // Vérification que la tâche a bien été ajoutée.
        Assertions.assertTrue(gestionTaches.verifierTache(expectedTacheTitle));

        // Check que la vérification d'une tâche inexistante retourne false.
        Assertions.assertFalse(gestionTaches.verifierTache("tache inexistante"));

    }

    /**
     * Test de la méthode completerTache
     */
    @Test
    void testCompleterTache() {
        // Création d'un projet et d'une gestion de tâches test.
        Projet projet = new Projet("projet test");
        GestionTaches gestionTaches = new GestionTaches(projet);

        // Ajout d'une tâche test.
        gestionTaches.ajouterTache("tache test", "description test");

        // Vérification que la tâche n'est pas complétée.
        Assertions.assertFalse(gestionTaches.projet.getTaches().get(0).estCompletee);

        // Complétion de la tâche.
        gestionTaches.completerTache("tache test");

        // Vérification que la tâche est complétée.
        Assertions.assertTrue(gestionTaches.projet.getTaches().get(0).estCompletee);

        // Vérification que la complétion d'une tâche inexistante retourne false.
        Assertions.assertFalse(gestionTaches.completerTache("tache inexistante"));
    }

    /**
     * Test de la méthode ajouterTache
     */
    @Test
    void testAjouterTache() {
        // Création d'un projet et d'une gestion de tâches test.
        Projet projet = new Projet("projet test");
        GestionTaches gestionTaches = new GestionTaches(projet);

        // Ajout d'une tâche test.
        gestionTaches.ajouterTache("tache test", "description test");

        // Vérification que la tâche a bien été ajoutée.
        Assertions.assertEquals("tache test", gestionTaches.projet.getTaches().get(0).getTitre());
    }
}
