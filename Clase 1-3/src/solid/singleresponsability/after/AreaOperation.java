package solid.singleresponsability.after;

import java.util.List;

public class AreaOperation {

    public static double area(Rectangle rectangle) {
        return rectangle.getWidth() * rectangle.getHeight();
    }

    public static double sumAreas(List<Rectangle> rectangles) {
        return rectangles.stream().mapToDouble(x -> area(x)).sum();
    }
}
