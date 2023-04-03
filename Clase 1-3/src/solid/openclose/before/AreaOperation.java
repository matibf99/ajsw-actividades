package solid.openclose.before;

import solid.openclose.after.EquilateralTriangle;

import java.util.List;

public class AreaOperation {

    public static double area(GeometricShape shape) {
        if (shape instanceof Rectangle)
            return ((Rectangle)shape).getWidth() * ((Rectangle)shape).getHeight();
        else if (shape instanceof Circle)
            return Math.PI * ((Circle)shape).getRadius() * ((Circle)shape).getRadius();
        else if (shape instanceof EquilateralTriangle)
            return Math.sqrt(3) * Math.pow(((EquilateralTriangle)shape).getLength(), 2) / 4;
        else
            return -1;
    }

    public static double sumAreas(List<Rectangle> rectangles) {
        return rectangles.stream().mapToDouble(x -> area(x)).sum();
    }
}
