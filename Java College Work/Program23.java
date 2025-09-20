// Count the no of digit present in the no 
import java.util.Scanner;
public class Program23 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no : ");

        int n = sc.nextInt();
        int count = 0;
        while (n>=1) {
            n = n/10;
            count++;
        }
        System.out.println("Digit present : "+count);

        sc.close();
    }
}
