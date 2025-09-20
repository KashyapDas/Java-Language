// find the largest of 3 number
import java.util.Scanner;;
public class Program10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no : ");
        int no1 = sc.nextInt();
        int no2 = sc.nextInt();
        int no3 = sc.nextInt();
        if( (no1>no2) && (no1>no3) )
        {
            System.out.println("No1 is the largest number...");
        }
        else if( (no2>no1) && (no2>no3) )
        {
            System.out.println("No2 is the largest number...");
        }
        else{
            System.out.println("No3 is the largest number...");
        }
        sc.close();
    }
}
