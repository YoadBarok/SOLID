package Shapes;

import Shapes.interfaces.ThreeDimensionalShape;

//This is a 3d shape therefore it implements the ThreeDimensionalShape interface.
public class Cube implements ThreeDimensionalShape {

    private final int length;

    public Cube(int length) {
        this.length = length;
    }

    @Override
    public double getArea() {
        return 6 * (Math.pow(this.length, 2));
    }

    @Override
    public double getVolume() {
        return Math.pow(this.length, 3);
    }
}
