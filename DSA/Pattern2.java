import java.util.Scanner;
public class Pattern2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);        
        System.out.print("Enter the size of row : ");
        int row = sc.nextInt();
        System.out.print("Enter the size of col : ");
        int col = sc.nextInt();
        for(int i=0; i<row; i++)
        {
            for(int j=0; j<col; j++)
            {
                if(i==0 || i==(row-1))
                {
                    System.out.print("* ");
                }
                else if(j==0 || j==(col-1))
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
