import java.util.Scanner;

public class Program3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size");
        int size = sc.nextInt();
        int[] arr = new int[size];
        System.out.println("Enter the element of the array");
        for(int i=0; i<size; i++)
        {
            arr[i] = sc.nextInt();
        }        
        int largest = 0;
        int secondLargest = -1;
        for(int i=0; i<size; i++)
        {
            if((arr[i] > largest))
            {
                largest = arr[i];
            }
        }
        for(int i=0; i<size; i++)
        {
            if(arr[i] < largest && arr[i] > secondLargest)
            {
                secondLargest = arr[i];
            }
        }

        System.out.println("2nd largest : "+secondLargest );

        sc.close();
    }    
}
