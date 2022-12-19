package utils;

import Shapes.interfaces.Shape;

import java.util.List;

public class AreaCalculatorImpl implements utils.interfaces.AreaCalculator {
    @Override
    public int sum(List<Shape> shapes) {
        int sum = 0;
        for (Shape shape : shapes){
        /*  Open Closed:
        *   instead of doing something like:
        *   if (shape instanceOf Square/Circle/Cube and so on), and change the way of calculation of the area based
        *   on the shape, we simply made all the shapes implement the Shape, interface and have their own implementation
        *   of the getArea method.
        * */
            sum += shape.getArea();
        }

        return sum;
    }

}
