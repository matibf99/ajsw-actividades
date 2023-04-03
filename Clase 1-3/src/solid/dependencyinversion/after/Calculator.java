package solid.dependencyinversion.after;

import java.util.Arrays;
import java.util.List;

public class Calculator {

    private double totalPerimeter = 0;
    private double totalArea = 0;

    public void calculate(List<GeometricShape> shapesList) {
        /* La lista se crea dentro de la clase, no se pasa por parámetro */

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
