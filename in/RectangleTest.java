class Rectangle {
    double length;
    double width;

    public void setDimensions(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public double calculateArea() {
        return length * width;
    }

    public double calculatePerimeter() {
        return 2 * (length + width);
    }

    public void display() {
        System.out.println("Area of Rectangle: " + calculateArea());
        System.out.println("Perimeter of Rectangle: " + calculatePerimeter());
    }
}

public class RectangleTest {
    public static void main(String args[]) {
        Rectangle rect = new Rectangle();
        rect.setDimensions(5.0, 3.0);  // Example values
        rect.display();
    }
}
