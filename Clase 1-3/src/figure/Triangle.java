package figure;

import java.util.Objects;

public class Triangle extends GeometricFigure {
    public double base;
    public double height;

    public Triangle(String color, double base, double height) {
        super(color);
        this.base = base;
        this.height = height;
    }

    public double getBase() {
        return base;
    }

    public double getHeight() {
        return height;
    }

    @Override
    public double area() {
        return base * height * 0.5;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Triangle triangle = (Triangle) o;

        return Double.compare(triangle.base, base) == 0 && Double.compare(triangle.height, height) == 0 &&
                Objects.equals(triangle.color, color);
    }

    @Override
    public int hashCode() {
        return Objects.hash(base, height);
    }
}
