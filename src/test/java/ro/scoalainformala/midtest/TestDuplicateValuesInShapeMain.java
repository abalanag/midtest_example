package ro.scoalainformala.midtest;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import java.util.ArrayList;

public class TestDuplicateValuesInShapeMain {

    @ParameterizedTest
    @ValueSource(doubles = {5})
    void testFunctionShapesCheckerUtil(final double doubles) {

        String[] expectedValues = {"Total area: 141.03981633974485 Total surface 86.41592653589794", "You can't have 2 object of the same size"};


        ArrayList<Shapes> testArray = new ArrayList<>();
        testArray.add(new Triangle(5, 6, 7, 8));
        testArray.add(new Rectangle(9, 10));
        testArray.add(new Square(11));
        testArray.add(new Circle(12));
        testArray.add(new Circle(13));
        testArray.add(new Circle(13));

        Assertions.assertEquals(expectedValues[0], ShapesCheckerUtil.calculateTotalAreaAndPerimeterUtil(testArray));

    }


}
