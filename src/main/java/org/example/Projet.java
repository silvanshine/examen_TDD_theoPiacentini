package org.example;

import java.util.ArrayList;
import java.util.List;

public class Projet {
    String nom;
    List<Tache> taches = new ArrayList<>() ;

    public Projet(String nom) {
        this.nom = nom;
    }

    int calculerDureeTotale(List<Tache> taches) {
        return 0;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }
}
