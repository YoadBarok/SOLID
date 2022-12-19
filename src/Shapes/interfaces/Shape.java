package Shapes.interfaces;

// Interface Segregation: All shapes should be able to fulfill the contract of this interface i.e, calculate their area.
public interface Shape {
    double getArea();
}
