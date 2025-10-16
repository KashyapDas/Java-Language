class Calculator{
    public int add(int num1, int num2)
    {
        return (num1+num2);
    }
    public double add(double num1, double num2)
    {
        return (num1+num2);
    }
    public int add(int num1, int num2, int num3)
    {
        return (num1+num2+num3);
    }
}

public class Program39 {
    public static void main(String[] args) {
        Calculator c1 = new Calculator();
        int result1 = c1.add(10, 20);
        double result2 = c1.add(20.5, 50.3);
        int result3 = c1.add(10,30,50);
        System.out.println("Sum of 2 integers : "+result1);
        System.out.println("Sum of 2 doubles : "+result2);
        System.out.println("Sum of 3 integers : "+result3);
    }
}
