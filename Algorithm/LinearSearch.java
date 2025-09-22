import java.util.Scanner;
public class LinearSearch{
    public static boolean Search(int[] arr, int target)
    {
        for(int i=0; i<arr.length; i++)
        {
            if(arr[i] == target)
            {
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int[] arr = {10,20,30,40,50,60,100};
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the element you want to search : ");
        int target = sc.nextInt();
        boolean result = Search(arr,target);
        if(result == false)
        {
            System.out.println("Element is not present...");
        }
        else{
            System.out.println("Element is present... : ");
        }

        sc.close();
    }
}