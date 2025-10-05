import java.util.Scanner;
public class Pattern7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of N : ");
        int n = sc.nextInt();

        for(int i=0; i<n; i++)
        {
            for(int j=0; j<(n-i); j++)
            {
                if(i==0)
                {
                    System.out.print("* ");
                }
                else if(j==0 || j==(n-(i+1)))
                {
                    System.out.print("* ");
                }
                else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }

        sc.close();
    }
}
