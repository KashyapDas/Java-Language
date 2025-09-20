// Check weather triangle is valid or not 
import java.util.Scanner;
public class Program13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the sides : ");
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int n3 = sc.nextInt();
        if( ((n1+n2) > n3) && ((n1+n3) > n2) && ((n2+n3) > n1) )
        {
            System.out.println("Triangle is valid");
        }
        else{
            System.out.println("Triangle is not valid");
        }
        sc.close();
    }
}
