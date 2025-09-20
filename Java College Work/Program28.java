// caculate the fibonaccie series upto to n terms using method
import java.util.Scanner;;
public class Program28 {
    public static void printFibo(int n)
    {
        int first = 1; 
        int second = 0;
        System.out.print("Fibo series are : ");
        for(int i=0; i<=n; i++)
        {
            System.out.print(first + " ");
            int next = first + second;
            first = second;
            second = next;
        }
        System.out.println();
    
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no of term : ");
        int n = sc.nextInt();
        printFibo(n);
        sc.close();
    }
}
