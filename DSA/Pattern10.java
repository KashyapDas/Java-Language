import java.util.Scanner;;
public class Pattern10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of n : ");
        int size = sc.nextInt();

        for(int i=1; i<=size; i++)
        {
            // print space
            for(int j=1; j<=(size-i); j++)
            {
                System.out.print(" ");
            }
            // print star
            for(int j=1; j<=i; j++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
        for(int i=0; i<size; i++)
        {
            // print space
            for(int j=0; j<i; j++)
            {
                System.out.print(" ");
            }
            // print star
            for(int j=0; j<(size-i); j++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }

        sc.close();
    }
}
