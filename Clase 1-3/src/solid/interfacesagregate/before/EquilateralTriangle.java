package solid.interfacesagregate.before;

public class EquilateralTriangle implements GeometricShape {

    public String color;
    public double length;

    public EquilateralTriangle(String color, double length) {
        this.length = length;
    }

    public String getColor() {
        return color;
    }

    public double getLength() {
        return length;
    }

    @Override
    public double area() {
        return Math.sqrt(3) * Math.pow(length, 2) / 4;
    }

    @Override
    public double perimeter() {
        return length * 3;
    }
}
