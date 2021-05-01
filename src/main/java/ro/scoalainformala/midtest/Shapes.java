package ro.scoalainformala.midtest;

public abstract class Shapes {

    private String shapeType;

    public abstract double calculateSurface ();

    public abstract double calculateArea ();

    public Shapes (final String shapeType) {
        this.shapeType = shapeType;
    }

    @Override
    public boolean equals(final Object obj) {
        if (!(obj instanceof Shapes)) {
            return false;
        }
        final Shapes shape = (Shapes) obj;
        return this.shapeType.equals(((Shapes) obj).shapeType);
    }
}
