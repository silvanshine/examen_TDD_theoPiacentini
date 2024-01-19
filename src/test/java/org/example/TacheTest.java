package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertThrows;

public class TacheTest {
    /**
     * Test du setter de la durée
     */
    @Test
    void testSetDuree() {
        Tache tache = new Tache("tache test", "description test");

         // Test de set positif
        tache.setDuree(1);
        Assertions.assertEquals(1, tache.getDuree());

         // Test de set 0
        tache.setDuree(0);
        Assertions.assertEquals(0, tache.getDuree());

        // Vérifie la levée d'exception en cas de durée négative.
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            tache.setDuree(-1);
        });

        // Vérifie le message de levée d'exception en cas de durée négative.
        String expectedMessage = "La durée ne peut pas être négative";
        String actualMessage = exception.getMessage();
        Assertions.assertEquals(expectedMessage, actualMessage);

    }
}
