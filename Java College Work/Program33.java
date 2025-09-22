// Find the smallest and largest element of the array
public class Program33 {
    public static void main(String[] args) {
        int[] arr = {10,20,30,40,50,60,70,80,90,100};
        int smallest = arr[0];
        int largest = arr[0];
        for(int i=1; i<arr.length; i++)
        {
            if(arr[i]<smallest)
            {
                smallest = arr[i];
            }
            else if(arr[i] > largest)
            {
                largest = arr[i];
            }
        }
        System.out.println("Largest element is : "+largest);
        System.out.println("Smallest element is : "+smallest);
        
    }
}
