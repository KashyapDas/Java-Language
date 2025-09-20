// print the fibonaccie series
import java.util.Scanner;

public class Program18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int first = 0;
        int second = 1;
        int next = 0;
        for(int i=2; i<=n; i++)
        {
            next = first+second;
            first = second;
            second = next;
            System.out.println(next);
        }
        sc.close();
    }
}
