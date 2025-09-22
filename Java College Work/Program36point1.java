// Search element in an array
import java.util.Scanner;
public class Program36point1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter target : ");
        int target = sc.nextInt();
        int[] arr = {10,20,30,40,50,60,70,80,90,100};
        boolean found = false;
        for(int i=0; i<arr.length; i++)
        {
            if(arr[i] == target)
            {
                found = true;
            }
        }
        if(found == false)
        {
            System.out.println("Element not present...");
        }
        else{
            System.out.println("Element present...");
        }

        sc.close();
    }
}
