package ro.scoalainformala.midtest;

import java.util.ArrayList;

public class ShapesMain {

    public static void main(String[] args) {

        ArrayList<Shapes> allShapes = new ArrayList<>();
        allShapes.add(new Triangle(5, 5, 5, 5));
        allShapes.add(new Rectangle(5, 6));
        allShapes.add(new Square(5));
        allShapes.add(new Circle(5));

        System.out.println(ShapesCheckerUtil.calculateTotalAreaAndPerimeterUtil(allShapes));

    }
}
