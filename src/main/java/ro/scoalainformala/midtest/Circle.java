package ro.scoalainformala.midtest;

import java.util.Objects;

public class Circle extends Shapes {

    private final double radius;

    public Circle(final double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    @Override
    public double calculateArea() {
        return Math.PI * (this.radius * this.radius);
    }

    @Override
    public double calculateSurface() {
        return 2 * Math.PI * this.radius;
    }

    public boolean equals(final Object obj) {
        if (!(obj instanceof Circle)) {
            return false;
        }
        final Circle shapeCircle = (Circle) obj;
        return this.radius == shapeCircle.radius;
    }

    public int hashCode() {
        return Objects.hash(radius);
    }
}
