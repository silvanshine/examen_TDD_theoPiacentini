package org.example;

public class Tache {

    private double duree = 0;
    private final String titre;
    private final String description;

    boolean estCompletee = false;

    public Tache(String titre, String description) {
        this.titre = titre;
        this.description = description;
    }

    public Tache(String titre, String description, double duree) {
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


    public double getDuree() {
        return duree;
    }

    public String getDescription() {
        return description;
    }

    public String getNom() {
        return titre;
    }

    public String getTitre() {
        return titre;
    }
}
