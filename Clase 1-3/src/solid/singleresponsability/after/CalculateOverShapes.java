package solid.singleresponsability.after;

import java.util.Arrays;
import java.util.List;

public class CalculateOverShapes {

    public static void main(String[] args) {
        List<Rectangle> rectangles = Arrays.asList(
                new Rectangle("white", 12,23),
                new Rectangle("blue", 15, 25),
                new Rectangle("red", 10, 20)
        );

        double sumArea = AreaOperation.sumAreas(rectangles);
        double sumPerimeter = PerimeterOperation.sumPerimeter(rectangles);

        System.out.println("Area: " + sumArea);
        System.out.println("Perimeter: " + sumPerimeter);
    }
}
