package Shapes.interfaces;

// Interface Segregation: Only 3d shapes can calculate their volume, therefore, this interface will extend Shape and
// should only be implemented by classes of 3d shapes.
public interface ThreeDimensionalShape extends Shape {
    double getVolume();
}
