package printshapes;

import java.util.List;

public class Printer implements Runnable {

    private final String name;
    private final List<GeometricShape> shapes;

    public Printer(String name, List<GeometricShape> shapes) {
        this.name = name;
        this.shapes = shapes;

        System.out.println("Created printer " + name);
    }

    @Override
    public void run() {
        String lastColor = null;

        while (true) {
            GeometricShape shapeToPrint = null;

            synchronized (shapes) {
                for (GeometricShape shape : shapes) {
                    if (!shape.isPrinted() && shape.getName().equals(name)) {
                        shapeToPrint = shape;
                        break;
                    }
                }

                if (shapeToPrint != null) {
                    shapeToPrint.setPrinted(true);
                    String color = shapeToPrint.getColor();

                    if (color.equals(lastColor)) {
                        System.out.println("Printer " + name + " printing shape #" + shapeToPrint.getNumber() + ": " + shapeToPrint.getName() + " with color " + color);
                    } else {
                        System.out.println("Printer " + name + " changing color to " + color);

                        try {
                            Thread.sleep(1000); // wait some time before printing
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }

                        System.out.println("Printer " + name + " printing shape #" + shapeToPrint.getNumber() + ": " + shapeToPrint.getName() + " with color " + color);
                    }

                    lastColor = color;
                }
            }

            if (shapeToPrint == null) {
                try {
                    Thread.sleep(1000); // wait some time before checking again
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            } else {
                try {
                    Thread.sleep(2000); // simulate some delay before printing next shape
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }

}
