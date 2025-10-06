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

public class CircleDemo {
    public static void main(String[] args) {
        Shape s = new Circle(7);
        s.area();
    }
}

