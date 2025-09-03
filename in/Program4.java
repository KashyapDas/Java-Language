// factorial number

import java.util.Scanner;

public class Program4 {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the factorial input : ");
        int n = sc.nextInt();
        int fac = 1;
        for(int i=1; i<=n; i++)
        {
            fac *= i;
        }
        System.out.println("Factorial is : "+fac);
        sc.close();
    }   
}
