package ro.scoalainformala.midtest;

import java.util.Objects;

public class Triangle extends Shapes {
    private final double sideOne;
    private final double sideTwo;
    private final double base;
    private final double height;

    public Triangle(final double sideOne, final double sideTwo, final double base,
                    final double height) {
        this.sideOne = sideOne;
        this.sideTwo = sideTwo;
        this.base = base;
        this.height = height;
    }

    @Override
    public double calculateArea() {
        return 0.5 * (base * height);
    }

    @Override
    public double calculateSurface() {
        return sideTwo + sideOne + base;
    }

    public double getSideOne() {
        return sideOne;
    }

    public double getSideTwo() {
        return sideTwo;
    }

    public double getBase() {
        return base;
    }

    public double getHeight() {
        return height;
    }

    public boolean equals(final Object obj) {
        if (!(obj instanceof Triangle)) {
            return false;
        }
        final Triangle shapeTriangle = (Triangle) obj;
        return this.sideOne == shapeTriangle.sideOne && this.sideTwo == shapeTriangle.sideTwo
                && this.base == shapeTriangle.base && this.height == shapeTriangle.base;
    }

    public int hashCode() {
        return Objects.hash(sideOne, sideTwo, base, height);
    }


}
