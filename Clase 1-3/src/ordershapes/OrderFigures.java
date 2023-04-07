package ordershapes;

import java.util.*;

public class OrderFigures {

    public static void main(String[] args) {
        List<GeometricShape> shapes = Arrays.asList(
                new Circle("white", 10),
                new Rectangle("red", 1, 1),
                new Square("blue", 2),
                new EquilateralTriangle("black", 100)
        );

        // Lambda
        System.out.println("Lambda -> o1 - o2 (area)");
        shapes.sort((o1, o2) -> (int) (o1.area() - o2.area()));
        shapes.forEach((shape -> System.out.println(shape.area())));

        System.out.println("Lambda -> o2 - o1 (area)");
        shapes.sort((o1, o2) -> (int) (o2.area() - o1.area()));
        shapes.forEach((shape -> System.out.println(shape.area())));

        // Collections.sort
        System.out.println("Collections.sort -> o1 - o2 (area)");
        Collections.sort(shapes, new Comparator<>() {
            @Override
            public int compare(GeometricShape o1, GeometricShape o2) {
                return (int) (o1.area() - o2.area());
            }
        });
        shapes.forEach((shape) -> System.out.println(shape.area()));
    }
}
