package fr.parisnanterre.miage.poa.shapes.implem;

public class RevolutionCone extends  Shape3D{
    private double height;
    private double radius;
    private Point3D center;

    public RevolutionCone(double radius, Point3D p) {
        this.height = 0;
        this.radius = radius;
        this.center = p;
    }

    public double apothem() {
        return 0;
    }
}
