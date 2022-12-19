package utils.interfaces;

import Shapes.interfaces.Shape;

import java.util.List;

// Single Responsibility: all this interface does, is calculating the sum of all the shapes in a List of shapes.
public interface AreaCalculator {
    int sum(List<Shape> shapes);
}
