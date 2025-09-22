// Check array is sorted or not
public class Program36point2 {
    public static void main(String[] args) {
        int[] arr = {10,20,30,40,50,60,70,80,90,100};
        boolean isSort = true;
        for(int i=0; i<arr.length-1; i++)
        {
            if(arr[i] > arr[i+1])
            {
                isSort = false;
                break;
            }
        }
        if(isSort == false)
        {
            System.out.println("Array is not sorted...");
        }
        else{
            System.out.println("Array is sorted...");
        }
        
    }
}
