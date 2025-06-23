// Base class Shape
class Shape {
    double area() {
        System.out.println("Calculating area...");
        return 0;
    }
}

// Subclass for Triangle
class Triangle extends Shape {
    double base, height;

    Triangle(double b, double h) {
        base = b;
        height = h;
    }

    @Override
    double area() {
        return 0.5 * base * height;
    }
}

// Subclass for Square
class Square extends Shape {
    double side;

    Square(double s) {
        side = s;
    }

    @Override
    double area() {
        return side * side;
    }
}

// Main class
public class ShapeExample {
    public static void main(String[] args) {
        Shape triangle = new Triangle(4, 5);   // base=4, height=5
        Shape square = new Square(6);          // side=6

        System.out.println("Area of Triangle: " + triangle.area());
        System.out.println("Area of Square: " + square.area());
    }
}
