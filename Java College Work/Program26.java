// find factorial of a no using method
import java.util.Scanner;
public class Program26 {
    public static int findFac(int n)
    {
        int fact = 1;
        for(int i=1; i<=n; i++)
        {
            fact *= i;
        }
        return fact;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int result = findFac(n);
        System.out.println("The factorial is : "+result);
        sc.close();
    }
}
