import java.util.Scanner;
public class Pattern14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of N : ");
        int n = sc.nextInt();
        for(int i=1; i<=n; i++)
        {
            for(int j=1; j<=i; j++)
            {
                if(j==i)
                {
                    System.out.print(j+"  ");
                }
                else{
                    System.out.print(j+"* ");
                }
            }
            System.out.println();
        }
        sc.close();
    }
}
