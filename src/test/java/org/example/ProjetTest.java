package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ProjetTest {

    @Test
    void testVerifierTache() {
        Projet projet = new Projet("projet test");

        String expectedTacheTitle = "tache test";
        projet.ajouterTache(expectedTacheTitle, "description test");

        Assertions.assertTrue(projet.verifierTache(expectedTacheTitle));

        Assertions.assertFalse(projet.verifierTache("tache inexistante"));

    }

    @Test
    void testCompleterTache() {
        Projet projet = new Projet("projet test");

        projet.ajouterTache("tache test", "description test");

        Assertions.assertFalse(projet.getTaches().get(0).estCompletee);

        projet.completerTache("tache test");

        Assertions.assertTrue(projet.getTaches().get(0).estCompletee);

        Assertions.assertFalse(projet.completerTache("tache inexistante"));
    }

    @Test
    void testAjouterTache() {
        Projet projet = new Projet("projet test");
        GestionTaches gestionTaches = new GestionTaches(projet);

        gestionTaches.ajouterTache("tache test", "description test");

        Assertions.assertEquals("tache test", gestionTaches.projet.getTaches().get(0).getTitre());
    }
}
