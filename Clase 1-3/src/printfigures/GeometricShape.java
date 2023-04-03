package printfigures;

public abstract class GeometricShape {
    private static int counter = 0;

    private int number;
    protected String name;
    private String color;
    private boolean printed;

    public GeometricShape(String color) {
        this.number = ++counter;
        this.color = color;
        this.printed = false;
    }

    public int getNumber() {
        return number;
    }

    public String getName() {
        return name;
    }

    public String getColor() {
        return color;
    }

    public boolean isPrinted() {
        return printed;
    }

    public void setPrinted(boolean printed) {
        this.printed = printed;
    }
}
