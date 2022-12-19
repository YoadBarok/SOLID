package Shapes;

import Shapes.interfaces.Shape;

// Liskov Substitution: This class is unable to fulfill the contract of the Shape interface properly and therefore
// SHOULD NOT implement that interface.
public class NoShape implements Shape {
    @Override
    public double getArea() {
        throw new IllegalStateException(
                "Cannot calculate area");
    }
}
