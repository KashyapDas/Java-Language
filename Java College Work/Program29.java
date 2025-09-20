// find the sum of n natural number using recursion

import java.util.Scanner;
public class Program29 {
    public static int sumN(int n)
    {
        if(n==1) return 1;
        return n+sumN(n-1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a positive interger N : ");

        int n = sc.nextInt();
        sc.close();
        if(n>0)
        {
            int sum = sumN(n);
            System.out.println(sum);
        }
        else{
            System.out.println("Enter a positive integer...");
        }
    }    
}
