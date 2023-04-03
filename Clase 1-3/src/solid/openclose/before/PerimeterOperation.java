package solid.openclose.before;

import solid.openclose.after.EquilateralTriangle;

import java.util.List;

public class PerimeterOperation {

    public static double perimeter(GeometricShape shape) {
        if (shape instanceof Rectangle)
            return 2 * ( ((Rectangle)shape).getWidth() + ((Rectangle)shape).getHeight() );
        else if (shape instanceof Circle)
            return 2 * Math.PI * ((Circle)shape).getRadius();
        else if (shape instanceof EquilateralTriangle)
            return 3 * ((EquilateralTriangle)shape).getLength();
        else
            return -1;
    }

    public static double sumPerimeter(List<Rectangle> rectangles) {
        return rectangles.stream().mapToDouble(x -> perimeter(x)).sum();
    }
}
