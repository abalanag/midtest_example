package ro.scoalainformala.midtest;

import java.util.ArrayList;

public class ShapesMain {

    public static void main(String[] args) {

        ArrayList<Shapes> allShapes = new ArrayList<>();
        allShapes.add(new Triangle(25, 25, 25, 25, "Triangle"));
        allShapes.add(new Rectangles(25, 25, "Rectangle"));
        allShapes.add(new Squares(25));
        allShapes.add(new Circle(25, "Circle"));
        allShapes.add(new Circle(25, "Circle"));

        System.out.println(ShapesMain.calculateTotalAreaAndPerimeter(allShapes));


    }

    static Boolean checkForSimilarShapes(ArrayList<Shapes> allShapes) {

        for (int i = 0; i < allShapes.size() - 1; i++) {
            for (int j = i + 1; j < allShapes.size(); j++) {
                if (allShapes.get(i).equals(allShapes.get(j))) {
                    return true;
                }
            }
        }
        return false;
    }

    static String calculateTotalAreaAndPerimeter(ArrayList<Shapes> allShapes) {
        if (checkForSimilarShapes(allShapes)) {
            return "You can't have 2 object of the same size";
        } else {
            double area = 0;
            double surface = 0;
            for (Shapes i : allShapes) {

                area += i.calculateArea();
                surface += i.calculateSurface();
            }
            return "Total area: " + area + " Total surface " + surface;
        }
    }
}
