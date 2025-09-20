// sum of elem present in the array 

public class Program20 {
    public static void main(String[] args) {
        int[] arr = {10,20,30,40,50};
        int sum = 0;
        for(int elem : arr)
        {
            sum += elem;
        }        
        System.out.print("Sum of elem present in the array : "+sum);
    }
}
