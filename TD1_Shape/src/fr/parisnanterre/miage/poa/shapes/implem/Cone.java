package fr.parisnanterre.miage.poa.shapes.implem;

public class Cone extends Shape3D {
    private double height,radius;

    public Cone(double height, double radius) {
        this.height = height;
        this.radius = radius;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double volume() {
        return Math.PI*Math.pow(this.radius,2.0)*this.height/3;
    }

    public double surface() {
        return Math.PI*this.radius*Math.sqrt(Math.pow(this.radius,2.0) + Math.pow(this.height,2.0));
    }
}