
import java.util.Scanner;
public class Program8 {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the digit : ");
        int n = sc.nextInt();
        int count = 0;
        while(n>=1)
        {
            count++;
            n = n/10;
        }
        System.out.println("No of digit present : "+count);
        sc.close();
    }
}
