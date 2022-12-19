package utils.interfaces;

import Shapes.interfaces.Shape;

import java.util.List;

// Single Responsibility: All this interface does is printing the list of shapes in different formats.
public interface ShapesPrinter {
    String json(List<Shape> shapes);

    String csv(List<Shape> shapes);

}
