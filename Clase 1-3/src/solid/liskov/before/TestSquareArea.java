package solid.liskov.before;

public class TestSquareArea {

    public static void main(String[] args) {
        Rectangle rectangle = new Square("white", 5);
        rectangle.setWidth(10);
        rectangle.setHeight(5);

        System.out.println("Area: " + rectangle.area() + ". Area esperada: 25");
        /* El área devuelta es 50.0.
        * Si la clase A es un subtipo de la clase B, entonces deberíamos poder
        * reemplazar B con A sin interrumpir el comportamiento de nuestro programa. */
    }
}
