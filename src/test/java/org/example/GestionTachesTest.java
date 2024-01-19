package org.example;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class GestionTachesTest {

    @Test
    void testVerifierTache() {
        Projet projet = new Projet("projet test");
        GestionTaches gestionTaches = new GestionTaches(projet);

        String expectedTacheTitle = "tache test";
        gestionTaches.ajouterTache(expectedTacheTitle, "description test");

        Assertions.assertTrue(gestionTaches.verifierTache(expectedTacheTitle));

        Assertions.assertFalse(gestionTaches.verifierTache("tache inexistante"));

    }

    @Test
    void testCompleterTache() {
        Projet projet = new Projet("projet test");
        GestionTaches gestionTaches = new GestionTaches(projet);

        gestionTaches.ajouterTache("tache test", "description test");

        Assertions.assertFalse(gestionTaches.projet.getTaches().get(0).estCompletee);

        gestionTaches.completerTache("tache test");

        Assertions.assertTrue(gestionTaches.projet.getTaches().get(0).estCompletee);

        Assertions.assertFalse(gestionTaches.completerTache("tache inexistante"));
    }

    @Test
    void testAjouterTache() {
        Projet projet = new Projet("projet test");
        GestionTaches gestionTaches = new GestionTaches(projet);

        gestionTaches.ajouterTache("tache test", "description test");

        Assertions.assertEquals("tache test", gestionTaches.projet.getTaches().get(0).getTitre());
    }
}
