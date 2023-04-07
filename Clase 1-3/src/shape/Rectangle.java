package shape;

import java.util.Objects;

public class Rectangle extends GeometricFigure {
    private double width;
    private double height;

    public Rectangle(String color, double width, double height) {
        super(color);
        this.width = width;
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }

    @Override
    public double area() {
        return width * height;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Rectangle rectangle = (Rectangle) o;

        return Double.compare(rectangle.width, width) == 0 && Double.compare(rectangle.height, height) == 0 &&
                Objects.equals(color, rectangle.color);
    }

    @Override
    public int hashCode() {
        return Objects.hash(width, height);
    }

}
