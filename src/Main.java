import Shapes.*;
import utils.AreaCalculatorImpl;
import utils.interfaces.AreaCalculator;
import Shapes.interfaces.Shape;
import utils.ShapesPrinterImpl;

import java.util.List;

public class Main {
    public static void main(String[] args) {

        // Dependency Inversion: We are instantiating an implementation of the AreaCalculator interface.
        AreaCalculator areaCalculator = new AreaCalculatorImpl();
        // Dependency Inversion: We are instantiating an implementation of the ShapesPrinter interface,
        // and passing the implementation of the AreaCalculator interface into the constructor.
        ShapesPrinterImpl printer = new ShapesPrinterImpl(areaCalculator);

        // Instantiating our shapes:
        Circle circle = new Circle(10);
        Square square = new Square(10);
        Cube cube = new Cube(10);

        List<Shape> shapes = List.of(
                circle,
                square,
                cube
        );

        // Dependency Inversion:
        // Note that since the ShapesPrinter has an AreaCalculator, the calculation happens
        // as part of these method calls. We didn't have to do something like:
        // int sum = areaCalculator.sum(shapes), and then pass that into the printer.
        System.out.println(printer.json(shapes));
        System.out.println(printer.csv(shapes));
    }
}