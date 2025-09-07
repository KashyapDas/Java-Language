
import java.util.Scanner;
public class Program7 {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the digit : ");
        int n = sc.nextInt();
        int sum = 0;
        while(n>=1)
        {
            int store = n%10;
            sum = sum + store;
            n = n/10;
        }
        System.out.println("The sum of the digit are : "+sum);
        sc.close();
    }
}
