import java.util.Scanner;;
public class Pattern11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of n : ");
        int n = sc.nextInt();
        for(int i=0; i<n; i++)
        {
            // 1st part
            for(int j=0; j<n; j++)
            {
                if(j==(n-(i+1)))
                {
                    System.out.print("* ");
                }
                else{
                    System.out.print("  ");
                }
            }
            // 2nd part
            for(int j=1; j<n; j++)
            {
                if(j==i)
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
