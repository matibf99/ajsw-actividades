package solid.dependencyinversion.before;

public class Square implements GeometricShape {

    public String color;
    public double length;

    public Square(String color, double length) {
        this.color = color;
        this.length = length;
    }

    public String getColor() {
        return color;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    @Override
    public double area() {
        return Math.pow(length, 2);
    }

    @Override
    public double perimeter() {
        return 4 * length;
    }
}
