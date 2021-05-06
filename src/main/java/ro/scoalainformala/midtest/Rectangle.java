package ro.scoalainformala.midtest;

import java.util.Objects;

public class Rectangle extends Shapes {
    private double width;
    private double length;

    public Rectangle(final double width, final double length) {

        this.width = width;
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public double getLength() {
        return length;
    }

    @Override
    public double calculateSurface() {
        return 2 * (this.width + this.length);
    }

    @Override
    public double calculateArea() {
        return this.width * this.length;
    }

    public boolean equals(final Object obj) {
        if (!(obj instanceof Rectangle)) {
            return false;
        }
        final Rectangle shape = (Rectangle) obj;
        return this.width == shape.width && this.length == shape.length;
    }

    public int hashCode() {
        return Objects.hash(width, length);
    }
}
