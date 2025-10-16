class Calculatorsss {

    // 1 Add two integers
    public int calculate(int a, int b) {
        return a + b;
    }

    // 2 Multiply two doubles
    public double calculate(double a, double b) {
        return a * b;
    }

    // 3 Subtract three integers
    public int calculate(int a, int b, int c) {
        return a - b - c;
    }

    // 4 Divide two numbers and return double
    public double calculate(int a, double b) {
        return a / b;
    }

    // 5 Square of a number
    public int calculate(int a) {
        return a * a;
    }
}

public class Program42 {
    public static void main(String[] args) {
        Calculatorsss calc = new Calculatorsss();

        System.out.println("Addition (int, int): " + calc.calculate(5, 3));
        System.out.println("Multiplication (double, double): " + calc.calculate(2.5, 4.0));
        System.out.println("Subtraction (int, int, int): " + calc.calculate(20, 5, 3));
        System.out.println("Division (int, double): " + calc.calculate(10, 4.0));
        System.out.println("Square (int): " + calc.calculate(6));
    }
}
