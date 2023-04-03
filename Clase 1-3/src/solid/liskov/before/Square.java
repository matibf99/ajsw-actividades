package solid.liskov.before;

public class Square extends Rectangle {

    private Square(String color, double x, double y) {
        super(color, x, y);
    }

    public Square(String color, double x) {
        super(color, x, x);
    }
}
