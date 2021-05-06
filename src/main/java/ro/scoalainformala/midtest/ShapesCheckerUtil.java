package ro.scoalainformala.midtest;

import java.util.List;

public class ShapesCheckerUtil {
    static Boolean checkForSimilarShapesUtil(List<Shapes> allShapes) {

        for (int i = 0; i < allShapes.size() - 1; i++) {
            for (int j = i + 1; j < allShapes.size(); j++) {
                if (allShapes.get(i).equals(allShapes.get(j))) {
                    return true;
                }
            }
        }
        return false;
    }

    static String calculateTotalAreaAndPerimeterUtil(List<Shapes> allShapes) {
        if (checkForSimilarShapesUtil(allShapes)) {
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
