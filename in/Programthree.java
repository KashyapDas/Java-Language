// sum of the elem of array using enhanced array

import java.util.Scanner;
public class Programthree {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int arr[] = {10,20,30,40,50,60,70,80,90,100};
        int sum = 0;
        for(int elem : arr)
        {
            sum+= elem;
        }
        System.out.println("Sum of the elements are : "+sum);
        sc.close();
    }
}
