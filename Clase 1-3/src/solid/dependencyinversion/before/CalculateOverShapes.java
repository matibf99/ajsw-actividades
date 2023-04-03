package solid.dependencyinversion.before;

import java.util.Arrays;
import java.util.List;

public class CalculateOverShapes {

    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        calculator.calculate();

        System.out.println("Area: " + calculator.getTotalArea());
        System.out.println("Perimeter: " + calculator.getTotalPerimeter());
    }
}
