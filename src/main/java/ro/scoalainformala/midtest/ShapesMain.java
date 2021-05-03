package ro.scoalainformala.midtest;

import java.util.ArrayList;

public class ShapesMain {

    public static void main(String[] args) {

        ArrayList<Shapes> allShapes = new ArrayList<>();
        allShapes.add(new Triangle(5, 5, 5, 5, "Triangle"));
        allShapes.add(new Rectangles(5, 5, "Rectangle"));
        allShapes.add(new Squares(5));
        allShapes.add(new Circle(5, "Circle"));
        allShapes.add(new Circle(5, "Circle"));

        System.out.println(ShapesCheckerUtil.calculateTotalAreaAndPerimeterUtil(allShapes));

    }
}
