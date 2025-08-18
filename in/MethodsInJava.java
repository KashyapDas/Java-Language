package in;

public class MethodsInJava {

    public static void print()
    {
        System.out.println("Hello world");
    }

    public static void print(int a)
    {
        System.out.println("This is "+a);
    }

    public static int print(int a, int b)
    {
        int c = a+b;
        return c; 
    }

    public static void main(String[] args)
    {
        print();
        print();
        print(10);
        print(10,20);

    }
}
