class Calculator{
    public int add(int num1, int num2)
    {
        return num1 + num2;
    }
}

public class Java41 {
    public static void main(String[] args) {
        Calculator c1 = new Calculator();
        int result = c1.add(10, 20);
        System.out.println("The result was : "+result);
    }
}
