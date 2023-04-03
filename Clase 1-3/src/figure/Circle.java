package figure;

import java.util.Objects;

public class Circle extends GeometricFigure {
    private double radius;

    public Circle(String color, double radius) {
        super(color);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    @Override
    public double area() {
        return Math.PI * radius * radius;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Circle circle = (Circle) o;

        return Double.compare(circle.radius, radius) == 0 && Objects.equals(circle.color, color);
    }

    @Override
    public int hashCode() {
        return Objects.hash(radius);
    }
}
