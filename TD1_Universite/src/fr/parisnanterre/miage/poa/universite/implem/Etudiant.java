package fr.parisnanterre.miage.poa.universite.implem;

import fr.parisnanterre.miage.poa.universite.api.IBoursier;

public class Etudiant extends Personnel implements IBoursier {

    private int echelon;

    public Etudiant(String nom, String prenom, Date dateEntree, int numeroOrdre, int echelon) {
        super(nom, prenom, dateEntree, numeroOrdre);
    }


    @Override
    public double montantBoursier() {
        switch (echelon) {
            case 0: return 100.0;
            case 1: return 200.0;
            case 2
        }
    }



}
