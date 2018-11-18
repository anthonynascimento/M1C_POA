package fr.parisnanterre.miage.poa.shapes.implem;

public class Point2D {
    double x;
    double y;

    public Point2D(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public boolean isOrigin() {
        if(this.x == 0 && this.y == 0) {
            return true;
        }
        else {
            return false;
        }
    }

    public double distance(Point2D p) {
        return Math.sqrt((p.getX()-this.x)*(p.getX()-this.x)+(p.getY()-this.y)*(p.getY()-this.y));
    }

    @Override
    public String toString() {
        return String.format("(%d, %d)", getX(), getY());
    }

}
