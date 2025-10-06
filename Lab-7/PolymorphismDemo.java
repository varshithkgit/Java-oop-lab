class Shape {
    void area() {
        System.out.println("Calculating area of a shape...");
    }
}

class Circle extends Shape {
    double radius;

    Circle(double radius) {
        this.radius = radius;
    }

    void area() {
        System.out.println("Area of Circle: " + (Math.PI * radius * radius));
    }
}

class Rectangle extends Shape {
    double length, breadth;

    Rectangle(double length, double breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    void area() {
        System.out.println("Area of Rectangle: " + (length * breadth));
    }
}

public class PolymorphismDemo {
    public static void main(String[] args) {
        Shape s;
        s = new Circle(5);
        s.area();
        s = new Rectangle(4, 6);
        s.area();
    }
}
