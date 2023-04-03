package solid.liskov.after;


public class TestSquareArea {

    public static void main(String[] args) {
        Square square = new Square("red", 10);
        square.setLength(5);

        System.out.println("Area: " + square.area() + ". Area esperada: 25");
    }
}
