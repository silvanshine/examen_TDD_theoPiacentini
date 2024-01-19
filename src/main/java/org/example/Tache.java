package org.example;

public class Tache {

    int duree = 0;
    String titre;
    String description;

    boolean estCompletee = false;

    public Tache(String titre, String description) {
        this.titre = titre;
        this.description = description;
    }

    public Tache(String titre, String description,  int duree) {
        this.duree = duree;
        this.titre = titre;
        this.description = description;
    }

    public boolean isEstCompletee() {
        return estCompletee;
    }

    public void setEstCompletee(boolean estCompletee) {
        this.estCompletee = estCompletee;
    }


}
