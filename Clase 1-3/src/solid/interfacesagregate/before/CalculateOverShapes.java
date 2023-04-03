package solid.interfacesagregate.before;

import java.util.Arrays;
import java.util.List;

public class CalculateOverShapes {

    public static void main(String[] args) {
        List<GeometricShape> shapes = Arrays.asList(
                new Rectangle("white", 12,23),
                new Rectangle("blue", 15, 25),
                new Rectangle("red", 10, 20)
        );

        double sumArea = AreaOperation.sumAreas(shapes);
        double sumPerimeter = PerimeterOperation.sumPerimeter(shapes);

        System.out.println("Area: " + sumArea);
        System.out.println("Perimeter: " + sumPerimeter);
    }
}
