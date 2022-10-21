package int101.geometry;

public class Sphere {
    private double radius; // non-static field / instance variable
    private String color;
    public Sphere(double radius) {
        this.radius = radius;
    }


    public double computeVolume() {
        return Math.PI * 4.0/3.0 * radius * radius * radius;
    }
    public double computeSurface() {
        return Math.PI * 4.0 * radius * radius;
    }

    public double compareVolume(Sphere s) {
        return s.computeVolume() / this.computeVolume();
    }

    public double getRadius() {
        return radius;
    }
    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }
    public void setColor(String c) {
        color = c;
    }
}