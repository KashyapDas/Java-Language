import java.util.Scanner;
public class Pattern9{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of n : ");
        int n = sc.nextInt();

        for(int i=0; i<n; i++)
        {
            // print space
            for(int j=0; j<i; j++)
            {
                System.out.print(" ");
            }
            // print star
            for(int j=0; j<(n-i); j++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }

        sc.close();
    }
}