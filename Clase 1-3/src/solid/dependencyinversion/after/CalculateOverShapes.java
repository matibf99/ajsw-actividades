package solid.dependencyinversion.after;

import java.util.Arrays;
import java.util.List;

public class CalculateOverShapes {

    public static void main(String[] args) {
        List<GeometricShape> shapes = Arrays.asList(
                new Rectangle("white", 12,23),
                new Rectangle("blue", 15, 25),
                new Rectangle("red", 10, 20)
        );

        Calculator calculator = new Calculator();
        calculator.calculate(getShapesList());

        System.out.println("Area: " + calculator.getTotalArea());
        System.out.println("Perimeter: " + calculator.getTotalPerimeter());
    }

    private static List<GeometricShape> getShapesList() {
        return Arrays.asList(
                new Rectangle("white", 12,23),
                new Square("white", 7),
                new Rectangle("white", 18,4),
                new EquilateralTriangle("white", 8)
        );
    }
}
