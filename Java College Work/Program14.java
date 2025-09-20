// take the operator as user input and perform operation between 2 intergers and print it
import java.util.Scanner;;
public class Program14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no's : ");
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();

        System.out.println("Enter the operator : ");
        char oprt = sc.next().charAt(0);
        
        if(oprt == '+')
        {
            System.out.println("Sum : "+(n1+n2));
        }
        else if(oprt == '-')
        {
            System.out.println("Sum : "+(n1-n2));
        }
        else if(oprt == '*')
        {
            System.out.println("Sum : "+(n1*n2));
        }
        else if(oprt == '/')
        {
            System.out.println("Sum : "+(n1/n2));
        }
        else{
            System.out.println("Sum : "+(n1%n2));
        }

        sc.close();
    }
}
