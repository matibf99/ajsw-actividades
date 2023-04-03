package solid.dependencyinversion.before;

import java.util.Arrays;
import java.util.List;

public class Calculator {

    private double totalPerimeter = 0;
    private double totalArea = 0;

    public void calculate() {
        List<GeometricShape> shapesList = Arrays.asList(
                new Rectangle("white", 12,23),
                new Square("white", 7),
                new Rectangle("white", 18,4),
                new EquilateralTriangle("white", 8)
        );

        totalArea = this.sumAreas(shapesList);
        totalPerimeter = this.sumPerimeter(shapesList);
    }

    public double sumAreas(List<GeometricShape> shapes) {
        return shapes.stream().mapToDouble(s -> AreaOperation.area(s)).sum();
    }

    public double sumPerimeter(List<GeometricShape> shapes) {
        return shapes.stream().mapToDouble(r -> PerimeterOperation.perimeter(r)).sum();
    }

    public double getTotalArea() {
        return totalArea;
    }

    public double getTotalPerimeter() {
        return totalPerimeter;
    }
}
