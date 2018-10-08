package fr.parisnanterre.miage.poa.universite.implem;

import fr.parisnanterre.miage.poa.universite.api.INumero;

public class NumeroPersonnel implements INumero {
    private Date dateEntree;
    private int numeroOrdre;

    NumeroPersonnel(Date dateEntree, int numeroOrdre) {
        this.dateEntree = dateEntree;
        this.numeroOrdre = numeroOrdre;
    }

    @Override
    public String numero() {
        return this.toString();
    }

    @Override
    public String toString() {
        return "NumeroPersonnel{" +
                "dateEntree=" + dateEntree +
                ", numeroOrdre=" + numeroOrdre +
                '}';
    }
}

