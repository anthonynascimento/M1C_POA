package fr.parisnanterre.miage.poa.universite.implem;

import fr.parisnanterre.miage.poa.universite.api.IPersonnel;

public abstract class Personnel implements IPersonnel {

    private String nom;
    private String prenom;
    private NumeroPersonnel numero;

    public Personnel(String nom, String prenom, Date dateEntree, int numeroOrdre) {
        this.nom = nom;
        this.prenom = prenom;
        this.numero = new NumeroPersonnel(dateEntree,numeroOrdre);
    }

    public String nom() {
        return nom;
    }

    public String prenom() {
        return prenom;
    }

    public String numero() {
        return numero.numero();
    }
}
