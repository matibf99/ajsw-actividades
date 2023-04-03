package printfigures;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<GeometricShape> shapes = Collections.synchronizedList(new ArrayList<>());

        Person person1 = new Person("Person 1", shapes, 5);
        Person person2 = new Person("Person 2", shapes, 5);

        Printer circlePrinter = new Printer("Circle", shapes);
        Printer squarePrinter = new Printer("Square", shapes);

        Thread person1Thread = new Thread(person1);
        Thread person2Thread = new Thread(person2);
        Thread circlePrinterThread = new Thread(circlePrinter);
        Thread squarePrinterThread = new Thread(squarePrinter);

        person1Thread.start();
        person2Thread.start();
        circlePrinterThread.start();
        squarePrinterThread.start();
    }
}
