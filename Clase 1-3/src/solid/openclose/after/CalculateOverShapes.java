package solid.openclose.after;

import solid.openclose.before.AreaOperation;
import solid.openclose.before.PerimeterOperation;
import solid.openclose.before.Rectangle;

import java.util.Arrays;
import java.util.List;

public class CalculateOverShapes {

    public static void main(String[] args) {
        List<solid.openclose.before.Rectangle> rectangles = Arrays.asList(
                new solid.openclose.before.Rectangle("white", 12,23),
                new solid.openclose.before.Rectangle("blue", 15, 25),
                new Rectangle("red", 10, 20)
        );

        double sumArea = AreaOperation.sumAreas(rectangles);
        double sumPerimeter = PerimeterOperation.sumPerimeter(rectangles);

        System.out.println("Area: " + sumArea);
        System.out.println("Perimeter: " + sumPerimeter);
    }
}
