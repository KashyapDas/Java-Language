import java.util.Scanner;
public class Pattern8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of n : ");
        int n = sc.nextInt();
        // 1st part
        for(int i=0; i<n; i++)
        {
            for(int j=0; j<n; j++)
            {
                if(j<(n-(i+1)))
                {
                    System.out.print("  ");
                }
                else{
                    
                    System.out.print("* ");
                }
            }
            for(int j=1; j<=i; j++)
            {
                if(i==0)
                {
                    continue;
                }
                else{
                    System.out.print("* ");
                }
            }
            System.out.println();
        }

        sc.close();
    }
}
