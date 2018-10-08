package fr.parisnanterre.miage.poa.universite.implem;

public enum EchelonBourse {

    public double montantBourse() {
        ZERO, UN, DEUX, TROIS;

        switch (this) {
            case ZERO: return 100.0;
            case UN: return 200.0;
            case DEUX: return 300.0;
            case TROIS: return 400.0;
            default: return 0;
        }
    }
}
