import java.util.Scanner;

public class BinarySearchUsingRecursion{
    public static int BinarySearch(int start, int end, int mid, int number)
    {
        
        if(start>end)
        {
            return end;
        }
        mid = (start+end)/2;
        if((mid*mid) == number)
        {
            return mid;
        }
        else if((mid*mid) < number)
        {
            // start = mid+1;
            return BinarySearch(mid+1, end, mid, number);
        }
        else{
            // end = mid-1;
            return BinarySearch(start, mid-1, mid, number);
        }
    } 
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number you want to find the square root : ");
        int number = sc.nextInt();
        int start = 0;
        int end = number;
        int mid = 0;
        int result = BinarySearch(start, end, mid, number);
        System.out.println(result);

        sc.close();
    }
}