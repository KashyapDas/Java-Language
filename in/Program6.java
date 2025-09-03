
import java.util.Scanner;
public class Program6 {
    public static void main(String args[])
    {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the no : ");
        int n = sc.nextInt();
        while(n>=1)
        {
            int store = n%10;
            System.out.print(store);
            n = n/10;
        }
        sc.close();
    }    
}
