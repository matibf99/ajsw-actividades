package solid.singleresponsability.before;

import java.util.List;

public class Rectangle {

    private String color;
    private double width;
    private double height;

    public Rectangle(String color, double width, double height) {
        this.width = width;
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }

    public String getColor() {
        return color;
    }

    public static double area(Rectangle rectangle){
        return rectangle.getWidth() * rectangle.getHeight();
    }

    public static double perimeter(Rectangle rectangle){
        return 2 * (rectangle.getWidth() + rectangle.getHeight());
    }

    public static double sumAreas(List<Rectangle> rectangles) {
        return rectangles.stream().mapToDouble(r -> Rectangle.area(r)).sum();
    }

    public static double sumPerimeter(List<Rectangle> rectangles) {
        return rectangles.stream().mapToDouble(r -> Rectangle.perimeter(r)).sum();
    }
}
