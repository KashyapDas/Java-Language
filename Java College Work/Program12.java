// Check weather a year is a leap year or not
import java.util.Scanner;;
public class Program12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the year : ");
        int leapYear = sc.nextInt();
        if( ((leapYear%4==0) || (leapYear%400==0)) && (leapYear !=0) )
        {
            System.out.println(leapYear + " is a leap year");
        }
        else{
            System.out.println(leapYear + " is not a leap year");
        }
        sc.close();
    }
}
