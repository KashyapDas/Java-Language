// Find the square & cube of a number
import java.util.Scanner;
public class Program6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int n = sc.nextInt();
        System.out.println("Square of a number is : "+n*n);
        System.out.println("Cube of a number is : "+n*n*n);
        sc.close();
    }
}
