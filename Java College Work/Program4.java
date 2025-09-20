// Program to swap 2 variable without using 3rd variable 
public class Program4 {
    public static void main(String[] args) {
        int a = 10, b=20;
        System.out.println("Value of a is : "+a+" and b is : "+b);
        a = a+b;
        b = a-b;
        a = a-b;
        System.out.println("Value of a is : "+a+" and b is : "+b);
    }
}
