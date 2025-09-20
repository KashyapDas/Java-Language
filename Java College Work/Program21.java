// print the reverse of an no
import java.util.Scanner;;
public class Program21 {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         int n = sc.nextInt();
         
         while(n>=1)
         {
            int no = n%10;
            System.out.print(no);
            n = n/10;
         }
         sc.close();
    }    
}
