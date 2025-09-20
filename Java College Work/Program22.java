// print the sum of an no
import java.util.Scanner;;
public class Program22 {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         int n = sc.nextInt();
         int sum = 0;         

         while(n>=1)
         {
            int no = n%10;
            sum = sum+no;
            n = n/10;
         }
         
         System.out.println("Sum of the digit of the number is : "+sum);
         sc.close();
    }    
}
