package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertThrows;

public class TacheTest {
    @Test
    void testSetDuree() {
        Tache tache = new Tache("tache test", "description test");
        tache.setDuree(1);
        Assertions.assertEquals(1, tache.getDuree());

        tache.setDuree(0);
        Assertions.assertEquals(0, tache.getDuree());

        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            tache.setDuree(-1);
    });

    }
}
