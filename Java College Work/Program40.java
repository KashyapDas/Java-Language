class MethodOverloading{
    // rectangle
    public void Shape(int l, int b)
    {
        System.out.println("Rectangle is : "+(l*b));
    }
    // circle
    public void Shape(int r)
    {
        System.out.println("Area of circle is : "+(3.14*r*r));
    }
    // square
    public void Shape(double a)
    {
        System.out.println("Area of square is : "+(a*a));
    }

}

public class Program40 {
    public static void main(String[] args) {
        // circle - pie r square
        // rectangle - l * b
        // sqaure - a sqaure
        MethodOverloading m1 = new MethodOverloading();
        m1.Shape(10);
        m1.Shape(10,20);
        m1.Shape(20.5);



    }
}
