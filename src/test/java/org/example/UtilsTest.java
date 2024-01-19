package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

public class UtilsTest {

    @Test
    void testCalculerDureeTotale() {
        ArrayList<Tache> tachesTest = new ArrayList<>();
        Assertions.assertEquals(0.0, Utils.calculerDureeTotale(tachesTest));

        tachesTest.add(new Tache("tache test", "description test", 1.0));
        Assertions.assertEquals(1.0, Utils.calculerDureeTotale(tachesTest));

        tachesTest.add(new Tache("tache test", "description test", 2.5));
        Assertions.assertEquals(3.5, Utils.calculerDureeTotale(tachesTest));
    }


}
