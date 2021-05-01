package ro.scoalainformala.midtest;

public class Circle extends Shapes {

    private double radius;

    public Circle(final double radius) {
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        return Math.PI * (this.radius * this.radius);
    }

    @Override
    public double calculateSurface() {
        return 2 * Math.PI * this.radius;
    }
}
