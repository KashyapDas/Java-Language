package in;

import java.util.Scanner;

public class InputScanner {
    public static void main(String[] agrs)
    {
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);

        // Taking input and print it as an output
        System.out.print("Enter your age");
        int age = sc.nextInt();
        sc.nextLine();
        System.out.println("Your age is : "+age);        

        // Take input only single word
        System.out.print("Enter your name : ");
        String name = sc.next();
        System.out.println("Your name is : "+name);

        // Take line as an input
        System.out.print("Tell me your full name");
        String fullName = sc.nextLine();
        System.out.println(fullName);

    }
}
