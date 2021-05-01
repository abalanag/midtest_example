package ro.scoalainformala.midtest;

import java.util.ArrayList;

public class ShapesMain {

    public static void main(String[] args) {


        ArrayList<Shapes> allShapes = new ArrayList<>();
        allShapes.add(new Triangle(25, 25, 25, 25));
        allShapes.add(new Rectangles(25, 25));
        allShapes.add(new Squares(25));
        allShapes.add(new Circle(25));

        System.out.println(ShapesMain.calculateTotalAreaAndPerimeter(allShapes));
    }

    static String calculateTotalAreaAndPerimeter(ArrayList<Shapes> allShapes) {
    double area = 0;
    double surface =0;
        for (Shapes i : allShapes) {
            area += i.calculateArea();
            surface += i.calculateSurface();
        }
        return "Total area: " + area + " Total surface " + surface;
    }
}
