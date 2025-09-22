// Program to find the fibonaccie series upto to n terms using recursion

import java.util.Scanner;;
public class Program30 {
    public static int fibo(int n)
    {
        if(n==0 || n==1) return n;
        return fibo(n-1) + fibo(n-2);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no of term...");
        int term = sc.nextInt();
        sc.close();
        if(term<1)
        {
            System.out.println("Enter a positive interger...");
        }
        else{
            for(int i=0; i<term; i++)
            {   
                System.out.println(fibo(i));
            }
        }
    }
}
