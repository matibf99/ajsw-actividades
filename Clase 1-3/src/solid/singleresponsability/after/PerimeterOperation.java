package solid.singleresponsability.after;

import java.util.List;

public class PerimeterOperation {

    public static double perimeter(Rectangle rectangle) {
        return 2 * (rectangle.getWidth() + rectangle.getWidth());
    }

    public static double sumPerimeter(List<Rectangle> rectangles) {
        return rectangles.stream().mapToDouble(x -> perimeter(x)).sum();
    }
}
