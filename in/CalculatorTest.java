class Calculator {
    public int add(int a, int b) {
        return a + b;
    }
}

public class CalculatorTest {
    public static void main(String args[]) {
        Calculator calc = new Calculator();
        int result = calc.add(10, 20);  // Example numbers
        System.out.println("Sum: " + result);
    }
}
