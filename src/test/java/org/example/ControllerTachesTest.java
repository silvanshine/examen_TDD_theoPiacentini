package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.ArrayList;

@SuppressWarnings("DuplicateExpressions")
public class ControllerTachesTest {
    private final PrintStream standardOut = System.out;
    private final ByteArrayOutputStream outputStreamCaptor = new ByteArrayOutputStream();


    /**
     * Permet de rediriger la sortie standard vers un flux de sortie qu'on utilisera pour tester les sorties
     * (System.out.println).
     * Est exécuté avant chaque test.
     */
    @BeforeEach
    public void setUp() {
        System.setOut(new PrintStream(outputStreamCaptor));
    }


    /**
     * Test l'affichage d'une tâche.
     */
    @Test
    void testAfficheTache() {
        ArrayList<Tache> tachesTest = new ArrayList<>();
        ControllerTaches.afficheTache(tachesTest, "tache test");


        // Vérifie le cas où aucune tâche n'est trouvée
        // Trim l'output capturé pour enlever les espaces en trop et on remplacer les \r (retour chariot)
        // ajouté par windows
        Assertions.assertEquals("Aucune tâche n'a été trouvée avec le nom tache test", outputStreamCaptor.toString().trim());


        // Reset l'outputStreamCaptor pour pouvoir tester le cas où une tâche est trouvée.
        outputStreamCaptor.reset();

        tachesTest.add(new Tache("tache test", "description test", 1.0));
        ControllerTaches.afficheTache(tachesTest, "tache test");



        // Vérifie le cas où une tâche est trouvée.
        // Compare l'output avec le résultat attendu.
        Assertions.assertEquals(
                "Tache n°1\n" +
                        "Nom : tache test\n" +
                        "Description : description test\n" +
                        "Durée : 1.0h", outputStreamCaptor.toString().trim().replaceAll("\\r", ""));


    }

    /**
     * Test l'affichage d'une liste de tâches.
     */
    @Test
    void testAfficheListeTaches() {


        ArrayList<Tache> tachesTest = new ArrayList<>();
        ControllerTaches.afficheListeTaches(tachesTest);

        // Vérifie le cas où la liste de tâches est vide.
        Assertions.assertEquals("Aucune tâche n'a été créée", outputStreamCaptor.toString().trim());

        outputStreamCaptor.reset();


        tachesTest.add(new Tache("tache test", "description test", 1.0));
        ControllerTaches.afficheListeTaches(tachesTest);

        // Vérifie le cas où la liste de tâches contient une tâche.
        Assertions.assertEquals(
                "Tache n°1\n" +
                        "Nom : tache test\n" +
                        "Description : description test\n" +
                        "Durée : 1.0h", outputStreamCaptor.toString().trim().replaceAll("\\r", ""));

        outputStreamCaptor.reset();

        tachesTest.add(new Tache("tache test 2", "description test 2", 2.5));
        ControllerTaches.afficheListeTaches(tachesTest);

        // Vérifie le cas où la liste de tâches contient plusieurs tâches.
        Assertions.assertEquals(
                "Tache n°1\n" +
                        "Nom : tache test\n" +
                        "Description : description test\n" +
                        "Durée : 1.0h \n" +
                        "\n" +
                        "Tache n°2\n" +
                        "Nom : tache test 2\n" +
                        "Description : description test 2\n" +
                        "Durée : 2.5h", outputStreamCaptor.toString().trim().replaceAll("\\r", ""));

    }
}
