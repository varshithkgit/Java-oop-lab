class Shape {
    void area() {
        System.out.println("Calculating area of a shape...");
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

public class RectangleDemo {
    public static void main(String[] args) {
        Shape s = new Rectangle(8, 5);
        s.area();
    }
}

