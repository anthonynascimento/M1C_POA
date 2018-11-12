package batiment.model;

import batiment.model.base.Truc;
import batiment.model.base.Bureau;
import batiment.model.base.Lamp;
import batiment.model.base.Lit;
import batiment.model.base.Piece;
import batiment.model.base.Univers;
import batiment.model.visiteur.Visiteur;
import batiment.model.visiteur.VisiteurComptage;
import batiment.model.visiteur.VisiteurFrancais;

public class Main {
    public static void main(String[] args) {
        Truc l = new Lit();
        Piece p = new Piece("chambre");
        p.ajouter(l);
        Univers u = new Univers();
        u.ajouter(p);
        Bureau b = new Bureau();
        p.ajouter(b);
        Truc x = new Lamp();
        p.ajouter(x);
        Visiteur v = new VisiteurComptage();
        u.accept(v);
        System.out.println(v.value());
    }
}
