public class BubbleSort{
    public static void main(String[] args) {
        int[] arr = {14,33,77,10,25,16};
        for(int i=0; i<arr.length; i++)
        {
            for(int j=0; j<arr.length-1; j++)
            {
                    if(arr[j] > arr[j+1])
                    {
                        int temp = arr[j];
                        arr[j] = arr[j+1];
                        arr[j+1] = temp;
                    }
            }
        }
        // Print the array
        for(int i=0; i<arr.length; i++)
        {
            System.out.println(arr[i]+" ");
        }
    }
}