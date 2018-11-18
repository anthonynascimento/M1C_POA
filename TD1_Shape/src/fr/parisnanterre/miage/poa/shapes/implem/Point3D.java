package fr.parisnanterre.miage.poa.shapes.implem;

public class Point3D extends Point2D {
    private double z;

    public Point3D(double x, double y, double z) {
        super(x,y);
        this.z = z;
    }

    public double getZ() {
        return this.z;
    }

    public void setZ(double z) {
        this.z = z;
    }

    public boolean isOrigin() {
        if(this.x == 0 && this.y == 0 && this.z == 0) {
            return true;
        }
        else {
            return false;
        }
    }

    public double distance(Point3D p) {
        return 0;
    }

    @Override
    public String toString() {
        return String.format("(%d, %d, %d)", getX(), getY(), getZ());
    }

}
