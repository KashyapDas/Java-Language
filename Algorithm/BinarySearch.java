import java.util.Scanner;
public class BinarySearch {
    public static int Search(int[] arr, int target)
    {
        int start = 0, end=arr.length-1;
        int mid = (start + end)/2;
        while (start<=end) {
            if(arr[mid] == target)
            {
                return mid;
            }
            else if(arr[mid] > target)
            {
                end = mid -1;
            }
            else{
                start = mid +1;
            }
            mid = (start+end)/2;
        }
        return -1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter you target you want to find : ");
        int target = sc.nextInt();
        int[] arr = {10,20,30,40,50,60,70,80,90,100};
        int result = Search(arr,target);
        if(result == -1)
        {
            System.out.println("Element is not found...");
        }
        else{
            System.out.println("Element is found in the index : "+result);
        }

        sc.close();
    }
}
