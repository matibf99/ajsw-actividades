package printshapes;

import java.util.List;
import java.util.Random;

public class Person implements Runnable {

    private final String name;
    private final List<GeometricShape> shapes;
    private final int numShapes;

    public Person(String name, List<GeometricShape> shapes, int numShapes) {
        this.name = name;
        this.shapes = shapes;
        this.numShapes = numShapes;

        System.out.println("Created " + name);
    }

    @Override
    public void run() {
        for (int i = 0; i < numShapes; i++) {
            GeometricShape shape = generateRandomShape();
            shapes.add(shape);

            System.out.println(name + " generated " + shape.getName() + " with color " + shape.getColor());

            try {
                Thread.sleep(1000); // simulate some delay before generating next shape
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    private GeometricShape generateRandomShape() {
        Random random = new Random();
        String color = getRandomColor();
        int shapeType = random.nextInt(2); // generate a random number between 0 and 1 (inclusive)

        if (shapeType == 0) {
            return new Circle(color);
        } else {
            return new Square(color);
        }
    }

    private String getRandomColor() {
        Random random = new Random();
        String[] colors = { "red", "green", "blue", "yellow" };
        int index = random.nextInt(colors.length);
        return colors[index];
    }
}
