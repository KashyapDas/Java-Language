// Take user input as name, city, age of a person and print it.
import java.util.Scanner;;
public class Program5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your name : ");
        String name = sc.nextLine();
        System.out.print("Enter your age : ");
        int age = sc.nextInt(); // read only the number but left over the newline
        sc.nextLine(); // Consume left over new line 
        System.out.print("Enter your city : ");
        String city = sc.nextLine();
        System.out.print("Name is : "+name+" City is : "+city+" Age is : "+age);
        sc.close();
    }
}
