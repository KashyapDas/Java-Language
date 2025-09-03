// Print first 'n' natural number
import java.util.Scanner;

public class Programone {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of n : ");
        int n = sc.nextInt();
        for(int i=0; i<=n; i++)
        {
            System.out.print(i+" ");
        }
        sc.close();
    }   
     
}