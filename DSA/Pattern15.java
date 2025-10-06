import java.util.Scanner;
public class Pattern15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of N : ");
        int n = sc.nextInt();
        System.out.println();
        for(int i=1; i<=n; i++)
        {
            for(int j=1; j<=i; j++)
            {
                if(i==1 || i==n)
                {
                    System.out.print(j+" ");
                }
                else if(j==1 || j==i)
                {
                    System.out.print(j+" ");
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
