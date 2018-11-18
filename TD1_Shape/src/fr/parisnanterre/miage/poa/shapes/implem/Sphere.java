package fr.parisnanterre.miage.poa.shapes.implem;



public class Sphere extends Shape3D {
    private double radius;
    private Point3D center;

    public Sphere(Point3D p) {
        this.radius = 0;
        this.center = p;
    }
}
