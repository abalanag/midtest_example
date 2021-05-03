package ro.scoalainformala.midtest;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import java.util.ArrayList;


class TestShapesMain {

    @ParameterizedTest
    @ValueSource(doubles = {5})
    void testFunctionShapesCheckerUtil(final double doubles) {

        String[] expectedValues = {"Total area: 141.03981633974485 Total surface 86.41592653589794", "You can't have 2 object of the same size"};


        ArrayList<Shapes> testArray = new ArrayList<>();
        testArray.add(new Triangle(doubles, doubles, doubles, doubles, "Triangle"));
        testArray.add(new Rectangles(doubles, doubles, "Rectangle"));
        testArray.add(new Squares(doubles));
        testArray.add(new Circle(doubles, "Circle"));

        ArrayList<Shapes> testDuplicateArray = new ArrayList<>();
        testDuplicateArray.add(new Triangle(5, 5, 5, 5, "Triangle"));
        testDuplicateArray.add(new Rectangles(5, 5, "Rectangle"));
        testDuplicateArray.add(new Squares(5));
        testDuplicateArray.add(new Circle(5, "Circle"));
        testDuplicateArray.add(new Circle(5, "Circle"));

        ArrayList<ArrayList<Shapes>> listOfArrays = new ArrayList<>();
        listOfArrays.add(testArray);
        listOfArrays.add(testDuplicateArray);

        //for (ArrayList<Shapes> i : listOfArrays) {
        // for (String j : expectedValues) {
        // Assertions.assertEquals(j, ShapesCheckerUtil.calculateTotalAreaAndPerimeterUtil(i));
        // }
        // }

        Assertions.assertEquals(expectedValues[0], ShapesCheckerUtil.calculateTotalAreaAndPerimeterUtil(testArray));
        Assertions.assertEquals(expectedValues[1], ShapesCheckerUtil.calculateTotalAreaAndPerimeterUtil(testDuplicateArray));

    }

}
