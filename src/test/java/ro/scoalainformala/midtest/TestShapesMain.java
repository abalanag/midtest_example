package ro.scoalainformala.midtest;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import java.util.ArrayList;


class TestShapesMain {

    @ParameterizedTest
    @ValueSource(doubles = {5})
    void testFunctionShapesCheckerUtil(final double doubles) {

        String[] expectedValues = {"Total area: 1222.3185005736054 Total surface 257.0796326794897", "You can't have 2 object of the same size"};


        ArrayList<Shapes> testArray = new ArrayList<>();
        testArray.add(new Triangle(5, 6, 7, 8));
        testArray.add(new Rectangle(9, 10));
        testArray.add(new Square(11));
        testArray.add(new Circle(12));
        testArray.add(new Circle(13));

        Assertions.assertEquals(expectedValues[0], ShapesCheckerUtil.calculateTotalAreaAndPerimeterUtil(testArray));
    }
}
