package utils;

import utils.interfaces.AreaCalculator;
import Shapes.interfaces.Shape;

import java.util.List;

public class ShapesPrinterImpl implements utils.interfaces.ShapesPrinter {

    //Dependency Inversion - Providing an interface as a field, and when instantiating providing an implementation.
    private final AreaCalculator areaCalculator;

    public ShapesPrinterImpl(AreaCalculator areaCalculator) {
        this.areaCalculator = areaCalculator;
    }

    @Override
    public String json(List<Shape> shapes) {
        return "{shapesSum: %s}".formatted(this.areaCalculator.sum(shapes));
    }
    @Override
    public String csv(List<Shape> shapes) {
        return "shapes_sum,%s".formatted(this.areaCalculator.sum(shapes));
    }
}
