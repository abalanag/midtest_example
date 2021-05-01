package ro.scoalainformala.midtest;

public class Rectangles extends Shapes {
    private double width;
    private double length;

    public Rectangles (final double width, final double length, final String shapeType) {
        super(shapeType);
        this.width = width;
        this.length = length;
    }


    @Override
    public double calculateSurface() {
        return 2 * (this.width + this.length);
    }

    @Override
    public double calculateArea() {
        return this.width * this.length;
    }
}
