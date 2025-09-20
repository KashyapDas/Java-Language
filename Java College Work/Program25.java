// check no is prime or not using method
import java.util.Scanner;
public class Program25 {
    public static String checkPrint(int a)
    {
        if(a==1 || a==0)
        {
            return "not prime";
        }
        else if((a%2 !=0) || (a%3!=0))
        {
            return "prime";
        }
        return "not prime";
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String result = checkPrint(n);
        System.out.println(result);
        
        sc.close();
    }
}
