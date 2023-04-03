package solid.openclose.before;

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
}
