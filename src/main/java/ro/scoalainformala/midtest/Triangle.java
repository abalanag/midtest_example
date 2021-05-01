package ro.scoalainformala.midtest;

public class Triangle extends Shapes {
    private double sideOne;
    private double sideTwo;
    private double base;
    private double height;

    public Triangle (final double sideOne, final double sideTwo, final double base,
                     final double height, final String shapeType){
        super(shapeType);
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


}
