package fr.parisnanterre.miage.poa.shapes.api;
import fr.parisnanterre.miage.poa.shapes.implem.Point3D;

//import java.awt.geom.Point2D;

public interface Translatable3D {
    Point3D getRefPoint();
    void translate(double dx, double dy);

}
