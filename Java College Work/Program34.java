// Calculate the sum and average of all element of the array
public class Program34 {
    public static void main(String[] args) {
        int[] num = {10,20,30,40,50};
        int sum = 0;
        for(int i=0; i<num.length; i++)
        {
            sum = sum + num[i];
        }
        int average = sum/num.length;
        System.out.println("Sum of the element is : "+sum);
        System.out.println("Average of the element is : "+average);
    }
}
