import Figure.Circle;
import Figure.Rectangle;
import Figure.Triangle;

public class Main {
    public static void main(String[] args) {
        // Create four circles. Then, check if they're equal and print their hashes.
        Circle circle1 = new Circle("white", 5);
        Circle circle2 = new Circle("white", 5);
        Circle circle3 = new Circle("red", 5);
        Circle circle4 = new Circle("white", 2);

        System.out.println("Circle 1 and 2 are equal: " + circle1.equals(circle2));
        System.out.println("Circle 1 and 3 are equal: " + circle1.equals(circle3));
        System.out.println("Circle 1 and 4 are equal: " + circle1.equals(circle4));

        System.out.println("Circle 1 hash: " + circle1.hashCode());
        System.out.println("Circle 2 hash: " + circle2.hashCode());
        System.out.println("Circle 3 hash: " + circle3.hashCode());
        System.out.println("Circle 4 hash: " + circle4.hashCode());

        // Do the same for rectangles.
        Rectangle rectangle1 = new Rectangle("blue", 10, 15);
        Rectangle rectangle2 = new Rectangle("blue", 10, 15);
        Rectangle rectangle3 = new Rectangle("black", 10, 15);
        Rectangle rectangle4 = new Rectangle("blue", 12, 15);

        System.out.println("Rectangle 1 and 2 are equal: " + rectangle1.equals(rectangle2));
        System.out.println("Rectangle 1 and 3 are equal: " + rectangle1.equals(rectangle3));
        System.out.println("Rectangle 1 and 4 are equal: " + rectangle1.equals(rectangle4));

        System.out.println("Rectangle 1 hash: " + rectangle1.hashCode());
        System.out.println("Rectangle 2 hash: " + rectangle2.hashCode());
        System.out.println("Rectangle 3 hash: " + rectangle3.hashCode());
        System.out.println("Rectangle 4 hash: " + rectangle4.hashCode());

        // For triangles
        Triangle triangle1 = new Triangle("red", 5, 10);
        Triangle triangle2 = new Triangle("red", 5, 10);
        Triangle triangle3 = new Triangle("white", 5, 10);
        Triangle triangle4 = new Triangle("red", 10, 10);

        System.out.println("Triangle 1 and 2 are equal: " + triangle1.equals(triangle2));
        System.out.println("Triangle 1 and 3 are equal: " + triangle1.equals(triangle3));
        System.out.println("Triangle 1 and 4 are equal: " + triangle1.equals(triangle4));

        System.out.println("Triangle 1 hash: " + triangle1.hashCode());
        System.out.println("Triangle 2 hash: " + triangle2.hashCode());
        System.out.println("Triangle 3 hash: " + triangle3.hashCode());
        System.out.println("Triangle 4 hash: " + triangle4.hashCode());
    }
}