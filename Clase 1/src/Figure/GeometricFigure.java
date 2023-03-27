package Figure;

import java.util.Objects;

public abstract class GeometricFigure {
    protected String color;

    public GeometricFigure(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public abstract double area();
}
