import java.util.Scanner;
public class Pattern13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of N : ");
        int size = sc.nextInt();
        int n = size/2;

        // 1st part
        for(int i=0; i<n; i++)
        {
            // 1.1
            for(int j=0; j<=(n-(i+1)); j++)
            {
                System.out.print("* ");
            }
            // 1.2
            for(int j=0; j<2*i+1 ; j++)
            {
                System.out.print("  ");
            }
            // 1.3
            for(int j=0; j<n; j++)
            {
                if(j>=i)
                    System.out.print("* ");
            }
            System.out.println();
        }
        // 2nd part
        for(int i=1; i<=n; i++)
        {
            // 2.1
            for(int j=1; j<=i; j++)
            {
                System.out.print("* ");
            }
            // System.out.println();
            // 2.2
            for(int j=1; j<= 2*n-i-(i-1); j++)
            {
                System.out.print("  ");
            }
            // 2.3
            for(int j=1; j<=i; j++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }


        sc.close();;
    }
}
