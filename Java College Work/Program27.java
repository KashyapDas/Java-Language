// Convert celsius to farenheight using method
import java.util.Scanner;
public class Program27 {
    public static double Convert(double celsius)
    {
        return (celsius*9/5)+32;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double celsius = sc.nextDouble();
        double res = Convert(celsius);
        System.out.println("Temperature conversion : "+res);
        sc.close();
    }
}
